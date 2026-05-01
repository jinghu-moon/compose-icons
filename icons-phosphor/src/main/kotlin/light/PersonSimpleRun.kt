package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorLightIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 86.0f),
                    PathNode.CurveTo(168.56854f, 86.0f, 182.0f, 72.56854f, 182.0f, 56.0f),
                    PathNode.CurveTo(182.0f, 39.431458f, 168.56854f, 26.0f, 152.0f, 26.0f),
                    PathNode.CurveTo(135.43146f, 26.0f, 122.0f, 39.431458f, 122.0f, 56.0f),
                    PathNode.CurveTo(122.0f, 72.56854f, 135.43146f, 86.0f, 152.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 38.0f),
                    PathNode.CurveTo(161.94113f, 38.0f, 170.0f, 46.058876f, 170.0f, 56.0f),
                    PathNode.CurveTo(170.0f, 65.941124f, 161.94113f, 74.0f, 152.0f, 74.0f),
                    PathNode.CurveTo(142.05887f, 74.0f, 134.0f, 65.941124f, 134.0f, 56.0f),
                    PathNode.CurveTo(134.0f, 46.058876f, 142.05887f, 38.0f, 152.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.49f, 138.86f),
                    PathNode.CurveTo(217.9f, 139.13f, 211.32f, 141.99f, 199.61f, 141.99f),
                    PathNode.CurveTo(185.75f, 141.99f, 164.71f, 137.99f, 137.88f, 120.99f),
                    PathNode.CurveTo(133.58133f, 133.82555f, 127.727806f, 146.0867f, 120.45f, 157.5f),
                    PathNode.CurveTo(129.88f, 160.28f, 142.45f, 165.22f, 153.64f, 173.76f),
                    PathNode.CurveTo(172.46f, 188.05f, 182.0f, 207.65f, 182.0f, 232.0f),
                    PathNode.CurveTo(182.0f, 235.3137f, 179.3137f, 238.0f, 176.0f, 238.0f),
                    PathNode.CurveTo(172.6863f, 238.0f, 170.0f, 235.3137f, 170.0f, 232.0f),
                    PathNode.CurveTo(170.0f, 188.0f, 132.77f, 172.82f, 113.09f, 167.89f),
                    PathNode.QuadTo(111.89f, 169.44f, 110.63f, 170.98f),
                    PathNode.CurveTo(91.38f, 194.29f, 67.29f, 206.43f, 40.52f, 206.43f),
                    PathNode.CurveTo(37.47471f, 206.43983f, 34.430855f, 206.29631f, 31.4f, 206.0f),
                    PathNode.CurveTo(28.086292f, 205.66862f, 25.668629f, 202.71371f, 26.0f, 199.4f),
                    PathNode.CurveTo(26.331371f, 196.08629f, 29.286291f, 193.66862f, 32.6f, 194.0f),
                    PathNode.CurveTo(59.23f, 196.66f, 82.37f, 186.34f, 101.37f, 163.31f),
                    PathNode.CurveTo(114.53f, 147.37f, 123.31f, 127.8f, 127.45f, 114.16f),
                    PathNode.CurveTo(86.94f, 89.64f, 60.86f, 109.38f, 59.73f, 110.27f),
                    PathNode.CurveTo(57.135372f, 112.25023f, 53.43375f, 111.79315f, 51.398754f, 109.24125f),
                    PathNode.CurveTo(49.363766f, 106.68935f, 49.741978f, 102.97884f, 52.25f, 100.89f),
                    PathNode.CurveTo(52.62f, 100.59f, 61.64f, 93.46f, 77.01f, 90.89f),
                    PathNode.CurveTo(90.87f, 88.58f, 112.93f, 89.59f, 139.37f, 107.56f),
                    PathNode.CurveTo(186.51f, 139.56f, 213.25f, 128.03f, 213.51f, 127.91f),
                    PathNode.CurveTo(216.52548f, 126.52929f, 220.0893f, 127.85452f, 221.47f, 130.87f),
                    PathNode.CurveTo(222.85071f, 133.88547f, 221.52548f, 137.4493f, 218.51f, 138.83f),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
