package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorFillIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(111.59f, 181.47f),
                    PathNode.CurveTo(112.4033f, 183.9097f, 111.99415f, 186.59163f, 110.49041f, 188.67784f),
                    PathNode.CurveTo(108.98667f, 190.76407f, 106.571686f, 192.00018f, 104.0f, 192.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(21.428314f, 192.00018f, 19.013332f, 190.76407f, 17.509588f, 188.67784f),
                    PathNode.CurveTo(16.005844f, 186.59163f, 15.596704f, 183.9097f, 16.41f, 181.47f),
                    PathNode.LineTo(56.41f, 61.47f),
                    PathNode.CurveTo(57.49842f, 58.202442f, 60.555935f, 55.998222f, 64.0f, 55.998222f),
                    PathNode.CurveTo(67.44406f, 55.998222f, 70.50158f, 58.202442f, 71.59f, 61.47f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.CurveTo(208.0f, 47.281193f, 184.71881f, 24.0f, 156.0f, 24.0f),
                    PathNode.CurveTo(127.2812f, 24.0f, 104.0f, 47.281193f, 104.0f, 76.0f),
                    PathNode.CurveTo(104.0f, 104.7188f, 127.2812f, 128.0f, 156.0f, 128.0f),
                    PathNode.CurveTo(184.7051f, 127.966934f, 207.96693f, 104.7051f, 208.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(131.58173f, 144.0f, 128.0f, 147.58173f, 128.0f, 152.0f),
                    PathNode.LineTo(128.0f, 208.0f),
                    PathNode.CurveTo(128.0f, 212.41827f, 131.58173f, 216.0f, 136.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 152.0f),
                    PathNode.CurveTo(232.0f, 147.58173f, 228.41827f, 144.0f, 224.0f, 144.0f),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
