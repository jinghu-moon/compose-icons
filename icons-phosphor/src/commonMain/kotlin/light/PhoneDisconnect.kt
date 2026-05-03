package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorLightIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.19f, 91.55f),
                    PathNode.LineTo(230.19f, 91.55f),
                    PathNode.CurveTo(174.8f, 36.15f, 81.19f, 36.15f, 25.81f, 91.55f),
                    PathNode.CurveTo(6.56f, 110.82f, 4.7f, 139.22f, 21.29f, 160.61f),
                    PathNode.CurveTo(25.102827f, 165.46143f, 31.642307f, 167.24455f, 37.39f, 165.0f),
                    PathNode.LineTo(86.39f, 147.62f),
                    PathNode.LineTo(86.61f, 147.53f),
                    PathNode.CurveTo(91.01024f, 145.78462f, 94.22296f, 141.92409f, 95.14f, 137.28f),
                    PathNode.LineTo(101.04f, 107.76f),
                    PathNode.CurveTo(101.15676f, 107.09131f, 101.61622f, 106.53312f, 102.25f, 106.29f),
                    PathNode.CurveTo(118.81906f, 100.539154f, 136.83638f, 100.50043f, 153.43f, 106.18f),
                    PathNode.CurveTo(154.06229f, 106.41668f, 154.52493f, 106.96655f, 154.65f, 107.63f),
                    PathNode.LineTo(160.86f, 137.38f),
                    PathNode.CurveTo(161.81659f, 141.97011f, 165.00745f, 145.77661f, 169.36f, 147.52f),
                    PathNode.LineTo(169.59f, 147.6f),
                    PathNode.LineTo(218.59f, 165.0f),
                    PathNode.CurveTo(224.3442f, 167.23793f, 230.88506f, 165.44223f, 234.69f, 160.58f),
                    PathNode.CurveTo(251.3f, 139.22f, 249.44f, 110.82f, 230.19f, 91.55f),
                    PathNode.Close,
                    PathNode.MoveTo(225.19f, 153.26f),
                    PathNode.CurveTo(224.63458f, 153.93164f, 223.70818f, 154.16628f, 222.9f, 153.84f),
                    PathNode.LineTo(222.68f, 153.75f),
                    PathNode.LineTo(173.68f, 136.37f),
                    PathNode.CurveTo(173.12932f, 136.10268f, 172.73137f, 135.59789f, 172.6f, 135.0f),
                    PathNode.LineTo(166.38f, 105.26f),
                    PathNode.CurveTo(165.37988f, 100.46196f, 161.94348f, 96.536285f, 157.32f, 94.91f),
                    PathNode.CurveTo(138.1906f, 88.36374f, 117.42038f, 88.40951f, 98.32f, 95.04f),
                    PathNode.CurveTo(93.69336f, 96.70161f, 90.27722f, 100.66812f, 89.32f, 105.49f),
                    PathNode.LineTo(83.37f, 135.0f),
                    PathNode.CurveTo(83.24382f, 135.63853f, 82.81481f, 136.17574f, 82.22f, 136.44f),
                    PathNode.LineTo(33.28f, 153.75f),
                    PathNode.LineTo(33.06f, 153.84f),
                    PathNode.CurveTo(32.25183f, 154.16628f, 31.32542f, 153.93164f, 30.77f, 153.26f),
                    PathNode.CurveTo(17.77f, 136.52f, 19.21f, 115.14f, 34.3f, 100.04f),
                    PathNode.CurveTo(59.69f, 74.64f, 93.85f, 61.94f, 128.0f, 61.94f),
                    PathNode.CurveTo(162.15f, 61.94f, 196.31f, 74.64f, 221.7f, 100.04f),
                    PathNode.CurveTo(236.79f, 115.14f, 238.21f, 136.52f, 225.23f, 153.26f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 200.0f),
                    PathNode.CurveTo(222.0f, 203.3137f, 219.3137f, 206.0f, 216.0f, 206.0f),
                    PathNode.LineTo(40.0f, 206.0f),
                    PathNode.CurveTo(36.68629f, 206.0f, 34.0f, 203.3137f, 34.0f, 200.0f),
                    PathNode.CurveTo(34.0f, 196.6863f, 36.68629f, 194.0f, 40.0f, 194.0f),
                    PathNode.LineTo(216.0f, 194.0f),
                    PathNode.CurveTo(219.3137f, 194.0f, 222.0f, 196.6863f, 222.0f, 200.0f),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
