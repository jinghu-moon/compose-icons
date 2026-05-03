package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Turtle: ImageVector
    get() {
        if (_turtle != null) return _turtle!!
        _turtle = lucideOutlineIcon(
            name = "Turtle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 17.552284f, 14.447715f, 18.0f, 15.0f, 18.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(17.552284f, 18.0f, 18.0f, 17.552284f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.CurveTo(18.0f, 9.581722f, 14.418278f, 6.0f, 10.0f, 6.0f),
                    PathNode.CurveTo(5.581722f, 6.0f, 2.0f, 9.581722f, 2.0f, 14.0f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 17.552284f, 2.447715f, 18.0f, 3.0f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.552285f, 18.0f, 6.0f, 17.552284f, 6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 14.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.LineTo(12.0f, 10.0f),
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
                    PathNode.MoveTo(4.82f, 7.9f),
                    PathNode.LineTo(8.0f, 10.0f)
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
                    PathNode.MoveTo(15.18f, 7.9f),
                    PathNode.LineTo(12.0f, 10.0f)
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
                    PathNode.MoveTo(16.93f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(21.10457f, 10.0f, 22.0f, 10.895431f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 13.104569f, 21.10457f, 14.0f, 20.0f, 14.0f),
                    PathNode.LineTo(2.0f, 14.0f)
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
        return _turtle!!
    }

private var _turtle: ImageVector? = null
