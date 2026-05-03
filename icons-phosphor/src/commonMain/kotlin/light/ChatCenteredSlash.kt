package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) return _chatCenteredSlash!!
        _chatCenteredSlash = phosphorLightIcon(
            name = "ChatCenteredSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.52063f, 33.903984f, 47.39401f, 33.442116f, 44.95059f, 34.893654f),
                    PathNode.CurveTo(42.507164f, 36.345192f, 41.417316f, 39.31189f, 42.34f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 191.73198f, 32.268013f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(101.59f, 198.0f),
                    PathNode.LineTo(115.84f, 223.0f),
                    PathNode.CurveTo(118.33135f, 227.36658f, 122.97269f, 230.0621f, 128.0f, 230.0621f),
                    PathNode.CurveTo(133.02731f, 230.0621f, 137.66864f, 227.36658f, 140.16f, 223.0f),
                    PathNode.LineTo(154.41f, 198.0f),
                    PathNode.LineTo(183.53f, 198.0f),
                    PathNode.LineTo(203.53f, 220.0f),
                    PathNode.CurveTo(205.76123f, 222.45215f, 209.55786f, 222.63123f, 212.01f, 220.4f),
                    PathNode.CurveTo(214.46214f, 218.16876f, 214.64124f, 214.37215f, 212.41f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(150.93f, 186.0f),
                    PathNode.CurveTo(148.78146f, 185.99504f, 146.79427f, 187.1393f, 145.72f, 189.0f),
                    PathNode.LineTo(129.72f, 217.0f),
                    PathNode.CurveTo(129.36488f, 217.62662f, 128.70026f, 218.0139f, 127.98f, 218.0139f),
                    PathNode.CurveTo(127.25974f, 218.0139f, 126.59512f, 217.62662f, 126.24f, 217.0f),
                    PathNode.LineTo(110.24f, 189.0f),
                    PathNode.CurveTo(109.16573f, 187.1393f, 107.178535f, 185.99504f, 105.03f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(38.89543f, 186.0f, 38.0f, 185.10457f, 38.0f, 184.0f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(52.62f, 54.0f),
                    PathNode.LineTo(172.62f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 186.0f),
                    PathNode.CurveTo(230.0f, 189.3137f, 227.3137f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(220.6863f, 192.0f, 218.0f, 189.3137f, 218.0f, 186.0f),
                    PathNode.LineTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(98.52f, 54.0f),
                    PathNode.CurveTo(95.20629f, 54.0f, 92.52f, 51.31371f, 92.52f, 48.0f),
                    PathNode.CurveTo(92.52f, 44.68629f, 95.20629f, 42.0f, 98.52f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
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
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
