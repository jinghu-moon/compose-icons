package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorFillIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.380 221.920 C 210.110 224.891 205.051 224.649 202.080 221.380 L 199.820 218.900 C 198.354 230.943 188.132 239.998 176.000 240.000 L 80.000 240.000 C 66.745 240.000 56.000 229.255 56.000 216.000 L 56.000 60.690 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 L 213.920 210.620 C 216.891 213.890 216.649 218.949 213.380 221.920 ZM 186.080 156.210 C 188.303 158.656 191.801 159.483 194.884 158.291 C 197.967 157.100 200.000 154.135 200.000 150.830 L 200.000 40.000 C 200.000 26.745 189.255 16.000 176.000 16.000 L 76.700 16.000 C 73.534 16.000 70.666 17.868 69.385 20.763 C 68.104 23.658 68.651 27.037 70.780 29.380 Z"),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
