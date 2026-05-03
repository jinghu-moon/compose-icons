package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorLightIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.400 167.840 C 201.710 155.690 198.000 135.120 198.000 120.000 C 198.000 101.580 211.860 85.710 220.120 77.880 C 221.316 76.747 221.993 75.172 221.993 73.525 C 221.993 71.878 221.316 70.303 220.120 69.170 C 208.000 57.700 187.070 50.000 168.000 50.000 C 153.700 50.013 139.745 54.392 128.000 62.550 C 100.230 43.151 62.527 46.562 38.690 70.630 C 24.944 84.680 17.479 103.701 18.000 123.350 C 18.795 156.904 33.039 188.731 57.530 211.680 C 64.578 218.331 73.909 222.024 83.600 222.000 L 171.300 222.000 C 181.788 222.035 191.820 217.714 199.000 210.070 C 205.812 202.749 211.702 194.622 216.540 185.870 C 223.090 173.870 222.310 172.120 221.540 170.390 C 221.078 169.357 220.337 168.474 219.400 167.840 ZM 190.170 201.840 C 185.281 207.055 178.448 210.009 171.300 210.000 L 83.600 210.000 C 76.983 210.033 70.605 207.528 65.780 203.000 C 43.597 182.218 30.703 153.389 30.000 123.000 C 29.542 106.608 35.752 90.731 47.210 79.000 C 57.956 68.062 72.666 61.931 88.000 62.000 L 88.810 62.000 C 101.717 62.128 114.204 66.606 124.250 74.710 C 126.442 76.465 129.558 76.465 131.750 74.710 C 142.015 66.435 154.815 61.947 168.000 62.000 C 181.890 62.000 196.810 66.680 207.110 74.000 C 197.670 84.140 186.010 100.590 186.010 120.000 C 186.010 143.780 193.820 162.600 208.670 174.770 C 203.931 184.705 197.691 193.852 190.170 201.890 ZM 130.170 30.450 C 134.525 13.679 149.673 1.977 167.000 2.000 L 168.000 2.000 C 171.314 2.000 174.000 4.686 174.000 8.000 C 174.000 11.314 171.314 14.000 168.000 14.000 L 167.000 14.000 C 155.142 13.997 144.785 22.018 141.820 33.500 C 140.992 36.709 137.719 38.638 134.510 37.810 C 131.301 36.982 129.372 33.709 130.200 30.500 Z"),
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
