package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorLightIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 147.760 108.240 C 145.420 105.897 145.420 102.103 147.760 99.760 L 185.520 62.000 L 160.000 62.000 C 156.686 62.000 154.000 59.314 154.000 56.000 C 154.000 52.686 156.686 50.000 160.000 50.000 L 200.000 50.000 C 203.314 50.000 206.000 52.686 206.000 56.000 L 206.000 96.000 C 206.000 99.314 203.314 102.000 200.000 102.000 C 196.686 102.000 194.000 99.314 194.000 96.000 L 194.000 70.480 L 156.240 108.240 C 153.897 110.580 150.103 110.580 147.760 108.240 ZM 221.890 182.830 C 218.332 209.861 195.264 230.052 168.000 230.000 C 89.700 230.000 26.000 166.300 26.000 88.000 C 25.943 60.734 46.137 37.664 73.170 34.110 C 79.346 33.358 85.278 36.772 87.730 42.490 L 108.830 89.600 C 110.719 93.929 110.298 98.919 107.710 102.870 C 107.581 103.071 107.441 103.265 107.290 103.450 L 86.220 128.450 C 85.960 128.980 85.960 129.600 86.220 130.130 C 93.880 145.810 110.320 162.130 126.220 169.780 C 126.758 170.025 127.381 170.003 127.900 169.720 L 152.590 148.720 C 152.766 148.567 152.953 148.426 153.150 148.300 C 157.086 145.676 162.082 145.217 166.430 147.080 L 213.670 168.250 C 219.333 170.757 222.677 176.687 221.890 182.830 ZM 210.000 181.320 C 210.069 180.462 209.581 179.657 208.790 179.320 L 161.540 158.150 C 161.018 157.948 160.433 157.985 159.940 158.250 L 135.260 179.250 C 135.080 179.400 134.890 179.540 134.700 179.670 C 130.605 182.401 125.377 182.780 120.930 180.670 C 102.570 171.800 84.270 153.670 75.400 135.480 C 73.278 131.060 73.623 125.852 76.310 121.750 C 76.439 121.549 76.583 121.359 76.740 121.180 L 97.790 96.090 C 98.034 95.560 98.034 94.950 97.790 94.420 L 76.740 47.310 C 76.456 46.536 75.725 46.015 74.900 46.000 L 74.670 46.000 C 53.628 48.795 37.931 66.774 38.000 88.000 C 38.000 159.680 96.320 218.000 168.000 218.000 C 189.228 218.064 207.206 202.363 210.000 181.320 Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
