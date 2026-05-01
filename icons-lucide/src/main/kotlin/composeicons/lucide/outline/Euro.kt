package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Euro: ImageVector
    get() {
        if (_euro != null) return _euro!!
        _euro = lucideOutlineIcon(
            name = "Euro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f)
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
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f)
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
                    PathNode.MoveTo(19.0f, 6.0f),
                    PathNode.CurveTo(17.577066f, 4.707642f, 15.722211f, 3.994236f, 13.8f, 4.0f),
                    PathNode.CurveTo(11.704736f, 4.026354f, 9.705778f, 4.884056f, 8.242958f, 6.384384f),
                    PathNode.CurveTo(6.780139f, 7.884712f, 5.97331f, 9.90474f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 16.4f, 9.5f, 20.0f, 13.8f, 20.0f),
                    PathNode.CurveTo(15.8f, 20.0f, 17.6f, 19.2f, 19.0f, 18.0f)
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
        return _euro!!
    }

private var _euro: ImageVector? = null
