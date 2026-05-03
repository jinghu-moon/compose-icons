package composeicons.generator.core

import composeicons.generator.core.json.*
import java.io.File

class KotlinFileGenerator {

    /**
     * Generates the ImageVector builder block content from a SvgDocument.
     * Used by the new JSON-based pipeline (T-09).
     */
    fun generate(doc: SvgDocument): String = buildString {
        doc.nodes.forEach { node ->
            append(generateNode(node, indent = 0))
        }
    }

    private fun generateNode(node: JsonNode, indent: Int): String = when (node) {
        is JsonPathNode -> generatePath(node, indent)
        is JsonGroupNode -> generateGroup(node, indent)
    }

    private fun generatePath(node: JsonPathNode, indent: Int): String = buildString {
        val padding = "    ".repeat(indent + 1)
        val fillColor = node.fill?.color?.removePrefix("#")?.let { "0xFF$it" }
        val fillBrush = if (fillColor != null) "SolidColor(Color($fillColor))" else "null"
        val fillType = when (node.fill?.rule) {
            "evenodd" -> "PathFillType.EvenOdd"
            else -> "PathFillType.NonZero"
        }
        val strokeColor = node.stroke?.color?.removePrefix("#")?.let { "0xFF$it" }
        val strokeBrush = if (strokeColor != null) "SolidColor(Color($strokeColor))" else "null"
        val strokeCap = when (node.stroke?.linecap) {
            "round" -> "StrokeCap.Round"
            "square" -> "StrokeCap.Square"
            else -> "StrokeCap.Butt"
        }
        val strokeJoin = when (node.stroke?.linejoin) {
            "round" -> "StrokeJoin.Round"
            "bevel" -> "StrokeJoin.Bevel"
            else -> "StrokeJoin.Miter"
        }
        val strokeWidth = node.stroke?.width ?: 0.0
        val alpha = node.fill?.opacity ?: node.stroke?.opacity ?: 1.0

        appendLine("${padding}addPath(")
        appendLine("$padding    pathData = parseSvgPathData(\"${node.d}\"),")
        appendLine("$padding    pathFillType = $fillType,")
        appendLine("$padding    fill = $fillBrush,")
        appendLine("$padding    fillAlpha = ${alpha}f,")
        appendLine("$padding    stroke = $strokeBrush,")
        appendLine("$padding    strokeAlpha = ${alpha}f,")
        appendLine("$padding    strokeLineWidth = ${strokeWidth}f,")
        appendLine("$padding    strokeLineCap = $strokeCap,")
        appendLine("$padding    strokeLineJoin = $strokeJoin,")
        appendLine("$padding)")
    }

    private fun generateGroup(node: JsonGroupNode, indent: Int): String = buildString {
        val padding = "    ".repeat(indent + 1)
        appendLine("${padding}group(")
        if (node.clipPath != null) {
            appendLine("$padding    clipPathData = parseSvgPathData(\"${node.clipPath}\"),")
        }
        if (node.opacity != 1.0) {
            appendLine("$padding    groupAlpha = ${node.opacity}f,")
        }
        appendLine("$padding) {")
        node.children.forEach { child ->
            append(generateNode(child, indent + 1))
        }
        val closePadding = "    ".repeat(indent + 1)
        appendLine("$closePadding}")
    }

    /**
     * Writes a Kotlin icon file from a SvgDocument (JSON pipeline).
     */
    fun writeIconFileFromDoc(
        doc: SvgDocument,
        fileName: String,
        styleName: String,
        subdirectory: String,
        baseOutputDir: File,
        basePackage: String,
        iconContainerName: String,
        helperFunctionName: String,
    ) {
        val kotlinName = IconNameMapper.toKotlinName(fileName)
        val targetDir = baseOutputDir.resolve(subdirectory)
        targetDir.mkdirs()

        val outputFile = targetDir.resolve("$kotlinName.kt")
        targetDir.listFiles { file ->
            file.isFile &&
                file.extension.equals("kt", ignoreCase = true) &&
                file.name.equals(outputFile.name, ignoreCase = true) &&
                file.name != outputFile.name
        }?.forEach { caseMismatchedFile ->
            caseMismatchedFile.delete()
        }

        val vectorName = kotlinName.replaceFirstChar { it.lowercaseChar() }
        val packageName = "$basePackage.$subdirectory"
        val propertyHost = "$iconContainerName.${styleName.replaceFirstChar { it.uppercaseChar() }}"
        val widthDp = (24f / maxOf(doc.viewBox.width.toFloat(), doc.viewBox.height.toFloat()) * doc.viewBox.width.toFloat()).let {
            if (it == it.toInt().toFloat()) it.toInt().toString() else it.toString()
        }
        val heightDp = (24f / maxOf(doc.viewBox.width.toFloat(), doc.viewBox.height.toFloat()) * doc.viewBox.height.toFloat()).let {
            if (it == it.toInt().toFloat()) it.toInt().toString() else it.toString()
        }

        val content = buildString {
            appendLine("package $packageName")
            appendLine()
            appendLine("import androidx.compose.ui.graphics.*")
            appendLine("import androidx.compose.ui.graphics.vector.ImageVector")
            appendLine("import androidx.compose.ui.unit.dp")
            appendLine("import composeicons.core.IconSize")
            appendLine("import composeicons.core.ViewBox")
            appendLine("import composeicons.core.parseSvgPathData")
            appendLine("import $basePackage.$iconContainerName")
            appendLine("import $basePackage.$helperFunctionName")
            appendLine()
            appendLine("val $propertyHost.$kotlinName: ImageVector")
            appendLine("    get() {")
            appendLine("        if (_$vectorName != null) return _$vectorName!!")
            appendLine("        _$vectorName = $helperFunctionName(")
            appendLine("            name = \"$kotlinName\",")
            appendLine("            size = IconSize(width = ${widthDp}f.dp, height = ${heightDp}f.dp),")
            appendLine("            viewBox = ViewBox(minX = 0f, minY = 0f, width = ${doc.viewBox.width.toFloat()}f, height = ${doc.viewBox.height.toFloat()}f),")
            appendLine("        ) {")
            append(generate(doc))
            appendLine("        }")
            appendLine("        return _$vectorName!!")
            appendLine("    }")
            appendLine()
            appendLine("private var _$vectorName: ImageVector? = null")
        }

        outputFile.writeText(content)
    }

    fun writeIconFile(
        parsedIcon: ParsedSvgIcon,
        baseOutputDir: File,
        basePackage: String,
        iconContainerName: String,
        helperFunctionName: String,
    ) {
        val kotlinName = IconNameMapper.toKotlinName(parsedIcon.entry.fileName)
        val targetDir = baseOutputDir.resolve(parsedIcon.entry.style.subdirectory)
        targetDir.mkdirs()

        val outputFile = targetDir.resolve("$kotlinName.kt")
        targetDir.listFiles { file ->
            file.isFile &&
                file.extension.equals("kt", ignoreCase = true) &&
                file.name.equals(outputFile.name, ignoreCase = true) &&
                file.name != outputFile.name
        }?.forEach { caseMismatchedFile ->
            caseMismatchedFile.delete()
        }
        outputFile.writeText(
            generateIconFile(
                parsedIcon = parsedIcon,
                kotlinName = kotlinName,
                basePackage = basePackage,
                iconContainerName = iconContainerName,
                helperFunctionName = helperFunctionName,
            ),
        )
    }

    private fun generateIconFile(
        parsedIcon: ParsedSvgIcon,
        kotlinName: String,
        basePackage: String,
        iconContainerName: String,
        helperFunctionName: String,
    ): String = buildString {
        val packageName = "$basePackage.${parsedIcon.entry.style.subdirectory}"
        val propertyHost = "$iconContainerName.${parsedIcon.entry.style.name}"
        val vectorName = kotlinName.replaceFirstChar { it.lowercaseChar() }
        val widthDp = defaultWidthDp(parsedIcon.viewBox)
        val heightDp = defaultHeightDp(parsedIcon.viewBox)

        appendLine("package $packageName")
        appendLine()
        appendLine("import androidx.compose.ui.graphics.*")
        appendLine("import androidx.compose.ui.graphics.vector.ImageVector")
        appendLine("import androidx.compose.ui.graphics.vector.PathNode")
        appendLine("import androidx.compose.ui.unit.dp")
        appendLine("import composeicons.core.IconSize")
        appendLine("import composeicons.core.ViewBox")
        appendLine("import $basePackage.$iconContainerName")
        appendLine("import $basePackage.$helperFunctionName")
        appendLine()
        appendLine("val $propertyHost.$kotlinName: ImageVector")
        appendLine("    get() {")
        appendLine("        if (_$vectorName != null) return _$vectorName!!")
        appendLine("        _$vectorName = $helperFunctionName(")
        appendLine("            name = \"$kotlinName\",")
        appendLine("            size = IconSize(width = ${widthDp}f.dp, height = ${heightDp}f.dp),")
        appendLine(
            "            viewBox = ViewBox(minX = 0f, minY = 0f, width = ${parsedIcon.viewBox.width}f, height = ${parsedIcon.viewBox.height}f),",
        )
        appendLine("        ) {")
        parsedIcon.paths.forEach { path ->
            appendLine("            addPath(")
            appendLine("                pathData = listOf(")
            path.commands.forEachIndexed { index, command ->
                val suffix = if (index == path.commands.lastIndex) "" else ","
                appendLine("                    ${command.toComposeNodeCode()}$suffix")
            }
            appendLine("                ),")
            appendLine("                pathFillType = ${path.style.toFillTypeCode()},")
            appendLine("                fill = ${path.style.toFillBrushCode()},")
            appendLine("                fillAlpha = ${path.style.alpha ?: 1f}f,")
            appendLine("                stroke = ${path.style.toStrokeBrushCode()},")
            appendLine("                strokeAlpha = ${path.style.alpha ?: 1f}f,")
            appendLine("                strokeLineWidth = ${path.style.strokeWidth?.toString() ?: "0"}f,")
            appendLine("                strokeLineCap = ${path.style.toStrokeLineCapCode()},")
            appendLine("                strokeLineJoin = ${path.style.toStrokeLineJoinCode()},")
            appendLine("                strokeLineMiter = 4f,")
            appendLine("            )")
        }
        appendLine("        }")
        appendLine("        return _$vectorName!!")
        appendLine("    }")
        appendLine()
        appendLine("private var _$vectorName: ImageVector? = null")
    }

    private fun defaultWidthDp(viewBox: ViewBox): String {
        val scale = 24f / maxOf(viewBox.width, viewBox.height)
        return (viewBox.width * scale).normalizeDp()
    }

    private fun defaultHeightDp(viewBox: ViewBox): String {
        val scale = 24f / maxOf(viewBox.width, viewBox.height)
        return (viewBox.height * scale).normalizeDp()
    }
}

private fun Float.normalizeDp(): String = if (this == toInt().toFloat()) {
    toInt().toString()
} else {
    toString()
}

private fun PathStyle.toFillTypeCode(): String = when (fillRule?.lowercase()) {
    "evenodd", "evenOdd".lowercase() -> "PathFillType.EvenOdd"
    else -> "PathFillType.NonZero"
}

private fun PathStyle.toFillBrushCode(): String = when (fill?.lowercase()) {
    null, "none" -> "null"
    else -> "SolidColor(Color.Black)"
}

private fun PathStyle.toStrokeBrushCode(): String = when (stroke?.lowercase()) {
    null, "none" -> "null"
    else -> "SolidColor(Color.Black)"
}

private fun PathStyle.toStrokeLineCapCode(): String = when (strokeLineCap?.lowercase()) {
    "round" -> "StrokeCap.Round"
    "square" -> "StrokeCap.Square"
    else -> "StrokeCap.Butt"
}

private fun PathStyle.toStrokeLineJoinCode(): String = when (strokeLineJoin?.lowercase()) {
    "round" -> "StrokeJoin.Round"
    "bevel" -> "StrokeJoin.Bevel"
    else -> "StrokeJoin.Miter"
}
