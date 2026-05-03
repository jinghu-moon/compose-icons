package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorLightIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.000 56.000 L 238.000 104.000 C 238.000 107.314 235.314 110.000 232.000 110.000 L 184.000 110.000 C 180.686 110.000 178.000 107.314 178.000 104.000 C 178.000 100.686 180.686 98.000 184.000 98.000 L 216.550 98.000 L 186.170 70.200 C 186.110 70.140 186.050 70.070 185.980 70.010 C 154.170 38.219 102.689 37.981 70.587 69.477 C 38.484 100.973 37.741 152.449 68.920 184.859 C 100.099 217.269 151.565 218.519 184.280 187.660 C 186.691 185.385 190.490 185.494 192.765 187.905 C 195.040 190.316 194.931 194.115 192.520 196.390 C 175.099 212.893 151.997 222.063 128.000 222.000 L 126.720 222.000 C 84.368 221.404 47.646 192.556 37.039 151.549 C 26.432 110.543 44.560 67.507 81.310 46.449 C 118.061 25.392 164.356 31.513 194.370 61.400 L 226.000 90.350 L 226.000 56.000 C 226.000 52.686 228.686 50.000 232.000 50.000 C 235.314 50.000 238.000 52.686 238.000 56.000 Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
