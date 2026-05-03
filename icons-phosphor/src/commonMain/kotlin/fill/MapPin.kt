package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorFillIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(79.42178f, 16.055109f, 40.055107f, 55.421787f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 179.3f, 120.0f, 236.17f, 123.41f, 238.55f),
                    PathNode.CurveTo(126.16557f, 240.48035f, 129.83443f, 240.48035f, 132.59f, 238.55f),
                    PathNode.CurveTo(136.0f, 236.17f, 216.0f, 179.3f, 216.0f, 104.0f),
                    PathNode.CurveTo(215.94489f, 55.421787f, 176.57822f, 16.055109f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 86.32689f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 121.67311f, 145.67311f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(110.32689f, 136.0f, 96.0f, 121.67311f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 86.32689f, 110.32689f, 72.0f, 128.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
