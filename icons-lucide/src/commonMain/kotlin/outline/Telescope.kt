package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Telescope: ImageVector
    get() {
        if (_telescope != null) return _telescope!!
        _telescope = lucideOutlineIcon(
            name = "Telescope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.065f, 12.493f),
                    PathNode.LineTo(3.885f, 13.811f),
                    PathNode.CurveTo(3.385847f, 13.919328f, 2.892254f, 13.6066f, 2.777f, 13.109f),
                    PathNode.LineTo(2.24f, 10.959f),
                    PathNode.CurveTo(2.109161f, 10.422168f, 2.408595f, 9.874001f, 2.931f, 9.694f),
                    PathNode.LineTo(16.435f, 5.254f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.56f, 11.747f),
                    PathNode.LineTo(17.892f, 10.823f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 21.0f),
                    PathNode.LineTo(12.895f, 14.79f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.485f, 5.94f),
                    PathNode.CurveTo(16.217316f, 4.868593f, 16.868671f, 3.782999f, 17.94f, 3.515f),
                    PathNode.LineTo(19.03f, 3.243f),
                    PathNode.CurveTo(19.565384f, 3.109444f, 20.107767f, 3.434785f, 20.242f, 3.97f),
                    PathNode.LineTo(21.757f, 10.03f),
                    PathNode.CurveTo(21.89119f, 10.565714f, 21.565706f, 11.108783f, 21.03f, 11.243f),
                    PathNode.LineTo(19.94f, 11.515f),
                    PathNode.CurveTo(18.868593f, 11.782684f, 17.783f, 11.131328f, 17.515f, 10.06f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.158f, 8.633f),
                    PathNode.LineTo(7.272f, 13.089f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(11.105f, 14.79f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 14.104569f, 13.104569f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(10.895431f, 15.0f, 10.0f, 14.104569f, 10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 11.895431f, 10.895431f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(13.104569f, 11.0f, 14.0f, 11.895431f, 14.0f, 13.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _telescope!!
    }

private var _telescope: ImageVector? = null
