package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorLightIcon(
            name = "ChatCenteredDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.0f, 120.0f),
                    PathNode.CurveTo(138.0f, 125.52285f, 133.52284f, 130.0f, 128.0f, 130.0f),
                    PathNode.CurveTo(122.47715f, 130.0f, 118.0f, 125.52285f, 118.0f, 120.0f),
                    PathNode.CurveTo(118.0f, 114.47715f, 122.47715f, 110.0f, 128.0f, 110.0f),
                    PathNode.CurveTo(133.52284f, 110.0f, 138.0f, 114.47715f, 138.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 110.0f),
                    PathNode.CurveTo(78.47715f, 110.0f, 74.0f, 114.47715f, 74.0f, 120.0f),
                    PathNode.CurveTo(74.0f, 125.52285f, 78.47715f, 130.0f, 84.0f, 130.0f),
                    PathNode.CurveTo(89.52285f, 130.0f, 94.0f, 125.52285f, 94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 114.47715f, 89.52285f, 110.0f, 84.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 110.0f),
                    PathNode.CurveTo(166.47716f, 110.0f, 162.0f, 114.47715f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 125.52285f, 166.47716f, 130.0f, 172.0f, 130.0f),
                    PathNode.CurveTo(177.52284f, 130.0f, 182.0f, 125.52285f, 182.0f, 120.0f),
                    PathNode.CurveTo(182.0f, 114.47715f, 177.52284f, 110.0f, 172.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.LineTo(230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 191.73198f, 223.73198f, 198.0f, 216.0f, 198.0f),
                    PathNode.LineTo(154.41f, 198.0f),
                    PathNode.LineTo(140.16f, 223.0f),
                    PathNode.CurveTo(137.66864f, 227.36658f, 133.02731f, 230.0621f, 128.0f, 230.0621f),
                    PathNode.CurveTo(122.97269f, 230.0621f, 118.33135f, 227.36658f, 115.84f, 223.0f),
                    PathNode.LineTo(101.59f, 198.0f),
                    PathNode.LineTo(40.0f, 198.0f),
                    PathNode.CurveTo(32.268013f, 198.0f, 26.0f, 191.73198f, 26.0f, 184.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(216.0f, 42.0f),
                    PathNode.CurveTo(223.73198f, 42.0f, 230.0f, 48.268013f, 230.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 54.89543f, 217.10457f, 54.0f, 216.0f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.LineTo(38.0f, 184.0f),
                    PathNode.CurveTo(38.0f, 185.10457f, 38.89543f, 186.0f, 40.0f, 186.0f),
                    PathNode.LineTo(105.07f, 186.0f),
                    PathNode.CurveTo(107.21854f, 185.99504f, 109.205734f, 187.1393f, 110.28f, 189.0f),
                    PathNode.LineTo(126.28f, 217.0f),
                    PathNode.CurveTo(126.635124f, 217.62662f, 127.29974f, 218.0139f, 128.02f, 218.0139f),
                    PathNode.CurveTo(128.74025f, 218.0139f, 129.40488f, 217.62662f, 129.76f, 217.0f),
                    PathNode.LineTo(145.76f, 189.0f),
                    PathNode.CurveTo(146.83427f, 187.1393f, 148.82146f, 185.99504f, 150.97f, 186.0f),
                    PathNode.LineTo(216.0f, 186.0f),
                    PathNode.CurveTo(217.10457f, 186.0f, 218.0f, 185.10457f, 218.0f, 184.0f),
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
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
