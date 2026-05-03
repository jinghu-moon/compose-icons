package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorLightIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(185.22f, 125.25f),
                    PathNode.CurveTo(181.56404f, 122.48858f, 177.61325f, 120.14091f, 173.44f, 118.25f),
                    PathNode.CurveTo(169.91f, 88.65f, 150.44f, 79.43f, 141.61f, 76.75f),
                    PathNode.CurveTo(122.61f, 71.01f, 100.88f, 77.84f, 91.01f, 92.65f),
                    PathNode.CurveTo(89.17089f, 95.41142f, 89.91858f, 99.1409f, 92.68f, 100.98f),
                    PathNode.CurveTo(95.44142f, 102.81911f, 99.17089f, 102.07143f, 101.01f, 99.31f),
                    PathNode.CurveTo(107.95f, 88.9f, 124.26f, 84.03f, 138.15f, 88.24f),
                    PathNode.CurveTo(145.37f, 90.42f, 156.54f, 96.58f, 160.54f, 113.85f),
                    PathNode.CurveTo(154.60422f, 112.45788f, 148.52686f, 111.759865f, 142.43f, 111.77f),
                    PathNode.CurveTo(128.9f, 111.77f, 116.27f, 115.23f, 106.88f, 121.54f),
                    PathNode.CurveTo(96.0f, 128.85f, 90.0f, 139.66f, 90.0f, 152.0f),
                    PathNode.CurveTo(90.0f, 174.0f, 108.0f, 185.52f, 125.71f, 185.52f),
                    PathNode.CurveTo(138.14725f, 185.43364f, 150.01947f, 180.31462f, 158.62f, 171.33f),
                    PathNode.CurveTo(165.2f, 164.48f, 172.97f, 152.22f, 173.91f, 132.07f),
                    PathNode.CurveTo(175.31616f, 132.9112f, 176.6749f, 133.82925f, 177.98f, 134.82f),
                    PathNode.CurveTo(188.46f, 142.74f, 193.98f, 154.22f, 193.98f, 168.0f),
                    PathNode.CurveTo(193.98f, 188.16f, 172.98f, 218.0f, 127.98f, 218.0f),
                    PathNode.CurveTo(100.91f, 218.0f, 81.06f, 208.81f, 68.98f, 190.67f),
                    PathNode.CurveTo(59.0f, 175.75f, 54.0f, 154.66f, 54.0f, 128.0f),
                    PathNode.CurveTo(54.0f, 101.34f, 59.0f, 80.25f, 69.0f, 65.33f),
                    PathNode.CurveTo(81.08f, 47.19f, 100.93f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(161.85f, 38.0f, 183.57f, 51.67f, 194.4f, 79.8f),
                    PathNode.CurveTo(195.59018f, 82.89279f, 199.06221f, 84.43517f, 202.155f, 83.245f),
                    PathNode.CurveTo(205.24779f, 82.054825f, 206.79018f, 78.582794f, 205.6f, 75.49f),
                    PathNode.CurveTo(193.0f, 42.65f, 166.85f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(96.67f, 26.0f, 73.46f, 37.0f, 59.0f, 58.67f),
                    PathNode.CurveTo(47.72f, 75.6f, 42.0f, 98.93f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 157.07f, 47.72f, 180.4f, 59.0f, 197.33f),
                    PathNode.CurveTo(73.46f, 219.0f, 96.67f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(157.43f, 230.0f, 175.81f, 218.81f, 186.05f, 209.42f),
                    PathNode.CurveTo(198.54f, 198.0f, 206.0f, 182.49f, 206.0f, 168.0f),
                    PathNode.CurveTo(206.0f, 150.31f, 198.81f, 135.52f, 185.22f, 125.25f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 163.0f),
                    PathNode.CurveTo(143.66638f, 169.63849f, 134.91484f, 173.42986f, 125.74f, 173.51f),
                    PathNode.CurveTo(109.33f, 173.52f, 102.0f, 162.71f, 102.0f, 152.0f),
                    PathNode.CurveTo(102.0f, 138.41f, 114.64f, 123.79f, 142.41f, 123.79f),
                    PathNode.CurveTo(149.05121f, 123.78897f, 155.65376f, 124.8006f, 161.99f, 126.79f),
                    PathNode.CurveTo(161.99f, 127.2f, 161.99f, 127.61f, 161.99f, 128.03f),
                    PathNode.CurveTo(162.0f, 142.72f, 157.84f, 154.82f, 150.0f, 163.0f),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
