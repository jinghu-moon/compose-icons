package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookCopy: ImageVector
    get() {
        if (_bookCopy != null) return _bookCopy!!
        _bookCopy = lucideOutlineIcon(
            name = "BookCopy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.CurveTo(3.895431f, 7.0f, 3.0f, 7.895431f, 3.0f, 9.0f),
                    PathNode.LineTo(3.0f, 20.0f)
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
                    PathNode.MoveTo(5.803f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(3.895431f, 18.0f, 3.0f, 18.89543f, 3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 21.10457f, 3.895431f, 22.0f, 5.0f, 22.0f),
                    PathNode.LineTo(14.5f, 22.0f),
                    PathNode.CurveTo(14.776142f, 22.0f, 15.0f, 21.776142f, 15.0f, 21.5f),
                    PathNode.LineTo(15.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 2.895431f, 9.895431f, 2.0f, 11.0f, 2.0f),
                    PathNode.LineTo(20.5f, 2.0f),
                    PathNode.CurveTo(20.776142f, 2.0f, 21.0f, 2.223858f, 21.0f, 2.5f),
                    PathNode.LineTo(21.0f, 16.5f),
                    PathNode.CurveTo(21.0f, 16.776142f, 20.776142f, 17.0f, 20.5f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.CurveTo(9.895431f, 17.0f, 9.0f, 16.10457f, 9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 13.895431f, 9.895431f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(21.0f, 13.0f)
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
        return _bookCopy!!
    }

private var _bookCopy: ImageVector? = null
