package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorFillIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.120 93.540 C 214.751 86.639 207.835 81.097 199.930 77.360 C 198.520 47.495 173.899 24.004 144.000 24.000 L 84.000 24.000 C 76.659 24.001 70.260 28.998 68.480 36.120 L 32.480 180.120 C 31.285 184.899 32.359 189.963 35.391 193.846 C 38.422 197.729 43.074 199.999 48.000 200.000 L 75.500 200.000 L 72.500 212.120 C 71.306 216.896 72.377 221.956 75.404 225.838 C 78.431 229.720 83.077 231.993 88.000 232.000 L 119.500 232.000 C 126.834 231.990 133.222 226.995 135.000 219.880 L 144.000 184.000 L 176.000 184.000 C 197.406 183.999 216.939 171.796 226.326 152.558 C 235.713 133.320 233.312 110.413 220.140 93.540 ZM 48.000 184.000 L 84.000 40.000 L 144.000 40.000 C 163.200 39.995 179.695 53.632 183.300 72.490 C 180.880 72.171 178.441 72.007 176.000 72.000 L 120.000 72.000 C 112.655 71.997 106.251 76.994 104.470 84.120 L 79.520 184.000 L 48.000 184.000 ZM 214.770 137.700 C 210.341 155.507 194.349 168.005 176.000 168.000 L 144.000 168.000 C 136.659 168.001 130.260 172.998 128.480 180.120 L 119.480 216.000 L 88.000 216.000 L 108.000 136.000 L 144.000 136.000 C 169.290 136.007 191.435 119.034 198.000 94.610 C 201.612 97.003 204.813 99.965 207.480 103.380 C 215.107 113.068 217.804 125.747 214.780 137.700 Z"),
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
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
