package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorThinIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.24f, 130.34f),
                    PathNode.LineTo(183.24f, 202.34f),
                    PathNode.CurveTo(182.48773f, 203.37906f, 181.28276f, 203.99428f, 180.0f, 203.99428f),
                    PathNode.CurveTo(178.71724f, 203.99428f, 177.51227f, 203.37906f, 176.76f, 202.34f),
                    PathNode.LineTo(76.0f, 62.83f),
                    PathNode.LineTo(27.24f, 130.34f),
                    PathNode.CurveTo(26.429852f, 131.56438f, 25.014072f, 132.24654f, 23.551647f, 132.11716f),
                    PathNode.CurveTo(22.089224f, 131.98778f, 20.8152f, 131.06764f, 20.232592f, 129.72006f),
                    PathNode.CurveTo(19.649982f, 128.37247f, 19.85243f, 126.81401f, 20.76f, 125.66f),
                    PathNode.LineTo(72.76f, 53.66f),
                    PathNode.CurveTo(73.51226f, 52.62095f, 74.71722f, 52.00572f, 76.0f, 52.00572f),
                    PathNode.CurveTo(77.28278f, 52.00572f, 78.48774f, 52.62095f, 79.24f, 53.66f),
                    PathNode.LineTo(180.0f, 193.17f),
                    PathNode.LineTo(228.76f, 125.66f),
                    PathNode.CurveTo(230.08627f, 123.97359f, 232.50684f, 123.63385f, 234.24611f, 124.89f),
                    PathNode.CurveTo(235.9854f, 126.14614f, 236.4239f, 128.55077f, 235.24f, 130.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
