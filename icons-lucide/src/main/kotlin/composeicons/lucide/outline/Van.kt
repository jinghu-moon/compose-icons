package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = lucideOutlineIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 6.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 11.552285f, 13.447715f, 12.0f, 14.0f, 12.0f),
                    PathNode.LineTo(20.102f, 12.0f),
                    PathNode.CurveTo(20.36965f, 12.000048f, 20.62611f, 12.107386f, 20.814f, 12.298f),
                    PathNode.LineTo(21.712f, 13.208f),
                    PathNode.CurveTo(21.896498f, 13.395077f, 21.999952f, 13.647251f, 22.0f, 13.91f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 17.552284f, 21.552284f, 18.0f, 21.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f)
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
                    PathNode.MoveTo(5.0f, 18.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.CurveTo(2.447715f, 18.0f, 2.0f, 17.552284f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 6.895431f, 2.895431f, 6.0f, 4.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.CurveTo(17.1f, 6.0f, 18.1f, 6.8f, 18.4f, 7.8f),
                    PathNode.LineTo(19.576f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.LineTo(14.0f, 18.0f)
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
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 19.10457f, 17.10457f, 20.0f, 16.0f, 20.0f),
                    PathNode.CurveTo(14.895431f, 20.0f, 14.0f, 19.10457f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 16.89543f, 14.895431f, 16.0f, 16.0f, 16.0f),
                    PathNode.CurveTo(17.10457f, 16.0f, 18.0f, 16.89543f, 18.0f, 18.0f),
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 19.10457f, 8.10457f, 20.0f, 7.0f, 20.0f),
                    PathNode.CurveTo(5.895431f, 20.0f, 5.0f, 19.10457f, 5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 16.89543f, 5.895431f, 16.0f, 7.0f, 16.0f),
                    PathNode.CurveTo(8.10457f, 16.0f, 9.0f, 16.89543f, 9.0f, 18.0f),
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
        return _van!!
    }

private var _van: ImageVector? = null
