package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorThinIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.270 169.490 C 199.860 156.840 196.000 135.600 196.000 120.000 C 196.000 100.830 210.250 84.470 218.750 76.430 C 219.548 75.675 220.000 74.624 220.000 73.525 C 220.000 72.426 219.548 71.375 218.750 70.620 C 207.000 59.480 186.590 52.000 168.000 52.000 C 153.631 52.018 139.634 56.567 128.000 65.000 C 101.004 45.288 63.655 48.263 40.120 72.000 C 26.746 85.672 19.487 104.182 20.000 123.300 C 20.782 156.318 34.799 187.638 58.900 210.220 C 65.575 216.526 74.417 220.027 83.600 220.000 L 171.300 220.000 C 181.217 220.019 190.699 215.928 197.490 208.700 C 204.190 201.507 209.980 193.517 214.730 184.910 C 220.810 173.810 220.150 172.290 219.670 171.190 C 219.372 170.503 218.887 169.915 218.270 169.490 ZM 191.630 203.260 C 186.353 208.858 178.993 212.022 171.300 212.000 L 83.600 212.000 C 76.466 212.019 69.597 209.299 64.410 204.400 C 41.856 183.280 28.736 153.981 28.000 123.090 C 27.541 106.160 33.968 89.768 45.810 77.660 C 56.912 66.319 72.129 59.950 88.000 60.000 L 88.840 60.000 C 102.191 60.136 115.106 64.769 125.500 73.150 C 126.961 74.320 129.039 74.320 130.500 73.150 C 141.118 64.588 154.360 59.944 168.000 60.000 C 183.120 60.000 199.450 65.410 210.110 73.730 C 200.680 83.420 188.000 100.160 188.000 120.000 C 188.000 143.790 196.000 162.440 211.120 174.170 C 206.255 184.865 199.671 194.692 191.630 203.260 ZM 132.130 31.000 C 136.235 15.101 150.579 3.994 167.000 4.000 L 168.000 4.000 C 170.209 4.000 172.000 5.791 172.000 8.000 C 172.000 10.209 170.209 12.000 168.000 12.000 L 167.000 12.000 C 154.229 11.996 143.073 20.634 139.880 33.000 C 139.423 34.769 137.827 36.003 136.000 36.000 C 135.662 36.000 135.326 35.957 135.000 35.870 C 132.864 35.316 131.579 33.137 132.130 31.000 Z"),
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
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
