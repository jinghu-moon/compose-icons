package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorLightIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 131.0f),
                    PathNode.LineTo(167.27f, 110.76f),
                    PathNode.CurveTo(160.36984f, 108.46736f, 154.74496f, 103.39011f, 151.76f, 96.76f),
                    PathNode.LineTo(128.51f, 42.31f),
                    PathNode.CurveTo(125.5227f, 35.593433f, 117.84955f, 32.331146f, 110.94f, 34.84f),
                    PathNode.LineTo(35.22f, 62.37f),
                    PathNode.CurveTo(29.693983f, 64.39297f, 26.014118f, 69.645355f, 26.0f, 75.53f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 199.73198f, 32.268013f, 206.0f, 40.0f, 206.0f),
                    PathNode.LineTo(240.0f, 206.0f),
                    PathNode.CurveTo(247.73198f, 206.0f, 254.0f, 199.73198f, 254.0f, 192.0f),
                    PathNode.LineTo(254.0f, 167.06f),
                    PathNode.CurveTo(254.00194f, 150.69553f, 243.52708f, 136.16772f, 228.0f, 131.0f),
                    PathNode.Close,
                    PathNode.MoveTo(39.32f, 73.65f),
                    PathNode.LineTo(115.0f, 46.12f),
                    PathNode.CurveTo(115.216866f, 46.036736f, 115.44773f, 45.99599f, 115.68f, 46.0f),
                    PathNode.CurveTo(116.43894f, 46.000404f, 117.13227f, 46.430344f, 117.47f, 47.11f),
                    PathNode.LineTo(125.47f, 65.79f),
                    PathNode.LineTo(102.0f, 74.36f),
                    PathNode.CurveTo(99.27006f, 75.35056f, 97.641426f, 78.15406f, 98.1332f, 81.01623f),
                    PathNode.CurveTo(98.624985f, 83.87837f, 101.09599f, 85.97747f, 104.0f, 86.0f),
                    PathNode.CurveTo(104.68302f, 85.99297f, 105.35967f, 85.86779f, 106.0f, 85.63f),
                    PathNode.LineTo(130.18f, 76.84f),
                    PathNode.LineTo(136.49f, 91.6f),
                    PathNode.LineTo(118.0f, 98.36f),
                    PathNode.CurveTo(115.27006f, 99.35056f, 113.641426f, 102.15406f, 114.1332f, 105.01623f),
                    PathNode.CurveTo(114.624985f, 107.87837f, 117.09599f, 109.97747f, 120.0f, 110.0f),
                    PathNode.CurveTo(120.682014f, 109.99174f, 121.35791f, 109.87007f, 122.0f, 109.64f),
                    PathNode.LineTo(141.26f, 102.64f),
                    PathNode.CurveTo(143.7459f, 107.78168f, 147.35875f, 112.296906f, 151.83f, 115.85f),
                    PathNode.LineTo(134.0f, 122.36f),
                    PathNode.CurveTo(131.27007f, 123.35056f, 129.64142f, 126.15406f, 130.13321f, 129.01622f),
                    PathNode.CurveTo(130.62498f, 131.87837f, 133.096f, 133.97746f, 136.0f, 134.0f),
                    PathNode.CurveTo(136.69882f, 133.99734f, 137.39209f, 133.8756f, 138.05f, 133.64f),
                    PathNode.LineTo(166.69f, 123.22f),
                    PathNode.LineTo(224.22f, 142.4f),
                    PathNode.CurveTo(233.08636f, 145.3464f, 239.6832f, 152.83327f, 241.49f, 162.0f),
                    PathNode.LineTo(38.0f, 162.0f),
                    PathNode.LineTo(38.0f, 75.53f),
                    PathNode.CurveTo(38.00036f, 74.68794f, 38.528107f, 73.9363f, 39.32f, 73.65f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 194.0f),
                    PathNode.LineTo(40.0f, 194.0f),
                    PathNode.CurveTo(38.89543f, 194.0f, 38.0f, 193.10457f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 174.0f),
                    PathNode.LineTo(242.0f, 174.0f),
                    PathNode.LineTo(242.0f, 192.0f),
                    PathNode.CurveTo(242.0f, 193.10457f, 241.10457f, 194.0f, 240.0f, 194.0f),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
