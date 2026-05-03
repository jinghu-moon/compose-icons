package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorThinIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(203.1f, 50.53f),
                    PathNode.LineTo(136.44f, 132.0f),
                    PathNode.LineTo(176.0f, 132.0f),
                    PathNode.CurveTo(178.20914f, 132.0f, 180.0f, 133.79086f, 180.0f, 136.0f),
                    PathNode.CurveTo(180.0f, 138.20914f, 178.20914f, 140.0f, 176.0f, 140.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(132.0f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(178.20914f, 164.0f, 180.0f, 165.79086f, 180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 170.20914f, 178.20914f, 172.0f, 176.0f, 172.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(125.79086f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 172.0f),
                    PathNode.LineTo(80.0f, 172.0f),
                    PathNode.CurveTo(77.79086f, 172.0f, 76.0f, 170.20914f, 76.0f, 168.0f),
                    PathNode.CurveTo(76.0f, 165.79086f, 77.79086f, 164.0f, 80.0f, 164.0f),
                    PathNode.LineTo(124.0f, 164.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.LineTo(80.0f, 140.0f),
                    PathNode.CurveTo(77.79086f, 140.0f, 76.0f, 138.20914f, 76.0f, 136.0f),
                    PathNode.CurveTo(76.0f, 133.79086f, 77.79086f, 132.0f, 80.0f, 132.0f),
                    PathNode.LineTo(119.56f, 132.0f),
                    PathNode.LineTo(52.9f, 50.53f),
                    PathNode.CurveTo(51.50272f, 48.817917f, 51.757915f, 46.29728f, 53.47f, 44.9f),
                    PathNode.CurveTo(55.182083f, 43.50272f, 57.70272f, 43.757915f, 59.1f, 45.47f),
                    PathNode.LineTo(128.0f, 129.68f),
                    PathNode.LineTo(196.9f, 45.47f),
                    PathNode.CurveTo(198.29729f, 43.757915f, 200.81792f, 43.50272f, 202.53f, 44.9f),
                    PathNode.CurveTo(204.24208f, 46.29728f, 204.49728f, 48.817917f, 203.1f, 50.53f),
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
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
