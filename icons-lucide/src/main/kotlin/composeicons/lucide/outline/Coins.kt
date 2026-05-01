package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = lucideOutlineIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.744f, 17.736f),
                    PathNode.CurveTo(12.915004f, 20.477089f, 10.264459f, 22.250269f, 7.414466f, 21.97037f),
                    PathNode.CurveTo(4.564472f, 21.690474f, 2.309528f, 19.435528f, 2.02963f, 16.585535f),
                    PathNode.CurveTo(1.749733f, 13.735541f, 3.522911f, 11.084996f, 6.264f, 10.256f)
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
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.LineTo(16.0f, 6.0f),
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
                    PathNode.MoveTo(6.134f, 14.768f),
                    PathNode.LineTo(7.0f, 14.268f),
                    PathNode.LineTo(9.0f, 17.732f)
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
                    PathNode.MoveTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 11.313708f, 19.31371f, 14.0f, 16.0f, 14.0f),
                    PathNode.CurveTo(12.686292f, 14.0f, 10.0f, 11.313708f, 10.0f, 8.0f),
                    PathNode.CurveTo(10.0f, 4.686292f, 12.686292f, 2.0f, 16.0f, 2.0f),
                    PathNode.CurveTo(19.31371f, 2.0f, 22.0f, 4.686292f, 22.0f, 8.0f),
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
        return _coins!!
    }

private var _coins: ImageVector? = null
