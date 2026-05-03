package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorThinIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 80.0f),
                    PathNode.CurveTo(204.0f, 82.20914f, 202.20914f, 84.0f, 200.0f, 84.0f),
                    PathNode.LineTo(163.42f, 84.0f),
                    PathNode.CurveTo(163.80095f, 86.64974f, 163.99477f, 89.32302f, 164.0f, 92.0f),
                    PathNode.CurveTo(163.96693f, 122.91424f, 138.91423f, 147.96693f, 108.0f, 148.0f),
                    PathNode.LineTo(82.35f, 148.0f),
                    PathNode.LineTo(162.69f, 221.0f),
                    PathNode.CurveTo(163.76758f, 221.95595f, 164.24792f, 223.41747f, 163.94757f, 224.8263f),
                    PathNode.CurveTo(163.64722f, 226.23512f, 162.61255f, 227.37364f, 161.23878f, 227.80698f),
                    PathNode.CurveTo(159.865f, 228.24031f, 158.36435f, 227.9015f, 157.31f, 226.92f),
                    PathNode.LineTo(69.31f, 146.92f),
                    PathNode.CurveTo(68.1171f, 145.80338f, 67.7233f, 144.07346f, 68.315315f, 142.55049f),
                    PathNode.CurveTo(68.907326f, 141.02754f, 70.36613f, 140.01778f, 72.0f, 140.0f),
                    PathNode.LineTo(108.0f, 140.0f),
                    PathNode.CurveTo(122.127495f, 139.99745f, 135.53647f, 133.77144f, 144.65475f, 122.98057f),
                    PathNode.CurveTo(153.77304f, 112.1897f, 157.67458f, 97.9299f, 155.32f, 84.0f),
                    PathNode.LineTo(72.0f, 84.0f),
                    PathNode.CurveTo(69.79086f, 84.0f, 68.0f, 82.20914f, 68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 77.79086f, 69.79086f, 76.0f, 72.0f, 76.0f),
                    PathNode.LineTo(153.25f, 76.0f),
                    PathNode.CurveTo(146.44757f, 56.840473f, 128.33125f, 44.02894f, 108.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(69.79086f, 44.0f, 68.0f, 42.20914f, 68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 37.79086f, 69.79086f, 36.0f, 72.0f, 36.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.CurveTo(202.20914f, 36.0f, 204.0f, 37.79086f, 204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 42.20914f, 202.20914f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(136.81f, 44.0f),
                    PathNode.CurveTo(148.78127f, 51.20892f, 157.63994f, 62.616467f, 161.66f, 76.0f),
                    PathNode.LineTo(200.0f, 76.0f),
                    PathNode.CurveTo(202.20914f, 76.0f, 204.0f, 77.79086f, 204.0f, 80.0f),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
