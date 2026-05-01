package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleOff: ImageVector
    get() {
        if (_messageCircleOff != null) return _messageCircleOff!!
        _messageCircleOff = lucideOutlineIcon(
            name = "MessageCircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(4.93f, 4.929f),
                    PathNode.CurveTo(1.924262f, 7.934516f, 1.146955f, 12.511718f, 2.992f, 16.341f),
                    PathNode.CurveTo(3.139039f, 16.711914f, 3.171775f, 17.118332f, 3.086f, 17.508f),
                    PathNode.LineTo(2.021f, 20.798f),
                    PathNode.CurveTo(1.95123f, 21.137228f, 2.061949f, 21.488405f, 2.313667f, 21.726274f),
                    PathNode.CurveTo(2.565384f, 21.964144f, 2.922259f, 22.054834f, 3.257f, 21.966f),
                    PathNode.LineTo(6.67f, 20.968f),
                    PathNode.CurveTo(7.037716f, 20.895061f, 7.418529f, 20.92694f, 7.769f, 21.06f),
                    PathNode.CurveTo(11.57975f, 22.839691f, 16.096792f, 22.044752f, 19.071f, 19.071f)
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
                    PathNode.MoveTo(8.350001f, 2.69f),
                    PathNode.CurveTo(12.049881f, 1.244935f, 16.254269f, 2.126646f, 19.061863f, 4.936407f),
                    PathNode.CurveTo(21.869455f, 7.746168f, 22.74792f, 11.951235f, 21.3f, 15.65f)
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
        return _messageCircleOff!!
    }

private var _messageCircleOff: ImageVector? = null
