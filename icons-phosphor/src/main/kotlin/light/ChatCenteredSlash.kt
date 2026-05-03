package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorLightIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.440 36.000 C 50.521 33.904 47.394 33.442 44.951 34.894 C 42.507 36.345 41.417 39.312 42.340 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 184.000 C 26.000 191.732 32.268 198.000 40.000 198.000 L 101.590 198.000 L 115.840 223.000 C 118.331 227.367 122.973 230.062 128.000 230.062 C 133.027 230.062 137.669 227.367 140.160 223.000 L 154.410 198.000 L 183.530 198.000 L 203.530 220.000 C 205.761 222.452 209.558 222.631 212.010 220.400 C 214.462 218.169 214.641 214.372 212.410 211.920 ZM 150.930 186.000 C 148.781 185.995 146.794 187.139 145.720 189.000 L 129.720 217.000 C 129.365 217.627 128.700 218.014 127.980 218.014 C 127.260 218.014 126.595 217.627 126.240 217.000 L 110.240 189.000 C 109.166 187.139 107.179 185.995 105.030 186.000 L 40.000 186.000 C 38.895 186.000 38.000 185.105 38.000 184.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 52.620 54.000 L 172.620 186.000 ZM 230.000 56.000 L 230.000 186.000 C 230.000 189.314 227.314 192.000 224.000 192.000 C 220.686 192.000 218.000 189.314 218.000 186.000 L 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 98.520 54.000 C 95.206 54.000 92.520 51.314 92.520 48.000 C 92.520 44.686 95.206 42.000 98.520 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 Z"),
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
