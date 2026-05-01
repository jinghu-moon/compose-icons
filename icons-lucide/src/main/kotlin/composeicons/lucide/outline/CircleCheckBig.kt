package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleCheckBig: ImageVector
    get() {
        if (_circleCheckBig != null) return _circleCheckBig!!
        _circleCheckBig = lucideOutlineIcon(
            name = "CircleCheckBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.801f, 10.0f),
                    PathNode.CurveTo(22.742086f, 14.61852f, 20.330345f, 19.267159f, 16.012514f, 21.157318f),
                    PathNode.CurveTo(11.694684f, 23.04748f, 6.643184f, 21.665928f, 3.888277f, 17.841421f),
                    PathNode.CurveTo(1.133369f, 14.016914f, 1.423093f, 8.787919f, 4.583651f, 5.291171f),
                    PathNode.CurveTo(7.74421f, 1.794424f, 12.917416f, 0.979395f, 17.0f, 3.335f)
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
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.LineTo(22.0f, 4.0f)
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
        return _circleCheckBig!!
    }

private var _circleCheckBig: ImageVector? = null
