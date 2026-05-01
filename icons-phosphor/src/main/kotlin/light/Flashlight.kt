package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorLightIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 18.0f),
                    PathNode.LineTo(72.0f, 18.0f),
                    PathNode.CurveTo(64.26801f, 18.0f, 58.0f, 24.268015f, 58.0f, 32.0f),
                    PathNode.LineTo(58.0f, 77.33f),
                    PathNode.CurveTo(58.0f, 80.359184f, 58.98249f, 83.306656f, 60.8f, 85.73f),
                    PathNode.LineTo(81.6f, 113.46f),
                    PathNode.CurveTo(81.86171f, 113.80893f, 82.002174f, 114.23384f, 82.0f, 114.67f),
                    PathNode.LineTo(82.0f, 224.0f),
                    PathNode.CurveTo(82.0f, 231.73198f, 88.26801f, 238.0f, 96.0f, 238.0f),
                    PathNode.LineTo(160.0f, 238.0f),
                    PathNode.CurveTo(167.73198f, 238.0f, 174.0f, 231.73198f, 174.0f, 224.0f),
                    PathNode.LineTo(174.0f, 114.67f),
                    PathNode.CurveTo(174.0f, 114.23726f, 174.14035f, 113.81619f, 174.4f, 113.47f),
                    PathNode.LineTo(195.2f, 85.73f),
                    PathNode.CurveTo(197.01752f, 83.306656f, 198.0f, 80.359184f, 198.0f, 77.33f),
                    PathNode.LineTo(198.0f, 32.0f),
                    PathNode.CurveTo(198.0f, 24.268015f, 191.73198f, 18.0f, 184.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 30.0f),
                    PathNode.LineTo(184.0f, 30.0f),
                    PathNode.CurveTo(185.10457f, 30.0f, 186.0f, 30.89543f, 186.0f, 32.0f),
                    PathNode.LineTo(186.0f, 58.0f),
                    PathNode.LineTo(70.0f, 58.0f),
                    PathNode.LineTo(70.0f, 32.0f),
                    PathNode.CurveTo(70.0f, 30.89543f, 70.89543f, 30.0f, 72.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(185.6f, 78.53f),
                    PathNode.LineTo(164.8f, 106.27f),
                    PathNode.CurveTo(162.98248f, 108.693344f, 162.0f, 111.640816f, 162.0f, 114.67f),
                    PathNode.LineTo(162.0f, 224.0f),
                    PathNode.CurveTo(162.0f, 225.10457f, 161.10457f, 226.0f, 160.0f, 226.0f),
                    PathNode.LineTo(96.0f, 226.0f),
                    PathNode.CurveTo(94.89543f, 226.0f, 94.0f, 225.10457f, 94.0f, 224.0f),
                    PathNode.LineTo(94.0f, 114.67f),
                    PathNode.CurveTo(94.0f, 111.640816f, 93.01751f, 108.693344f, 91.2f, 106.27f),
                    PathNode.LineTo(70.4f, 78.54f),
                    PathNode.CurveTo(70.13829f, 78.19107f, 69.997826f, 77.76616f, 70.0f, 77.33f),
                    PathNode.LineTo(70.0f, 70.0f),
                    PathNode.LineTo(186.0f, 70.0f),
                    PathNode.LineTo(186.0f, 77.33f),
                    PathNode.CurveTo(186.0f, 77.76274f, 185.85965f, 78.18381f, 185.6f, 78.53f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 120.0f),
                    PathNode.LineTo(134.0f, 152.0f),
                    PathNode.CurveTo(134.0f, 155.3137f, 131.3137f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(124.686295f, 158.0f, 122.0f, 155.3137f, 122.0f, 152.0f),
                    PathNode.LineTo(122.0f, 120.0f),
                    PathNode.CurveTo(122.0f, 116.686295f, 124.686295f, 114.0f, 128.0f, 114.0f),
                    PathNode.CurveTo(131.3137f, 114.0f, 134.0f, 116.686295f, 134.0f, 120.0f),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
