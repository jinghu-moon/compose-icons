package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareOff: ImageVector
    get() {
        if (_messageSquareOff != null) return _messageSquareOff!!
        _messageSquareOff = lucideOutlineIcon(
            name = "MessageSquareOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 19.0f),
                    PathNode.LineTo(6.828f, 19.0f),
                    PathNode.CurveTo(6.297611f, 19.000113f, 5.788986f, 19.210901f, 5.414f, 19.586f),
                    PathNode.LineTo(3.212f, 21.788f),
                    PathNode.CurveTo(3.012873f, 22.001991f, 2.701741f, 22.06972f, 2.431682f, 21.957863f),
                    PathNode.CurveTo(2.161623f, 21.846006f, 1.989501f, 21.57812f, 2.0f, 21.286f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(1.999986f, 4.211087f, 2.463737f, 3.495876f, 3.184f, 3.174f)
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
                    PathNode.MoveTo(8.656f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(21.10457f, 3.0f, 22.0f, 3.895431f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 16.344f)
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
        return _messageSquareOff!!
    }

private var _messageSquareOff: ImageVector? = null
