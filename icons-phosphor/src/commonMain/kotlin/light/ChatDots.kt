package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorLightIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 133.52284f, 133.52284f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(122.47715f, 138.0f, 118.0f, 133.52284f, 118.0f, 128.0f),
                    PathNode.CurveTo(118.0f, 122.47715f, 122.47715f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(133.52284f, 118.0f, 138.0f, 122.47715f, 138.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 118.0f),
                    PathNode.CurveTo(78.47715f, 118.0f, 74.0f, 122.47715f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 133.52284f, 78.47715f, 138.0f, 84.0f, 138.0f),
                    PathNode.CurveTo(89.52285f, 138.0f, 94.0f, 133.52284f, 94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 122.47715f, 89.52285f, 118.0f, 84.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 118.0f),
                    PathNode.CurveTo(166.47716f, 118.0f, 162.0f, 122.47715f, 162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 133.52284f, 166.47716f, 138.0f, 172.0f, 138.0f),
                    PathNode.CurveTo(177.52284f, 138.0f, 182.0f, 133.52284f, 182.0f, 128.0f),
                    PathNode.CurveTo(182.0f, 122.47715f, 177.52284f, 118.0f, 172.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 64.0f),
                    PathNode.LineTo(230.0f, 192.0f),
                    PathNode.CurveTo(230.0f, 199.73198f, 223.73198f, 206.0f, 216.0f, 206.0f),
                    PathNode.LineTo(82.23f, 206.0f),
                    PathNode.LineTo(49.07f, 234.64f),
                    PathNode.LineTo(49.01f, 234.69f),
                    PathNode.CurveTo(46.496338f, 236.83052f, 43.30156f, 238.00418f, 40.0f, 238.0f),
                    PathNode.CurveTo(37.943443f, 237.99557f, 35.91271f, 237.54164f, 34.05f, 236.67f),
                    PathNode.CurveTo(29.117393f, 234.3871f, 25.971155f, 229.4352f, 26.0f, 224.0f),
                    PathNode.LineTo(26.0f, 64.0f),
                    PathNode.CurveTo(26.0f, 56.268013f, 32.268013f, 50.0f, 40.0f, 50.0f),
                    PathNode.LineTo(216.0f, 50.0f),
                    PathNode.CurveTo(223.73198f, 50.0f, 230.0f, 56.268013f, 230.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 64.0f),
                    PathNode.CurveTo(218.0f, 62.89543f, 217.10457f, 62.0f, 216.0f, 62.0f),
                    PathNode.LineTo(40.0f, 62.0f),
                    PathNode.CurveTo(38.89543f, 62.0f, 38.0f, 62.89543f, 38.0f, 64.0f),
                    PathNode.LineTo(38.0f, 224.0f),
                    PathNode.CurveTo(38.00123f, 224.77069f, 38.44518f, 225.4721f, 39.141205f, 225.80304f),
                    PathNode.CurveTo(39.837234f, 226.13397f, 40.661484f, 226.03554f, 41.26f, 225.55f),
                    PathNode.LineTo(76.08f, 195.47f),
                    PathNode.CurveTo(77.167786f, 194.52524f, 78.55922f, 194.00345f, 80.0f, 194.0f),
                    PathNode.LineTo(216.0f, 194.0f),
                    PathNode.CurveTo(217.10457f, 194.0f, 218.0f, 193.10457f, 218.0f, 192.0f),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
