package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorFillIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 72.0f),
                    PathNode.CurveTo(167.8597f, 71.99765f, 163.72607f, 72.33209f, 159.64f, 73.0f),
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
                    PathNode.CurveTo(130.79147f, 38.12723f, 143.12689f, 56.649628f, 144.0f, 77.38f),
                    PathNode.CurveTo(124.25446f, 85.23668f, 108.673515f, 100.96256f, 101.0f, 120.78f),
                    PathNode.CurveTo(98.02806f, 120.26131f, 95.01686f, 120.000336f, 92.0f, 120.0f),
                    PathNode.CurveTo(81.24588f, 119.99808f, 70.75892f, 123.35041f, 62.0f, 129.59f),
                    PathNode.CurveTo(51.240463f, 123.9456f, 42.599064f, 114.96739f, 37.37f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
