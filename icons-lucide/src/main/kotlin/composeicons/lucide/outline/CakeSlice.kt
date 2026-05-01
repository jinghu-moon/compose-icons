package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CakeSlice: ImageVector
    get() {
        if (_cakeSlice != null) return _cakeSlice!!
        _cakeSlice = lucideOutlineIcon(
            name = "CakeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f)
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
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f)
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
                    PathNode.MoveTo(7.2f, 7.9f),
                    PathNode.LineTo(3.812f, 10.4f),
                    PathNode.CurveTo(3.301038f, 10.777284f, 2.99966f, 11.374843f, 3.0f, 12.01f),
                    PathNode.LineTo(3.0f, 20.0f),
                    PathNode.CurveTo(3.0f, 20.552284f, 3.447715f, 21.0f, 4.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.552284f, 21.0f, 21.0f, 20.552284f, 21.0f, 20.0f),
                    PathNode.LineTo(21.0f, 11.346f),
                    PathNode.CurveTo(21.0f, 9.346f, 18.56f, 5.32f, 14.56f, 3.32f),
                    PathNode.CurveTo(14.219396f, 3.125034f, 13.796234f, 3.147327f, 13.478f, 3.377f),
                    PathNode.LineTo(10.4f, 5.6f)
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
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.CurveTo(11.0f, 8.10457f, 10.104569f, 9.0f, 9.0f, 9.0f),
                    PathNode.CurveTo(7.895431f, 9.0f, 7.0f, 8.10457f, 7.0f, 7.0f),
                    PathNode.CurveTo(7.0f, 5.895431f, 7.895431f, 5.0f, 9.0f, 5.0f),
                    PathNode.CurveTo(10.104569f, 5.0f, 11.0f, 5.895431f, 11.0f, 7.0f),
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
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
