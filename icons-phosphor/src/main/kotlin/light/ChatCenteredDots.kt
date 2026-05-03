package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorLightIcon(
            name = "ChatCenteredDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 138.000 120.000 C 138.000 125.523 133.523 130.000 128.000 130.000 C 122.477 130.000 118.000 125.523 118.000 120.000 C 118.000 114.477 122.477 110.000 128.000 110.000 C 133.523 110.000 138.000 114.477 138.000 120.000 ZM 84.000 110.000 C 78.477 110.000 74.000 114.477 74.000 120.000 C 74.000 125.523 78.477 130.000 84.000 130.000 C 89.523 130.000 94.000 125.523 94.000 120.000 C 94.000 114.477 89.523 110.000 84.000 110.000 ZM 172.000 110.000 C 166.477 110.000 162.000 114.477 162.000 120.000 C 162.000 125.523 166.477 130.000 172.000 130.000 C 177.523 130.000 182.000 125.523 182.000 120.000 C 182.000 114.477 177.523 110.000 172.000 110.000 ZM 230.000 56.000 L 230.000 184.000 C 230.000 191.732 223.732 198.000 216.000 198.000 L 154.410 198.000 L 140.160 223.000 C 137.669 227.367 133.027 230.062 128.000 230.062 C 122.973 230.062 118.331 227.367 115.840 223.000 L 101.590 198.000 L 40.000 198.000 C 32.268 198.000 26.000 191.732 26.000 184.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 184.000 C 38.000 185.105 38.895 186.000 40.000 186.000 L 105.070 186.000 C 107.219 185.995 109.206 187.139 110.280 189.000 L 126.280 217.000 C 126.635 217.627 127.300 218.014 128.020 218.014 C 128.740 218.014 129.405 217.627 129.760 217.000 L 145.760 189.000 C 146.834 187.139 148.821 185.995 150.970 186.000 L 216.000 186.000 C 217.105 186.000 218.000 185.105 218.000 184.000 Z"),
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
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
