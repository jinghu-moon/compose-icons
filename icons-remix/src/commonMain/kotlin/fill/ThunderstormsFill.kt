package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThunderstormsFill: ImageVector
    get() {
        if (_thunderstormsFill != null) return _thunderstormsFill!!
        _thunderstormsFill = remixIcon(
            name = "ThunderstormsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.989 18.000 L 18.204 16.419 C 18.406 16.157 18.515 15.836 18.515 15.505 C 18.515 14.676 17.844 14.005 17.015 14.005 L 15.000 14.005 L 15.000 10.029 C 15.000 9.563 14.783 9.124 14.414 8.840 C 13.757 8.335 12.816 8.458 12.311 9.115 L 5.945 17.396 C 3.042 16.196 1.000 13.337 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 15.538 20.538 18.000 17.500 18.000 L 16.989 18.000 ZM 13.000 16.005 L 16.000 16.005 L 11.000 22.505 L 11.000 18.005 L 8.000 18.005 L 13.000 11.500 L 13.000 16.005 Z"),
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
        return _thunderstormsFill!!
    }

private var _thunderstormsFill: ImageVector? = null
