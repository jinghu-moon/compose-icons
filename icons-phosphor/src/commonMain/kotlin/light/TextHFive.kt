package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorLightIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 180.0f),
                    PathNode.CurveTo(246.0f, 198.77768f, 230.77768f, 214.0f, 212.0f, 214.0f),
                    PathNode.CurveTo(202.91103f, 214.15358f, 194.14764f, 210.61794f, 187.71f, 204.2f),
                    PathNode.CurveTo(185.39041f, 201.8307f, 185.4307f, 198.0296f, 187.8f, 195.71f),
                    PathNode.CurveTo(190.1693f, 193.39041f, 193.9704f, 193.4307f, 196.29f, 195.8f),
                    PathNode.CurveTo(200.47137f, 199.90823f, 206.13992f, 202.14534f, 212.0f, 202.0f),
                    PathNode.CurveTo(224.15027f, 202.0f, 234.0f, 192.15027f, 234.0f, 180.0f),
                    PathNode.CurveTo(234.0f, 167.84973f, 224.15027f, 158.0f, 212.0f, 158.0f),
                    PathNode.CurveTo(206.13992f, 157.85466f, 200.47137f, 160.09177f, 196.29f, 164.2f),
                    PathNode.CurveTo(194.45609f, 166.08078f, 191.61195f, 166.54991f, 189.27116f, 165.35774f),
                    PathNode.CurveTo(186.93037f, 164.16556f, 185.63727f, 161.58932f, 186.08f, 159.0f),
                    PathNode.LineTo(194.08f, 111.0f),
                    PathNode.CurveTo(194.56822f, 108.11167f, 197.0707f, 105.998085f, 200.0f, 106.0f),
                    PathNode.LineTo(240.0f, 106.0f),
                    PathNode.CurveTo(243.3137f, 106.0f, 246.0f, 108.686295f, 246.0f, 112.0f),
                    PathNode.CurveTo(246.0f, 115.313705f, 243.3137f, 118.0f, 240.0f, 118.0f),
                    PathNode.LineTo(205.08f, 118.0f),
                    PathNode.LineTo(200.08f, 148.0f),
                    PathNode.CurveTo(203.91223f, 146.66634f, 207.94235f, 145.99013f, 212.0f, 146.0f),
                    PathNode.CurveTo(230.77768f, 146.0f, 246.0f, 161.22232f, 246.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 50.0f),
                    PathNode.CurveTo(140.6863f, 50.0f, 138.0f, 52.68629f, 138.0f, 56.0f),
                    PathNode.LineTo(138.0f, 110.0f),
                    PathNode.LineTo(46.0f, 110.0f),
                    PathNode.LineTo(46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 52.68629f, 43.31371f, 50.0f, 40.0f, 50.0f),
                    PathNode.CurveTo(36.68629f, 50.0f, 34.0f, 52.68629f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 179.3137f, 36.68629f, 182.0f, 40.0f, 182.0f),
                    PathNode.CurveTo(43.31371f, 182.0f, 46.0f, 179.3137f, 46.0f, 176.0f),
                    PathNode.LineTo(46.0f, 122.0f),
                    PathNode.LineTo(138.0f, 122.0f),
                    PathNode.LineTo(138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 179.3137f, 140.6863f, 182.0f, 144.0f, 182.0f),
                    PathNode.CurveTo(147.3137f, 182.0f, 150.0f, 179.3137f, 150.0f, 176.0f),
                    PathNode.LineTo(150.0f, 56.0f),
                    PathNode.CurveTo(150.0f, 52.68629f, 147.3137f, 50.0f, 144.0f, 50.0f),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
