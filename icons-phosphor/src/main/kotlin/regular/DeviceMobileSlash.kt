package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorRegularIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.920 210.620 L 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 56.000 60.690 L 56.000 216.000 C 56.000 229.255 66.745 240.000 80.000 240.000 L 176.000 240.000 C 188.135 239.997 198.359 230.937 199.820 218.890 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 184.000 216.000 C 184.000 220.418 180.418 224.000 176.000 224.000 L 80.000 224.000 C 75.582 224.000 72.000 220.418 72.000 216.000 L 72.000 78.290 L 184.000 201.490 ZM 68.700 24.000 C 68.700 19.582 72.282 16.000 76.700 16.000 L 176.000 16.000 C 189.255 16.000 200.000 26.745 200.000 40.000 L 200.000 150.830 C 200.000 155.248 196.418 158.830 192.000 158.830 C 187.582 158.830 184.000 155.248 184.000 150.830 L 184.000 40.000 C 184.000 35.582 180.418 32.000 176.000 32.000 L 76.700 32.000 C 72.282 32.000 68.700 28.418 68.700 24.000 Z"),
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
