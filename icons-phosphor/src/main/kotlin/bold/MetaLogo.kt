package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorBoldIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 149.310 C 244.000 166.150 240.630 180.640 234.250 191.220 C 226.060 204.810 213.330 212.000 197.440 212.000 C 167.110 212.000 146.720 173.950 125.140 133.670 C 109.460 104.410 90.000 68.000 74.000 68.000 C 66.290 68.000 56.840 77.370 49.340 92.450 C 40.761 110.190 36.206 129.606 36.000 149.310 C 36.000 161.610 38.240 172.090 42.300 178.830 C 46.070 185.090 51.240 188.000 58.560 188.000 C 72.310 188.000 89.190 159.000 94.740 149.510 C 98.079 143.783 105.428 141.846 111.155 145.185 C 116.882 148.524 118.819 155.873 115.480 161.600 C 106.570 176.880 98.950 187.600 91.480 195.380 C 80.750 206.560 70.000 212.000 58.560 212.000 C 42.670 212.000 29.940 204.810 21.750 191.220 C 15.370 180.640 12.000 166.150 12.000 149.310 C 12.000 105.340 35.580 44.000 74.000 44.000 C 104.330 44.000 124.720 82.050 146.300 122.330 C 162.000 151.590 181.470 188.000 197.440 188.000 C 204.760 188.000 209.930 185.090 213.700 178.830 C 217.760 172.090 220.000 161.610 220.000 149.310 C 219.797 129.606 215.245 110.191 206.670 92.450 C 199.170 77.370 189.720 68.000 182.000 68.000 C 176.280 68.000 169.390 73.000 161.510 82.830 C 157.368 88.005 149.815 88.842 144.640 84.700 C 139.465 80.558 138.628 73.005 142.770 67.830 C 155.620 51.800 168.450 44.000 182.000 44.000 C 199.650 44.000 216.000 57.410 228.150 81.760 C 238.342 102.835 243.754 125.901 244.000 149.310 Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
