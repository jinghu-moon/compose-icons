package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorRegularIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.CurveTo(195.8247f, 47.989014f, 183.78119f, 50.519653f, 172.64f, 55.43f),
                    PathNode.CurveTo(157.54f, 30.06f, 132.72f, 17.43f, 131.58f, 16.84f),
                    PathNode.CurveTo(129.32652f, 15.712362f, 126.67347f, 15.712362f, 124.42f, 16.84f),
                    PathNode.CurveTo(123.28f, 17.42f, 98.42f, 30.06f, 83.36f, 55.43f),
                    PathNode.CurveTo(72.2188f, 50.519653f, 60.175285f, 47.989014f, 48.0f, 48.0f),
                    PathNode.CurveTo(43.581722f, 48.0f, 40.0f, 51.581722f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(40.0547f, 141.47897f, 74.71405f, 179.44395f, 120.0f, 183.63f),
                    PathNode.LineTo(120.0f, 219.06f),
                    PathNode.LineTo(83.58f, 200.84f),
                    PathNode.CurveTo(79.62564f, 198.86282f, 74.81718f, 200.46564f, 72.84f, 204.42f),
                    PathNode.CurveTo(70.86282f, 208.37436f, 72.465645f, 213.18282f, 76.42f, 215.16f),
                    PathNode.LineTo(124.42f, 239.16f),
                    PathNode.CurveTo(126.67347f, 240.28764f, 129.32652f, 240.28764f, 131.58f, 239.16f),
                    PathNode.LineTo(179.58f, 215.16f),
                    PathNode.CurveTo(183.53436f, 213.18282f, 185.13718f, 208.37436f, 183.16f, 204.42f),
                    PathNode.CurveTo(181.18282f, 200.46564f, 176.37436f, 198.86282f, 172.42f, 200.84f),
                    PathNode.LineTo(136.0f, 219.06f),
                    PathNode.LineTo(136.0f, 183.63f),
                    PathNode.CurveTo(181.28595f, 179.44395f, 215.9453f, 141.47897f, 216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 51.581722f, 212.41827f, 48.0f, 208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 167.56f),
                    PathNode.CurveTo(83.57842f, 163.44221f, 56.042484f, 132.6536f, 56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 64.44f),
                    PathNode.CurveTo(92.42158f, 68.557785f, 119.95752f, 99.34641f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 99.36f),
                    PathNode.CurveTo(121.27003f, 84.73872f, 110.67577f, 72.232376f, 97.36f, 63.19f),
                    PathNode.CurveTo(106.93f, 47.4f, 121.36f, 37.29f, 128.0f, 33.19f),
                    PathNode.CurveTo(134.65f, 37.27f, 149.08f, 47.38f, 158.64f, 63.19f),
                    PathNode.CurveTo(145.32628f, 72.23466f, 134.73256f, 84.74037f, 128.0f, 99.36f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 96.0f),
                    PathNode.CurveTo(199.95752f, 132.6536f, 172.42157f, 163.44221f, 136.0f, 167.56f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.04248f, 99.34641f, 163.57843f, 68.557785f, 200.0f, 64.44f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
