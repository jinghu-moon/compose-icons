package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) return _chatTeardropDots!!
        _chatTeardropDots = phosphorBoldIcon(
            name = "ChatTeardropDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 20.0f),
                    PathNode.CurveTo(74.58752f, 20.060629f, 28.060629f, 66.58752f, 28.0f, 124.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(132.0f, 228.0f),
                    PathNode.CurveTo(189.4376f, 228.0f, 236.0f, 181.4376f, 236.0f, 124.0f),
                    PathNode.CurveTo(236.0f, 66.562386f, 189.4376f, 20.0f, 132.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.CurveTo(52.0f, 79.81722f, 87.81722f, 44.0f, 132.0f, 44.0f),
                    PathNode.CurveTo(176.18279f, 44.0f, 212.0f, 79.81722f, 212.0f, 124.0f),
                    PathNode.CurveTo(212.0f, 168.18279f, 176.18279f, 204.0f, 132.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 136.83656f, 116.836555f, 144.0f, 108.0f, 144.0f),
                    PathNode.CurveTo(99.163445f, 144.0f, 92.0f, 136.83656f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 119.163445f, 99.163445f, 112.0f, 108.0f, 112.0f),
                    PathNode.CurveTo(116.836555f, 112.0f, 124.0f, 119.163445f, 124.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 136.83656f, 164.83656f, 144.0f, 156.0f, 144.0f),
                    PathNode.CurveTo(147.16344f, 144.0f, 140.0f, 136.83656f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 119.163445f, 147.16344f, 112.0f, 156.0f, 112.0f),
                    PathNode.CurveTo(164.83656f, 112.0f, 172.0f, 119.163445f, 172.0f, 128.0f),
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
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
