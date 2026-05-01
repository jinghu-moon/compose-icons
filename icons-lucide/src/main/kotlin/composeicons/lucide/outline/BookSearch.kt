package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookSearch: ImageVector
    get() {
        if (_bookSearch != null) return _bookSearch!!
        _bookSearch = lucideOutlineIcon(
            name = "BookSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 22.0f),
                    PathNode.LineTo(5.5f, 22.0f),
                    PathNode.CurveTo(4.119288f, 22.0f, 3.0f, 20.880713f, 3.0f, 19.5f),
                    PathNode.CurveTo(3.0f, 18.119287f, 4.119288f, 17.0f, 5.5f, 17.0f),
                    PathNode.LineTo(10.001f, 17.0f)
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
                    PathNode.MoveTo(21.0f, 22.0f),
                    PathNode.LineTo(19.121f, 20.122f)
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
                    PathNode.MoveTo(3.0f, 19.5f),
                    PathNode.LineTo(3.0f, 4.5f),
                    PathNode.CurveTo(3.0f, 3.119288f, 4.119288f, 2.0f, 5.5f, 2.0f),
                    PathNode.LineTo(18.0f, 2.0f),
                    PathNode.CurveTo(18.552284f, 2.0f, 19.0f, 2.447715f, 19.0f, 3.0f),
                    PathNode.LineTo(19.0f, 11.0f)
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
                    PathNode.MoveTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.656855f, 18.656855f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(15.343145f, 21.0f, 14.0f, 19.656855f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 16.343145f, 15.343145f, 15.0f, 17.0f, 15.0f),
                    PathNode.CurveTo(18.656855f, 15.0f, 20.0f, 16.343145f, 20.0f, 18.0f),
                    PathNode.Close
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
        return _bookSearch!!
    }

private var _bookSearch: ImageVector? = null
