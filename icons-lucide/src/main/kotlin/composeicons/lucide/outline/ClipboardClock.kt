package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardClock: ImageVector
    get() {
        if (_clipboardClock != null) return _clipboardClock!!
        _clipboardClock = lucideOutlineIcon(
            name = "ClipboardClock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 16.2f),
                    PathNode.LineTo(17.6f, 17.2f)
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
                    PathNode.MoveTo(16.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.10457f, 4.0f, 20.0f, 4.895431f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.832f)
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
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(4.895431f, 4.0f, 4.0f, 4.895431f, 4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(4.0f, 21.10457f, 4.895431f, 22.0f, 6.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f)
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
                    PathNode.MoveTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 19.31371f, 19.31371f, 22.0f, 16.0f, 22.0f),
                    PathNode.CurveTo(12.686292f, 22.0f, 10.0f, 19.31371f, 10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 12.686292f, 12.686292f, 10.0f, 16.0f, 10.0f),
                    PathNode.CurveTo(19.31371f, 10.0f, 22.0f, 12.686292f, 22.0f, 16.0f),
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
                    PathNode.MoveTo(9.0f, 2.0f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.552285f, 2.0f, 16.0f, 2.447715f, 16.0f, 3.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 5.552285f, 15.552285f, 6.0f, 15.0f, 6.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.CurveTo(8.447715f, 6.0f, 8.0f, 5.552285f, 8.0f, 5.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(8.0f, 2.447715f, 8.447715f, 2.0f, 9.0f, 2.0f),
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
        return _clipboardClock!!
    }

private var _clipboardClock: ImageVector? = null
