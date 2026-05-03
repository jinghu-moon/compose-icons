package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorFillIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 36.000 C 100.000 20.536 112.536 8.000 128.000 8.000 C 143.464 8.000 156.000 20.536 156.000 36.000 C 156.000 51.464 143.464 64.000 128.000 64.000 C 112.536 64.000 100.000 51.464 100.000 36.000 ZM 227.600 92.570 C 226.096 85.176 219.545 79.897 212.000 80.000 L 44.000 80.000 C 36.485 80.000 29.982 85.230 28.371 92.570 C 26.760 99.911 30.475 107.383 37.300 110.530 L 37.360 110.530 L 91.250 134.260 L 69.330 217.560 C 65.851 225.519 69.357 234.800 77.230 238.470 C 79.346 239.475 81.658 239.997 84.000 240.000 C 90.155 240.009 95.770 236.486 98.440 230.940 L 128.000 180.000 L 157.580 231.000 C 161.406 238.783 170.735 242.101 178.616 238.481 C 186.497 234.862 190.060 225.624 186.650 217.650 L 164.730 134.350 L 218.730 110.590 C 225.645 107.508 229.375 99.930 227.600 92.570 Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
