package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorLightIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 104.000 C 166.000 107.314 163.314 110.000 160.000 110.000 L 96.000 110.000 C 92.686 110.000 90.000 107.314 90.000 104.000 C 90.000 100.686 92.686 98.000 96.000 98.000 L 160.000 98.000 C 163.314 98.000 166.000 100.686 166.000 104.000 ZM 160.000 130.000 L 96.000 130.000 C 92.686 130.000 90.000 132.686 90.000 136.000 C 90.000 139.314 92.686 142.000 96.000 142.000 L 160.000 142.000 C 163.314 142.000 166.000 139.314 166.000 136.000 C 166.000 132.686 163.314 130.000 160.000 130.000 ZM 230.000 56.000 L 230.000 184.000 C 230.000 191.732 223.732 198.000 216.000 198.000 L 154.410 198.000 L 140.160 223.000 C 137.669 227.367 133.027 230.062 128.000 230.062 C 122.973 230.062 118.331 227.367 115.840 223.000 L 101.590 198.000 L 40.000 198.000 C 32.268 198.000 26.000 191.732 26.000 184.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 184.000 C 38.000 185.105 38.895 186.000 40.000 186.000 L 105.070 186.000 C 107.219 185.995 109.206 187.139 110.280 189.000 L 126.280 217.000 C 126.635 217.627 127.300 218.014 128.020 218.014 C 128.740 218.014 129.405 217.627 129.760 217.000 L 145.760 189.000 C 146.834 187.139 148.821 185.995 150.970 186.000 L 216.000 186.000 C 217.105 186.000 218.000 185.105 218.000 184.000 Z"),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
