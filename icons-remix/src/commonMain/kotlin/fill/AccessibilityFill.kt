package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AccessibilityFill: ImageVector
    get() {
        if (_accessibilityFill != null) return _accessibilityFill!!
        _accessibilityFill = remixIcon(
            name = "AccessibilityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 13.500 7.000 C 13.500 7.828 12.828 8.500 12.000 8.500 C 11.172 8.500 10.500 7.828 10.500 7.000 C 10.500 6.172 11.172 5.500 12.000 5.500 C 12.828 5.500 13.500 6.172 13.500 7.000 ZM 6.629 10.429 L 7.371 8.571 C 8.822 9.143 10.443 9.500 12.000 9.500 C 13.559 9.500 15.173 9.139 16.626 8.572 C 16.629 8.571 17.384 10.423 17.359 10.433 C 16.282 10.853 15.141 11.147 14.000 11.330 C 14.000 12.200 13.915 13.094 14.317 13.897 L 15.894 17.053 L 14.106 17.947 L 12.553 14.842 C 12.448 14.632 12.234 14.500 12.000 14.500 C 11.766 14.500 11.552 14.632 11.447 14.842 L 9.894 17.947 L 8.105 17.053 L 9.683 13.897 C 10.085 13.094 10.000 12.200 10.000 11.330 C 8.857 11.147 7.705 10.858 6.629 10.429 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _accessibilityFill!!
    }

private var _accessibilityFill: ImageVector? = null
