package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorRegularIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(105.90861f, 64.0f, 88.0f, 81.90861f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 126.09139f, 105.90861f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(150.09138f, 144.0f, 168.0f, 126.09139f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 81.90861f, 150.09138f, 64.0f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.CurveTo(114.74516f, 128.0f, 104.0f, 117.25484f, 104.0f, 104.0f),
                    PathNode.CurveTo(104.0f, 90.74516f, 114.74516f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(141.25484f, 80.0f, 152.0f, 90.74516f, 152.0f, 104.0f),
                    PathNode.CurveTo(152.0f, 117.25484f, 141.25484f, 128.0f, 128.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(79.42178f, 16.055109f, 40.055107f, 55.421787f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 135.4f, 54.51f, 168.68f, 82.0f, 200.25f),
                    PathNode.CurveTo(94.3522f, 214.51566f, 108.254524f, 227.36147f, 123.45f, 238.55f),
                    PathNode.CurveTo(126.205574f, 240.48035f, 129.87444f, 240.48035f, 132.63f, 238.55f),
                    PathNode.CurveTo(147.79749f, 227.35681f, 161.6728f, 214.51115f, 174.0f, 200.25f),
                    PathNode.CurveTo(201.45f, 168.68f, 216.0f, 135.4f, 216.0f, 104.0f),
                    PathNode.CurveTo(215.94489f, 55.421787f, 176.57822f, 16.055109f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 222.0f),
                    PathNode.CurveTo(111.47f, 209.0f, 56.0f, 161.25f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 64.2355f, 88.2355f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(167.7645f, 32.0f, 200.0f, 64.2355f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 161.23f, 144.53f, 209.0f, 128.0f, 222.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
