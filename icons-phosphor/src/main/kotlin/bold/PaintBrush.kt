package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorBoldIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 32.000 C 236.000 25.373 230.627 20.000 224.000 20.000 C 179.220 20.000 134.000 68.540 108.100 102.000 C 88.929 97.050 68.546 101.252 52.895 113.381 C 37.245 125.510 28.090 144.200 28.100 164.000 C 28.100 176.000 25.000 186.710 18.870 195.760 C 16.296 199.684 13.097 203.160 9.400 206.050 C 4.973 208.924 2.973 214.374 4.490 219.430 C 6.039 224.544 10.767 228.030 16.110 228.000 L 92.110 228.000 C 111.891 227.976 130.549 218.807 142.653 203.161 C 154.756 187.516 158.945 167.153 154.000 148.000 C 187.490 122.050 236.000 76.800 236.000 32.000 ZM 209.620 46.390 C 205.620 59.310 196.470 73.880 182.700 89.300 C 179.700 92.690 176.540 96.000 173.350 99.190 C 168.485 93.087 162.950 87.549 156.850 82.680 C 160.040 79.490 163.340 76.360 166.730 73.330 C 182.150 59.550 196.710 50.430 209.620 46.390 ZM 92.070 204.000 L 42.000 204.000 C 48.812 191.780 52.308 177.990 52.140 164.000 C 52.140 141.909 70.049 124.000 92.140 124.000 C 114.231 124.000 132.140 141.909 132.140 164.000 C 132.140 186.091 114.231 204.000 92.140 204.000 ZM 130.250 112.680 C 133.370 108.750 136.800 104.590 140.480 100.330 C 146.216 104.705 151.339 109.831 155.710 115.570 C 151.450 119.250 147.290 122.680 143.360 125.800 C 139.646 120.817 135.230 116.398 130.250 112.680 Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
