package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorLightIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 126.79f),
                    PathNode.CurveTo(234.33965f, 84.83105f, 207.13046f, 48.607944f, 167.85223f, 33.40354f),
                    PathNode.CurveTo(128.57402f, 18.199139f, 84.06736f, 26.66139f, 53.11f, 55.22f),
                    PathNode.CurveTo(32.84915f, 73.82649f, 20.3329f, 99.37665f, 18.05f, 126.79f),
                    PathNode.CurveTo(17.71087f, 130.69913f, 19.027796f, 134.57117f, 21.679989f, 137.4629f),
                    PathNode.CurveTo(24.332182f, 140.35466f, 28.076185f, 142.00067f, 32.0f, 142.0f),
                    PathNode.LineTo(122.0f, 142.0f),
                    PathNode.LineTo(122.0f, 200.0f),
                    PathNode.CurveTo(122.0f, 216.56854f, 135.43146f, 230.0f, 152.0f, 230.0f),
                    PathNode.CurveTo(168.56854f, 230.0f, 182.0f, 216.56854f, 182.0f, 200.0f),
                    PathNode.CurveTo(182.0f, 196.6863f, 179.3137f, 194.0f, 176.0f, 194.0f),
                    PathNode.CurveTo(172.6863f, 194.0f, 170.0f, 196.6863f, 170.0f, 200.0f),
                    PathNode.CurveTo(170.0f, 209.94113f, 161.94113f, 218.0f, 152.0f, 218.0f),
                    PathNode.CurveTo(142.05887f, 218.0f, 134.0f, 209.94113f, 134.0f, 200.0f),
                    PathNode.LineTo(134.0f, 142.0f),
                    PathNode.LineTo(224.0f, 142.0f),
                    PathNode.CurveTo(227.93251f, 142.01472f, 231.68988f, 140.37482f, 234.35313f, 137.4814f),
                    PathNode.CurveTo(237.01639f, 134.58795f, 238.3399f, 130.70782f, 238.0f, 126.79f),
                    PathNode.Close,
                    PathNode.MoveTo(94.11f, 130.0f),
                    PathNode.CurveTo(95.8f, 78.79f, 118.81f, 49.84f, 128.0f, 40.27f),
                    PathNode.CurveTo(137.2f, 49.85f, 160.2f, 78.8f, 161.89f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.54f, 129.35f),
                    PathNode.CurveTo(30.147406f, 128.9303f, 29.954329f, 128.362f, 30.01f, 127.79f),
                    PathNode.CurveTo(33.881264f, 82.65508f, 68.142456f, 46.03433f, 112.92f, 39.17f),
                    PathNode.CurveTo(100.92f, 54.17f, 83.49f, 83.61f, 82.09f, 130.0f),
                    PathNode.LineTo(32.0f, 130.0f),
                    PathNode.CurveTo(31.44415f, 129.99564f, 30.915192f, 129.76015f, 30.54f, 129.35f),
                    PathNode.Close,
                    PathNode.MoveTo(225.46f, 129.35f),
                    PathNode.CurveTo(225.08482f, 129.76015f, 224.55585f, 129.99564f, 224.0f, 130.0f),
                    PathNode.LineTo(173.91f, 130.0f),
                    PathNode.CurveTo(172.51f, 83.61f, 155.1f, 54.13f, 143.08f, 39.17f),
                    PathNode.CurveTo(187.86147f, 46.030144f, 222.12775f, 82.65191f, 226.0f, 127.79f),
                    PathNode.CurveTo(226.05301f, 128.3635f, 225.85622f, 128.932f, 225.46f, 129.35f),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
