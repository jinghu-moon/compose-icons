package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccessibilityLine: ImageVector
    get() {
        if (_accessibilityLine != null) return _accessibilityLine!!
        _accessibilityLine = remixIcon(
            name = "AccessibilityLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 ZM 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 ZM 12.000 8.500 C 12.828 8.500 13.500 7.828 13.500 7.000 C 13.500 6.172 12.828 5.500 12.000 5.500 C 11.172 5.500 10.500 6.172 10.500 7.000 C 10.500 7.828 11.172 8.500 12.000 8.500 ZM 12.000 9.500 C 10.443 9.500 8.822 9.143 7.371 8.571 L 6.629 10.429 C 7.705 10.858 8.857 11.147 10.000 11.330 C 10.000 12.200 10.085 13.094 9.683 13.897 L 8.105 17.053 L 9.894 17.947 L 11.447 14.842 C 11.552 14.632 11.766 14.500 12.000 14.500 C 12.234 14.500 12.448 14.632 12.553 14.842 L 14.106 17.947 L 15.894 17.053 L 14.317 13.897 C 13.915 13.094 14.000 12.200 14.000 11.330 C 15.141 11.147 16.282 10.853 17.359 10.433 C 17.384 10.423 16.629 8.571 16.626 8.572 C 15.173 9.139 13.559 9.500 12.000 9.500 Z"),
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
        return _accessibilityLine!!
    }

private var _accessibilityLine: ImageVector? = null
