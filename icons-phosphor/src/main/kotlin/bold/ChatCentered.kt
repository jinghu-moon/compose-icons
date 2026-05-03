package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorBoldIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 184.000 C 20.000 195.046 28.954 204.000 40.000 204.000 L 98.110 204.000 L 110.630 225.920 C 114.189 232.157 120.819 236.006 128.000 236.006 C 135.181 236.006 141.811 232.157 145.370 225.920 L 157.890 204.000 L 216.000 204.000 C 227.046 204.000 236.000 195.046 236.000 184.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 180.000 L 150.930 180.000 C 146.623 180.000 142.646 182.309 140.510 186.050 L 128.000 207.940 L 115.490 186.050 C 113.354 182.309 109.377 180.000 105.070 180.000 L 44.000 180.000 L 44.000 60.000 L 212.000 60.000 Z"),
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
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
