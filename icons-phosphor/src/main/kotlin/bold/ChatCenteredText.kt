package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorBoldIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.000 100.000 C 84.000 93.373 89.373 88.000 96.000 88.000 L 160.000 88.000 C 166.627 88.000 172.000 93.373 172.000 100.000 C 172.000 106.627 166.627 112.000 160.000 112.000 L 96.000 112.000 C 89.373 112.000 84.000 106.627 84.000 100.000 ZM 96.000 152.000 L 160.000 152.000 C 166.627 152.000 172.000 146.627 172.000 140.000 C 172.000 133.373 166.627 128.000 160.000 128.000 L 96.000 128.000 C 89.373 128.000 84.000 133.373 84.000 140.000 C 84.000 146.627 89.373 152.000 96.000 152.000 ZM 236.000 56.000 L 236.000 184.000 C 236.000 195.046 227.046 204.000 216.000 204.000 L 157.890 204.000 L 145.370 225.920 C 141.811 232.157 135.181 236.006 128.000 236.006 C 120.819 236.006 114.189 232.157 110.630 225.920 L 98.110 204.000 L 40.000 204.000 C 28.954 204.000 20.000 195.046 20.000 184.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 212.000 60.000 L 44.000 60.000 L 44.000 180.000 L 105.070 180.000 C 109.377 180.000 113.354 182.309 115.490 186.050 L 128.000 207.940 L 140.510 186.050 C 142.646 182.309 146.623 180.000 150.930 180.000 L 212.000 180.000 Z"),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
