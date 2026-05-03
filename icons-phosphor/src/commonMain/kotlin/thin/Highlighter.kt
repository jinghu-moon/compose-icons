package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorThinIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.83f, 109.17f),
                    PathNode.CurveTo(250.07973f, 108.418884f, 249.06163f, 107.99686f, 248.0f, 107.99686f),
                    PathNode.CurveTo(246.93837f, 107.99686f, 245.92027f, 108.418884f, 245.17f, 109.17f),
                    PathNode.LineTo(194.83f, 159.51f),
                    PathNode.CurveTo(194.07973f, 160.26111f, 193.06163f, 160.68315f, 192.0f, 160.68315f),
                    PathNode.CurveTo(190.93837f, 160.68315f, 189.92027f, 160.26111f, 189.17f, 159.51f),
                    PathNode.LineTo(104.49f, 74.83f),
                    PathNode.CurveTo(103.73889f, 74.07973f, 103.31686f, 73.06164f, 103.31686f, 72.0f),
                    PathNode.CurveTo(103.31686f, 70.93836f, 103.73889f, 69.92027f, 104.49f, 69.17f),
                    PathNode.LineTo(154.83f, 18.83f),
                    PathNode.CurveTo(156.39296f, 17.267035f, 156.39296f, 14.732965f, 154.83f, 13.17f),
                    PathNode.CurveTo(153.26703f, 11.607035f, 150.73297f, 11.607034f, 149.17f, 13.17f),
                    PathNode.LineTo(98.83f, 63.51f),
                    PathNode.CurveTo(94.32389f, 68.013176f, 94.12194f, 75.25262f, 98.37f, 80.0f),
                    PathNode.LineTo(74.83f, 103.51f),
                    PathNode.CurveTo(72.57055f, 105.76162f, 71.30054f, 108.82018f, 71.30054f, 112.01f),
                    PathNode.CurveTo(71.30054f, 115.19982f, 72.57055f, 118.25838f, 74.83f, 120.51f),
                    PathNode.LineTo(82.34f, 128.0f),
                    PathNode.LineTo(21.17f, 189.17f),
                    PathNode.CurveTo(20.191492f, 190.15128f, 19.79059f, 191.56909f, 20.11037f, 192.91747f),
                    PathNode.CurveTo(20.43015f, 194.26585f, 21.42505f, 195.35265f, 22.74f, 195.79f),
                    PathNode.LineTo(94.74f, 219.79f),
                    PathNode.CurveTo(95.14569f, 219.92842f, 95.57134f, 219.99936f, 96.0f, 220.0f),
                    PathNode.CurveTo(97.06119f, 220.00084f, 98.07921f, 219.57996f, 98.83f, 218.83f),
                    PathNode.LineTo(136.0f, 181.66f),
                    PathNode.LineTo(143.51f, 189.17f),
                    PathNode.CurveTo(145.76163f, 191.42946f, 148.82018f, 192.69946f, 152.01f, 192.69946f),
                    PathNode.CurveTo(155.19981f, 192.69946f, 158.25838f, 191.42946f, 160.51f, 189.17f),
                    PathNode.LineTo(184.0f, 165.63f),
                    PathNode.CurveTo(188.74448f, 169.86539f, 195.96933f, 169.66359f, 200.47f, 165.17f),
                    PathNode.LineTo(250.81f, 114.83f),
                    PathNode.CurveTo(251.56377f, 114.08238f, 251.98941f, 113.06579f, 251.99316f, 112.00414f),
                    PathNode.CurveTo(251.9969f, 110.942505f, 251.57846f, 109.92292f, 250.83f, 109.17f),
                    PathNode.Close,
                    PathNode.MoveTo(94.92f, 211.42f),
                    PathNode.LineTo(31.4f, 190.25f),
                    PathNode.LineTo(88.0f, 133.66f),
                    PathNode.LineTo(130.34f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.83f, 183.51f),
                    PathNode.CurveTo(154.07973f, 184.26111f, 153.06163f, 184.68315f, 152.0f, 184.68315f),
                    PathNode.CurveTo(150.93837f, 184.68315f, 149.92027f, 184.26111f, 149.17f, 183.51f),
                    PathNode.LineTo(80.49f, 114.83f),
                    PathNode.CurveTo(79.73889f, 114.07973f, 79.31686f, 113.06164f, 79.31686f, 112.0f),
                    PathNode.CurveTo(79.31686f, 110.93836f, 79.73889f, 109.92027f, 80.49f, 109.17f),
                    PathNode.LineTo(104.0f, 85.66f),
                    PathNode.LineTo(178.34f, 160.0f),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
