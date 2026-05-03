package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorBoldIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.900 152.000 C 251.570 150.530 229.150 126.150 192.690 111.310 C 190.540 93.030 183.590 76.410 172.590 63.600 C 157.120 45.520 134.790 36.000 108.000 36.000 C 54.440 36.000 19.690 83.790 18.240 85.820 C 14.374 91.213 15.612 98.719 21.005 102.585 C 26.398 106.451 33.904 105.213 37.770 99.820 C 38.050 99.380 66.650 60.000 108.000 60.000 C 127.850 60.000 143.450 66.450 154.380 79.180 C 160.245 86.159 164.481 94.358 166.780 103.180 C 156.864 101.058 146.751 99.992 136.610 100.000 C 109.610 100.000 86.820 107.130 70.760 120.630 C 56.300 132.790 48.000 149.780 48.000 167.250 C 48.000 193.460 67.440 220.000 104.610 220.000 C 156.540 220.000 186.950 179.720 192.480 137.570 C 208.299 145.262 222.708 155.566 235.100 168.050 C 237.895 171.495 242.363 173.116 246.717 172.266 C 251.071 171.416 254.601 168.233 255.896 163.990 C 257.190 159.747 256.038 155.136 252.900 152.000 ZM 152.370 173.740 C 144.090 183.900 129.090 196.000 104.610 196.000 C 82.080 196.000 72.000 181.560 72.000 167.250 C 72.000 146.420 92.220 124.000 136.610 124.000 C 147.651 124.029 158.635 125.584 169.250 128.620 C 168.240 145.440 162.210 161.660 152.370 173.740 Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
