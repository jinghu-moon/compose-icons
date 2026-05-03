package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorLightIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 42.0f),
                    PathNode.CurveTo(162.07817f, 41.957146f, 146.80045f, 48.283558f, 135.57f, 59.57f),
                    PathNode.LineTo(128.0f, 67.15f),
                    PathNode.LineTo(120.43f, 59.57f),
                    PathNode.CurveTo(103.27f, 42.40709f, 77.460396f, 37.272335f, 55.03802f, 46.560444f),
                    PathNode.CurveTo(32.615658f, 55.848553f, 17.997093f, 77.730034f, 18.0f, 102.0f),
                    PathNode.CurveTo(18.0f, 131.2f, 36.2f, 161.59f, 72.1f, 192.31f),
                    PathNode.CurveTo(88.55049f, 206.32764f, 106.32014f, 218.71884f, 125.16f, 229.31f),
                    PathNode.CurveTo(126.933426f, 230.26294f, 129.06657f, 230.26294f, 130.84f, 229.31f),
                    PathNode.CurveTo(149.67986f, 218.71884f, 167.44951f, 206.32764f, 183.9f, 192.31f),
                    PathNode.CurveTo(219.8f, 161.59f, 238.0f, 131.2f, 238.0f, 102.0f),
                    PathNode.CurveTo(237.96143f, 68.87891f, 211.1211f, 42.038574f, 178.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 217.11f),
                    PathNode.CurveTo(111.59f, 207.64f, 30.0f, 157.72f, 30.0f, 102.0f),
                    PathNode.CurveTo(30.00091f, 82.58651f, 41.695724f, 65.08501f, 59.6315f, 57.655907f),
                    PathNode.CurveTo(77.56728f, 50.22681f, 98.212135f, 54.333042f, 111.94f, 68.06f),
                    PathNode.LineTo(119.51f, 75.63f),
                    PathNode.LineTo(107.76f, 87.39f),
                    PathNode.CurveTo(106.63334f, 88.51541f, 106.00028f, 90.04254f, 106.00028f, 91.635f),
                    PathNode.CurveTo(106.00028f, 93.227455f, 106.63334f, 94.75459f, 107.76f, 95.88f),
                    PathNode.LineTo(133.7f, 121.82f),
                    PathNode.LineTo(115.76f, 139.76f),
                    PathNode.CurveTo(113.55713f, 142.12408f, 113.62213f, 145.80807f, 115.90703f, 148.09297f),
                    PathNode.CurveTo(118.191925f, 150.37787f, 121.87592f, 150.44287f, 124.24f, 148.24f),
                    PathNode.LineTo(146.43f, 126.06f),
                    PathNode.CurveTo(147.55666f, 124.93459f, 148.18971f, 123.407455f, 148.18971f, 121.815f),
                    PathNode.CurveTo(148.18971f, 120.22254f, 147.55666f, 118.69541f, 146.43f, 117.57f),
                    PathNode.LineTo(120.49f, 91.63f),
                    PathNode.LineTo(144.06f, 68.06f),
                    PathNode.CurveTo(157.78786f, 54.333042f, 178.43272f, 50.22681f, 196.3685f, 57.655907f),
                    PathNode.CurveTo(214.30428f, 65.08501f, 225.99908f, 82.58651f, 226.0f, 102.0f),
                    PathNode.CurveTo(226.0f, 157.72f, 144.41f, 207.64f, 128.0f, 217.11f),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
