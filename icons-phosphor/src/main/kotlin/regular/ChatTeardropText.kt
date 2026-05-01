package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorRegularIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 112.0f),
                    PathNode.CurveTo(172.0f, 116.41828f, 168.41827f, 120.0f, 164.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 116.41828f, 88.0f, 112.0f),
                    PathNode.CurveTo(88.0f, 107.58172f, 91.58172f, 104.0f, 96.0f, 104.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.CurveTo(168.41827f, 104.0f, 172.0f, 107.58172f, 172.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(91.58172f, 136.0f, 88.0f, 139.58173f, 88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 148.41827f, 91.58172f, 152.0f, 96.0f, 152.0f),
                    PathNode.LineTo(164.0f, 152.0f),
                    PathNode.CurveTo(168.41827f, 152.0f, 172.0f, 148.41827f, 172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 139.58173f, 168.41827f, 136.0f, 164.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 124.0f),
                    PathNode.CurveTo(231.93938f, 179.20334f, 187.20334f, 223.93938f, 132.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 124.0f),
                    PathNode.CurveTo(32.0f, 68.77152f, 76.77152f, 24.0f, 132.0f, 24.0f),
                    PathNode.CurveTo(187.22847f, 24.0f, 232.0f, 68.77152f, 232.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 124.0f),
                    PathNode.CurveTo(216.0f, 77.60808f, 178.39192f, 40.0f, 132.0f, 40.0f),
                    PathNode.CurveTo(85.60808f, 40.0f, 48.0f, 77.60808f, 48.0f, 124.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(132.0f, 208.0f),
                    PathNode.CurveTo(178.37135f, 207.9504f, 215.9504f, 170.37135f, 216.0f, 124.0f),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
