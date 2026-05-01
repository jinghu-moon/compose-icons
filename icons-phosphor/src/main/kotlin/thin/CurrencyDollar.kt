package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorThinIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 124.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(132.0f, 52.0f),
                    PathNode.LineTo(144.0f, 52.0f),
                    PathNode.CurveTo(163.88223f, 52.0f, 180.0f, 68.11775f, 180.0f, 88.0f),
                    PathNode.CurveTo(180.0f, 90.20914f, 181.79086f, 92.0f, 184.0f, 92.0f),
                    PathNode.CurveTo(186.20914f, 92.0f, 188.0f, 90.20914f, 188.0f, 88.0f),
                    PathNode.CurveTo(187.97244f, 63.71089f, 168.28911f, 44.027554f, 144.0f, 44.0f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.LineTo(112.0f, 44.0f),
                    PathNode.CurveTo(87.69947f, 44.0f, 68.0f, 63.69947f, 68.0f, 88.0f),
                    PathNode.CurveTo(68.0f, 112.30053f, 87.69947f, 132.0f, 112.0f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 204.0f),
                    PathNode.LineTo(104.0f, 204.0f),
                    PathNode.CurveTo(84.11775f, 204.0f, 68.0f, 187.88223f, 68.0f, 168.0f),
                    PathNode.CurveTo(68.0f, 165.79086f, 66.20914f, 164.0f, 64.0f, 164.0f),
                    PathNode.CurveTo(61.79086f, 164.0f, 60.0f, 165.79086f, 60.0f, 168.0f),
                    PathNode.CurveTo(60.027554f, 192.28911f, 79.71089f, 211.97244f, 104.0f, 212.0f),
                    PathNode.LineTo(124.0f, 212.0f),
                    PathNode.LineTo(124.0f, 232.0f),
                    PathNode.CurveTo(124.0f, 234.20914f, 125.79086f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(130.20914f, 236.0f, 132.0f, 234.20914f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 212.0f),
                    PathNode.LineTo(152.0f, 212.0f),
                    PathNode.CurveTo(176.30052f, 212.0f, 196.0f, 192.30052f, 196.0f, 168.0f),
                    PathNode.CurveTo(196.0f, 143.69948f, 176.30052f, 124.0f, 152.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 124.0f),
                    PathNode.CurveTo(92.11775f, 124.0f, 76.0f, 107.88225f, 76.0f, 88.0f),
                    PathNode.CurveTo(76.0f, 68.11775f, 92.11775f, 52.0f, 112.0f, 52.0f),
                    PathNode.LineTo(124.0f, 52.0f),
                    PathNode.LineTo(124.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 204.0f),
                    PathNode.LineTo(132.0f, 204.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(152.0f, 132.0f),
                    PathNode.CurveTo(171.88223f, 132.0f, 188.0f, 148.11777f, 188.0f, 168.0f),
                    PathNode.CurveTo(188.0f, 187.88223f, 171.88223f, 204.0f, 152.0f, 204.0f),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
