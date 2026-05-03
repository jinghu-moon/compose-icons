package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LockKeyhole: ImageVector
    get() {
        if (_lockKeyhole != null) return _lockKeyhole!!
        _lockKeyhole = lucideOutlineIcon(
            name = "LockKeyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 16.552284f, 12.552285f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(11.447715f, 17.0f, 11.0f, 16.552284f, 11.0f, 16.0f),
                    PathNode.CurveTo(11.0f, 15.447715f, 11.447715f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.552285f, 15.0f, 13.0f, 15.447715f, 13.0f, 16.0f),
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
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(20.10457f, 10.0f, 21.0f, 10.895431f, 21.0f, 12.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.0f, 21.10457f, 20.10457f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.895431f, 22.0f, 3.0f, 21.10457f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 10.895431f, 3.895431f, 10.0f, 5.0f, 10.0f),
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.CurveTo(7.0f, 4.238577f, 9.238576f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(14.761424f, 2.0f, 17.0f, 4.238577f, 17.0f, 7.0f),
                    PathNode.LineTo(17.0f, 10.0f)
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
        return _lockKeyhole!!
    }

private var _lockKeyhole: ImageVector? = null
