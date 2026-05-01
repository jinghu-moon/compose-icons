package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartOff: ImageVector
    get() {
        if (_heartOff != null) return _heartOff!!
        _heartOff = lucideOutlineIcon(
            name = "HeartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.5f, 4.893f),
                    PathNode.CurveTo(10.902744f, 5.154383f, 11.269528f, 5.467377f, 11.591f, 5.824f),
                    PathNode.CurveTo(11.696891f, 5.937222f, 11.844977f, 6.001484f, 12.0f, 6.001484f),
                    PathNode.CurveTo(12.155023f, 6.001484f, 12.303109f, 5.937222f, 12.409f, 5.824f),
                    PathNode.CurveTo(13.927118f, 4.118204f, 16.342613f, 3.530239f, 18.474874f, 4.347483f),
                    PathNode.CurveTo(20.607136f, 5.164728f, 22.010878f, 7.216515f, 22.0f, 9.5f),
                    PathNode.CurveTo(22.0f, 11.372f, 20.998f, 12.856f, 19.813f, 14.155f)
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
                    PathNode.MoveTo(16.967f, 16.967f),
                    PathNode.LineTo(13.508f, 20.313f),
                    PathNode.CurveTo(13.131067f, 20.745916f, 12.586294f, 20.99601f, 12.012289f, 20.999645f),
                    PathNode.CurveTo(11.438283f, 21.00328f, 10.890386f, 20.760109f, 10.508f, 20.332f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(3.5f, 13.5f, 2.0f, 11.8f, 2.0f, 9.5f),
                    PathNode.CurveTo(2.000145f, 7.536423f, 3.047111f, 5.72186f, 4.747f, 4.739f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
