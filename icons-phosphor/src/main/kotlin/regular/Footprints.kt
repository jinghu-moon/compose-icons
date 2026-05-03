package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorRegularIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.060 184.000 L 152.000 184.000 C 147.582 184.000 144.000 187.582 144.000 192.000 L 144.000 204.000 C 144.000 223.896 160.129 240.025 180.025 240.025 C 199.921 240.025 216.050 223.896 216.050 204.000 L 216.050 192.000 C 216.050 187.586 212.474 184.006 208.060 184.000 ZM 200.060 204.000 C 200.060 215.046 191.106 224.000 180.060 224.000 C 169.014 224.000 160.060 215.046 160.060 204.000 L 160.060 200.000 L 200.060 200.000 ZM 104.000 160.000 L 48.000 160.000 C 43.582 160.000 40.000 163.582 40.000 168.000 L 40.000 180.000 C 40.000 199.882 56.118 216.000 76.000 216.000 C 95.882 216.000 112.000 199.882 112.000 180.000 L 112.000 168.000 C 112.000 163.582 108.418 160.000 104.000 160.000 ZM 96.000 180.000 C 96.000 191.046 87.046 200.000 76.000 200.000 C 64.954 200.000 56.000 191.046 56.000 180.000 L 56.000 176.000 L 96.000 176.000 ZM 76.000 16.000 C 64.360 16.000 53.070 26.310 44.200 45.000 C 30.270 74.380 25.640 118.000 44.490 141.000 C 46.012 142.858 48.288 143.934 50.690 143.930 L 101.240 143.930 C 103.642 143.934 105.918 142.858 107.440 141.000 C 126.290 118.000 121.660 74.350 107.730 45.000 C 98.850 26.310 87.570 16.000 76.000 16.000 ZM 97.150 128.000 L 54.780 128.000 C 43.380 109.900 47.570 75.300 58.670 51.890 C 65.140 38.220 72.170 32.000 76.000 32.000 C 79.830 32.000 86.820 38.220 93.300 51.890 C 104.360 75.300 108.550 109.900 97.150 128.000 ZM 154.760 168.000 L 205.310 168.000 C 207.712 168.004 209.988 166.928 211.510 165.070 C 230.360 142.070 225.730 98.420 211.800 69.070 C 202.930 50.310 191.640 40.000 180.000 40.000 C 168.360 40.000 157.110 50.310 148.230 69.000 C 134.300 98.380 129.670 142.000 148.520 165.000 C 150.042 166.889 152.334 167.991 154.760 168.000 ZM 162.760 75.890 C 169.220 62.220 176.250 56.000 180.000 56.000 C 183.750 56.000 190.820 62.220 197.290 75.890 C 208.390 99.300 212.580 133.890 201.190 152.000 L 158.850 152.000 C 147.450 133.900 151.640 99.300 162.740 75.890 Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
