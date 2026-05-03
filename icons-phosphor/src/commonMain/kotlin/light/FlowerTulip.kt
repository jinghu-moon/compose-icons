package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorLightIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 50.0f),
                    PathNode.CurveTo(195.50365f, 49.992023f, 183.15738f, 52.722744f, 171.83f, 58.0f),
                    PathNode.CurveTo(157.16f, 32.1f, 131.83f, 19.21f, 130.68f, 18.63f),
                    PathNode.CurveTo(128.99263f, 17.787603f, 127.00737f, 17.787603f, 125.32f, 18.63f),
                    PathNode.CurveTo(124.18f, 19.21f, 98.84f, 32.1f, 84.17f, 58.0f),
                    PathNode.CurveTo(72.84263f, 52.722744f, 60.49635f, 49.992023f, 48.0f, 50.0f),
                    PathNode.CurveTo(44.68629f, 50.0f, 42.0f, 52.68629f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 96.0f),
                    PathNode.CurveTo(42.059586f, 141.1409f, 76.972496f, 178.5719f, 122.0f, 181.77f),
                    PathNode.LineTo(122.0f, 222.29f),
                    PathNode.LineTo(82.68f, 202.63f),
                    PathNode.CurveTo(79.71423f, 201.14987f, 76.11012f, 202.35423f, 74.63f, 205.32f),
                    PathNode.CurveTo(73.14988f, 208.28577f, 74.35423f, 211.88988f, 77.32f, 213.37f),
                    PathNode.LineTo(125.32f, 237.37f),
                    PathNode.CurveTo(127.00737f, 238.2124f, 128.99263f, 238.2124f, 130.68f, 237.37f),
                    PathNode.LineTo(178.68f, 213.37f),
                    PathNode.CurveTo(181.64577f, 211.88988f, 182.85013f, 208.28577f, 181.37f, 205.32f),
                    PathNode.CurveTo(179.88988f, 202.35423f, 176.28577f, 201.14987f, 173.32f, 202.63f),
                    PathNode.LineTo(134.0f, 222.29f),
                    PathNode.LineTo(134.0f, 181.77f),
                    PathNode.CurveTo(179.02751f, 178.5719f, 213.94041f, 141.1409f, 214.0f, 96.0f),
                    PathNode.LineTo(214.0f, 56.0f),
                    PathNode.CurveTo(214.0f, 52.68629f, 211.3137f, 50.0f, 208.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 30.88f),
                    PathNode.CurveTo(134.46f, 34.72f, 151.07f, 45.88f, 161.33f, 63.82f),
                    PathNode.CurveTo(146.26724f, 73.59217f, 134.61871f, 87.80945f, 128.0f, 104.5f),
                    PathNode.CurveTo(121.38128f, 87.80945f, 109.73276f, 73.59217f, 94.67f, 63.82f),
                    PathNode.CurveTo(104.93f, 45.83f, 121.54f, 34.71f, 128.0f, 30.88f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 96.0f),
                    PathNode.LineTo(54.0f, 62.24f),
                    PathNode.CurveTo(92.39227f, 65.41603f, 121.94921f, 97.476616f, 122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 169.76f),
                    PathNode.CurveTo(83.60548f, 166.58858f, 54.04601f, 134.52525f, 54.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 96.0f),
                    PathNode.CurveTo(201.954f, 134.52525f, 172.39453f, 166.58858f, 134.0f, 169.76f),
                    PathNode.LineTo(134.0f, 136.0f),
                    PathNode.CurveTo(134.0508f, 97.476616f, 163.60773f, 65.41603f, 202.0f, 62.24f),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
