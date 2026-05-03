package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorLightIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(58.0f, 56.0f),
                    PathNode.CurveTo(58.0f, 52.68629f, 60.68629f, 50.0f, 64.0f, 50.0f),
                    PathNode.LineTo(192.0f, 50.0f),
                    PathNode.CurveTo(195.3137f, 50.0f, 198.0f, 52.68629f, 198.0f, 56.0f),
                    PathNode.CurveTo(198.0f, 59.31371f, 195.3137f, 62.0f, 192.0f, 62.0f),
                    PathNode.LineTo(64.0f, 62.0f),
                    PathNode.CurveTo(60.68629f, 62.0f, 58.0f, 59.31371f, 58.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 162.0f),
                    PathNode.CurveTo(212.6863f, 162.0f, 210.0f, 164.6863f, 210.0f, 168.0f),
                    PathNode.LineTo(210.0f, 186.0f),
                    PathNode.LineTo(176.0f, 186.0f),
                    PathNode.CurveTo(166.05887f, 186.0f, 158.0f, 177.94113f, 158.0f, 168.0f),
                    PathNode.LineTo(158.0f, 118.0f),
                    PathNode.LineTo(208.0f, 118.0f),
                    PathNode.CurveTo(211.3137f, 118.0f, 214.0f, 115.313705f, 214.0f, 112.0f),
                    PathNode.CurveTo(214.0f, 108.686295f, 211.3137f, 106.0f, 208.0f, 106.0f),
                    PathNode.LineTo(48.0f, 106.0f),
                    PathNode.CurveTo(44.68629f, 106.0f, 42.0f, 108.686295f, 42.0f, 112.0f),
                    PathNode.CurveTo(42.0f, 115.313705f, 44.68629f, 118.0f, 48.0f, 118.0f),
                    PathNode.LineTo(98.0f, 118.0f),
                    PathNode.LineTo(98.0f, 128.0f),
                    PathNode.CurveTo(97.961426f, 160.01653f, 72.016525f, 185.96143f, 40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.CurveTo(78.641655f, 197.95592f, 109.95592f, 166.64166f, 110.0f, 128.0f),
                    PathNode.LineTo(110.0f, 118.0f),
                    PathNode.LineTo(146.0f, 118.0f),
                    PathNode.LineTo(146.0f, 168.0f),
                    PathNode.CurveTo(146.0f, 184.56854f, 159.43146f, 198.0f, 176.0f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(219.3137f, 198.0f, 222.0f, 195.3137f, 222.0f, 192.0f),
                    PathNode.LineTo(222.0f, 168.0f),
                    PathNode.CurveTo(222.0f, 164.6863f, 219.3137f, 162.0f, 216.0f, 162.0f),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
