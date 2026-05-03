package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorBoldIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.000 45.000 C 224.726 43.044 219.703 43.763 216.150 46.840 C 191.440 68.250 171.620 60.150 141.330 45.160 C 113.190 31.270 78.170 13.940 40.140 46.880 C 37.497 49.171 35.985 52.502 36.000 56.000 L 36.000 224.000 C 36.000 230.627 41.373 236.000 48.000 236.000 C 54.627 236.000 60.000 230.627 60.000 224.000 L 60.000 181.710 C 82.840 164.580 102.100 172.600 130.680 186.710 C 146.910 194.710 165.420 203.910 185.480 203.910 C 200.200 203.910 215.760 198.970 231.860 185.030 C 234.480 182.759 235.989 179.467 236.000 176.000 L 236.000 56.000 C 236.036 51.275 233.296 46.969 229.000 45.000 ZM 185.480 83.910 C 194.639 83.917 203.689 81.928 212.000 78.080 L 212.000 110.230 C 201.000 118.490 190.800 120.900 180.000 119.600 L 180.000 83.660 C 181.810 83.810 183.640 83.910 185.480 83.910 ZM 156.000 78.080 L 156.000 112.170 C 151.360 110.170 146.500 107.770 141.320 105.170 C 133.092 100.934 124.639 97.148 116.000 93.830 L 116.000 59.750 C 120.640 61.750 125.500 64.150 130.680 66.750 C 138.906 70.987 147.359 74.769 156.000 78.080 ZM 92.000 52.320 L 92.000 88.240 C 81.027 87.296 69.997 89.229 60.000 93.850 L 60.000 61.680 C 71.000 53.420 81.200 51.000 92.000 52.320 ZM 86.520 148.000 C 77.359 148.002 68.309 150.002 60.000 153.860 L 60.000 121.700 C 71.000 113.450 81.200 111.040 92.000 112.340 L 92.000 148.280 C 90.190 148.130 88.360 148.000 86.520 148.000 ZM 116.000 153.860 L 116.000 119.770 C 120.640 121.770 125.500 124.170 130.680 126.770 C 138.906 131.007 147.359 134.789 156.000 138.100 L 156.000 172.190 C 151.360 170.140 146.500 167.790 141.320 165.190 C 133.096 160.949 124.643 157.166 116.000 153.860 ZM 180.000 179.620 L 180.000 143.680 C 181.810 143.820 183.640 143.920 185.480 143.920 C 194.641 143.926 203.692 141.929 212.000 138.070 L 212.000 170.260 C 201.000 178.520 190.800 180.920 180.000 179.620 Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
