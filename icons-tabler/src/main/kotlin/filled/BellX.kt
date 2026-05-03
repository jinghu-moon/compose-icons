package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BellX: ImageVector
    get() {
        if (_bellX != null) return _bellX!!
        _bellX = tablerFilledIcon(
            name = "BellX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.235 19.000 C 15.100 19.000 15.557 20.024 14.980 20.668 C 14.222 21.516 13.138 22.001 12.000 22.000 C 10.862 22.001 9.778 21.516 9.020 20.668 C 8.468 20.052 8.862 19.089 9.654 19.007 L 9.764 19.001 L 14.235 19.001 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 13.358 2.000 14.506 2.903 14.875 4.141 L 14.921 4.312 L 14.929 4.355 C 17.165 5.617 18.661 7.873 18.953 10.424 L 18.981 10.711 L 19.000 11.000 L 19.000 13.931 L 19.021 14.067 C 19.158 14.804 19.566 15.463 20.164 15.914 L 20.331 16.031 L 20.493 16.130 C 21.353 16.617 21.053 17.896 20.116 17.994 L 20.000 18.000 L 4.000 18.000 C 2.972 18.000 2.613 16.636 3.507 16.130 C 4.278 15.694 4.817 14.938 4.979 14.067 L 5.000 13.924 L 5.001 10.954 C 5.125 8.302 6.556 5.884 8.822 4.500 L 9.070 4.354 L 9.080 4.311 C 9.370 3.086 10.392 2.172 11.642 2.021 L 11.824 2.004 L 12.000 2.000 ZM 10.511 8.140 C 10.077 7.882 9.520 7.987 9.210 8.386 C 8.900 8.784 8.936 9.351 9.293 9.707 L 10.585 11.000 L 9.293 12.293 L 9.210 12.387 C 8.887 12.804 8.944 13.400 9.340 13.749 C 9.735 14.097 10.334 14.079 10.707 13.707 L 12.000 12.415 L 13.293 13.707 L 13.387 13.790 C 13.804 14.113 14.400 14.056 14.749 13.660 C 15.097 13.265 15.079 12.666 14.707 12.293 L 13.415 11.000 L 14.707 9.707 L 14.790 9.613 C 15.113 9.196 15.056 8.600 14.660 8.251 C 14.265 7.903 13.666 7.921 13.293 8.293 L 12.000 9.585 L 10.707 8.293 L 10.613 8.210 Z"),
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
        return _bellX!!
    }

private var _bellX: ImageVector? = null
