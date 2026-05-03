package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorBoldIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 114.62742f, 170.62741f, 120.0f, 164.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(89.37258f, 120.0f, 84.0f, 114.62742f, 84.0f, 108.0f),
                    PathNode.CurveTo(84.0f, 101.37258f, 89.37258f, 96.0f, 96.0f, 96.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.CurveTo(170.62741f, 96.0f, 176.0f, 101.37258f, 176.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(89.37258f, 136.0f, 84.0f, 141.37259f, 84.0f, 148.0f),
                    PathNode.CurveTo(84.0f, 154.62741f, 89.37258f, 160.0f, 96.0f, 160.0f),
                    PathNode.LineTo(164.0f, 160.0f),
                    PathNode.CurveTo(170.62741f, 160.0f, 176.0f, 154.62741f, 176.0f, 148.0f),
                    PathNode.CurveTo(176.0f, 141.37259f, 170.62741f, 136.0f, 164.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 124.0f),
                    PathNode.CurveTo(235.93938f, 181.41248f, 189.41248f, 227.93938f, 132.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(36.954304f, 228.0f, 28.0f, 219.0457f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 124.0f),
                    PathNode.CurveTo(28.0f, 66.562386f, 74.562386f, 20.0f, 132.0f, 20.0f),
                    PathNode.CurveTo(189.4376f, 20.0f, 236.0f, 66.562386f, 236.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 124.0f),
                    PathNode.CurveTo(212.0f, 79.81722f, 176.18279f, 44.0f, 132.0f, 44.0f),
                    PathNode.CurveTo(87.81722f, 44.0f, 52.0f, 79.81722f, 52.0f, 124.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(132.0f, 204.0f),
                    PathNode.CurveTo(176.16223f, 203.9504f, 211.9504f, 168.16223f, 212.0f, 124.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
