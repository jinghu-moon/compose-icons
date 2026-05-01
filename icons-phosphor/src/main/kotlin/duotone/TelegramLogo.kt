package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorDuotoneIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.41f, 32.09f),
                    PathNode.LineTo(80.0f, 134.87f),
                    PathNode.LineTo(21.0f, 123.3f),
                    PathNode.CurveTo(18.286139f, 122.74982f, 16.261127f, 120.4744f, 16.029636f, 117.71503f),
                    PathNode.CurveTo(15.798144f, 114.95566f, 17.41574f, 112.37466f, 20.0f, 111.38f),
                    PathNode.LineTo(222.63f, 32.07f),
                    PathNode.CurveTo(222.88199f, 31.970774f, 223.16344f, 31.977991f, 223.41f, 32.09f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.CurveTo(79.99665f, 203.264f, 81.97657f, 206.20274f, 85.00287f, 207.42557f),
                    PathNode.CurveTo(88.02916f, 208.6484f, 91.494865f, 207.9101f, 93.76f, 205.56f),
                    PathNode.LineTo(124.37f, 173.8f),
                    PathNode.LineTo(80.0f, 134.87f),
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
                    PathNode.MoveTo(78.15f, 126.35f),
                    PathNode.LineTo(28.54f, 116.62f),
                    PathNode.LineTo(167.74f, 62.14f),
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
