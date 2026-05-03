package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorBoldIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.85f, 46.89f),
                    PathNode.CurveTo(227.23248f, 36.807037f, 219.19296f, 28.767525f, 209.11f, 28.15f),
                    PathNode.CurveTo(195.98f, 27.38f, 162.46f, 28.57f, 134.63f, 56.39f),
                    PathNode.LineTo(131.0f, 60.0f),
                    PathNode.LineTo(74.36f, 60.0f),
                    PathNode.CurveTo(69.05237f, 59.982273f, 63.959156f, 62.093037f, 60.22f, 65.86f),
                    PathNode.LineTo(25.87f, 100.19f),
                    PathNode.CurveTo(20.50644f, 105.55109f, 18.636341f, 113.48453f, 21.0408f, 120.67671f),
                    PathNode.CurveTo(23.445257f, 127.868904f, 29.71062f, 133.08253f, 37.22f, 134.14f),
                    PathNode.LineTo(74.36f, 139.32f),
                    PathNode.LineTo(116.68f, 181.64f),
                    PathNode.LineTo(121.87f, 218.82f),
                    PathNode.CurveTo(122.90133f, 226.34329f, 128.12833f, 232.6219f, 135.34f, 235.0f),
                    PathNode.CurveTo(137.39581f, 235.67345f, 139.54672f, 236.01111f, 141.71f, 236.0f),
                    PathNode.CurveTo(147.00366f, 235.99661f, 152.07784f, 233.88419f, 155.81f, 230.13f),
                    PathNode.LineTo(190.15f, 195.78f),
                    PathNode.CurveTo(193.91139f, 192.03792f, 196.01813f, 186.94574f, 196.0f, 181.64f),
                    PathNode.LineTo(196.0f, 125.0f),
                    PathNode.LineTo(199.6f, 121.41f),
                    PathNode.CurveTo(227.43f, 93.54f, 228.62f, 60.0f, 227.85f, 46.89f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 84.0f),
                    PathNode.LineTo(107.0f, 84.0f),
                    PathNode.LineTo(75.75f, 115.28f),
                    PathNode.LineTo(48.52f, 111.48f),
                    PathNode.Close,
                    PathNode.MoveTo(151.6f, 73.37f),
                    PathNode.CurveTo(165.43564f, 59.419987f, 184.35463f, 51.704357f, 204.0f, 52.0f),
                    PathNode.CurveTo(204.30737f, 71.65247f, 196.58604f, 90.580185f, 182.62f, 104.41f),
                    PathNode.LineTo(128.0f, 159.0f),
                    PathNode.LineTo(97.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 180.0f),
                    PathNode.LineTo(144.51f, 207.49f),
                    PathNode.LineTo(140.71f, 180.26f),
                    PathNode.LineTo(172.0f, 149.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 202.0f),
                    PathNode.CurveTo(91.29f, 213.85f, 73.81f, 228.0f, 40.0f, 228.0f),
                    PathNode.CurveTo(33.37258f, 228.0f, 28.0f, 222.62741f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 182.16f, 42.12f, 164.68f, 54.0f, 156.0f),
                    PathNode.CurveTo(57.42536f, 153.1222f, 62.167194f, 152.38881f, 66.301895f, 154.09735f),
                    PathNode.CurveTo(70.4366f, 155.8059f, 73.27756f, 159.67264f, 73.672295f, 164.129f),
                    PathNode.CurveTo(74.06703f, 168.58534f, 71.95f, 172.89127f, 68.18f, 175.3f),
                    PathNode.CurveTo(62.3f, 179.63f, 55.51f, 187.8f, 53.0f, 203.0f),
                    PathNode.CurveTo(68.21f, 200.49f, 76.37f, 193.7f, 80.7f, 187.82f),
                    PathNode.CurveTo(83.108734f, 184.05f, 87.41466f, 181.93298f, 91.87101f, 182.3277f),
                    PathNode.CurveTo(96.327354f, 182.72244f, 100.19411f, 185.56342f, 101.90265f, 189.6981f),
                    PathNode.CurveTo(103.6112f, 193.83281f, 102.87781f, 198.57465f, 100.0f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
