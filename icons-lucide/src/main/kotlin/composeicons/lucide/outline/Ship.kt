package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ship: ImageVector
    get() {
        if (_ship != null) return _ship!!
        _ship = lucideOutlineIcon(
            name = "Ship",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.189f),
                    PathNode.LineTo(12.0f, 14.0f)
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
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 5.0f)
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
                    PathNode.MoveTo(19.0f, 13.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(19.0f, 5.895431f, 18.10457f, 5.0f, 17.0f, 5.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(5.895431f, 5.0f, 5.0f, 5.895431f, 5.0f, 7.0f),
                    PathNode.LineTo(5.0f, 13.0f)
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
                    PathNode.MoveTo(19.38f, 20.0f),
                    PathNode.CurveTo(20.455685f, 18.184578f, 21.015787f, 16.11012f, 21.0f, 14.0f),
                    PathNode.LineTo(12.812f, 10.361f),
                    PathNode.CurveTo(12.295028f, 10.131329f, 11.704972f, 10.131329f, 11.188f, 10.361f),
                    PathNode.LineTo(3.0f, 14.0f),
                    PathNode.CurveTo(2.953708f, 16.843678f, 3.953718f, 19.60527f, 5.81f, 21.76f)
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.CurveTo(2.6f, 21.5f, 3.2f, 22.0f, 4.5f, 22.0f),
                    PathNode.CurveTo(7.0f, 22.0f, 7.0f, 20.0f, 9.5f, 20.0f),
                    PathNode.CurveTo(10.8f, 20.0f, 11.4f, 20.5f, 12.0f, 21.0f),
                    PathNode.CurveTo(12.6f, 21.5f, 13.2f, 22.0f, 14.5f, 22.0f),
                    PathNode.CurveTo(17.0f, 22.0f, 17.0f, 20.0f, 19.5f, 20.0f),
                    PathNode.CurveTo(20.8f, 20.0f, 21.4f, 20.5f, 22.0f, 21.0f)
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
        return _ship!!
    }

private var _ship: ImageVector? = null
