package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) return _redditLogo!!
        _redditLogo = phosphorFillIcon(
            name = "RedditLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 104.0f),
                    PathNode.CurveTo(247.99709f, 91.477005f, 240.6895f, 80.10652f, 229.29926f, 74.90195f),
                    PathNode.CurveTo(217.909f, 69.69737f, 204.52951f, 71.615265f, 195.06f, 79.81f),
                    PathNode.CurveTo(178.31f, 70.91f, 158.3f, 65.53f, 137.4f, 64.28f),
                    PathNode.LineTo(142.59f, 33.11f),
                    PathNode.LineTo(160.31f, 35.83f),
                    PathNode.CurveTo(162.16614f, 47.370605f, 172.06656f, 55.89555f, 183.75484f, 56.017624f),
                    PathNode.CurveTo(195.44312f, 56.139694f, 205.51942f, 47.823383f, 207.6162f, 36.324062f),
                    PathNode.CurveTo(209.71294f, 24.82474f, 203.22028f, 13.487273f, 192.2411f, 9.476207f),
                    PathNode.CurveTo(181.26193f, 5.465141f, 168.98985f, 9.947193f, 163.18f, 20.09f),
                    PathNode.LineTo(137.18f, 16.09f),
                    PathNode.CurveTo(132.85138f, 15.42259f, 128.79079f, 18.359953f, 128.07f, 22.68f),
                    PathNode.LineTo(121.2f, 64.16f),
                    PathNode.CurveTo(99.36f, 65.1f, 78.38f, 70.54f, 60.94f, 79.81f),
                    PathNode.CurveTo(47.69639f, 68.62217f, 27.952072f, 70.01545f, 16.410843f, 82.95225f),
                    PathNode.CurveTo(4.869613f, 95.88905f, 5.72944f, 115.66378f, 18.35f, 127.55f),
                    PathNode.CurveTo(16.794548f, 132.89502f, 16.00337f, 138.43326f, 16.0f, 144.0f),
                    PathNode.CurveTo(16.0f, 165.93f, 28.0f, 186.35f, 49.91f, 201.49f),
                    PathNode.CurveTo(70.88f, 216.0f, 98.61f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(157.39f, 224.0f, 185.12f, 216.0f, 206.09f, 201.49f),
                    PathNode.CurveTo(228.0f, 186.35f, 240.0f, 165.93f, 240.0f, 144.0f),
                    PathNode.CurveTo(239.99663f, 138.43326f, 239.20546f, 132.89502f, 237.65f, 127.55f),
                    PathNode.CurveTo(244.226f, 121.481705f, 247.97644f, 112.94804f, 248.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 119.163445f, 79.163445f, 112.0f, 88.0f, 112.0f),
                    PathNode.CurveTo(96.836555f, 112.0f, 104.0f, 119.163445f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 136.83656f, 96.836555f, 144.0f, 88.0f, 144.0f),
                    PathNode.CurveTo(79.163445f, 144.0f, 72.0f, 136.83656f, 72.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.75f, 183.07f),
                    PathNode.CurveTo(141.39691f, 194.94923f, 114.603096f, 194.94923f, 92.25f, 183.07f),
                    PathNode.CurveTo(88.345345f, 180.99893f, 86.85893f, 176.15463f, 88.93f, 172.25f),
                    PathNode.CurveTo(91.001076f, 168.34537f, 95.845345f, 166.85893f, 99.75f, 168.93f),
                    PathNode.CurveTo(117.412834f, 178.3203f, 138.58717f, 178.3203f, 156.25f, 168.93f),
                    PathNode.CurveTo(160.15463f, 166.85893f, 164.99893f, 168.34537f, 167.07f, 172.25f),
                    PathNode.CurveTo(169.14107f, 176.15463f, 167.65463f, 180.99893f, 163.75f, 183.07f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 144.0f),
                    PathNode.CurveTo(159.16344f, 144.0f, 152.0f, 136.83656f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 119.163445f, 159.16344f, 112.0f, 168.0f, 112.0f),
                    PathNode.CurveTo(176.83656f, 112.0f, 184.0f, 119.163445f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 136.83656f, 176.83656f, 144.0f, 168.0f, 144.0f),
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
        return _redditLogo!!
    }

private var _redditLogo: ImageVector? = null
