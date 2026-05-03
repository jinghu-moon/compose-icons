package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorBoldIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 54.001 28.767 49.655 27.376 45.474 28.278 C 41.293 29.181 37.908 32.241 36.590 36.310 C 27.009 37.968 20.008 46.276 20.000 56.000 L 20.000 184.000 C 20.000 195.046 28.954 204.000 40.000 204.000 L 98.110 204.000 L 110.630 225.920 C 114.191 232.152 120.818 235.997 127.995 235.997 C 135.172 235.997 141.799 232.152 145.360 225.920 L 157.890 204.000 L 180.890 204.000 L 199.140 224.070 C 203.618 228.880 211.131 229.194 215.994 224.774 C 220.857 220.355 221.261 212.846 216.900 207.930 ZM 150.930 180.000 C 146.623 180.000 142.646 182.309 140.510 186.050 L 128.000 207.940 L 115.490 186.050 C 113.354 182.309 109.377 180.000 105.070 180.000 L 44.000 180.000 L 44.000 60.000 L 50.000 60.000 L 159.100 180.000 ZM 236.000 56.000 L 236.000 174.140 C 236.000 180.767 230.627 186.140 224.000 186.140 C 217.373 186.140 212.000 180.767 212.000 174.140 L 212.000 60.000 L 109.330 60.000 C 102.703 60.000 97.330 54.627 97.330 48.000 C 97.330 41.373 102.703 36.000 109.330 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 Z"),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
