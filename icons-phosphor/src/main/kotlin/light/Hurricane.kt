package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorLightIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 98.000 C 111.431 98.000 98.000 111.431 98.000 128.000 C 98.000 144.569 111.431 158.000 128.000 158.000 C 144.569 158.000 158.000 144.569 158.000 128.000 C 158.000 111.431 144.569 98.000 128.000 98.000 ZM 128.000 146.000 C 118.059 146.000 110.000 137.941 110.000 128.000 C 110.000 118.059 118.059 110.000 128.000 110.000 C 137.941 110.000 146.000 118.059 146.000 128.000 C 146.000 137.941 137.941 146.000 128.000 146.000 ZM 155.910 46.630 L 165.800 9.540 C 166.338 7.522 165.787 5.369 164.346 3.857 C 162.905 2.345 160.782 1.691 158.740 2.130 C 138.182 7.182 118.589 15.567 100.740 26.950 C 62.320 51.660 42.000 86.600 42.000 128.000 C 42.020 164.739 65.349 197.418 100.090 209.370 L 90.200 246.450 C 89.658 248.470 90.207 250.626 91.648 252.141 C 93.090 253.656 95.216 254.311 97.260 253.870 C 117.818 248.818 137.411 240.433 155.260 229.050 C 193.680 204.340 214.000 169.400 214.000 128.000 C 213.983 91.260 190.652 58.579 155.910 46.630 ZM 149.050 218.760 C 135.170 227.572 120.191 234.522 104.500 239.430 L 113.180 206.860 C 113.589 205.322 113.369 203.684 112.571 202.308 C 111.772 200.931 110.458 199.928 108.920 199.520 C 76.537 190.857 54.011 161.522 54.000 128.000 C 54.000 90.470 71.820 59.930 107.000 37.230 C 120.867 28.428 135.828 21.483 151.500 16.570 L 142.820 49.140 C 142.411 50.678 142.631 52.316 143.429 53.692 C 144.228 55.069 145.542 56.072 147.080 56.480 C 179.463 65.143 201.989 94.478 202.000 128.000 C 202.000 165.530 184.180 196.070 149.050 218.760 Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
