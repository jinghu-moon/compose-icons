package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorFillIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.21f, 128.0f),
                    PathNode.LineTo(231.0f, 76.0f),
                    PathNode.CurveTo(232.43564f, 73.513664f, 232.42886f, 70.44866f, 230.98221f, 67.968704f),
                    PathNode.CurveTo(229.53557f, 65.488754f, 226.87094f, 63.974167f, 224.0f, 64.0f),
                    PathNode.LineTo(164.65f, 64.0f),
                    PathNode.LineTo(135.0f, 12.0f),
                    PathNode.CurveTo(133.57675f, 9.503405f, 130.92378f, 7.962007f, 128.05f, 7.962007f),
                    PathNode.CurveTo(125.17622f, 7.962007f, 122.52324f, 9.503405f, 121.1f, 12.0f),
                    PathNode.LineTo(91.33f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(29.137983f, 63.992195f, 26.48982f, 65.5139f, 25.055433f, 67.99054f),
                    PathNode.CurveTo(23.621048f, 70.46718f, 23.618975f, 73.521416f, 25.05f, 76.0f),
                    PathNode.LineTo(54.77f, 128.0f),
                    PathNode.LineTo(25.05f, 180.0f),
                    PathNode.CurveTo(23.614355f, 182.48634f, 23.621143f, 185.55133f, 25.067785f, 188.0313f),
                    PathNode.CurveTo(26.514425f, 190.51125f, 29.179062f, 192.02583f, 32.05f, 192.0f),
                    PathNode.LineTo(91.33f, 192.0f),
                    PathNode.LineTo(121.05f, 244.0f),
                    PathNode.CurveTo(122.47324f, 246.4966f, 125.12622f, 248.038f, 128.0f, 248.038f),
                    PathNode.CurveTo(130.87378f, 248.038f, 133.52676f, 246.4966f, 134.95f, 244.0f),
                    PathNode.LineTo(164.65f, 192.0f),
                    PathNode.LineTo(224.0f, 192.0f),
                    PathNode.CurveTo(226.87094f, 192.02583f, 229.53557f, 190.51125f, 230.98221f, 188.0313f),
                    PathNode.CurveTo(232.42886f, 185.55133f, 232.43564f, 182.48634f, 231.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.79f, 128.0f),
                    PathNode.LineTo(155.37f, 176.0f),
                    PathNode.LineTo(100.62f, 176.0f),
                    PathNode.LineTo(73.2f, 128.0f),
                    PathNode.LineTo(100.62f, 80.0f),
                    PathNode.LineTo(155.37f, 80.0f),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
