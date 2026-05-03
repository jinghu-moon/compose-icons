package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorLightIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.86f, 131.51f),
                    PathNode.LineTo(184.86f, 203.51f),
                    PathNode.CurveTo(183.73161f, 205.06857f, 181.92418f, 205.99142f, 180.0f, 205.99142f),
                    PathNode.CurveTo(178.07582f, 205.99142f, 176.26839f, 205.06857f, 175.14f, 203.51f),
                    PathNode.LineTo(76.0f, 66.25f),
                    PathNode.LineTo(28.86f, 131.51f),
                    PathNode.CurveTo(27.668137f, 133.39464f, 25.529411f, 134.46284f, 23.306738f, 134.28362f),
                    PathNode.CurveTo(21.084063f, 134.1044f, 19.144121f, 132.70732f, 18.26962f, 130.65607f),
                    PathNode.CurveTo(17.395119f, 128.60481f, 17.730328f, 126.23778f, 19.14f, 124.51f),
                    PathNode.LineTo(71.14f, 52.51f),
                    PathNode.CurveTo(72.268394f, 50.95142f, 74.07583f, 50.02858f, 76.0f, 50.02858f),
                    PathNode.CurveTo(77.92417f, 50.02858f, 79.731606f, 50.95142f, 80.86f, 52.51f),
                    PathNode.LineTo(180.0f, 189.75f),
                    PathNode.LineTo(227.14f, 124.49f),
                    PathNode.CurveTo(229.14618f, 122.03111f, 232.72015f, 121.559654f, 235.29533f, 123.41421f),
                    PathNode.CurveTo(237.8705f, 125.26875f, 238.5562f, 128.80788f, 236.86f, 131.49f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
