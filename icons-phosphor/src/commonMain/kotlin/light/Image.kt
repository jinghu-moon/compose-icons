package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Image: ImageVector
    get() {
        if (_image != null) return _image!!
        _image = phosphorLightIcon(
            name = "Image",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.LineTo(218.0f, 163.57f),
                    PathNode.LineTo(188.53f, 134.1f),
                    PathNode.CurveTo(185.90445f, 131.47418f, 182.34328f, 129.999f, 178.63f, 129.999f),
                    PathNode.CurveTo(174.91672f, 129.999f, 171.35555f, 131.47418f, 168.73f, 134.1f),
                    PathNode.LineTo(147.31f, 155.52f),
                    PathNode.LineTo(101.9f, 110.1f),
                    PathNode.CurveTo(99.27445f, 107.47418f, 95.71328f, 105.99899f, 92.0f, 105.99899f),
                    PathNode.CurveTo(88.28672f, 105.99899f, 84.72555f, 107.47418f, 82.1f, 110.1f),
                    PathNode.LineTo(38.0f, 154.2f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 171.17f),
                    PathNode.LineTo(90.58f, 118.59f),
                    PathNode.CurveTo(90.955536f, 118.21137f, 91.46673f, 117.998405f, 92.0f, 117.998405f),
                    PathNode.CurveTo(92.53327f, 117.998405f, 93.044464f, 118.21137f, 93.42f, 118.59f),
                    PathNode.LineTo(176.83f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 202.0f),
                    PathNode.LineTo(193.8f, 202.0f),
                    PathNode.LineTo(155.8f, 164.0f),
                    PathNode.LineTo(177.21f, 142.58f),
                    PathNode.CurveTo(177.58516f, 142.20445f, 178.09418f, 141.99342f, 178.62498f, 141.99342f),
                    PathNode.CurveTo(179.15582f, 141.99342f, 179.66484f, 142.20445f, 180.04f, 142.58f),
                    PathNode.LineTo(218.04f, 180.58f),
                    PathNode.LineTo(218.04f, 200.0f),
                    PathNode.CurveTo(218.0401f, 200.53743f, 217.82391f, 201.0523f, 217.44014f, 201.42854f),
                    PathNode.CurveTo(217.05638f, 201.8048f, 216.53732f, 202.01074f, 216.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 100.0f),
                    PathNode.CurveTo(146.0f, 94.47715f, 150.47716f, 90.0f, 156.0f, 90.0f),
                    PathNode.CurveTo(161.52284f, 90.0f, 166.0f, 94.47715f, 166.0f, 100.0f),
                    PathNode.CurveTo(166.0f, 105.52285f, 161.52284f, 110.0f, 156.0f, 110.0f),
                    PathNode.CurveTo(150.47716f, 110.0f, 146.0f, 105.52285f, 146.0f, 100.0f),
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
        return _image!!
    }

private var _image: ImageVector? = null
