package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ColorFilterAiLine: ImageVector
    get() {
        if (_colorFilterAiLine != null) return _colorFilterAiLine!!
        _colorFilterAiLine = remixIcon(
            name = "ColorFilterAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.007 7.297C6.002 7.199 6 7.1 6 7 6 3.686 8.686 1 12 1c1.35 0 2.598 .447 3.601 1.2L14.399 3.799C13.731 3.297 12.902 3 12 3c-.276 0-.546 .028-.806 .081C9.371 3.454 8 5.067 8 7c0 2.033 1.517 3.712 3.481 3.967C12.504 9.558 14.055 8.709 15.696 8.533c.684-.073 1.383-.029 2.068 .139 .537 .132 1.064 .342 1.566 .631 2.87 1.657 3.853 5.326 2.196 8.196-1.657 2.87-5.326 3.853-8.196 2.196-.502-.29-.947-.642-1.33-1.041-.383 .399-.828 .751-1.33 1.041C7.8 21.353 4.131 20.37 2.474 17.5 .817 14.63 1.8 10.961 4.67 9.304c.502-.29 1.029-.499 1.566-.631C6.113 8.246 6.035 7.801 6.01 7.341L6.007 7.297ZM7.15 10.533c-.506 .066-1.008 .231-1.48 .503C3.757 12.141 3.101 14.587 4.206 16.5c1.105 1.913 3.551 2.569 5.464 1.464 .632-.365 1.125-.874 1.464-1.462 .609-1.057 .719-2.363 .231-3.535-.384-.04-.758-.117-1.117-.227-.045-.014-.09-.028-.135-.043C8.912 12.3 7.88 11.533 7.15 10.533ZM13.154 16.934c.31 .405 .704 .758 1.176 1.03 1.913 1.105 4.36 .449 5.464-1.464 .5-.865 .639-1.839 .465-2.749-.211-1.102-.881-2.11-1.929-2.715-.632-.365-1.32-.537-1.998-.537-1.22 .001-2.406 .559-3.177 1.568 .111 .25 .204 .504 .279 .761 .044 .151 .081 .303 .113 .455 .014 .065 .026 .131 .037 .196 .203 1.178 .046 2.383-.43 3.456ZM18.577 7c.289 .334 .529 .714 .709 1.128l.247 .566c.181 .414 .753 .414 .934 0l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.738-.338c.411-.183 .411-.78 0-.963l-.695-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.08 .192-.172 .378-.276 .555-.46 .783-1.149 1.404-1.975 1.772l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.582 .259 1.096 .644 1.51 1.123Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _colorFilterAiLine!!
    }

private var _colorFilterAiLine: ImageVector? = null
