package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorRegularIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 184.000 C 24.000 192.837 31.163 200.000 40.000 200.000 L 100.430 200.000 L 114.110 223.940 C 116.959 228.923 122.260 231.998 128.000 231.998 C 133.740 231.998 139.041 228.923 141.890 223.940 L 155.570 200.000 L 216.000 200.000 C 224.837 200.000 232.000 192.837 232.000 184.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 184.000 L 150.930 184.000 C 148.046 183.974 145.372 185.502 143.930 188.000 L 127.930 216.000 L 111.930 188.000 C 110.488 185.502 107.814 183.974 104.930 184.000 L 40.000 184.000 L 40.000 56.000 L 216.000 56.000 Z"),
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
