package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorBoldIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 120.000 C 200.000 128.837 192.837 136.000 184.000 136.000 C 175.163 136.000 168.000 128.837 168.000 120.000 C 168.000 111.163 175.163 104.000 184.000 104.000 C 192.837 104.000 200.000 111.163 200.000 120.000 ZM 156.000 64.000 L 116.000 64.000 C 109.373 64.000 104.000 69.373 104.000 76.000 C 104.000 82.627 109.373 88.000 116.000 88.000 L 156.000 88.000 C 162.627 88.000 168.000 82.627 168.000 76.000 C 168.000 69.373 162.627 64.000 156.000 64.000 ZM 256.000 112.000 L 256.000 144.000 C 256.002 159.286 243.744 171.749 228.460 172.000 L 213.200 214.730 C 210.355 222.690 202.813 228.003 194.360 228.000 L 181.640 228.000 C 173.187 228.003 165.645 222.690 162.800 214.730 L 161.800 212.000 L 110.170 212.000 L 109.170 214.730 C 106.329 222.680 98.802 227.990 90.360 228.000 L 77.640 228.000 C 69.187 228.003 61.645 222.690 58.800 214.730 L 46.500 180.280 C 35.987 168.179 28.832 153.531 25.750 137.800 C 24.608 139.667 24.003 141.812 24.000 144.000 C 24.000 150.627 18.627 156.000 12.000 156.000 C 5.373 156.000 -0.000 150.627 -0.000 144.000 C 0.023 128.535 9.903 114.805 24.560 109.870 C 29.779 63.294 69.133 28.059 116.000 28.000 L 220.000 28.000 C 226.627 28.000 232.000 33.373 232.000 40.000 C 232.000 46.627 226.627 52.000 220.000 52.000 L 210.000 52.000 C 219.636 60.773 227.299 71.493 232.480 83.450 L 232.900 84.450 C 246.247 86.843 255.971 98.440 256.000 112.000 ZM 232.000 112.000 C 232.000 109.791 230.209 108.000 228.000 108.000 L 224.340 108.000 C 219.096 108.000 214.459 104.594 212.890 99.590 C 203.975 71.257 177.702 51.989 148.000 52.000 L 116.000 52.000 C 89.035 51.998 64.616 67.930 53.755 92.611 C 42.894 117.292 47.643 146.059 65.860 165.940 C 66.942 167.114 67.775 168.495 68.310 170.000 L 80.460 204.000 L 87.540 204.000 L 90.410 196.000 C 92.103 191.210 96.630 188.006 101.710 188.000 L 170.290 188.000 C 175.370 188.006 179.897 191.210 181.590 196.000 L 184.460 204.000 L 191.540 204.000 L 208.700 156.000 C 210.393 151.210 214.920 148.006 220.000 148.000 L 228.000 148.000 C 230.209 148.000 232.000 146.209 232.000 144.000 Z"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
