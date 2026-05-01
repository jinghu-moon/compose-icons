package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = lucideOutlineIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.CurveTo(16.53039f, 6.000114f, 17.039015f, 6.210902f, 17.414f, 6.586f),
                    PathNode.LineTo(21.414f, 10.586f),
                    PathNode.CurveTo(21.789099f, 10.960985f, 21.999887f, 11.46961f, 22.0f, 12.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.10457f, 21.10457f, 21.0f, 20.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(2.895431f, 21.0f, 2.0f, 20.10457f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.000113f, 11.46961f, 2.210901f, 10.960985f, 2.586f, 10.586f),
                    PathNode.LineTo(6.586f, 6.586f),
                    PathNode.CurveTo(6.960986f, 6.210902f, 7.46961f, 6.000114f, 8.0f, 6.0f),
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
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 2.895431f, 15.104569f, 2.0f, 14.0f, 2.0f),
                    PathNode.LineTo(10.0f, 2.0f),
                    PathNode.CurveTo(8.895431f, 2.0f, 8.0f, 2.895431f, 8.0f, 4.0f),
                    PathNode.LineTo(8.0f, 6.0f)
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
                    PathNode.MoveTo(2.0f, 14.0f),
                    PathNode.LineTo(22.0f, 14.0f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
