package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorFillIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 197.200 176.870 C 184.130 188.050 172.300 191.970 161.560 191.970 C 147.300 191.970 134.940 185.050 124.090 178.970 C 105.680 168.660 91.140 160.520 69.200 179.280 C 65.842 182.152 60.792 181.758 57.920 178.400 C 55.048 175.042 55.442 169.992 58.800 167.120 C 89.220 141.120 112.890 154.360 131.910 165.010 C 150.320 175.320 164.910 183.460 186.800 164.700 C 190.158 161.828 195.208 162.222 198.080 165.580 C 200.952 168.938 200.558 173.988 197.200 176.860 ZM 197.200 132.870 C 184.130 144.050 172.300 147.970 161.560 147.970 C 147.300 147.970 134.940 141.050 124.090 134.970 C 105.680 124.660 91.140 116.520 69.200 135.280 C 65.842 138.152 60.792 137.758 57.920 134.400 C 55.048 131.042 55.442 125.992 58.800 123.120 C 89.220 97.120 112.890 110.360 131.910 121.010 C 150.320 131.320 164.910 139.460 186.800 120.700 C 190.158 117.828 195.208 118.222 198.080 121.580 C 200.952 124.938 200.558 129.988 197.200 132.860 ZM 197.200 88.870 C 184.130 100.050 172.300 103.970 161.560 103.970 C 147.300 103.970 134.940 97.050 124.090 90.970 C 105.680 80.660 91.140 72.520 69.200 91.280 C 65.832 93.997 60.914 93.543 58.100 90.256 C 55.286 86.968 55.596 82.039 58.800 79.130 C 89.220 53.130 112.890 66.370 131.910 77.020 C 150.320 87.330 164.910 95.470 186.800 76.710 C 190.158 73.838 195.208 74.232 198.080 77.590 C 200.952 80.948 200.558 85.998 197.200 88.870 Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
