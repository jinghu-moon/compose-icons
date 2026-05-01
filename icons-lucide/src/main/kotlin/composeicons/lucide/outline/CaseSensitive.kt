package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CaseSensitive: ImageVector
    get() {
        if (_caseSensitive != null) return _caseSensitive!!
        _caseSensitive = lucideOutlineIcon(
            name = "CaseSensitive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 16.0f),
                    PathNode.LineTo(6.039f, 6.31f),
                    PathNode.CurveTo(6.116658f, 6.123726f, 6.298686f, 6.0024f, 6.5005f, 6.0024f),
                    PathNode.CurveTo(6.702314f, 6.0024f, 6.884342f, 6.123726f, 6.962f, 6.31f),
                    PathNode.LineTo(11.0f, 16.0f)
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
                    PathNode.MoveTo(22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 16.0f)
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
                    PathNode.MoveTo(3.304f, 13.0f),
                    PathNode.LineTo(9.696f, 13.0f)
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
                    PathNode.MoveTo(22.0f, 12.5f),
                    PathNode.CurveTo(22.0f, 14.432997f, 20.432997f, 16.0f, 18.5f, 16.0f),
                    PathNode.CurveTo(16.567003f, 16.0f, 15.0f, 14.432997f, 15.0f, 12.5f),
                    PathNode.CurveTo(15.0f, 10.567003f, 16.567003f, 9.0f, 18.5f, 9.0f),
                    PathNode.CurveTo(20.432997f, 9.0f, 22.0f, 10.567003f, 22.0f, 12.5f),
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
        return _caseSensitive!!
    }

private var _caseSensitive: ImageVector? = null
