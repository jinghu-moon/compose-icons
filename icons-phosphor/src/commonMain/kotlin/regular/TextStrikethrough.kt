package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorRegularIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.41827f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.LineTo(175.93f, 136.0f),
                    PathNode.CurveTo(185.12f, 143.11f, 192.0f, 153.2f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 181.34f, 185.0f, 193.7f, 172.25f, 202.79f),
                    PathNode.CurveTo(160.33f, 211.31f, 144.61f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(111.39f, 216.0f, 95.67f, 211.31f, 83.75f, 202.79f),
                    PathNode.CurveTo(71.0f, 193.7f, 64.0f, 181.34f, 64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 163.58173f, 67.58172f, 160.0f, 72.0f, 160.0f),
                    PathNode.CurveTo(76.41828f, 160.0f, 80.0f, 163.58173f, 80.0f, 168.0f),
                    PathNode.CurveTo(80.0f, 185.35f, 102.0f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(154.0f, 200.0f, 176.0f, 185.35f, 176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 153.15f, 165.46f, 144.42f, 137.23f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 132.41827f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 123.58172f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.33f, 104.0f),
                    PathNode.CurveTo(78.895454f, 104.002365f, 81.30641f, 102.77424f, 82.81287f, 100.69766f),
                    PathNode.CurveTo(84.31932f, 98.62109f, 84.738495f, 95.94802f, 83.94f, 93.51f),
                    PathNode.CurveTo(83.367424f, 91.73025f, 83.08712f, 89.869446f, 83.11f, 88.0f),
                    PathNode.CurveTo(83.11f, 69.76f, 102.41f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(146.84f, 56.0f, 162.16f, 63.42f, 169.0f, 75.85f),
                    PathNode.CurveTo(171.24384f, 79.46476f, 175.9244f, 80.69092f, 179.65231f, 78.64057f),
                    PathNode.CurveTo(183.38022f, 76.59022f, 184.85118f, 71.98071f, 183.0f, 68.15f),
                    PathNode.CurveTo(173.33f, 50.52f, 152.77f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(93.29f, 40.0f, 67.11f, 60.63f, 67.11f, 88.0f),
                    PathNode.CurveTo(67.092995f, 91.56025f, 67.63976f, 95.100746f, 68.73f, 98.49f),
                    PathNode.CurveTo(69.806274f, 101.77616f, 72.87208f, 103.99886f, 76.33f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
