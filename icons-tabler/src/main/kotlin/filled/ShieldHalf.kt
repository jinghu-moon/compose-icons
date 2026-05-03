package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldHalf: ImageVector
    get() {
        if (_shieldHalf != null) return _shieldHalf!!
        _shieldHalf = tablerFilledIcon(
            name = "ShieldHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.998 2.000 L 12.030 2.002 L 12.116 2.007 C 12.235 2.021 12.351 2.056 12.458 2.111 L 12.563 2.173 L 12.660 2.249 L 12.676 2.264 L 12.923 2.474 C 14.940 4.150 17.490 5.049 20.112 5.011 L 20.454 5.001 C 20.914 4.980 21.329 5.276 21.459 5.718 C 22.452 9.095 22.033 12.731 20.297 15.793 C 18.562 18.856 15.658 21.084 12.251 21.968 C 12.086 22.011 11.914 22.011 11.749 21.968 C 8.341 21.084 5.438 18.856 3.702 15.794 C 1.967 12.731 1.547 9.095 2.540 5.718 C 2.670 5.276 3.085 4.980 3.545 5.001 C 6.401 5.132 9.195 4.145 11.336 2.251 L 11.382 2.215 L 11.435 2.174 C 11.502 2.128 11.575 2.090 11.652 2.062 L 11.727 2.039 L 11.763 2.029 C 11.803 2.019 11.843 2.012 11.883 2.007 L 11.969 2.002 ZM 12.000 4.296 L 11.824 4.431 C 9.712 6.007 7.170 6.904 4.536 7.003 L 4.272 7.009 L 4.208 7.319 C 3.741 9.762 4.116 12.291 5.272 14.494 L 5.442 14.808 C 6.854 17.300 9.183 19.142 11.932 19.944 L 12.000 19.963 Z"),
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
        return _shieldHalf!!
    }

private var _shieldHalf: ImageVector? = null
