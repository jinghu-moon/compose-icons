package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareDot: ImageVector
    get() {
        if (_messageSquareDot != null) return _messageSquareDot!!
        _messageSquareDot = lucideOutlineIcon(
            name = "MessageSquareDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.7f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f),
                    PathNode.CurveTo(2.895431f, 3.0f, 2.0f, 3.895431f, 2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 21.286f),
                    PathNode.CurveTo(2.000037f, 21.57314f, 2.173023f, 21.83199f, 2.438307f, 21.941868f),
                    PathNode.CurveTo(2.703592f, 22.051746f, 3.008943f, 21.99102f, 3.212f, 21.788f),
                    PathNode.LineTo(5.414f, 19.586f),
                    PathNode.CurveTo(5.788986f, 19.210901f, 6.297611f, 19.000113f, 6.828f, 19.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(21.10457f, 19.0f, 22.0f, 18.10457f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 12.3f)
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
                    PathNode.MoveTo(22.0f, 6.0f),
                    PathNode.CurveTo(22.0f, 7.656854f, 20.656855f, 9.0f, 19.0f, 9.0f),
                    PathNode.CurveTo(17.343145f, 9.0f, 16.0f, 7.656854f, 16.0f, 6.0f),
                    PathNode.CurveTo(16.0f, 4.343146f, 17.343145f, 3.0f, 19.0f, 3.0f),
                    PathNode.CurveTo(20.656855f, 3.0f, 22.0f, 4.343146f, 22.0f, 6.0f),
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
        return _messageSquareDot!!
    }

private var _messageSquareDot: ImageVector? = null
