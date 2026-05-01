package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ALargeSmall: ImageVector
    get() {
        if (_aLargeSmall != null) return _aLargeSmall!!
        _aLargeSmall = lucideOutlineIcon(
            name = "ALargeSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 16.0f),
                    PathNode.LineTo(17.536f, 8.672f),
                    PathNode.CurveTo(17.678104f, 8.261018f, 18.065144f, 7.985323f, 18.5f, 7.985323f),
                    PathNode.CurveTo(18.934856f, 7.985323f, 19.321896f, 8.261018f, 19.464f, 8.672f),
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
                    PathNode.MoveTo(15.697f, 14.0f),
                    PathNode.LineTo(21.303f, 14.0f)
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
        }
        return _aLargeSmall!!
    }

private var _aLargeSmall: ImageVector? = null
