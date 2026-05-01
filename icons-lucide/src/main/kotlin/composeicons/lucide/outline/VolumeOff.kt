package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) return _volumeOff!!
        _volumeOff = lucideOutlineIcon(
            name = "VolumeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.CurveTo(16.504356f, 9.672338f, 16.83109f, 10.460969f, 16.95f, 11.293f)
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
                    PathNode.MoveTo(19.364f, 5.636f),
                    PathNode.CurveTo(21.981415f, 8.251929f, 22.73084f, 12.203371f, 21.253f, 15.596f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(6.413f, 7.587f),
                    PathNode.CurveTo(6.14921f, 7.852368f, 5.790171f, 8.001097f, 5.416f, 8.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(2.447715f, 8.0f, 2.0f, 8.447715f, 2.0f, 9.0f),
                    PathNode.LineTo(2.0f, 15.0f),
                    PathNode.CurveTo(2.0f, 15.552285f, 2.447715f, 16.0f, 3.0f, 16.0f),
                    PathNode.LineTo(5.416f, 16.0f),
                    PathNode.CurveTo(5.790171f, 15.998903f, 6.14921f, 16.147633f, 6.413f, 16.413f),
                    PathNode.LineTo(9.796f, 19.797f),
                    PathNode.CurveTo(9.997645f, 19.999043f, 10.301225f, 20.059551f, 10.564925f, 19.95026f),
                    PathNode.CurveTo(10.828625f, 19.84097f, 11.000397f, 19.58345f, 11.0f, 19.298f),
                    PathNode.LineTo(11.0f, 11.0f)
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
                    PathNode.MoveTo(9.828f, 4.172f),
                    PathNode.CurveTo(10.024097f, 3.975153f, 10.319571f, 3.916035f, 10.57631f, 4.022279f),
                    PathNode.CurveTo(10.83305f, 4.128524f, 11.000345f, 4.379146f, 11.0f, 4.657f),
                    PathNode.LineTo(11.0f, 5.343f)
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
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
