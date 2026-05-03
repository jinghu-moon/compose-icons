package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorThinIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.27f, 29.22f),
                    PathNode.CurveTo(224.86383f, 28.004656f, 222.89957f, 27.669577f, 221.17f, 28.35f),
                    PathNode.LineTo(18.51f, 107.66f),
                    PathNode.CurveTo(14.265849f, 109.307434f, 11.62318f, 113.563576f, 12.02888f, 118.09814f),
                    PathNode.CurveTo(12.43458f, 122.632706f, 15.790809f, 126.352135f, 20.26f, 127.22f),
                    PathNode.LineTo(76.0f, 138.16f),
                    PathNode.LineTo(76.0f, 200.0f),
                    PathNode.CurveTo(75.99932f, 204.89438f, 78.971146f, 209.29869f, 83.51f, 211.13f),
                    PathNode.CurveTo(84.93775f, 211.70279f, 86.46164f, 211.99806f, 88.0f, 212.0f),
                    PathNode.CurveTo(91.25339f, 211.99257f, 94.36432f, 210.66446f, 96.62f, 208.32f),
                    PathNode.LineTo(124.62f, 179.32f),
                    PathNode.LineTo(167.62f, 217.03f),
                    PathNode.CurveTo(169.79991f, 218.95253f, 172.60347f, 220.01852f, 175.51f, 220.03f),
                    PathNode.CurveTo(176.77943f, 220.02484f, 178.04063f, 219.82588f, 179.25f, 219.44f),
                    PathNode.CurveTo(183.27875f, 218.16458f, 186.32564f, 214.84348f, 187.25f, 210.72f),
                    PathNode.LineTo(227.87f, 34.12f),
                    PathNode.CurveTo(228.28456f, 32.31643f, 227.66904f, 30.43138f, 226.27f, 29.22f),
                    PathNode.Close,
                    PathNode.MoveTo(20.0f, 117.38f),
                    PathNode.CurveTo(19.87913f, 116.383224f, 20.470795f, 115.43739f, 21.42f, 115.11f),
                    PathNode.LineTo(196.07f, 46.76f),
                    PathNode.LineTo(79.07f, 130.61f),
                    PathNode.LineTo(21.81f, 119.37f),
                    PathNode.CurveTo(20.80919f, 119.2234f, 20.051346f, 118.39019f, 20.0f, 117.38f),
                    PathNode.Close,
                    PathNode.MoveTo(90.87f, 202.76f),
                    PathNode.CurveTo(89.7389f, 203.92519f, 88.0156f, 204.2909f, 86.508766f, 203.68552f),
                    PathNode.CurveTo(85.00192f, 203.08015f, 84.01061f, 201.62386f, 84.0f, 200.0f),
                    PathNode.LineTo(84.0f, 143.7f),
                    PathNode.LineTo(118.58f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.45f, 208.9f),
                    PathNode.CurveTo(179.13522f, 210.28168f, 178.11292f, 211.39369f, 176.7625f, 211.82327f),
                    PathNode.CurveTo(175.4121f, 212.25285f, 173.9352f, 211.93588f, 172.88f, 210.99f),
                    PathNode.LineTo(86.43f, 135.18f),
                    PathNode.LineTo(218.13f, 40.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
