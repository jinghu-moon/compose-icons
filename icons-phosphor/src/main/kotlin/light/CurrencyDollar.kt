package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorLightIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 122.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.LineTo(134.0f, 54.0f),
                    PathNode.LineTo(144.0f, 54.0f),
                    PathNode.CurveTo(162.77768f, 54.0f, 178.0f, 69.22232f, 178.0f, 88.0f),
                    PathNode.CurveTo(178.0f, 91.313705f, 180.6863f, 94.0f, 184.0f, 94.0f),
                    PathNode.CurveTo(187.3137f, 94.0f, 190.0f, 91.313705f, 190.0f, 88.0f),
                    PathNode.CurveTo(189.96695f, 62.608604f, 169.39139f, 42.033054f, 144.0f, 42.0f),
                    PathNode.LineTo(134.0f, 42.0f),
                    PathNode.LineTo(134.0f, 24.0f),
                    PathNode.CurveTo(134.0f, 20.68629f, 131.3137f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(124.686295f, 18.0f, 122.0f, 20.68629f, 122.0f, 24.0f),
                    PathNode.LineTo(122.0f, 42.0f),
                    PathNode.LineTo(112.0f, 42.0f),
                    PathNode.CurveTo(86.5949f, 42.0f, 66.0f, 62.594906f, 66.0f, 88.0f),
                    PathNode.CurveTo(66.0f, 113.4051f, 86.5949f, 134.0f, 112.0f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(122.0f, 202.0f),
                    PathNode.LineTo(104.0f, 202.0f),
                    PathNode.CurveTo(85.22232f, 202.0f, 70.0f, 186.77768f, 70.0f, 168.0f),
                    PathNode.CurveTo(70.0f, 164.6863f, 67.313705f, 162.0f, 64.0f, 162.0f),
                    PathNode.CurveTo(60.68629f, 162.0f, 58.0f, 164.6863f, 58.0f, 168.0f),
                    PathNode.CurveTo(58.033054f, 193.39139f, 78.608604f, 213.96695f, 104.0f, 214.0f),
                    PathNode.LineTo(122.0f, 214.0f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 214.0f),
                    PathNode.LineTo(152.0f, 214.0f),
                    PathNode.CurveTo(177.4051f, 214.0f, 198.0f, 193.4051f, 198.0f, 168.0f),
                    PathNode.CurveTo(198.0f, 142.5949f, 177.4051f, 122.0f, 152.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 122.0f),
                    PathNode.CurveTo(93.22232f, 122.0f, 78.0f, 106.77768f, 78.0f, 88.0f),
                    PathNode.CurveTo(78.0f, 69.22232f, 93.22232f, 54.0f, 112.0f, 54.0f),
                    PathNode.LineTo(122.0f, 54.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 202.0f),
                    PathNode.LineTo(134.0f, 202.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(152.0f, 134.0f),
                    PathNode.CurveTo(170.77768f, 134.0f, 186.0f, 149.22232f, 186.0f, 168.0f),
                    PathNode.CurveTo(186.0f, 186.77768f, 170.77768f, 202.0f, 152.0f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
