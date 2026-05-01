package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorLightIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.46f, 122.18f),
                    PathNode.LineTo(221.12f, 115.09f),
                    PathNode.CurveTo(215.38663f, 73.392204f, 182.59851f, 40.60817f, 140.9f, 34.88f),
                    PathNode.LineTo(133.82f, 6.54f),
                    PathNode.CurveTo(133.151f, 3.870664f, 130.75189f, 1.99863f, 128.0f, 1.99863f),
                    PathNode.CurveTo(125.2481f, 1.99863f, 122.849f, 3.870664f, 122.18f, 6.54f),
                    PathNode.LineTo(115.1f, 34.88f),
                    PathNode.CurveTo(73.40149f, 40.60817f, 40.613365f, 73.392204f, 34.88f, 115.09f),
                    PathNode.LineTo(6.54f, 122.18f),
                    PathNode.CurveTo(3.870664f, 122.849f, 1.99863f, 125.2481f, 1.99863f, 128.0f),
                    PathNode.CurveTo(1.99863f, 130.75189f, 3.870664f, 133.151f, 6.54f, 133.82f),
                    PathNode.LineTo(34.88f, 140.91f),
                    PathNode.CurveTo(40.613365f, 182.6078f, 73.40149f, 215.39183f, 115.1f, 221.12f),
                    PathNode.LineTo(122.18f, 249.46f),
                    PathNode.CurveTo(122.849f, 252.12933f, 125.2481f, 254.00137f, 128.0f, 254.00137f),
                    PathNode.CurveTo(130.75189f, 254.00137f, 133.151f, 252.12933f, 133.82f, 249.46f),
                    PathNode.LineTo(140.9f, 221.12f),
                    PathNode.CurveTo(182.59851f, 215.39183f, 215.38663f, 182.6078f, 221.12f, 140.91f),
                    PathNode.LineTo(249.46f, 133.82f),
                    PathNode.CurveTo(252.12933f, 133.151f, 254.00137f, 130.75189f, 254.00137f, 128.0f),
                    PathNode.CurveTo(254.00137f, 125.2481f, 252.12933f, 122.849f, 249.46f, 122.18f),
                    PathNode.Close,
                    PathNode.MoveTo(208.41f, 111.92f),
                    PathNode.LineTo(157.0f, 99.05f),
                    PathNode.LineTo(144.08f, 47.59f),
                    PathNode.CurveTo(176.56053f, 54.048973f, 201.95103f, 79.43946f, 208.41f, 111.92f),
                    PathNode.Close,
                    PathNode.MoveTo(145.41f, 102.16f),
                    PathNode.LineTo(128.0f, 119.51f),
                    PathNode.LineTo(110.64f, 102.16f),
                    PathNode.LineTo(128.0f, 32.74f),
                    PathNode.Close,
                    PathNode.MoveTo(111.92f, 47.59f),
                    PathNode.LineTo(99.05f, 99.05f),
                    PathNode.LineTo(47.59f, 111.92f),
                    PathNode.CurveTo(54.048973f, 79.43946f, 79.43946f, 54.048973f, 111.92f, 47.59f),
                    PathNode.Close,
                    PathNode.MoveTo(102.16f, 110.65f),
                    PathNode.LineTo(119.52f, 128.0f),
                    PathNode.LineTo(102.16f, 145.35f),
                    PathNode.LineTo(32.74f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(47.59f, 144.08f),
                    PathNode.LineTo(99.05f, 157.0f),
                    PathNode.LineTo(111.92f, 208.46f),
                    PathNode.CurveTo(79.42511f, 201.99382f, 54.030926f, 176.57991f, 47.59f, 144.08f),
                    PathNode.Close,
                    PathNode.MoveTo(110.64f, 153.84f),
                    PathNode.LineTo(128.0f, 136.49f),
                    PathNode.LineTo(145.36f, 153.84f),
                    PathNode.LineTo(128.0f, 223.26f),
                    PathNode.Close,
                    PathNode.MoveTo(144.08f, 208.41f),
                    PathNode.LineTo(157.0f, 157.0f),
                    PathNode.LineTo(208.46f, 144.13f),
                    PathNode.CurveTo(201.9758f, 176.60551f, 176.56557f, 201.97627f, 144.08f, 208.41f),
                    PathNode.Close,
                    PathNode.MoveTo(153.84f, 145.35f),
                    PathNode.LineTo(136.48f, 128.0f),
                    PathNode.LineTo(153.84f, 110.65f),
                    PathNode.LineTo(223.26f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
