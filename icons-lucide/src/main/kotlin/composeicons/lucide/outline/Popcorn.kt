package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = lucideOutlineIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.CurveTo(19.10457f, 8.0f, 20.0f, 7.10457f, 20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.895431f, 19.10457f, 4.0f, 18.0f, 4.0f),
                    PathNode.CurveTo(18.0f, 2.895431f, 17.10457f, 2.0f, 16.0f, 2.0f),
                    PathNode.CurveTo(14.895431f, 2.0f, 14.0f, 2.895431f, 14.0f, 4.0f),
                    PathNode.CurveTo(14.0f, 2.895431f, 13.104569f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(10.895431f, 2.0f, 10.0f, 2.895431f, 10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 2.895431f, 9.104569f, 2.0f, 8.0f, 2.0f),
                    PathNode.CurveTo(6.895431f, 2.0f, 6.0f, 2.895431f, 6.0f, 4.0f),
                    PathNode.CurveTo(4.895431f, 4.0f, 4.0f, 4.895431f, 4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 7.10457f, 4.895431f, 8.0f, 6.0f, 8.0f)
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
                    PathNode.MoveTo(10.0f, 22.0f),
                    PathNode.LineTo(9.0f, 8.0f)
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
                    PathNode.MoveTo(14.0f, 22.0f),
                    PathNode.LineTo(15.0f, 8.0f)
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
                    PathNode.MoveTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.5f, 8.0f, 20.9f, 8.4f, 20.8f, 9.0f),
                    PathNode.LineTo(18.2f, 21.0f),
                    PathNode.CurveTo(18.1f, 21.5f, 17.5f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(6.4f, 22.0f, 5.9f, 21.6f, 5.8f, 21.0f),
                    PathNode.LineTo(3.2f, 9.0f),
                    PathNode.CurveTo(3.1f, 8.4f, 3.5f, 8.0f, 4.0f, 8.0f),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
