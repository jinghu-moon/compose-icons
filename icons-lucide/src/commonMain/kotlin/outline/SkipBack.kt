package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = lucideOutlineIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.971f, 4.285f),
                    PathNode.CurveTo(18.588863f, 3.914277f, 19.358381f, 3.904568f, 19.985401f, 4.259584f),
                    PathNode.CurveTo(20.612423f, 4.614599f, 21.000008f, 5.279451f, 21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.000008f, 18.720549f, 20.612423f, 19.3854f, 19.985401f, 19.740417f),
                    PathNode.CurveTo(19.358381f, 20.095432f, 18.588863f, 20.085722f, 17.971f, 19.715f),
                    PathNode.LineTo(7.974f, 13.717f),
                    PathNode.CurveTo(7.370313f, 13.356315f, 7.000414f, 12.705079f, 6.999799f, 12.00185f),
                    PathNode.CurveTo(6.999184f, 11.298621f, 7.367945f, 10.646741f, 7.971f, 10.285f),
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
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 4.0f)
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
