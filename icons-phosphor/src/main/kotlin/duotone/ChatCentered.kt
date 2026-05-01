package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorDuotoneIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 188.41827f, 220.41827f, 192.0f, 216.0f, 192.0f),
                    PathNode.LineTo(150.93f, 192.0f),
                    PathNode.LineTo(134.93f, 220.0f),
                    PathNode.CurveTo(133.50676f, 222.4966f, 130.85378f, 224.038f, 127.98f, 224.038f),
                    PathNode.CurveTo(125.106224f, 224.038f, 122.45324f, 222.4966f, 121.03f, 220.0f),
                    PathNode.LineTo(105.03f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.CurveTo(35.581722f, 192.0f, 32.0f, 188.41827f, 32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 51.581722f, 224.0f, 56.0f),
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
