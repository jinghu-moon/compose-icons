package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorFillIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 197.200 160.870 C 184.130 172.050 172.300 175.970 161.560 175.970 C 147.300 175.970 134.940 169.050 124.090 162.970 C 105.680 152.660 91.140 144.520 69.200 163.280 C 65.842 166.152 60.792 165.758 57.920 162.400 C 55.048 159.042 55.442 153.992 58.800 151.120 C 89.220 125.120 112.890 138.360 131.910 149.010 C 150.320 159.320 164.910 167.460 186.800 148.700 C 190.158 145.828 195.208 146.222 198.080 149.580 C 200.952 152.938 200.558 157.988 197.200 160.860 ZM 197.200 104.870 C 184.130 116.050 172.300 119.970 161.560 119.970 C 147.300 119.970 134.940 113.050 124.090 106.970 C 105.680 96.660 91.140 88.520 69.200 107.280 C 65.832 109.997 60.914 109.543 58.100 106.256 C 55.286 102.968 55.596 98.039 58.800 95.130 C 89.220 69.130 112.890 82.370 131.910 93.020 C 150.320 103.330 164.910 111.470 186.800 92.710 C 190.158 89.838 195.208 90.232 198.080 93.590 C 200.952 96.948 200.558 101.998 197.200 104.870 Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
