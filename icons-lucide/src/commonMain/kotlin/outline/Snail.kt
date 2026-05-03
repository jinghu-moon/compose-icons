package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Snail: ImageVector
    get() {
        if (_snail != null) return _snail!!
        _snail = lucideOutlineIcon(
            name = "Snail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 13.0f),
                    PathNode.CurveTo(2.0f, 16.31371f, 4.686292f, 19.0f, 8.0f, 19.0f),
                    PathNode.CurveTo(11.313708f, 19.0f, 14.0f, 16.31371f, 14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 10.790861f, 12.209139f, 9.0f, 10.0f, 9.0f),
                    PathNode.CurveTo(7.790861f, 9.0f, 6.0f, 10.790861f, 6.0f, 13.0f),
                    PathNode.CurveTo(6.0f, 14.104569f, 6.895431f, 15.0f, 8.0f, 15.0f),
                    PathNode.CurveTo(9.104569f, 15.0f, 10.0f, 14.104569f, 10.0f, 13.0f)
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
                    PathNode.MoveTo(18.0f, 13.0f),
                    PathNode.CurveTo(18.0f, 17.418278f, 14.418278f, 21.0f, 10.0f, 21.0f),
                    PathNode.CurveTo(5.581722f, 21.0f, 2.0f, 17.418278f, 2.0f, 13.0f),
                    PathNode.CurveTo(2.0f, 8.581722f, 5.581722f, 5.0f, 10.0f, 5.0f),
                    PathNode.CurveTo(14.418278f, 5.0f, 18.0f, 8.581722f, 18.0f, 13.0f),
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(18.4f, 21.0f, 22.0f, 17.4f, 22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 5.895431f, 21.10457f, 5.0f, 20.0f, 5.0f),
                    PathNode.CurveTo(18.89543f, 5.0f, 18.0f, 5.895431f, 18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 13.0f)
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
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.LineTo(19.1f, 5.2f)
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
                    PathNode.MoveTo(22.0f, 3.0f),
                    PathNode.LineTo(20.9f, 5.2f)
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
        return _snail!!
    }

private var _snail: ImageVector? = null
