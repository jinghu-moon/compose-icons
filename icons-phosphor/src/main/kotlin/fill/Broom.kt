package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorFillIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.290 216.700 C 212.860 205.690 200.000 182.120 200.000 152.000 L 200.000 134.690 C 200.017 128.129 196.013 122.228 189.910 119.820 L 161.260 108.360 C 157.174 106.724 155.176 102.095 156.790 98.000 L 179.110 41.330 C 184.000 28.790 178.000 14.210 165.340 9.510 C 153.080 4.951 139.428 11.048 134.640 23.220 L 112.250 80.080 C 111.470 82.061 109.934 83.649 107.980 84.493 C 106.026 85.338 103.817 85.369 101.840 84.580 L 73.110 73.080 C 67.111 70.652 60.240 72.099 55.730 76.740 C 34.680 98.400 24.000 123.710 24.000 152.000 C 23.945 180.903 35.113 208.699 55.150 229.530 C 56.680 231.119 58.794 232.012 61.000 232.000 L 232.000 232.000 C 236.234 232.008 239.741 228.716 240.000 224.490 C 240.145 221.181 238.288 218.109 235.290 216.700 ZM 115.110 216.000 C 103.275 204.645 94.869 190.192 90.850 174.290 C 89.845 170.137 85.822 167.449 81.600 168.110 C 79.408 168.506 77.480 169.798 76.280 171.675 C 75.081 173.552 74.718 175.844 75.280 178.000 C 78.774 191.776 85.019 204.702 93.640 216.000 L 64.440 216.000 C 48.668 198.417 39.963 175.620 40.000 152.000 C 39.901 139.481 42.540 127.092 47.730 115.700 L 185.530 170.830 C 188.530 188.890 196.080 204.330 207.420 216.020 Z"),
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
        return _broom!!
    }

private var _broom: ImageVector? = null
