package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorLightIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 147.760 99.760 L 167.520 80.000 L 147.760 60.240 C 145.557 57.876 145.622 54.192 147.907 51.907 C 150.192 49.622 153.876 49.557 156.240 51.760 L 176.000 71.510 L 195.760 51.760 C 198.124 49.557 201.808 49.622 204.093 51.907 C 206.378 54.192 206.443 57.876 204.240 60.240 L 184.480 80.000 L 204.240 99.760 C 205.845 101.256 206.506 103.508 205.963 105.634 C 205.420 107.760 203.760 109.420 201.634 109.963 C 199.508 110.506 197.256 109.845 195.760 108.240 L 176.000 88.480 L 156.240 108.240 C 153.876 110.443 150.192 110.378 147.907 108.093 C 145.622 105.808 145.557 102.124 147.760 99.760 ZM 221.890 182.830 C 218.332 209.861 195.264 230.052 168.000 230.000 C 89.700 230.000 26.000 166.300 26.000 88.000 C 25.948 60.736 46.139 37.668 73.170 34.110 C 79.346 33.358 85.278 36.772 87.730 42.490 L 108.830 89.600 C 110.723 93.932 110.301 98.926 107.710 102.880 C 107.581 103.078 107.441 103.268 107.290 103.450 L 86.220 128.510 C 85.961 129.036 85.961 129.654 86.220 130.180 C 93.880 145.860 110.320 162.180 126.220 169.830 C 126.758 170.075 127.381 170.053 127.900 169.770 L 152.590 148.770 C 152.766 148.617 152.953 148.476 153.150 148.350 C 157.086 145.726 162.082 145.267 166.430 147.130 L 213.670 168.300 C 219.314 170.801 222.653 176.704 221.890 182.830 ZM 210.000 181.320 C 210.069 180.462 209.581 179.657 208.790 179.320 L 161.540 158.150 C 161.018 157.948 160.433 157.985 159.940 158.250 L 135.260 179.250 C 135.080 179.400 134.890 179.540 134.700 179.670 C 130.605 182.401 125.377 182.780 120.930 180.670 C 102.570 171.800 84.270 153.670 75.400 135.480 C 73.278 131.060 73.623 125.852 76.310 121.750 C 76.439 121.549 76.583 121.359 76.740 121.180 L 97.790 96.090 C 98.034 95.560 98.034 94.950 97.790 94.420 L 76.740 47.310 C 76.456 46.536 75.725 46.015 74.900 46.000 L 74.670 46.000 C 53.631 48.799 37.935 66.775 38.000 88.000 C 38.000 159.680 96.320 218.000 168.000 218.000 C 189.228 218.064 207.206 202.363 210.000 181.320 Z"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
