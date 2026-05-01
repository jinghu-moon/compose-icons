package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileDiff: ImageVector
    get() {
        if (_fileDiff != null) return _fileDiff!!
        _fileDiff = lucideOutlineIcon(
            name = "FileDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 22.0f),
                    PathNode.CurveTo(4.895431f, 22.0f, 4.0f, 21.10457f, 4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 2.895431f, 4.895431f, 2.0f, 6.0f, 2.0f),
                    PathNode.LineTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.639365f, 1.998964f, 15.252715f, 2.253087f, 15.704f, 2.706f),
                    PathNode.LineTo(19.292f, 6.294f),
                    PathNode.CurveTo(19.74614f, 6.745445f, 20.00104f, 7.359654f, 20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(20.0f, 21.10457f, 19.10457f, 22.0f, 18.0f, 22.0f),
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 7.0f)
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
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f)
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
        return _fileDiff!!
    }

private var _fileDiff: ImageVector? = null
