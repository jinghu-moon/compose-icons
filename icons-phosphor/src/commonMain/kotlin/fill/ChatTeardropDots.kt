package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) return _chatTeardropDots!!
        _chatTeardropDots = phosphorFillIcon(
            name = "ChatTeardropDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 24.0f),
                    PathNode.CurveTo(76.79665f, 24.060623f, 32.060623f, 68.79665f, 32.0f, 124.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(132.0f, 224.0f),
                    PathNode.CurveTo(187.22847f, 224.0f, 232.0f, 179.22847f, 232.0f, 124.0f),
                    PathNode.CurveTo(232.0f, 68.77152f, 187.22847f, 24.0f, 132.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 140.0f),
                    PathNode.CurveTo(81.37258f, 140.0f, 76.0f, 134.62741f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 121.37258f, 81.37258f, 116.0f, 88.0f, 116.0f),
                    PathNode.CurveTo(94.62742f, 116.0f, 100.0f, 121.37258f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 134.62741f, 94.62742f, 140.0f, 88.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 140.0f),
                    PathNode.CurveTo(125.37258f, 140.0f, 120.0f, 134.62741f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 121.37258f, 125.37258f, 116.0f, 132.0f, 116.0f),
                    PathNode.CurveTo(138.62741f, 116.0f, 144.0f, 121.37258f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 134.62741f, 138.62741f, 140.0f, 132.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 140.0f),
                    PathNode.CurveTo(169.37259f, 140.0f, 164.0f, 134.62741f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 121.37258f, 169.37259f, 116.0f, 176.0f, 116.0f),
                    PathNode.CurveTo(182.62741f, 116.0f, 188.0f, 121.37258f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 134.62741f, 182.62741f, 140.0f, 176.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
