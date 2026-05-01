package composeicons.generator.core

import java.io.File

class KotlinFileGenerator {

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
            appendLine("                fillAlpha = 1f,")
            appendLine("                stroke = ${path.style.toStrokeBrushCode()},")
            appendLine("                strokeAlpha = 1f,")
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
