package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorThinIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 140.0f),
                    PathNode.LineTo(196.0f, 140.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(218.20914f, 116.0f, 220.0f, 114.20914f, 220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 109.79086f, 218.20914f, 108.0f, 216.0f, 108.0f),
                    PathNode.LineTo(196.0f, 108.0f),
                    PathNode.LineTo(196.0f, 46.0f),
                    PathNode.CurveTo(196.0f, 43.79086f, 194.20914f, 42.0f, 192.0f, 42.0f),
                    PathNode.CurveTo(189.79086f, 42.0f, 188.0f, 43.79086f, 188.0f, 46.0f),
                    PathNode.LineTo(188.0f, 108.0f),
                    PathNode.LineTo(117.46f, 108.0f),
                    PathNode.LineTo(67.15f, 43.54f),
                    PathNode.CurveTo(66.09879f, 42.196808f, 64.31149f, 41.667953f, 62.698643f, 42.222862f),
                    PathNode.CurveTo(61.085793f, 42.777775f, 60.00224f, 44.29436f, 60.0f, 46.0f),
                    PathNode.LineTo(60.0f, 108.0f),
                    PathNode.LineTo(40.0f, 108.0f),
                    PathNode.CurveTo(37.79086f, 108.0f, 36.0f, 109.79086f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 114.20914f, 37.79086f, 116.0f, 40.0f, 116.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(37.79086f, 140.0f, 36.0f, 141.79086f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 146.20914f, 37.79086f, 148.0f, 40.0f, 148.0f),
                    PathNode.LineTo(60.0f, 148.0f),
                    PathNode.LineTo(60.0f, 210.0f),
                    PathNode.CurveTo(60.0f, 212.20914f, 61.79086f, 214.0f, 64.0f, 214.0f),
                    PathNode.CurveTo(66.20914f, 214.0f, 68.0f, 212.20914f, 68.0f, 210.0f),
                    PathNode.LineTo(68.0f, 148.0f),
                    PathNode.LineTo(138.54f, 148.0f),
                    PathNode.LineTo(188.85f, 212.46f),
                    PathNode.CurveTo(189.60709f, 213.43071f, 190.76897f, 213.99873f, 192.0f, 214.0f),
                    PathNode.CurveTo(192.44267f, 214.00098f, 192.8823f, 213.92657f, 193.3f, 213.78f),
                    PathNode.CurveTo(194.91438f, 213.2252f, 195.99878f, 211.70705f, 196.0f, 210.0f),
                    PathNode.LineTo(196.0f, 148.0f),
                    PathNode.LineTo(216.0f, 148.0f),
                    PathNode.CurveTo(218.20914f, 148.0f, 220.0f, 146.20914f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 141.79086f, 218.20914f, 140.0f, 216.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 116.0f),
                    PathNode.LineTo(188.0f, 140.0f),
                    PathNode.LineTo(142.44f, 140.0f),
                    PathNode.LineTo(123.71f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 57.63f),
                    PathNode.LineTo(107.32f, 108.0f),
                    PathNode.LineTo(68.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 140.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(113.56f, 116.0f),
                    PathNode.LineTo(132.29f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 198.37f),
                    PathNode.LineTo(148.68f, 148.0f),
                    PathNode.LineTo(188.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
