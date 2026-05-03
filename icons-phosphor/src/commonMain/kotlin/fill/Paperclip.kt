package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorFillIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 74.34f),
                    PathNode.CurveTo(164.15945f, 72.83778f, 162.12328f, 71.993706f, 160.0f, 71.993706f),
                    PathNode.CurveTo(157.87672f, 71.993706f, 155.84055f, 72.83778f, 154.34f, 74.34f),
                    PathNode.LineTo(87.09f, 143.0f),
                    PathNode.CurveTo(77.70116f, 152.36398f, 77.681015f, 167.56616f, 87.045f, 176.955f),
                    PathNode.CurveTo(96.40899f, 186.34384f, 111.61116f, 186.36398f, 121.0f, 177.0f),
                    PathNode.LineTo(170.32f, 126.68f),
                    PathNode.CurveTo(172.30322f, 124.559616f, 175.27956f, 123.68014f, 178.09674f, 124.382034f),
                    PathNode.CurveTo(180.91393f, 125.08394f, 183.12971f, 127.257034f, 183.88628f, 130.06003f),
                    PathNode.CurveTo(184.64284f, 132.86304f, 183.82141f, 135.85591f, 181.74f, 137.88f),
                    PathNode.LineTo(132.37f, 188.26f),
                    PathNode.CurveTo(122.314f, 198.56279f, 107.49713f, 202.66673f, 93.57348f, 199.0058f),
                    PathNode.CurveTo(79.649826f, 195.34485f, 68.76769f, 184.48386f, 65.07967f, 170.56737f),
                    PathNode.CurveTo(61.391655f, 156.65083f, 65.46679f, 141.82602f, 75.75f, 131.75f),
                    PathNode.LineTo(143.0f, 63.09f),
                    PathNode.CurveTo(152.36398f, 53.70116f, 167.56616f, 53.68101f, 176.955f, 63.045f),
                    PathNode.CurveTo(186.34384f, 72.40899f, 186.36398f, 87.61116f, 177.0f, 97.0f),
                    PathNode.LineTo(109.71f, 165.6f),
                    PathNode.CurveTo(107.726776f, 167.72038f, 104.75044f, 168.59987f, 101.93326f, 167.89796f),
                    PathNode.CurveTo(99.11607f, 167.19606f, 96.90029f, 165.02296f, 96.14373f, 162.21997f),
                    PathNode.CurveTo(95.38717f, 159.41696f, 96.208595f, 156.42409f, 98.29f, 154.4f),
                    PathNode.LineTo(165.6f, 85.71f),
                    PathNode.CurveTo(167.12553f, 84.21549f, 167.9902f, 82.17309f, 168.0015f, 80.03751f),
                    PathNode.CurveTo(168.01274f, 77.90194f, 167.16968f, 75.85052f, 165.66f, 74.34f),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
