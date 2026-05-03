package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorDuotoneIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 184.000 152.000 L 169.390 217.740 C 168.575 221.399 165.328 224.001 161.580 224.000 L 94.420 224.000 C 90.672 224.001 87.425 221.399 86.610 217.740 L 72.000 152.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 200.000 144.000 L 123.300 144.000 L 125.650 141.650 L 125.650 141.650 L 145.710 121.590 C 153.812 125.670 162.739 127.846 171.810 127.950 C 180.940 127.974 189.900 125.476 197.700 120.730 C 221.420 106.370 234.130 73.130 231.700 31.810 C 231.463 27.759 228.231 24.527 224.180 24.290 C 182.860 21.870 149.620 34.570 135.250 58.290 C 125.900 73.740 125.660 92.400 134.390 110.290 L 120.000 124.680 L 107.790 112.470 C 113.790 99.220 113.360 85.470 106.400 73.990 C 95.530 56.000 70.600 46.400 39.730 48.220 C 35.686 48.461 32.461 51.686 32.220 55.730 C 30.400 86.600 40.000 111.520 58.000 122.400 C 64.022 126.077 70.944 128.015 78.000 128.000 C 84.401 127.937 90.715 126.508 96.520 123.810 L 108.690 136.000 L 100.690 144.000 L 56.000 144.000 C 51.582 144.000 48.000 147.582 48.000 152.000 C 48.000 156.418 51.582 160.000 56.000 160.000 L 65.590 160.000 L 78.800 219.470 C 80.389 226.815 86.906 232.042 94.420 232.000 L 161.590 232.000 C 169.102 232.035 175.614 226.810 177.210 219.470 L 190.420 160.000 L 200.000 160.000 C 204.418 160.000 208.000 156.418 208.000 152.000 C 208.000 147.582 204.418 144.000 200.000 144.000 ZM 149.000 66.580 C 159.460 49.320 184.230 39.580 216.000 40.010 C 216.410 71.820 206.690 96.590 189.430 107.010 C 177.920 114.010 164.030 113.550 150.150 105.830 C 142.420 92.000 142.000 78.090 149.000 66.580 ZM 92.110 108.110 C 82.910 113.030 73.800 113.260 66.280 108.710 C 54.780 101.740 48.150 85.310 48.000 64.000 C 69.310 64.150 85.750 70.780 92.710 82.280 C 97.270 89.800 97.000 98.910 92.110 108.110 ZM 161.590 216.000 L 94.420 216.000 L 82.000 160.000 L 174.000 160.000 Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
