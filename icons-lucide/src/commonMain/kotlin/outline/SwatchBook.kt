package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SwatchBook: ImageVector
    get() {
        if (_swatchBook != null) return _swatchBook!!
        _swatchBook = lucideOutlineIcon(
            name = "SwatchBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 17.0f),
                    PathNode.CurveTo(11.0f, 19.209139f, 9.209139f, 21.0f, 7.0f, 21.0f),
                    PathNode.CurveTo(4.790861f, 21.0f, 3.0f, 19.209139f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.895431f, 3.895431f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(10.104569f, 3.0f, 11.0f, 3.895431f, 11.0f, 5.0f),
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
                    PathNode.MoveTo(16.7f, 13.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(20.10457f, 13.0f, 21.0f, 13.895431f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.10457f, 20.10457f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 17.0f),
                    PathNode.LineTo(7.01f, 17.0f)
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
                    PathNode.MoveTo(11.0f, 8.0f),
                    PathNode.LineTo(13.3f, 5.7f),
                    PathNode.CurveTo(13.751016f, 5.24741f, 14.363886f, 4.993347f, 15.002831f, 4.994097f),
                    PathNode.CurveTo(15.641778f, 4.994849f, 16.25405f, 5.250351f, 16.704f, 5.704f),
                    PathNode.LineTo(18.6f, 7.6f),
                    PathNode.CurveTo(19.065851f, 8.048098f, 19.33126f, 8.665161f, 19.336155f, 9.311524f),
                    PathNode.CurveTo(19.341047f, 9.957888f, 19.085012f, 10.578899f, 18.626f, 11.034f),
                    PathNode.LineTo(9.9f, 19.8f)
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
        return _swatchBook!!
    }

private var _swatchBook: ImageVector? = null
