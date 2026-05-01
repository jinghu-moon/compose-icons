package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorBoldIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.49f, 23.16f),
                    PathNode.CurveTo(227.83994f, 20.012377f, 222.74797f, 19.142548f, 218.26f, 20.9f),
                    PathNode.LineTo(15.6f, 100.21f),
                    PathNode.CurveTo(8.04383f, 103.15286f, 3.341935f, 110.7353f, 4.064809f, 118.812035f),
                    PathNode.CurveTo(4.787684f, 126.88876f, 10.761333f, 133.51573f, 18.72f, 135.07f),
                    PathNode.LineTo(68.0f, 144.74f),
                    PathNode.LineTo(68.0f, 200.0f),
                    PathNode.CurveTo(67.99979f, 208.15637f, 72.95257f, 215.49573f, 80.51644f, 218.54765f),
                    PathNode.CurveTo(88.08032f, 221.5996f, 96.739685f, 219.7526f, 102.4f, 213.88f),
                    PathNode.LineTo(125.07f, 190.37f),
                    PathNode.LineTo(162.35f, 223.0f),
                    PathNode.CurveTo(167.64026f, 227.6525f, 174.98816f, 229.17848f, 181.69348f, 227.01718f),
                    PathNode.CurveTo(188.39882f, 224.85588f, 193.47247f, 219.32614f, 195.05f, 212.46f),
                    PathNode.LineTo(235.67f, 35.91f),
                    PathNode.CurveTo(236.74707f, 31.213776f, 235.13843f, 26.307001f, 231.49f, 23.16f),
                    PathNode.Close,
                    PathNode.MoveTo(139.41f, 77.52f),
                    PathNode.LineTo(77.22f, 122.09f),
                    PathNode.LineTo(42.79f, 115.34f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 190.06f),
                    PathNode.LineTo(92.0f, 161.35f),
                    PathNode.LineTo(107.0f, 174.5f),
                    PathNode.Close,
                    PathNode.MoveTo(173.16f, 200.58f),
                    PathNode.LineTo(99.28f, 135.81f),
                    PathNode.LineTo(205.59f, 59.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
