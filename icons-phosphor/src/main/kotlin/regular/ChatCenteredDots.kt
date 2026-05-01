package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorRegularIcon(
            name = "ChatCenteredDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 113.37258f, 121.37258f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(134.62741f, 108.0f, 140.0f, 113.37258f, 140.0f, 120.0f),
                    PathNode.CurveTo(140.0f, 126.62742f, 134.62741f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(121.37258f, 132.0f, 116.0f, 126.62742f, 116.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 132.0f),
                    PathNode.CurveTo(90.62742f, 132.0f, 96.0f, 126.62742f, 96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 113.37258f, 90.62742f, 108.0f, 84.0f, 108.0f),
                    PathNode.CurveTo(77.37258f, 108.0f, 72.0f, 113.37258f, 72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 126.62742f, 77.37258f, 132.0f, 84.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 132.0f),
                    PathNode.CurveTo(178.62741f, 132.0f, 184.0f, 126.62742f, 184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 113.37258f, 178.62741f, 108.0f, 172.0f, 108.0f),
                    PathNode.CurveTo(165.37259f, 108.0f, 160.0f, 113.37258f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 126.62742f, 165.37259f, 132.0f, 172.0f, 132.0f),
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
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
