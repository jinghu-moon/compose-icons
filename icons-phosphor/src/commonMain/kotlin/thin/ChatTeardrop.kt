package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) return _chatTeardrop!!
        _chatTeardrop = phosphorThinIcon(
            name = "ChatTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 28.0f),
                    PathNode.CurveTo(79.00579f, 28.060617f, 36.06062f, 71.00579f, 36.0f, 124.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(132.0f, 220.0f),
                    PathNode.CurveTo(185.01933f, 220.0f, 228.0f, 177.01933f, 228.0f, 124.0f),
                    PathNode.CurveTo(228.0f, 70.98067f, 185.01933f, 28.0f, 132.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.CurveTo(44.0f, 75.39894f, 83.39894f, 36.0f, 132.0f, 36.0f),
                    PathNode.CurveTo(180.60106f, 36.0f, 220.0f, 75.39894f, 220.0f, 124.0f),
                    PathNode.CurveTo(220.0f, 172.60106f, 180.60106f, 212.0f, 132.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null
