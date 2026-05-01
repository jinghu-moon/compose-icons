package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaseLower: ImageVector
    get() {
        if (_caseLower != null) return _caseLower!!
        _caseLower = lucideOutlineIcon(
            name = "CaseLower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 16.0f)
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
                    PathNode.MoveTo(14.0f, 6.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
                    PathNode.MoveTo(21.0f, 12.5f),
                    PathNode.CurveTo(21.0f, 14.432997f, 19.432997f, 16.0f, 17.5f, 16.0f),
                    PathNode.CurveTo(15.567003f, 16.0f, 14.0f, 14.432997f, 14.0f, 12.5f),
                    PathNode.CurveTo(14.0f, 10.567003f, 15.567003f, 9.0f, 17.5f, 9.0f),
                    PathNode.CurveTo(19.432997f, 9.0f, 21.0f, 10.567003f, 21.0f, 12.5f),
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
                    PathNode.MoveTo(10.0f, 12.5f),
                    PathNode.CurveTo(10.0f, 14.432997f, 8.432997f, 16.0f, 6.5f, 16.0f),
                    PathNode.CurveTo(4.567004f, 16.0f, 3.0f, 14.432997f, 3.0f, 12.5f),
                    PathNode.CurveTo(3.0f, 10.567003f, 4.567004f, 9.0f, 6.5f, 9.0f),
                    PathNode.CurveTo(8.432997f, 9.0f, 10.0f, 10.567003f, 10.0f, 12.5f),
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
        return _caseLower!!
    }

private var _caseLower: ImageVector? = null
