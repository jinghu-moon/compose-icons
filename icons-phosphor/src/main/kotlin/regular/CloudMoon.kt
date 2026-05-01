package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorRegularIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 72.0f),
                    PathNode.CurveTo(167.85973f, 71.99809f, 163.7261f, 72.33253f, 159.64f, 73.0f),
                    PathNode.CurveTo(156.6596f, 42.205154f, 134.32126f, 16.765934f, 104.17f, 9.83f),
                    PathNode.CurveTo(101.48587f, 9.21335f, 98.67327f, 10.020687f, 96.724846f, 11.967081f),
                    PathNode.CurveTo(94.77642f, 13.913475f, 93.96615f, 16.725227f, 94.58f, 19.41f),
                    PathNode.CurveTo(98.39703f, 36.03848f, 94.43262f, 53.500168f, 83.80942f, 66.85021f),
                    PathNode.CurveTo(73.18622f, 80.20025f, 57.060944f, 87.98502f, 40.0f, 88.0f),
                    PathNode.CurveTo(35.763344f, 88.00062f, 31.540083f, 87.524284f, 27.41f, 86.58f),
                    PathNode.CurveTo(24.723755f, 85.96198f, 21.908558f, 86.77039f, 19.959475f, 88.719475f),
                    PathNode.CurveTo(18.010391f, 90.66856f, 17.201986f, 93.48376f, 17.82f, 96.17f),
                    PathNode.CurveTo(22.160702f, 114.887344f, 33.78112f, 131.10338f, 50.11f, 141.23f),
                    PathNode.CurveTo(38.51532f, 157.02583f, 36.784454f, 177.9983f, 45.632614f, 195.4813f),
                    PathNode.CurveTo(54.480778f, 212.9643f, 72.40549f, 223.98906f, 92.0f, 224.0f),
                    PathNode.LineTo(172.0f, 224.0f),
                    PathNode.CurveTo(213.97365f, 224.0f, 248.0f, 189.97365f, 248.0f, 148.0f),
                    PathNode.CurveTo(248.0f, 106.02636f, 213.97365f, 72.0f, 172.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(37.37f, 104.0f),
                    PathNode.CurveTo(38.24f, 104.0f, 39.12f, 104.0f, 40.0f, 104.0f),
                    PathNode.CurveTo(79.74622f, 103.95591f, 111.95591f, 71.74622f, 112.0f, 32.0f),
                    PathNode.CurveTo(112.0f, 31.11f, 112.0f, 30.22f, 112.0f, 29.33f),
                    PathNode.CurveTo(130.77754f, 38.117226f, 143.11082f, 56.617184f, 144.0f, 77.33f),
                    PathNode.CurveTo(124.24625f, 85.17425f, 108.66101f, 100.904465f, 101.0f, 120.73f),
                    PathNode.CurveTo(87.33869f, 118.36612f, 73.29904f, 121.55564f, 62.0f, 129.59f),
                    PathNode.CurveTo(51.240463f, 123.9456f, 42.599064f, 114.96739f, 37.37f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 208.0f),
                    PathNode.LineTo(92.0f, 208.0f),
                    PathNode.CurveTo(78.58175f, 207.97531f, 66.2908f, 200.49f, 60.111187f, 188.5794f),
                    PathNode.CurveTo(53.93157f, 176.6688f, 54.88897f, 162.30981f, 62.595158f, 151.32507f),
                    PathNode.CurveTo(70.301346f, 140.34032f, 83.47725f, 134.55304f, 96.78f, 136.31f),
                    PathNode.CurveTo(96.41f, 138.68f, 96.15f, 141.1f, 96.01f, 143.54f),
                    PathNode.CurveTo(95.75595f, 147.95828f, 99.13172f, 151.74596f, 103.55f, 152.0f),
                    PathNode.CurveTo(107.96828f, 152.25404f, 111.75595f, 148.87828f, 112.01f, 144.46f),
                    PathNode.CurveTo(112.23444f, 140.46976f, 112.86435f, 136.51271f, 113.89f, 132.65f),
                    PathNode.CurveTo(113.89f, 132.49f, 113.98f, 132.33f, 114.01f, 132.17f),
                    PathNode.CurveTo(122.177734f, 102.15467f, 151.91168f, 83.34284f, 182.53291f, 88.81748f),
                    PathNode.CurveTo(213.15416f, 94.29212f, 234.52791f, 122.24128f, 231.78947f, 153.2273f),
                    PathNode.CurveTo(229.05104f, 184.2133f, 203.10678f, 207.98065f, 172.0f, 208.0f),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
