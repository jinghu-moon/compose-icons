package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorLightIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 219.760 L 177.380 168.900 C 179.564 168.381 181.717 167.740 183.830 166.980 C 213.929 156.022 229.447 122.739 218.490 92.640 C 217.354 89.529 213.912 87.926 210.800 89.060 L 161.500 107.000 C 162.811 104.921 163.993 102.764 165.040 100.540 C 174.944 79.281 171.071 54.149 155.225 36.859 C 139.379 19.569 114.680 13.523 92.640 21.540 C 89.529 22.676 87.926 26.118 89.060 29.230 L 107.000 78.520 C 104.920 77.216 102.763 76.040 100.540 75.000 C 79.281 65.096 54.149 68.969 36.859 84.815 C 19.569 100.661 13.523 125.360 21.540 147.400 C 22.085 148.893 23.200 150.108 24.640 150.780 C 26.083 151.453 27.734 151.525 29.230 150.980 L 78.520 133.000 C 77.211 135.084 76.035 137.248 75.000 139.480 C 66.659 157.435 68.043 178.402 78.670 195.106 C 89.297 211.809 107.703 221.947 127.500 222.000 C 134.282 221.990 141.009 220.795 147.380 218.470 C 150.497 217.350 152.117 213.918 151.000 210.800 L 133.000 161.500 C 141.697 167.013 151.709 170.103 162.000 170.450 L 219.790 228.240 C 222.154 230.443 225.838 230.378 228.123 228.093 C 230.408 225.808 230.473 222.124 228.270 219.760 ZM 102.520 31.110 C 125.066 26.095 147.835 38.576 155.734 60.279 C 163.634 81.983 154.215 106.180 133.720 116.830 ZM 31.110 137.500 C 26.095 114.954 38.576 92.185 60.279 84.286 C 81.983 76.386 106.180 85.805 116.830 106.300 ZM 137.500 208.900 C 114.954 213.915 92.185 201.434 84.286 179.731 C 76.386 158.027 85.805 133.830 106.300 123.180 ZM 164.450 158.490 C 147.131 158.647 131.187 149.078 123.180 133.720 L 208.900 102.520 C 211.892 116.053 208.631 130.214 200.022 141.076 C 191.412 151.937 178.369 158.344 164.510 158.520 Z"),
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
