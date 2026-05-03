package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorBoldIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 187.300 159.060 C 183.903 175.868 169.148 187.965 152.000 188.000 C 105.629 187.950 68.050 150.371 68.000 104.000 C 68.035 86.852 80.132 72.097 96.940 68.700 C 102.237 67.652 107.583 70.271 110.000 75.100 L 121.480 98.100 C 123.396 101.946 123.110 106.523 120.730 110.100 L 112.210 122.880 C 116.597 132.027 123.973 139.403 133.120 143.790 L 145.900 135.270 C 149.477 132.890 154.054 132.604 157.900 134.520 L 180.900 146.000 C 185.729 148.417 188.348 153.763 187.300 159.060 ZM 236.000 128.000 C 236.008 165.620 216.439 200.534 184.344 220.160 C 152.250 239.787 112.254 241.299 78.770 224.150 L 46.340 235.000 C 39.139 237.427 31.184 235.563 25.810 230.190 C 20.437 224.816 18.573 216.861 21.000 209.660 L 31.810 177.230 C 11.481 137.410 17.789 89.182 47.675 55.930 C 77.561 22.678 124.845 11.278 166.601 27.257 C 208.356 43.236 235.949 83.291 236.000 128.000 ZM 212.000 128.000 C 211.987 92.687 189.888 61.152 156.699 49.087 C 123.511 37.022 86.320 47.002 63.632 74.063 C 40.943 101.123 37.602 139.484 55.270 170.060 C 56.994 173.036 57.358 176.608 56.270 179.870 L 46.340 209.660 L 76.130 199.730 C 77.355 199.322 78.638 199.113 79.930 199.110 C 82.038 199.114 84.107 199.672 85.930 200.730 C 111.922 215.770 143.965 215.790 169.976 200.785 C 195.987 185.779 212.009 158.029 212.000 128.000 Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
