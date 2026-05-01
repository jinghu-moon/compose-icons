package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScrollText: ImageVector
    get() {
        if (_scrollText != null) return _scrollText!!
        _scrollText = lucideOutlineIcon(
            name = "ScrollText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f)
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
                    PathNode.MoveTo(19.0f, 17.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 3.895431f, 18.10457f, 3.0f, 17.0f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f)
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
                    PathNode.MoveTo(8.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(21.10457f, 21.0f, 22.0f, 20.10457f, 22.0f, 19.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 17.447716f, 21.552284f, 17.0f, 21.0f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.CurveTo(10.447715f, 17.0f, 10.0f, 17.447716f, 10.0f, 18.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 20.10457f, 9.104569f, 21.0f, 8.0f, 21.0f),
                    PathNode.CurveTo(6.895431f, 21.0f, 6.0f, 20.10457f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 3.895431f, 5.10457f, 3.0f, 4.0f, 3.0f),
                    PathNode.CurveTo(2.895431f, 3.0f, 2.0f, 3.895431f, 2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 7.552285f, 2.447715f, 8.0f, 3.0f, 8.0f),
                    PathNode.LineTo(6.0f, 8.0f)
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
        return _scrollText!!
    }

private var _scrollText: ImageVector? = null
