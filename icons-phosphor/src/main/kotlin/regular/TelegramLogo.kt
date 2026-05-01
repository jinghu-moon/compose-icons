package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorRegularIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.88f, 26.19f),
                    PathNode.CurveTo(226.35396f, 24.00874f, 222.82825f, 23.404442f, 219.72f, 24.62f),
                    PathNode.LineTo(17.06f, 103.93f),
                    PathNode.CurveTo(11.15983f, 106.224304f, 7.48684f, 112.1427f, 8.049951f, 118.44815f),
                    PathNode.CurveTo(8.613062f, 124.75361f, 13.276653f, 129.9275f, 19.49f, 131.14f),
                    PathNode.LineTo(72.0f, 141.45f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(71.97884f, 206.52565f, 75.94226f, 212.4034f, 82.0f, 214.83f),
                    PathNode.CurveTo(88.04887f, 217.30002f, 94.99293f, 215.82079f, 99.51f, 211.1f),
                    PathNode.LineTo(124.83f, 184.84f),
                    PathNode.LineTo(165.0f, 220.0f),
                    PathNode.CurveTo(167.89815f, 222.57066f, 171.63603f, 223.99327f, 175.51f, 224.0f),
                    PathNode.CurveTo(177.20764f, 223.99864f, 178.89464f, 223.7321f, 180.51f, 223.21f),
                    PathNode.CurveTo(185.88118f, 221.50569f, 189.94359f, 217.07777f, 191.18f, 211.58f),
                    PathNode.LineTo(231.77f, 35.0f),
                    PathNode.CurveTo(232.50984f, 31.754864f, 231.39828f, 28.366348f, 228.88f, 26.19f),
                    PathNode.Close,
                    PathNode.MoveTo(167.74f, 62.19f),
                    PathNode.LineTo(78.15f, 126.35f),
                    PathNode.LineTo(28.55f, 116.62f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 200.0f),
                    PathNode.LineTo(88.0f, 152.52f),
                    PathNode.LineTo(112.79f, 174.26f),
                    PathNode.Close,
                    PathNode.MoveTo(175.53f, 208.0f),
                    PathNode.LineTo(92.85f, 135.5f),
                    PathNode.LineTo(211.85f, 50.21f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
