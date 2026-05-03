package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageSquareLock: ImageVector
    get() {
        if (_messageSquareLock != null) return _messageSquareLock!!
        _messageSquareLock = lucideOutlineIcon(
            name = "MessageSquareLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 8.5f),
                    PathNode.LineTo(22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 3.895431f, 21.10457f, 3.0f, 20.0f, 3.0f),
                    PathNode.LineTo(4.0f, 3.0f),
                    PathNode.CurveTo(2.895431f, 3.0f, 2.0f, 3.895431f, 2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 21.286f),
                    PathNode.CurveTo(2.000037f, 21.57314f, 2.173023f, 21.83199f, 2.438307f, 21.941868f),
                    PathNode.CurveTo(2.703592f, 22.051746f, 3.008943f, 21.99102f, 3.212f, 21.788f),
                    PathNode.LineTo(5.414f, 19.586f),
                    PathNode.CurveTo(5.788986f, 19.210901f, 6.297611f, 19.000113f, 6.828f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f)
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
                    PathNode.MoveTo(20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 11.895431f, 19.10457f, 11.0f, 18.0f, 11.0f),
                    PathNode.CurveTo(16.89543f, 11.0f, 16.0f, 11.895431f, 16.0f, 13.0f),
                    PathNode.LineTo(16.0f, 15.0f)
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
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.CurveTo(21.552284f, 15.0f, 22.0f, 15.447715f, 22.0f, 16.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 19.552284f, 21.552284f, 20.0f, 21.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(14.447715f, 20.0f, 14.0f, 19.552284f, 14.0f, 19.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.CurveTo(14.0f, 15.447715f, 14.447715f, 15.0f, 15.0f, 15.0f),
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
        }
        return _messageSquareLock!!
    }

private var _messageSquareLock: ImageVector? = null
