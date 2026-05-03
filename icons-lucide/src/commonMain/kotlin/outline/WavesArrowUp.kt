package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WavesArrowUp: ImageVector
    get() {
        if (_wavesArrowUp != null) return _wavesArrowUp!!
        _wavesArrowUp = lucideOutlineIcon(
            name = "WavesArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.0f, 10.0f)
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
                    PathNode.MoveTo(2.0f, 15.0f),
                    PathNode.CurveTo(2.6f, 15.5f, 3.2f, 16.0f, 4.5f, 16.0f),
                    PathNode.CurveTo(7.0f, 16.0f, 7.0f, 14.0f, 9.5f, 14.0f),
                    PathNode.CurveTo(12.1f, 14.0f, 11.9f, 16.0f, 14.5f, 16.0f),
                    PathNode.CurveTo(17.0f, 16.0f, 17.0f, 14.0f, 19.5f, 14.0f),
                    PathNode.CurveTo(20.8f, 14.0f, 21.4f, 14.5f, 22.0f, 15.0f)
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.CurveTo(2.6f, 21.5f, 3.2f, 22.0f, 4.5f, 22.0f),
                    PathNode.CurveTo(7.0f, 22.0f, 7.0f, 20.0f, 9.5f, 20.0f),
                    PathNode.CurveTo(12.1f, 20.0f, 11.9f, 22.0f, 14.5f, 22.0f),
                    PathNode.CurveTo(17.0f, 22.0f, 17.0f, 20.0f, 19.5f, 20.0f),
                    PathNode.CurveTo(20.8f, 20.0f, 21.4f, 20.5f, 22.0f, 21.0f)
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
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.LineTo(16.0f, 6.0f)
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
        return _wavesArrowUp!!
    }

private var _wavesArrowUp: ImageVector? = null
