package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessagesSquare: ImageVector
    get() {
        if (_messagesSquare != null) return _messagesSquare!!
        _messagesSquare = lucideOutlineIcon(
            name = "MessagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 11.104569f, 15.104569f, 12.0f, 14.0f, 12.0f),
                    PathNode.LineTo(6.828f, 12.0f),
                    PathNode.CurveTo(6.297611f, 12.000113f, 5.788986f, 12.210901f, 5.414f, 12.586f),
                    PathNode.LineTo(3.212f, 14.788f),
                    PathNode.CurveTo(3.008943f, 14.99102f, 2.703592f, 15.051746f, 2.438307f, 14.941868f),
                    PathNode.CurveTo(2.173023f, 14.831989f, 2.000037f, 14.57314f, 2.0f, 14.286f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.895431f, 2.895431f, 2.0f, 4.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.104569f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
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
                    PathNode.MoveTo(20.0f, 9.0f),
                    PathNode.CurveTo(21.10457f, 9.0f, 22.0f, 9.895431f, 22.0f, 11.0f),
                    PathNode.LineTo(22.0f, 21.286f),
                    PathNode.CurveTo(21.999964f, 21.57314f, 21.826977f, 21.83199f, 21.561693f, 21.941868f),
                    PathNode.CurveTo(21.296408f, 22.051746f, 20.991056f, 21.99102f, 20.788f, 21.788f),
                    PathNode.LineTo(18.586f, 19.586f),
                    PathNode.CurveTo(18.211014f, 19.210901f, 17.702389f, 19.000113f, 17.172f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(8.895431f, 19.0f, 8.0f, 18.10457f, 8.0f, 17.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
        return _messagesSquare!!
    }

private var _messagesSquare: ImageVector? = null
