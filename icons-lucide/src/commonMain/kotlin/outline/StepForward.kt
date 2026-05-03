package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StepForward: ImageVector
    get() {
        if (_stepForward != null) return _stepForward!!
        _stepForward = lucideOutlineIcon(
            name = "StepForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.029f, 4.285f),
                    PathNode.CurveTo(9.411136f, 3.914277f, 8.64162f, 3.904568f, 8.014598f, 4.259584f),
                    PathNode.CurveTo(7.387577f, 4.614599f, 6.999993f, 5.279451f, 7.0f, 6.0f),
                    PathNode.LineTo(7.0f, 18.0f),
                    PathNode.CurveTo(6.999993f, 18.720549f, 7.387577f, 19.3854f, 8.014598f, 19.740417f),
                    PathNode.CurveTo(8.64162f, 20.095432f, 9.411136f, 20.085722f, 10.029f, 19.715f),
                    PathNode.LineTo(20.026f, 13.717f),
                    PathNode.CurveTo(20.629686f, 13.356315f, 20.999586f, 12.705079f, 21.000202f, 12.00185f),
                    PathNode.CurveTo(21.000816f, 11.298621f, 20.632055f, 10.646741f, 20.029f, 10.285f),
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
                    PathNode.MoveTo(3.0f, 4.0f),
                    PathNode.LineTo(3.0f, 20.0f)
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
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
