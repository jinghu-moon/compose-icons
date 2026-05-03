package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorFillIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(168.41f, 184.38f),
                    PathNode.LineTo(140.31f, 218.26f),
                    PathNode.CurveTo(137.26881f, 221.91444f, 132.7543f, 224.0195f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(123.24076f, 224.0121f, 118.72539f, 221.89565f, 115.69f, 218.23f),
                    PathNode.LineTo(11.65f, 92.8f),
                    PathNode.CurveTo(8.882438f, 89.49356f, 7.601669f, 85.191765f, 8.11f, 80.91f),
                    PathNode.CurveTo(8.615581f, 76.61903f, 10.842456f, 72.71749f, 14.28f, 70.1f),
                    PathNode.CurveTo(24.361992f, 62.446888f, 35.190113f, 55.830074f, 46.6f, 50.35f),
                    PathNode.LineTo(42.31f, 45.63f),
                    PathNode.CurveTo(39.2958f, 42.415115f, 39.35314f, 37.39519f, 42.44f, 34.25f),
                    PathNode.CurveTo(43.996f, 32.74565f, 46.095123f, 31.935938f, 48.258297f, 32.005657f),
                    PathNode.CurveTo(50.421474f, 32.07538f, 52.4641f, 33.018578f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(247.92f, 80.91f),
                    PathNode.CurveTo(247.41441f, 76.61903f, 245.18755f, 72.71749f, 241.75f, 70.1f),
                    PathNode.CurveTo(209.05795f, 45.230736f, 169.07584f, 31.838928f, 128.0f, 32.0f),
                    PathNode.CurveTo(113.70353f, 31.988142f, 99.45093f, 33.581455f, 85.51f, 36.75f),
                    PathNode.CurveTo(84.13586f, 37.085114f, 83.040855f, 38.121014f, 82.6301f, 39.47447f),
                    PathNode.CurveTo(82.21934f, 40.827923f, 82.553894f, 42.29768f, 83.51f, 43.34f),
                    PathNode.LineTo(186.0f, 156.07f),
                    PathNode.CurveTo(186.77924f, 156.9136f, 187.8835f, 157.38158f, 189.03162f, 157.35481f),
                    PathNode.CurveTo(190.17973f, 157.32802f, 191.26096f, 156.80904f, 192.0f, 155.93f),
                    PathNode.LineTo(244.35f, 92.8f),
                    PathNode.CurveTo(247.11757f, 89.49356f, 248.39833f, 85.191765f, 247.89f, 80.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
