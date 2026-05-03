package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = lucideOutlineIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(5.627f, 21.373f),
                    PathNode.CurveTo(4.798573f, 22.201704f, 3.455203f, 22.201927f, 2.6265f, 21.3735f),
                    PathNode.CurveTo(1.797797f, 20.545073f, 1.797573f, 19.201704f, 2.626f, 18.373f),
                    PathNode.LineTo(12.0f, 9.0f)
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
                    PathNode.MoveTo(18.0f, 15.0f),
                    PathNode.LineTo(22.0f, 11.0f)
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
                    PathNode.MoveTo(21.5f, 11.5f),
                    PathNode.LineTo(19.586f, 9.586f),
                    PathNode.CurveTo(19.210901f, 9.211015f, 19.000113f, 8.70239f, 19.0f, 8.172f),
                    PathNode.LineTo(19.0f, 7.828f),
                    PathNode.CurveTo(18.999887f, 7.297611f, 18.789099f, 6.788986f, 18.414f, 6.414f),
                    PathNode.LineTo(16.757f, 4.757f),
                    PathNode.CurveTo(15.632125f, 3.632316f, 14.106679f, 3.00034f, 12.516f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(10.243f, 4.243f),
                    PathNode.CurveTo(11.367929f, 5.36812f, 11.999926f, 6.893975f, 12.0f, 8.485f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.LineTo(15.172f, 12.0f),
                    PathNode.CurveTo(15.70239f, 12.000113f, 16.211014f, 12.210901f, 16.586f, 12.586f),
                    PathNode.LineTo(18.5f, 14.5f)
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
