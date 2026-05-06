package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorLightIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 38c31.731 .009 61.112 16.727 77.33 44h-77.33c-21.605 .03-40.287 15.07-44.93 36.17L56.91 72.87C73.937 50.876 100.185 38.001 128 38ZM162 128c0 18.778-15.222 34-34 34C109.222 162 94 146.778 94 128c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34ZM38 128C37.976 112.587 41.938 97.43 49.5 84l38.66 67c.06 .1 .13 .18 .19 .27 10.863 18.57 33.159 27.115 53.65 20.56l-26.17 45.34C71.271 211.032 38.058 172.98 38 128ZM129.16 218l38.68-67 .21-.41C178.626 131.929 174.869 108.432 159 94h52.37c11.248 27.562 8.141 58.902-8.302 83.718C186.626 202.534 158.976 217.614 129.21 218Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
