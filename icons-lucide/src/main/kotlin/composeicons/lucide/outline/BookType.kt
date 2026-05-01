package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookType: ImageVector
    get() {
        if (_bookType != null) return _bookType!!
        _bookType = lucideOutlineIcon(
            name = "BookType",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(12.0f, 13.0f)
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 8.0f)
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
                    PathNode.MoveTo(4.0f, 19.5f),
                    PathNode.LineTo(4.0f, 4.5f),
                    PathNode.CurveTo(4.0f, 3.119288f, 5.119288f, 2.0f, 6.5f, 2.0f),
                    PathNode.LineTo(19.0f, 2.0f),
                    PathNode.CurveTo(19.552284f, 2.0f, 20.0f, 2.447715f, 20.0f, 3.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(6.5f, 22.0f),
                    PathNode.CurveTo(5.119288f, 22.0f, 4.0f, 20.880713f, 4.0f, 19.5f),
                    PathNode.CurveTo(4.0f, 18.119287f, 5.119288f, 17.0f, 6.5f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f)
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
        return _bookType!!
    }

private var _bookType: ImageVector? = null
