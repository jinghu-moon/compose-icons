package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorRegularIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(69.12f, 94.15f),
                    PathNode.LineTo(28.5f, 128.0f),
                    PathNode.LineTo(69.12f, 161.85f),
                    PathNode.CurveTo(71.380424f, 163.65953f, 72.48665f, 166.54926f, 72.012405f, 169.40562f),
                    PathNode.CurveTo(71.53816f, 172.26204f, 69.55749f, 174.63924f, 66.83359f, 175.62123f),
                    PathNode.CurveTo(64.109695f, 176.60321f, 61.067783f, 176.03671f, 58.88f, 174.14f),
                    PathNode.LineTo(10.88f, 134.14f),
                    PathNode.CurveTo(9.056611f, 132.62004f, 8.0024f, 130.36882f, 8.0024f, 127.995f),
                    PathNode.CurveTo(8.0024f, 125.621185f, 9.056611f, 123.36996f, 10.88f, 121.85f),
                    PathNode.LineTo(58.88f, 81.85f),
                    PathNode.CurveTo(62.27655f, 79.0223f, 67.3223f, 79.483444f, 70.15f, 82.88f),
                    PathNode.CurveTo(72.9777f, 86.27655f, 72.516556f, 91.3223f, 69.12f, 94.15f),
                    PathNode.Close,
                    PathNode.MoveTo(245.12f, 121.85f),
                    PathNode.LineTo(197.12f, 81.85f),
                    PathNode.CurveTo(193.72345f, 79.0223f, 188.67769f, 79.483444f, 185.85f, 82.88f),
                    PathNode.CurveTo(183.02231f, 86.27655f, 183.48344f, 91.3223f, 186.88f, 94.15f),
                    PathNode.LineTo(227.5f, 128.0f),
                    PathNode.LineTo(186.88f, 161.85f),
                    PathNode.CurveTo(184.61958f, 163.65953f, 183.51335f, 166.54926f, 183.9876f, 169.40562f),
                    PathNode.CurveTo(184.46184f, 172.26204f, 186.44254f, 174.63924f, 189.16641f, 175.62123f),
                    PathNode.CurveTo(191.8903f, 176.60321f, 194.93222f, 176.03671f, 197.12f, 174.14f),
                    PathNode.LineTo(245.12f, 134.14f),
                    PathNode.CurveTo(246.94339f, 132.62004f, 247.9976f, 130.36882f, 247.9976f, 127.995f),
                    PathNode.CurveTo(247.9976f, 125.621185f, 246.94339f, 123.36996f, 245.12f, 121.85f),
                    PathNode.Close,
                    PathNode.MoveTo(162.73f, 32.48f),
                    PathNode.CurveTo(160.73558f, 31.755901f, 158.53519f, 31.853771f, 156.61292f, 32.75208f),
                    PathNode.CurveTo(154.69066f, 33.650383f, 153.204f, 35.27554f, 152.48f, 37.27f),
                    PathNode.LineTo(88.48f, 213.27f),
                    PathNode.CurveTo(87.7528f, 215.26566f, 87.849075f, 217.4686f, 88.7476f, 219.3932f),
                    PathNode.CurveTo(89.646126f, 221.31781f, 91.27313f, 222.8061f, 93.27f, 223.53f),
                    PathNode.CurveTo(94.14646f, 223.84149f, 95.06983f, 224.00046f, 96.0f, 224.0f),
                    PathNode.CurveTo(99.36567f, 224.00009f, 102.37147f, 221.89363f, 103.52f, 218.73f),
                    PathNode.LineTo(167.52f, 42.73f),
                    PathNode.CurveTo(168.2441f, 40.735577f, 168.14622f, 38.535187f, 167.24792f, 36.612923f),
                    PathNode.CurveTo(166.34961f, 34.69066f, 164.72446f, 33.203995f, 162.73f, 32.48f),
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
        return _code!!
    }

private var _code: ImageVector? = null
