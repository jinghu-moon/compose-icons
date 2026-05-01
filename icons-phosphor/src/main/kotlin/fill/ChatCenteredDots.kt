package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorFillIcon(
            name = "ChatCenteredDots",
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
                    PathNode.MoveTo(84.0f, 132.0f),
                    PathNode.CurveTo(77.37258f, 132.0f, 72.0f, 126.62742f, 72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 113.37258f, 77.37258f, 108.0f, 84.0f, 108.0f),
                    PathNode.CurveTo(90.62742f, 108.0f, 96.0f, 113.37258f, 96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 126.62742f, 90.62742f, 132.0f, 84.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.0f),
                    PathNode.CurveTo(121.37258f, 132.0f, 116.0f, 126.62742f, 116.0f, 120.0f),
                    PathNode.CurveTo(116.0f, 113.37258f, 121.37258f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(134.62741f, 108.0f, 140.0f, 113.37258f, 140.0f, 120.0f),
                    PathNode.CurveTo(140.0f, 126.62742f, 134.62741f, 132.0f, 128.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 132.0f),
                    PathNode.CurveTo(165.37259f, 132.0f, 160.0f, 126.62742f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 113.37258f, 165.37259f, 108.0f, 172.0f, 108.0f),
                    PathNode.CurveTo(178.62741f, 108.0f, 184.0f, 113.37258f, 184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 126.62742f, 178.62741f, 132.0f, 172.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
