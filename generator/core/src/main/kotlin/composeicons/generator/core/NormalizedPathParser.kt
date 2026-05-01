package composeicons.generator.core

import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.ByteArrayInputStream
import javax.xml.parsers.DocumentBuilderFactory

class NormalizedPathParser {
    fun parse(
        entry: SvgIconEntry,
        defaultPathStyle: PathStyle,
        flattenedSvg: String,
    ): ParsedSvgIcon {

        val factory = DocumentBuilderFactory.newInstance()
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true)
        val builder = factory.newDocumentBuilder()
        val doc = builder.parse(ByteArrayInputStream(flattenedSvg.toByteArray(Charsets.UTF_8)))
        val svgElement = doc.documentElement

        val viewBox = parseViewBox(svgElement.getAttribute("viewBox"), svgElement.getAttribute("width"), svgElement.getAttribute("height"))
        val paths = mutableListOf<SvgPathNode>()

        val nodeList = doc.getElementsByTagName("path")
        for (i in 0 until nodeList.length) {
            val node = nodeList.item(i)
            if (node.nodeType == Node.ELEMENT_NODE) {
                val element = node as Element
                val d = element.getAttribute("d")
                val rawFill = element.getAttribute("fill").takeIf { it.isNotEmpty() }
                val rawStroke = element.getAttribute("stroke").takeIf { it.isNotEmpty() }
                val pathStyle = PathStyle(
                    fill = rawFill ?: defaultPathStyle.fill,
                    stroke = rawStroke ?: defaultPathStyle.stroke,
                    strokeWidth = element.getAttribute("stroke-width").takeIf { it.isNotEmpty() }?.toFloatOrNull() ?: defaultPathStyle.strokeWidth,
                    strokeLineCap = element.getAttribute("stroke-linecap").takeIf { it.isNotEmpty() } ?: defaultPathStyle.strokeLineCap,
                    strokeLineJoin = element.getAttribute("stroke-linejoin").takeIf { it.isNotEmpty() } ?: defaultPathStyle.strokeLineJoin,
                    fillRule = element.getAttribute("fill-rule").takeIf { it.isNotEmpty() } ?: defaultPathStyle.fillRule,
                    originalFill = rawFill,
                    originalStroke = rawStroke,
                )
                paths.add(SvgPathNode(
                    commands = parsePathData(d).map { it.normalize(viewBox.minX, viewBox.minY) },
                    style = pathStyle
                ))
            }
        }

        return ParsedSvgIcon(
            entry = entry,
            viewBox = viewBox,
            metadata = entry.metadata,
            paths = paths,
        )
    }

    private fun parseViewBox(viewBoxStr: String, widthStr: String, heightStr: String): ViewBox {
        if (viewBoxStr.isNotEmpty()) {
            val parts = viewBoxStr.split(Regex("\\s+|,")).filter { it.isNotEmpty() }.map { it.toFloat() }
            if (parts.size >= 4) {
                return ViewBox(parts[0], parts[1], parts[2], parts[3])
            }
        }
        val w = widthStr.replace("px", "").toFloatOrNull() ?: 24f
        val h = heightStr.replace("px", "").toFloatOrNull() ?: 24f
        return ViewBox(0f, 0f, w, h)
    }

    private fun parsePathData(d: String): List<SvgPathCommand> {
        val sanitizedD = d.replace(Regex("(\\d)[eE]([\\+\\-]?\\d)"), "$1#$2")
        val regex = Regex("([a-zA-Z])([^a-zA-Z]*)")
        val commands = mutableListOf<SvgPathCommand>()
        for (match in regex.findAll(sanitizedD)) {
            val command = match.groupValues[1].first()
            if (command !in listOf('M', 'L', 'Q', 'C', 'Z', 'm', 'l', 'q', 'c', 'z')) {
                error("Unsupported path command: $command")
            }
            val argsStr = match.groupValues[2].replace("#", "e")
            
            // Match numbers including negative signs, decimals, and scientific notation
            val args = Regex("[-+]?(?:\\d*\\.\\d+|\\d+)(?:[eE][-+]?\\d+)?")
                .findAll(argsStr)
                .map { it.value.toFloat() }
                .toList()
                
            commands.add(SvgPathCommand(command, args))
        }
        return commands
    }
}
