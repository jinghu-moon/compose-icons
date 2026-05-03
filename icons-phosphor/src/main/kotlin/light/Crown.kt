package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = phosphorLightIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 80.000 C 246.010 68.644 238.649 58.595 227.819 55.180 C 216.989 51.765 205.195 55.774 198.689 65.082 C 192.184 74.390 192.472 86.843 199.400 95.840 L 169.570 132.560 L 143.570 72.800 C 152.533 66.091 156.195 54.398 152.660 43.775 C 149.124 33.152 139.186 25.985 127.990 25.985 C 116.794 25.985 106.856 33.152 103.320 43.775 C 99.785 54.398 103.447 66.091 112.410 72.800 L 86.410 132.560 L 56.600 95.840 C 63.870 86.388 63.778 73.203 56.378 63.853 C 48.977 54.503 36.165 51.386 25.296 56.290 C 14.428 61.195 8.288 72.864 10.403 84.599 C 12.517 96.334 22.343 105.127 34.240 105.930 L 49.000 194.300 C 50.123 201.040 55.947 205.985 62.780 206.000 L 193.220 206.000 C 200.053 205.985 205.877 201.040 207.000 194.300 L 221.730 105.930 C 235.383 105.020 245.993 93.683 246.000 80.000 ZM 128.000 38.000 C 135.732 38.000 142.000 44.268 142.000 52.000 C 142.000 59.732 135.732 66.000 128.000 66.000 C 120.268 66.000 114.000 59.732 114.000 52.000 C 114.000 44.268 120.268 38.000 128.000 38.000 ZM 22.000 80.000 C 22.000 72.268 28.268 66.000 36.000 66.000 C 43.732 66.000 50.000 72.268 50.000 80.000 C 50.000 87.732 43.732 94.000 36.000 94.000 C 28.268 94.000 22.000 87.732 22.000 80.000 ZM 195.200 192.330 C 195.037 193.304 194.188 194.014 193.200 194.000 L 62.780 194.000 C 61.792 194.014 60.943 193.304 60.780 192.330 L 46.080 104.000 L 47.300 103.450 L 83.300 147.810 C 84.454 149.214 86.182 150.020 88.000 150.000 C 88.271 150.000 88.542 149.980 88.810 149.940 C 90.886 149.657 92.664 148.311 93.500 146.390 L 123.420 77.590 C 126.449 78.137 129.551 78.137 132.580 77.590 L 162.500 146.390 C 163.336 148.311 165.114 149.657 167.190 149.940 C 167.458 149.980 167.729 150.000 168.000 150.000 C 169.809 150.000 171.521 149.184 172.660 147.780 L 208.660 103.420 L 209.880 103.970 ZM 220.000 94.000 C 212.268 94.000 206.000 87.732 206.000 80.000 C 206.000 72.268 212.268 66.000 220.000 66.000 C 227.732 66.000 234.000 72.268 234.000 80.000 C 234.000 87.732 227.732 94.000 220.000 94.000 Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
