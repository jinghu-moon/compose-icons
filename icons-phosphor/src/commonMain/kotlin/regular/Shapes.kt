package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorRegularIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(71.59f, 61.47f),
                    PathNode.CurveTo(70.50158f, 58.202442f, 67.44406f, 55.998222f, 64.0f, 55.998222f),
                    PathNode.CurveTo(60.555935f, 55.998222f, 57.49842f, 58.202442f, 56.41f, 61.47f),
                    PathNode.LineTo(16.41f, 181.47f),
                    PathNode.CurveTo(15.596704f, 183.9097f, 16.005844f, 186.59163f, 17.509588f, 188.67784f),
                    PathNode.CurveTo(19.013332f, 190.76407f, 21.428314f, 192.00018f, 24.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.CurveTo(106.571686f, 192.00018f, 108.98667f, 190.76407f, 110.49041f, 188.67784f),
                    PathNode.CurveTo(111.99415f, 186.59163f, 112.4033f, 183.9097f, 111.59f, 181.47f),
                    PathNode.Close,
                    PathNode.MoveTo(35.1f, 176.0f),
                    PathNode.LineTo(64.0f, 89.3f),
                    PathNode.LineTo(92.9f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.CurveTo(208.0f, 47.281193f, 184.71881f, 24.0f, 156.0f, 24.0f),
                    PathNode.CurveTo(127.2812f, 24.0f, 104.0f, 47.281193f, 104.0f, 76.0f),
                    PathNode.CurveTo(104.0f, 104.7188f, 127.2812f, 128.0f, 156.0f, 128.0f),
                    PathNode.CurveTo(184.7051f, 127.966934f, 207.96693f, 104.7051f, 208.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 76.0f),
                    PathNode.CurveTo(120.0f, 56.11775f, 136.11777f, 40.0f, 156.0f, 40.0f),
                    PathNode.CurveTo(175.88223f, 40.0f, 192.0f, 56.11775f, 192.0f, 76.0f),
                    PathNode.CurveTo(192.0f, 95.88225f, 175.88223f, 112.0f, 156.0f, 112.0f),
                    PathNode.CurveTo(136.11777f, 112.0f, 120.0f, 95.88225f, 120.0f, 76.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shapes!!
    }

private var _shapes: ImageVector? = null
