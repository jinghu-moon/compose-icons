package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorLightIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(163.33f, 123.0f),
                    PathNode.LineTo(115.33f, 91.0f),
                    PathNode.CurveTo(113.487656f, 89.770805f, 111.11799f, 89.656494f, 109.16588f, 90.70264f),
                    PathNode.CurveTo(107.21377f, 91.74879f, 105.99671f, 93.78524f, 106.0f, 96.0f),
                    PathNode.LineTo(106.0f, 160.0f),
                    PathNode.CurveTo(105.99671f, 162.21475f, 107.21377f, 164.25122f, 109.16588f, 165.29736f),
                    PathNode.CurveTo(111.11799f, 166.3435f, 113.487656f, 166.22919f, 115.33f, 165.0f),
                    PathNode.LineTo(163.33f, 133.0f),
                    PathNode.CurveTo(165.00587f, 131.88835f, 166.01338f, 130.01105f, 166.01338f, 128.0f),
                    PathNode.CurveTo(166.01338f, 125.98895f, 165.00587f, 124.11165f, 163.33f, 123.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 148.79f),
                    PathNode.LineTo(118.0f, 107.21f),
                    PathNode.LineTo(149.18f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.4f, 70.0f),
                    PathNode.CurveTo(230.63881f, 63.15761f, 225.69852f, 57.57745f, 219.12f, 55.0f),
                    PathNode.CurveTo(185.0f, 41.79f, 130.27f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(125.73f, 42.0f, 71.0f, 41.79f, 36.84f, 55.0f),
                    PathNode.CurveTo(30.276867f, 57.58789f, 25.35296f, 63.166332f, 23.6f, 70.0f),
                    PathNode.CurveTo(21.05f, 79.89f, 18.0f, 98.0f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 158.0f, 21.05f, 176.11f, 23.6f, 186.0f),
                    PathNode.CurveTo(25.361183f, 192.84238f, 30.30149f, 198.42255f, 36.88f, 201.0f),
                    PathNode.CurveTo(71.0f, 214.21f, 125.72f, 214.0f, 128.0f, 214.0f),
                    PathNode.LineTo(128.71f, 214.0f),
                    PathNode.CurveTo(135.62f, 214.0f, 186.71f, 213.56f, 219.16f, 201.0f),
                    PathNode.CurveTo(225.73851f, 198.42255f, 230.67882f, 192.84238f, 232.44f, 186.0f),
                    PathNode.CurveTo(234.99f, 176.13f, 238.04f, 158.07f, 238.04f, 128.0f),
                    PathNode.CurveTo(238.04f, 97.93f, 235.0f, 79.89f, 232.4f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.78f, 183.0f),
                    PathNode.CurveTo(219.99881f, 186.1181f, 217.7663f, 188.67058f, 214.78f, 189.86f),
                    PathNode.CurveTo(182.78f, 202.19f, 128.58f, 202.0f, 128.0f, 202.0f),
                    PathNode.CurveTo(127.42f, 202.0f, 73.29f, 202.2f, 41.25f, 189.83f),
                    PathNode.CurveTo(38.26368f, 188.64058f, 36.031193f, 186.08812f, 35.25f, 182.97f),
                    PathNode.CurveTo(32.84f, 173.78f, 30.0f, 156.78f, 30.0f, 128.0f),
                    PathNode.CurveTo(30.0f, 99.22f, 32.84f, 82.22f, 35.22f, 73.0f),
                    PathNode.CurveTo(36.001198f, 69.8819f, 38.23368f, 67.32942f, 41.22f, 66.14f),
                    PathNode.CurveTo(72.06f, 54.26f, 123.53f, 54.0f, 127.76f, 54.0f),
                    PathNode.LineTo(128.0f, 54.0f),
                    PathNode.CurveTo(128.54f, 54.0f, 182.71f, 53.8f, 214.75f, 66.17f),
                    PathNode.CurveTo(217.73631f, 67.35942f, 219.96881f, 69.911896f, 220.75f, 73.03f),
                    PathNode.CurveTo(223.13f, 82.22f, 225.97f, 99.22f, 225.97f, 128.03f),
                    PathNode.CurveTo(225.97f, 156.84f, 223.16f, 173.78f, 220.78f, 183.0f),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
