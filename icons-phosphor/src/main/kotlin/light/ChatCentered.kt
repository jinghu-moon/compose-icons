package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorLightIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 184.000 C 26.000 191.732 32.268 198.000 40.000 198.000 L 101.590 198.000 L 115.840 223.000 C 118.331 227.367 122.973 230.062 128.000 230.062 C 133.027 230.062 137.669 227.367 140.160 223.000 L 154.410 198.000 L 216.000 198.000 C 223.732 198.000 230.000 191.732 230.000 184.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 184.000 C 218.000 185.105 217.105 186.000 216.000 186.000 L 150.930 186.000 C 148.781 185.995 146.794 187.139 145.720 189.000 L 129.720 217.000 C 129.365 217.627 128.700 218.014 127.980 218.014 C 127.260 218.014 126.595 217.627 126.240 217.000 L 110.240 189.000 C 109.166 187.139 107.179 185.995 105.030 186.000 L 40.000 186.000 C 38.895 186.000 38.000 185.105 38.000 184.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 Z"),
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
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
