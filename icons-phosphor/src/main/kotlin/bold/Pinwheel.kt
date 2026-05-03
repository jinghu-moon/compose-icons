package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorBoldIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 215.520 L 188.490 171.520 C 220.110 158.387 235.794 122.693 224.080 90.520 C 221.812 84.293 214.927 81.083 208.700 83.350 L 173.090 96.350 C 180.872 73.067 174.650 47.385 157.075 30.245 C 139.501 13.105 113.671 7.528 90.590 15.890 C 84.363 18.158 81.153 25.043 83.420 31.270 L 96.420 66.880 C 73.122 59.070 47.409 65.288 30.255 82.882 C 13.100 100.475 7.534 126.337 15.930 149.430 C 18.198 155.657 25.083 158.867 31.310 156.600 L 66.920 143.600 C 59.057 166.904 65.258 192.652 82.867 209.821 C 100.476 226.991 126.372 232.539 149.470 224.090 C 155.697 221.822 158.907 214.937 156.640 208.710 L 143.690 173.120 C 148.769 174.831 154.044 175.893 159.390 176.280 L 215.560 232.450 C 220.254 237.144 227.866 237.144 232.560 232.450 C 237.254 227.756 237.254 220.144 232.560 215.450 ZM 129.380 39.780 C 142.053 45.689 150.721 57.788 152.240 71.688 C 153.759 85.589 147.908 99.273 136.810 107.780 L 110.700 36.050 C 117.137 35.763 123.547 37.043 129.380 39.780 ZM 36.050 129.320 C 35.247 111.846 45.892 95.878 62.329 89.896 C 78.767 83.914 97.185 89.307 107.800 103.210 ZM 110.640 200.240 C 97.967 194.331 89.299 182.232 87.780 168.332 C 86.261 154.431 92.112 140.747 103.210 132.240 L 129.320 204.000 C 122.881 204.276 116.471 202.986 110.640 200.240 ZM 147.090 148.730 C 141.242 146.017 136.140 141.927 132.220 136.810 L 204.000 110.700 C 204.613 124.670 197.886 137.946 186.259 145.715 C 174.631 153.483 159.791 154.615 147.120 148.700 Z"),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
