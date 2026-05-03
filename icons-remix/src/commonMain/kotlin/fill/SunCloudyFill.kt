package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SunCloudyFill: ImageVector
    get() {
        if (_sunCloudyFill != null) return _sunCloudyFill!!
        _sunCloudyFill = remixIcon(
            name = "SunCloudyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.984 5.060 C 11.132 3.222 13.173 2.000 15.500 2.000 C 19.090 2.000 22.000 4.910 22.000 8.500 C 22.000 9.580 21.736 10.599 21.270 11.495 C 22.335 12.498 23.000 13.922 23.000 15.500 C 23.000 18.538 20.538 21.000 17.500 21.000 L 9.000 21.000 C 4.582 21.000 1.000 17.418 1.000 13.000 C 1.000 8.582 4.582 5.000 9.000 5.000 C 9.333 5.000 9.661 5.020 9.984 5.060 ZM 12.055 5.604 C 14.068 6.436 15.666 8.066 16.458 10.099 C 16.795 10.034 17.144 10.000 17.500 10.000 C 18.235 10.000 18.937 10.144 19.578 10.406 C 19.849 9.827 20.000 9.181 20.000 8.500 C 20.000 6.015 17.985 4.000 15.500 4.000 C 14.118 4.000 12.881 4.623 12.055 5.604 Z"),
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
        return _sunCloudyFill!!
    }

private var _sunCloudyFill: ImageVector? = null
