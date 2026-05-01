package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BrushCleaning: ImageVector
    get() {
        if (_brushCleaning != null) return _brushCleaning!!
        _brushCleaning = lucideOutlineIcon(
            name = "BrushCleaning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 22.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.552284f, 14.0f, 20.0f, 13.552285f, 20.0f, 13.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 10.895431f, 19.10457f, 10.0f, 18.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(14.447715f, 10.0f, 14.0f, 9.552285f, 14.0f, 9.0f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.CurveTo(14.0f, 2.895431f, 13.104569f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(10.895431f, 2.0f, 10.0f, 2.895431f, 10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 9.552285f, 9.552285f, 10.0f, 9.0f, 10.0f),
                    PathNode.LineTo(6.0f, 10.0f),
                    PathNode.CurveTo(4.895431f, 10.0f, 4.0f, 10.895431f, 4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(4.0f, 13.552285f, 4.447716f, 14.0f, 5.0f, 14.0f)
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
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.LineTo(3.027f, 20.767f),
                    PathNode.CurveTo(2.955631f, 21.064873f, 3.024715f, 21.379026f, 3.214464f, 21.61948f),
                    PathNode.CurveTo(3.404213f, 21.859932f, 3.693696f, 22.00016f, 4.0f, 22.0f),
                    PathNode.LineTo(20.0f, 22.0f),
                    PathNode.CurveTo(20.306305f, 22.00016f, 20.595787f, 21.859932f, 20.785536f, 21.61948f),
                    PathNode.CurveTo(20.975285f, 21.379026f, 21.044369f, 21.064873f, 20.973f, 20.767f),
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
                    PathNode.MoveTo(8.0f, 22.0f),
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
        }
        return _brushCleaning!!
    }

private var _brushCleaning: ImageVector? = null
