package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = lucideOutlineIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.3f, 15.3f),
                    PathNode.CurveTo(21.75189f, 15.750324f, 22.005892f, 16.362036f, 22.005892f, 17.0f),
                    PathNode.CurveTo(22.005892f, 17.637964f, 21.75189f, 18.249676f, 21.3f, 18.7f),
                    PathNode.LineTo(18.7f, 21.3f),
                    PathNode.CurveTo(18.249676f, 21.75189f, 17.637964f, 22.005892f, 17.0f, 22.005892f),
                    PathNode.CurveTo(16.362036f, 22.005892f, 15.750324f, 21.75189f, 15.3f, 21.3f),
                    PathNode.LineTo(2.7f, 8.7f),
                    PathNode.CurveTo(1.764326f, 7.759789f, 1.764326f, 6.240212f, 2.7f, 5.3f),
                    PathNode.LineTo(5.3f, 2.7f),
                    PathNode.CurveTo(6.240212f, 1.764326f, 7.759789f, 1.764326f, 8.7f, 2.7f),
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
                    PathNode.MoveTo(14.5f, 12.5f),
                    PathNode.LineTo(16.5f, 10.5f)
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
                    PathNode.MoveTo(11.5f, 9.5f),
                    PathNode.LineTo(13.5f, 7.5f)
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
                    PathNode.MoveTo(8.5f, 6.5f),
                    PathNode.LineTo(10.5f, 4.5f)
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
                    PathNode.MoveTo(17.5f, 15.5f),
                    PathNode.LineTo(19.5f, 13.5f)
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
