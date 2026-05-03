package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LandPlot: ImageVector
    get() {
        if (_landPlot != null) return _landPlot!!
        _landPlot = lucideOutlineIcon(
            name = "LandPlot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(8.0f, 11.99f),
                    PathNode.LineTo(2.5f, 15.13f),
                    PathNode.CurveTo(2.18669f, 15.307561f, 1.993052f, 15.639874f, 1.993052f, 16.0f),
                    PathNode.CurveTo(1.993052f, 16.360126f, 2.18669f, 16.692438f, 2.5f, 16.87f),
                    PathNode.LineTo(11.0f, 21.73f),
                    PathNode.CurveTo(11.618802f, 22.087267f, 12.381198f, 22.087267f, 13.0f, 21.73f),
                    PathNode.LineTo(21.5f, 16.87f),
                    PathNode.CurveTo(21.81331f, 16.692438f, 22.006948f, 16.360126f, 22.006948f, 16.0f),
                    PathNode.CurveTo(22.006948f, 15.639874f, 21.81331f, 15.307561f, 21.5f, 15.13f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(6.49f, 12.85f),
                    PathNode.LineTo(17.51f, 19.15f)
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
                    PathNode.MoveTo(17.51f, 12.85f),
                    PathNode.LineTo(6.5f, 19.15f)
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
        return _landPlot!!
    }

private var _landPlot: ImageVector? = null
