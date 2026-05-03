package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MetaFill: ImageVector
    get() {
        if (_metaFill != null) return _metaFill!!
        _metaFill = remixIcon(
            name = "MetaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.920 4.500 C 15.069 4.500 13.622 5.894 12.312 7.665 C 10.512 5.373 9.007 4.500 7.206 4.500 C 3.534 4.500 0.720 9.279 0.720 14.338 C 0.720 17.503 2.251 19.500 4.816 19.500 C 6.662 19.500 7.990 18.630 10.351 14.503 C 10.351 14.503 11.335 12.766 12.012 11.569 C 12.249 11.952 12.498 12.364 12.761 12.807 L 13.868 14.669 C 16.024 18.277 17.226 19.500 19.403 19.500 C 21.901 19.500 23.292 17.476 23.292 14.245 C 23.292 8.948 20.415 4.500 16.920 4.500 ZM 8.551 13.386 C 6.637 16.386 5.975 17.059 4.909 17.059 C 3.813 17.059 3.161 16.096 3.161 14.379 C 3.161 10.707 4.992 6.952 7.175 6.952 C 8.357 6.952 9.345 7.634 10.858 9.800 C 9.421 12.004 8.551 13.386 8.551 13.386 ZM 15.774 13.009 L 14.450 10.801 C 14.092 10.219 13.749 9.684 13.418 9.193 C 14.611 7.352 15.594 6.434 16.765 6.434 C 19.196 6.434 21.140 10.014 21.140 14.410 C 21.140 16.086 20.591 17.059 19.454 17.059 C 18.364 17.059 17.843 16.339 15.774 13.009 Z"),
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
        return _metaFill!!
    }

private var _metaFill: ImageVector? = null
