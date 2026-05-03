package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) return _headCircuit!!
        _headCircuit = phosphorFillIcon(
            name = "HeadCircuit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 72.000 C 120.000 67.582 123.582 64.000 128.000 64.000 C 132.418 64.000 136.000 67.582 136.000 72.000 C 136.000 76.418 132.418 80.000 128.000 80.000 C 123.582 80.000 120.000 76.418 120.000 72.000 ZM 144.000 136.000 C 144.000 140.418 147.582 144.000 152.000 144.000 C 156.418 144.000 160.000 140.418 160.000 136.000 C 160.000 131.582 156.418 128.000 152.000 128.000 C 147.582 128.000 144.000 131.582 144.000 136.000 ZM 192.500 171.470 C 213.004 154.251 224.590 128.659 224.000 101.890 Q 224.000 100.790 223.910 99.700 C 223.778 97.589 222.025 95.946 219.910 95.950 L 195.750 95.950 L 172.620 123.700 C 178.585 133.753 176.440 146.641 167.540 154.220 C 158.640 161.798 145.575 161.862 136.601 154.372 C 127.627 146.881 125.355 134.015 131.220 123.904 C 137.086 113.793 149.383 109.378 160.340 113.450 L 185.850 82.830 C 187.380 81.023 189.632 79.987 192.000 80.000 L 215.140 80.000 C 216.442 80.002 217.664 79.369 218.414 78.304 C 219.165 77.239 219.350 75.876 218.910 74.650 C 207.270 42.000 176.860 18.000 140.740 16.080 L 140.150 16.080 C 139.063 16.039 138.007 16.443 137.224 17.197 C 136.441 17.952 135.999 18.993 136.000 20.080 L 136.000 49.330 C 147.020 53.226 153.631 64.495 151.654 76.016 C 149.678 87.536 139.689 95.957 128.000 95.957 C 116.311 95.957 106.322 87.536 104.346 76.016 C 102.369 64.495 108.980 53.226 120.000 49.330 L 120.000 22.330 C 120.003 21.111 119.450 19.957 118.498 19.196 C 117.546 18.434 116.299 18.149 115.110 18.420 C 76.427 27.920 48.920 62.178 48.000 102.000 L 25.550 145.140 L 25.330 145.590 C 21.932 153.389 25.232 162.484 32.840 166.290 L 33.090 166.410 L 56.000 176.900 L 56.000 207.900 C 56.000 216.737 63.163 223.900 72.000 223.900 L 112.000 223.900 L 112.000 231.900 C 112.000 236.318 115.582 239.900 120.000 239.900 L 191.770 239.900 C 193.186 239.913 194.582 239.569 195.830 238.900 C 198.711 237.329 200.341 234.157 199.940 230.900 Z"),
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
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
