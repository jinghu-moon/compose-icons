package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StepBack: ImageVector
    get() {
        if (_stepBack != null) return _stepBack!!
        _stepBack = lucideOutlineIcon(
            name = "StepBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.971f, 4.285f),
                    PathNode.CurveTo(14.588864f, 3.914277f, 15.35838f, 3.904568f, 15.985402f, 4.259584f),
                    PathNode.CurveTo(16.612423f, 4.614599f, 17.000008f, 5.279451f, 17.0f, 6.0f),
                    PathNode.LineTo(17.0f, 18.0f),
                    PathNode.CurveTo(17.000008f, 18.720549f, 16.612423f, 19.3854f, 15.985402f, 19.740417f),
                    PathNode.CurveTo(15.35838f, 20.095432f, 14.588864f, 20.085722f, 13.971f, 19.715f),
                    PathNode.LineTo(3.974f, 13.717f),
                    PathNode.CurveTo(3.370314f, 13.356315f, 3.000414f, 12.705079f, 2.999799f, 12.00185f),
                    PathNode.CurveTo(2.999184f, 11.298621f, 3.367945f, 10.646741f, 3.971f, 10.285f),
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
                    PathNode.MoveTo(21.0f, 20.0f),
                    PathNode.LineTo(21.0f, 4.0f)
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
        return _stepBack!!
    }

private var _stepBack: ImageVector? = null
