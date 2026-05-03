package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorFillIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 144.000 L 123.300 144.000 L 145.710 121.590 C 153.812 125.670 162.739 127.846 171.810 127.950 C 180.940 127.974 189.900 125.476 197.700 120.730 C 221.420 106.370 234.130 73.130 231.700 31.810 C 231.463 27.759 228.231 24.527 224.180 24.290 C 182.860 21.860 149.620 34.570 135.250 58.290 C 125.900 73.740 125.660 92.400 134.390 110.290 L 120.000 124.680 L 107.790 112.470 C 113.790 99.220 113.360 85.470 106.400 73.990 C 95.530 56.000 70.610 46.410 39.730 48.220 C 35.686 48.461 32.461 51.686 32.220 55.730 C 30.400 86.600 40.000 111.520 58.000 122.400 C 64.022 126.077 70.944 128.015 78.000 128.000 C 84.401 127.937 90.715 126.508 96.520 123.810 L 108.690 136.000 L 100.690 144.000 L 56.000 144.000 C 51.582 144.000 48.000 147.582 48.000 152.000 C 48.000 156.418 51.582 160.000 56.000 160.000 L 65.590 160.000 L 78.800 219.470 C 80.389 226.815 86.906 232.042 94.420 232.000 L 161.590 232.000 C 169.102 232.035 175.614 226.810 177.210 219.470 L 190.420 160.000 L 200.000 160.000 C 204.418 160.000 208.000 156.418 208.000 152.000 C 208.000 147.582 204.418 144.000 200.000 144.000 Z"),
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
