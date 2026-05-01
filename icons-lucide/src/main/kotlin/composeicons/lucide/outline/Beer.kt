package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = lucideOutlineIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(19.656855f, 11.0f, 21.0f, 12.343145f, 21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 15.656855f, 19.656855f, 17.0f, 18.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 18.0f)
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
                    PathNode.MoveTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 18.0f)
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
                    PathNode.MoveTo(14.0f, 7.5f),
                    PathNode.CurveTo(13.0f, 7.5f, 12.56f, 8.0f, 11.0f, 8.0f),
                    PathNode.CurveTo(9.44f, 8.0f, 9.0f, 7.5f, 8.0f, 7.5f),
                    PathNode.CurveTo(7.0f, 7.5f, 6.28f, 8.0f, 5.5f, 8.0f),
                    PathNode.CurveTo(4.119288f, 8.0f, 3.0f, 6.880712f, 3.0f, 5.5f),
                    PathNode.CurveTo(3.0f, 4.119288f, 4.119288f, 3.0f, 5.5f, 3.0f),
                    PathNode.CurveTo(6.28f, 3.0f, 7.07f, 3.5f, 8.0f, 3.5f),
                    PathNode.CurveTo(8.93f, 3.5f, 9.44f, 2.0f, 11.0f, 2.0f),
                    PathNode.CurveTo(12.56f, 2.0f, 13.0f, 3.5f, 14.0f, 3.5f),
                    PathNode.CurveTo(15.0f, 3.5f, 15.72f, 3.0f, 16.5f, 3.0f),
                    PathNode.CurveTo(17.880713f, 3.0f, 19.0f, 4.119288f, 19.0f, 5.5f),
                    PathNode.CurveTo(19.0f, 6.880712f, 17.880713f, 8.0f, 16.5f, 8.0f),
                    PathNode.CurveTo(15.72f, 8.0f, 15.0f, 7.5f, 14.0f, 7.5f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(5.0f, 21.10457f, 5.895431f, 22.0f, 7.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.CurveTo(16.10457f, 22.0f, 17.0f, 21.10457f, 17.0f, 20.0f),
                    PathNode.LineTo(17.0f, 8.0f)
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
        return _beer!!
    }

private var _beer: ImageVector? = null
