package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorThinIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 114.20914f, 166.20914f, 116.0f, 164.0f, 116.0f),
                    PathNode.LineTo(96.0f, 116.0f),
                    PathNode.CurveTo(93.79086f, 116.0f, 92.0f, 114.20914f, 92.0f, 112.0f),
                    PathNode.CurveTo(92.0f, 109.79086f, 93.79086f, 108.0f, 96.0f, 108.0f),
                    PathNode.LineTo(164.0f, 108.0f),
                    PathNode.CurveTo(166.20914f, 108.0f, 168.0f, 109.79086f, 168.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 140.0f),
                    PathNode.LineTo(96.0f, 140.0f),
                    PathNode.CurveTo(93.79086f, 140.0f, 92.0f, 141.79086f, 92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 146.20914f, 93.79086f, 148.0f, 96.0f, 148.0f),
                    PathNode.LineTo(164.0f, 148.0f),
                    PathNode.CurveTo(166.20914f, 148.0f, 168.0f, 146.20914f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 141.79086f, 166.20914f, 140.0f, 164.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 124.0f),
                    PathNode.CurveTo(227.93938f, 176.9942f, 184.9942f, 219.93938f, 132.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 124.0f),
                    PathNode.CurveTo(36.0f, 70.98067f, 78.98067f, 28.0f, 132.0f, 28.0f),
                    PathNode.CurveTo(185.01933f, 28.0f, 228.0f, 70.98067f, 228.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 124.0f),
                    PathNode.CurveTo(220.0f, 75.39894f, 180.60106f, 36.0f, 132.0f, 36.0f),
                    PathNode.CurveTo(83.39894f, 36.0f, 44.0f, 75.39894f, 44.0f, 124.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.CurveTo(180.57822f, 211.94489f, 219.94489f, 172.57822f, 220.0f, 124.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
