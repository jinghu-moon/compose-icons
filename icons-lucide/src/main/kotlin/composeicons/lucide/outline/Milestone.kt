package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Milestone: ImageVector
    get() {
        if (_milestone != null) return _milestone!!
        _milestone = lucideOutlineIcon(
            name = "Milestone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 6.0f)
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
                    PathNode.MoveTo(18.172f, 6.0f),
                    PathNode.CurveTo(18.702389f, 6.000114f, 19.211014f, 6.210902f, 19.586f, 6.586f),
                    PathNode.LineTo(21.646f, 8.646f),
                    PathNode.CurveTo(21.872677f, 8.872398f, 22.000044f, 9.179627f, 22.000044f, 9.5f),
                    PathNode.CurveTo(22.000044f, 9.820373f, 21.872677f, 10.127602f, 21.646f, 10.354f),
                    PathNode.LineTo(19.586f, 12.414f),
                    PathNode.CurveTo(19.211014f, 12.789099f, 18.702389f, 12.999887f, 18.172f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.CurveTo(3.447715f, 13.0f, 3.0f, 12.552285f, 3.0f, 12.0f),
                    PathNode.LineTo(3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 6.447716f, 3.447715f, 6.0f, 4.0f, 6.0f),
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
        return _milestone!!
    }

private var _milestone: ImageVector? = null
