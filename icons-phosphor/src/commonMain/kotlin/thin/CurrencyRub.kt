package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorThinIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 36.0f),
                    PathNode.LineTo(88.0f, 36.0f),
                    PathNode.CurveTo(85.79086f, 36.0f, 84.0f, 37.79086f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(53.79086f, 140.0f, 52.0f, 141.79086f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 146.20914f, 53.79086f, 148.0f, 56.0f, 148.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.LineTo(84.0f, 172.0f),
                    PathNode.LineTo(56.0f, 172.0f),
                    PathNode.CurveTo(53.79086f, 172.0f, 52.0f, 173.79086f, 52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 178.20914f, 53.79086f, 180.0f, 56.0f, 180.0f),
                    PathNode.LineTo(84.0f, 180.0f),
                    PathNode.LineTo(84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 218.20914f, 85.79086f, 220.0f, 88.0f, 220.0f),
                    PathNode.CurveTo(90.20914f, 220.0f, 92.0f, 218.20914f, 92.0f, 216.0f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.LineTo(144.0f, 180.0f),
                    PathNode.CurveTo(146.20914f, 180.0f, 148.0f, 178.20914f, 148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 173.79086f, 146.20914f, 172.0f, 144.0f, 172.0f),
                    PathNode.LineTo(92.0f, 172.0f),
                    PathNode.LineTo(92.0f, 148.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.CurveTo(178.92795f, 148.0f, 204.0f, 122.92794f, 204.0f, 92.0f),
                    PathNode.CurveTo(204.0f, 61.072056f, 178.92795f, 36.0f, 148.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.LineTo(92.0f, 44.0f),
                    PathNode.LineTo(148.0f, 44.0f),
                    PathNode.CurveTo(174.50967f, 44.0f, 196.0f, 65.49033f, 196.0f, 92.0f),
                    PathNode.CurveTo(196.0f, 118.50967f, 174.50967f, 140.0f, 148.0f, 140.0f),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
