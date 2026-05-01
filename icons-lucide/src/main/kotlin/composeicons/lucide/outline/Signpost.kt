package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = lucideOutlineIcon(
            name = "Signpost",
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
                    PathNode.MoveTo(2.354f, 10.354f),
                    PathNode.CurveTo(2.127324f, 10.127602f, 1.999955f, 9.820373f, 1.999955f, 9.5f),
                    PathNode.CurveTo(1.999955f, 9.179627f, 2.127324f, 8.872398f, 2.354f, 8.646f),
                    PathNode.LineTo(4.414f, 6.586f),
                    PathNode.CurveTo(4.788986f, 6.210902f, 5.297611f, 6.000114f, 5.828f, 6.0f),
                    PathNode.LineTo(18.172f, 6.0f),
                    PathNode.CurveTo(18.702389f, 6.000114f, 19.211014f, 6.210902f, 19.586f, 6.586f),
                    PathNode.LineTo(21.646f, 8.646f),
                    PathNode.CurveTo(21.872677f, 8.872398f, 22.000044f, 9.179627f, 22.000044f, 9.5f),
                    PathNode.CurveTo(22.000044f, 9.820373f, 21.872677f, 10.127602f, 21.646f, 10.354f),
                    PathNode.LineTo(19.586f, 12.414f),
                    PathNode.CurveTo(19.211014f, 12.789099f, 18.702389f, 12.999887f, 18.172f, 13.0f),
                    PathNode.LineTo(5.828f, 13.0f),
                    PathNode.CurveTo(5.297611f, 12.999887f, 4.788986f, 12.789099f, 4.414f, 12.414f),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
