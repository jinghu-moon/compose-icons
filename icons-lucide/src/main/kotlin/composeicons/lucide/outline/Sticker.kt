package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = lucideOutlineIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 9.0f),
                    PathNode.CurveTo(21.00157f, 8.359943f, 20.747406f, 7.745774f, 20.294f, 7.294f),
                    PathNode.LineTo(16.706f, 3.706f),
                    PathNode.CurveTo(16.254227f, 3.252594f, 15.640058f, 2.99843f, 15.0f, 3.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(3.895431f, 3.0f, 3.0f, 3.895431f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 20.10457f, 3.895431f, 21.0f, 5.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(20.10457f, 21.0f, 21.0f, 20.10457f, 21.0f, 19.0f),
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
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 8.552285f, 15.447715f, 9.0f, 16.0f, 9.0f),
                    PathNode.LineTo(21.0f, 9.0f)
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
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.LineTo(8.01f, 13.0f)
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
                    PathNode.MoveTo(16.0f, 13.0f),
                    PathNode.LineTo(16.01f, 13.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 16.0f, 10.8f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(13.3f, 17.0f, 14.0f, 16.0f, 14.0f, 16.0f)
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
