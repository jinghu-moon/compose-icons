package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 192.83656f, 31.163445f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(100.43f, 200.0f),
                    PathNode.LineTo(114.11f, 223.94f),
                    PathNode.CurveTo(116.9592f, 228.92334f, 122.25965f, 231.99847f, 128.0f, 231.99847f),
                    PathNode.CurveTo(133.74034f, 231.99847f, 139.0408f, 228.92334f, 141.89f, 223.94f),
                    PathNode.LineTo(155.57f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(224.83656f, 200.0f, 232.0f, 192.83656f, 232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(150.93f, 184.0f),
                    PathNode.CurveTo(148.04626f, 183.97418f, 145.37181f, 185.50244f, 143.93f, 188.0f),
                    PathNode.LineTo(127.93f, 216.0f),
                    PathNode.LineTo(111.93f, 188.0f),
                    PathNode.CurveTo(110.48819f, 185.50244f, 107.81374f, 183.97418f, 104.93f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
