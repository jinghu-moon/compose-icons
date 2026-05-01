package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorThinIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(187.0f, 195.0f),
                    PathNode.CurveTo(187.70842f, 195.7902f, 188.07378f, 196.82956f, 188.01566f, 197.88924f),
                    PathNode.CurveTo(187.95749f, 198.9489f, 187.48062f, 199.94203f, 186.69f, 200.65f),
                    PathNode.CurveTo(164.89111f, 220.15977f, 133.82924f, 225.42567f, 106.818184f, 214.19064f),
                    PathNode.CurveTo(79.807144f, 202.9556f, 61.642483f, 177.21428f, 60.11f, 148.0f),
                    PathNode.LineTo(40.0f, 148.0f),
                    PathNode.CurveTo(37.79086f, 148.0f, 36.0f, 146.20914f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 141.79086f, 37.79086f, 140.0f, 40.0f, 140.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(37.79086f, 116.0f, 36.0f, 114.20914f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 109.79086f, 37.79086f, 108.0f, 40.0f, 108.0f),
                    PathNode.LineTo(60.11f, 108.0f),
                    PathNode.CurveTo(61.648655f, 78.79377f, 79.81007f, 53.061676f, 106.813354f, 41.828087f),
                    PathNode.CurveTo(133.81665f, 30.594494f, 164.87029f, 35.852722f, 186.67f, 55.35f),
                    PathNode.CurveTo(188.32686f, 56.8246f, 188.4746f, 59.363144f, 187.0f, 61.02f),
                    PathNode.CurveTo(185.5254f, 62.676853f, 182.98685f, 62.8246f, 181.33f, 61.35f),
                    PathNode.CurveTo(161.88622f, 43.96783f, 134.21375f, 39.23792f, 110.100395f, 49.175087f),
                    PathNode.CurveTo(85.98705f, 59.11226f, 69.681694f, 81.96554f, 68.13f, 108.0f),
                    PathNode.LineTo(136.0f, 108.0f),
                    PathNode.CurveTo(138.20914f, 108.0f, 140.0f, 109.79086f, 140.0f, 112.0f),
                    PathNode.CurveTo(140.0f, 114.20914f, 138.20914f, 116.0f, 136.0f, 116.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(68.0f, 140.0f),
                    PathNode.LineTo(120.0f, 140.0f),
                    PathNode.CurveTo(122.20914f, 140.0f, 124.0f, 141.79086f, 124.0f, 144.0f),
                    PathNode.CurveTo(124.0f, 146.20914f, 122.20914f, 148.0f, 120.0f, 148.0f),
                    PathNode.LineTo(68.13f, 148.0f),
                    PathNode.CurveTo(69.667496f, 174.04164f, 85.96747f, 196.9082f, 110.083664f, 206.85507f),
                    PathNode.CurveTo(134.19986f, 216.80193f, 161.88072f, 212.07552f, 181.33f, 194.69f),
                    PathNode.CurveTo(182.1212f, 193.97534f, 183.16496f, 193.60614f, 184.22955f, 193.66434f),
                    PathNode.CurveTo(185.29413f, 193.72255f, 186.29143f, 194.20335f, 187.0f, 195.0f),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
