package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorLightIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.69f, 116.41f),
                    PathNode.CurveTo(188.08057f, 105.37217f, 193.304f, 87.23556f, 187.83565f, 70.76625f),
                    PathNode.CurveTo(182.3673f, 54.296947f, 167.33324f, 42.886505f, 150.0f, 42.05f),
                    PathNode.LineTo(150.0f, 24.0f),
                    PathNode.CurveTo(150.0f, 20.68629f, 147.3137f, 18.0f, 144.0f, 18.0f),
                    PathNode.CurveTo(140.6863f, 18.0f, 138.0f, 20.68629f, 138.0f, 24.0f),
                    PathNode.LineTo(138.0f, 42.0f),
                    PathNode.LineTo(118.0f, 42.0f),
                    PathNode.LineTo(118.0f, 24.0f),
                    PathNode.CurveTo(118.0f, 20.68629f, 115.313705f, 18.0f, 112.0f, 18.0f),
                    PathNode.CurveTo(108.686295f, 18.0f, 106.0f, 20.68629f, 106.0f, 24.0f),
                    PathNode.LineTo(106.0f, 42.0f),
                    PathNode.LineTo(72.0f, 42.0f),
                    PathNode.CurveTo(68.686295f, 42.0f, 66.0f, 44.68629f, 66.0f, 48.0f),
                    PathNode.CurveTo(66.0f, 51.31371f, 68.686295f, 54.0f, 72.0f, 54.0f),
                    PathNode.LineTo(82.0f, 54.0f),
                    PathNode.LineTo(82.0f, 194.0f),
                    PathNode.LineTo(72.0f, 194.0f),
                    PathNode.CurveTo(68.686295f, 194.0f, 66.0f, 196.6863f, 66.0f, 200.0f),
                    PathNode.CurveTo(66.0f, 203.3137f, 68.686295f, 206.0f, 72.0f, 206.0f),
                    PathNode.LineTo(106.0f, 206.0f),
                    PathNode.LineTo(106.0f, 224.0f),
                    PathNode.CurveTo(106.0f, 227.3137f, 108.686295f, 230.0f, 112.0f, 230.0f),
                    PathNode.CurveTo(115.313705f, 230.0f, 118.0f, 227.3137f, 118.0f, 224.0f),
                    PathNode.LineTo(118.0f, 206.0f),
                    PathNode.LineTo(138.0f, 206.0f),
                    PathNode.LineTo(138.0f, 224.0f),
                    PathNode.CurveTo(138.0f, 227.3137f, 140.6863f, 230.0f, 144.0f, 230.0f),
                    PathNode.CurveTo(147.3137f, 230.0f, 150.0f, 227.3137f, 150.0f, 224.0f),
                    PathNode.LineTo(150.0f, 206.0f),
                    PathNode.LineTo(160.0f, 206.0f),
                    PathNode.CurveTo(182.5308f, 205.99808f, 201.7442f, 189.67708f, 205.38988f, 167.44319f),
                    PathNode.CurveTo(209.03555f, 145.2093f, 196.04037f, 123.60709f, 174.69f, 116.41f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 84.0f),
                    PathNode.CurveTo(178.0f, 100.56854f, 164.56854f, 114.0f, 148.0f, 114.0f),
                    PathNode.LineTo(94.0f, 114.0f),
                    PathNode.LineTo(94.0f, 54.0f),
                    PathNode.LineTo(148.0f, 54.0f),
                    PathNode.CurveTo(164.56854f, 54.0f, 178.0f, 67.43146f, 178.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 194.0f),
                    PathNode.LineTo(94.0f, 194.0f),
                    PathNode.LineTo(94.0f, 126.0f),
                    PathNode.LineTo(160.0f, 126.0f),
                    PathNode.CurveTo(178.77768f, 126.0f, 194.0f, 141.22232f, 194.0f, 160.0f),
                    PathNode.CurveTo(194.0f, 178.77768f, 178.77768f, 194.0f, 160.0f, 194.0f),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
