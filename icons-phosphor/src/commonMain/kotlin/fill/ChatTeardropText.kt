package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorFillIcon(
            name = "ChatTeardropText",
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
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 139.58173f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(164.0f, 136.0f),
                    PathNode.CurveTo(168.41827f, 136.0f, 172.0f, 139.58173f, 172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 148.41827f, 168.41827f, 152.0f, 164.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 116.41828f, 88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 107.58172f, 91.58172f, 104.0f, 96.0f, 104.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.CurveTo(168.41827f, 104.0f, 172.0f, 107.58172f, 172.0f, 112.0f),
                    PathNode.CurveTo(172.0f, 116.41828f, 168.41827f, 120.0f, 164.0f, 120.0f),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
