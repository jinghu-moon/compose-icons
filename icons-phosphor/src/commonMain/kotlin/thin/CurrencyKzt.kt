package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorThinIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.CurveTo(204.0f, 98.20914f, 202.20914f, 100.0f, 200.0f, 100.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(125.79086f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 100.0f),
                    PathNode.LineTo(56.0f, 100.0f),
                    PathNode.CurveTo(53.79086f, 100.0f, 52.0f, 98.20914f, 52.0f, 96.0f),
                    PathNode.CurveTo(52.0f, 93.79086f, 53.79086f, 92.0f, 56.0f, 92.0f),
                    PathNode.LineTo(200.0f, 92.0f),
                    PathNode.CurveTo(202.20914f, 92.0f, 204.0f, 93.79086f, 204.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(202.20914f, 60.0f, 204.0f, 58.20914f, 204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 53.79086f, 202.20914f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(56.0f, 52.0f),
                    PathNode.CurveTo(53.79086f, 52.0f, 52.0f, 53.79086f, 52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 58.20914f, 53.79086f, 60.0f, 56.0f, 60.0f),
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
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
