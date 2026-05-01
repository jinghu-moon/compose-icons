package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = lucideOutlineIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
                    PathNode.MoveTo(5.0f, 2.0f),
                    PathNode.LineTo(19.0f, 2.0f)
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
                    PathNode.MoveTo(17.0f, 22.0f),
                    PathNode.LineTo(17.0f, 17.828f),
                    PathNode.CurveTo(16.999887f, 17.297611f, 16.789099f, 16.788986f, 16.414f, 16.414f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(7.586f, 16.414f),
                    PathNode.CurveTo(7.210902f, 16.788986f, 7.000114f, 17.297611f, 7.0f, 17.828f),
                    PathNode.LineTo(7.0f, 22.0f)
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
                    PathNode.MoveTo(7.0f, 2.0f),
                    PathNode.LineTo(7.0f, 6.172f),
                    PathNode.CurveTo(7.000114f, 6.70239f, 7.210902f, 7.211015f, 7.586f, 7.586f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(16.414f, 7.586f),
                    PathNode.CurveTo(16.789099f, 7.211015f, 16.999887f, 6.70239f, 17.0f, 6.172f),
                    PathNode.LineTo(17.0f, 2.0f)
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
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
