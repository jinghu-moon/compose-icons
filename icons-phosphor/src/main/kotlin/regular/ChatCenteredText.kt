package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorRegularIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 104.000 C 88.000 99.582 91.582 96.000 96.000 96.000 L 160.000 96.000 C 164.418 96.000 168.000 99.582 168.000 104.000 C 168.000 108.418 164.418 112.000 160.000 112.000 L 96.000 112.000 C 91.582 112.000 88.000 108.418 88.000 104.000 ZM 96.000 144.000 L 160.000 144.000 C 164.418 144.000 168.000 140.418 168.000 136.000 C 168.000 131.582 164.418 128.000 160.000 128.000 L 96.000 128.000 C 91.582 128.000 88.000 131.582 88.000 136.000 C 88.000 140.418 91.582 144.000 96.000 144.000 ZM 232.000 56.000 L 232.000 184.000 C 232.000 192.837 224.837 200.000 216.000 200.000 L 155.570 200.000 L 141.890 223.940 C 139.041 228.923 133.740 231.998 128.000 231.998 C 122.260 231.998 116.959 228.923 114.110 223.940 L 100.430 200.000 L 40.000 200.000 C 31.163 200.000 24.000 192.837 24.000 184.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 216.000 56.000 L 40.000 56.000 L 40.000 184.000 L 105.070 184.000 C 107.954 183.974 110.628 185.502 112.070 188.000 L 128.070 216.000 L 144.070 188.000 C 145.512 185.502 148.186 183.974 151.070 184.000 L 216.000 184.000 Z"),
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
