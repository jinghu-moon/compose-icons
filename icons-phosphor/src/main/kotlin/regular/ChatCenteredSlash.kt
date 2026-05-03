package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorRegularIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 53.920 34.620 C 51.697 32.174 48.199 31.347 45.116 32.539 C 42.033 33.730 40.000 36.695 40.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 184.000 C 24.000 192.837 31.163 200.000 40.000 200.000 L 100.430 200.000 L 114.110 223.940 C 116.959 228.923 122.260 231.998 128.000 231.998 C 133.740 231.998 139.041 228.923 141.890 223.940 L 155.570 200.000 L 182.640 200.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 150.920 184.000 C 148.036 183.974 145.362 185.502 143.920 188.000 L 127.920 216.000 L 111.920 188.000 C 110.478 185.502 107.804 183.974 104.920 184.000 L 40.000 184.000 L 40.000 56.000 L 51.730 56.000 L 168.100 184.000 ZM 232.000 56.000 L 232.000 186.000 C 232.000 190.418 228.418 194.000 224.000 194.000 C 219.582 194.000 216.000 190.418 216.000 186.000 L 216.000 56.000 L 98.520 56.000 C 94.102 56.000 90.520 52.418 90.520 48.000 C 90.520 43.582 94.102 40.000 98.520 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 Z"),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
