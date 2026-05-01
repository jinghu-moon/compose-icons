package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorRegularIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 99.58172f, 91.58172f, 96.0f, 96.0f, 96.0f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.CurveTo(164.41827f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 108.41828f, 164.41827f, 112.0f, 160.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(91.58172f, 112.0f, 88.0f, 108.41828f, 88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 144.0f),
                    PathNode.LineTo(160.0f, 144.0f),
                    PathNode.CurveTo(164.41827f, 144.0f, 168.0f, 140.41827f, 168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 131.58173f, 164.41827f, 128.0f, 160.0f, 128.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.CurveTo(91.58172f, 128.0f, 88.0f, 131.58173f, 88.0f, 136.0f),
                    PathNode.CurveTo(88.0f, 140.41827f, 91.58172f, 144.0f, 96.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 192.83656f, 224.83656f, 200.0f, 216.0f, 200.0f),
                    PathNode.LineTo(155.57f, 200.0f),
                    PathNode.LineTo(141.89f, 223.94f),
                    PathNode.CurveTo(139.0408f, 228.92334f, 133.74034f, 231.99847f, 128.0f, 231.99847f),
                    PathNode.CurveTo(122.25965f, 231.99847f, 116.9592f, 228.92334f, 114.11f, 223.94f),
                    PathNode.LineTo(100.43f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(31.163445f, 200.0f, 24.0f, 192.83656f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.LineTo(105.07f, 184.0f),
                    PathNode.CurveTo(107.95374f, 183.97418f, 110.62819f, 185.50244f, 112.07f, 188.0f),
                    PathNode.LineTo(128.07f, 216.0f),
                    PathNode.LineTo(144.07f, 188.0f),
                    PathNode.CurveTo(145.51181f, 185.50244f, 148.18628f, 183.97418f, 151.07f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
