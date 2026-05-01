package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UtensilsCrossed: ImageVector
    get() {
        if (_utensilsCrossed != null) return _utensilsCrossed!!
        _utensilsCrossed = lucideOutlineIcon(
            name = "UtensilsCrossed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 2.0f),
                    PathNode.LineTo(13.7f, 4.3f),
                    PathNode.CurveTo(12.556571f, 5.466531f, 12.556571f, 7.33347f, 13.7f, 8.5f),
                    PathNode.LineTo(15.5f, 10.3f),
                    PathNode.CurveTo(16.66653f, 11.443429f, 18.53347f, 11.443429f, 19.7f, 10.3f),
                    PathNode.LineTo(22.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(3.3f, 3.3f),
                    PathNode.CurveTo(2.493737f, 4.089974f, 2.039388f, 5.171232f, 2.039388f, 6.3f),
                    PathNode.CurveTo(2.039388f, 7.428769f, 2.493737f, 8.510026f, 3.3f, 9.3f),
                    PathNode.LineTo(10.6f, 16.6f),
                    PathNode.CurveTo(11.3f, 17.3f, 12.6f, 17.3f, 13.4f, 16.6f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(22.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.1f, 21.8f),
                    PathNode.LineTo(8.5f, 15.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 5.0f),
                    PathNode.LineTo(12.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _utensilsCrossed!!
    }

private var _utensilsCrossed: ImageVector? = null
