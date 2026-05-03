package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorLightIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 138.000 72.000 C 138.000 68.686 140.686 66.000 144.000 66.000 L 201.510 66.000 L 179.760 44.240 C 177.557 41.876 177.622 38.192 179.907 35.907 C 182.192 33.622 185.876 33.557 188.240 35.760 L 220.240 67.760 C 222.580 70.103 222.580 73.897 220.240 76.240 L 188.240 108.240 C 185.876 110.443 182.192 110.378 179.907 108.093 C 177.622 105.808 177.557 102.124 179.760 99.760 L 201.510 78.000 L 144.000 78.000 C 140.686 78.000 138.000 75.314 138.000 72.000 ZM 221.890 182.830 C 218.332 209.861 195.264 230.052 168.000 230.000 C 89.700 230.000 26.000 166.300 26.000 88.000 C 25.948 60.736 46.139 37.668 73.170 34.110 C 79.349 33.359 85.281 36.778 87.730 42.500 L 108.830 89.610 C 110.719 93.939 110.298 98.929 107.710 102.880 C 107.581 103.078 107.441 103.268 107.290 103.450 L 86.220 128.510 C 85.961 129.036 85.961 129.654 86.220 130.180 C 93.880 145.870 110.320 162.180 126.220 169.830 C 126.758 170.075 127.381 170.053 127.900 169.770 L 152.590 148.770 C 152.766 148.617 152.953 148.476 153.150 148.350 C 157.086 145.726 162.082 145.267 166.430 147.130 L 213.670 168.300 C 219.314 170.801 222.653 176.704 221.890 182.830 ZM 210.000 181.320 C 210.069 180.462 209.581 179.657 208.790 179.320 L 161.540 158.150 C 161.013 157.956 160.429 157.992 159.930 158.250 L 135.260 179.250 C 135.080 179.400 134.890 179.540 134.700 179.670 C 130.605 182.401 125.377 182.780 120.930 180.670 C 102.570 171.800 84.270 153.670 75.400 135.480 C 73.278 131.060 73.623 125.852 76.310 121.750 C 76.439 121.549 76.583 121.359 76.740 121.180 L 97.790 96.090 C 98.034 95.560 98.034 94.950 97.790 94.420 L 76.740 47.310 C 76.456 46.536 75.725 46.015 74.900 46.000 L 74.670 46.000 C 53.631 48.799 37.935 66.775 38.000 88.000 C 38.000 159.680 96.320 218.000 168.000 218.000 C 189.228 218.064 207.206 202.363 210.000 181.320 Z"),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
