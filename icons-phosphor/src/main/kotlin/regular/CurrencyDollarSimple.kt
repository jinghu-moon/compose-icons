package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorRegularIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(199.97244f, 194.49825f, 178.49825f, 215.97244f, 152.0f, 216.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.CurveTo(77.501755f, 215.97244f, 56.02756f, 194.49825f, 56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 163.58173f, 59.581722f, 160.0f, 64.0f, 160.0f),
                    PathNode.CurveTo(68.41828f, 160.0f, 72.0f, 163.58173f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 185.67311f, 86.32689f, 200.0f, 104.0f, 200.0f),
                    PathNode.LineTo(152.0f, 200.0f),
                    PathNode.CurveTo(169.67311f, 200.0f, 184.0f, 185.67311f, 184.0f, 168.0f),
                    PathNode.CurveTo(184.0f, 150.32689f, 169.67311f, 136.0f, 152.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(85.49033f, 136.0f, 64.0f, 114.50967f, 64.0f, 88.0f),
                    PathNode.CurveTo(64.0f, 61.490334f, 85.49033f, 40.0f, 112.0f, 40.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 123.58172f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(132.41827f, 16.0f, 136.0f, 19.581722f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(170.49825f, 40.02756f, 191.97244f, 61.501755f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 92.41828f, 188.41827f, 96.0f, 184.0f, 96.0f),
                    PathNode.CurveTo(179.58173f, 96.0f, 176.0f, 92.41828f, 176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 70.32689f, 161.67311f, 56.0f, 144.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(94.32689f, 56.0f, 80.0f, 70.32689f, 80.0f, 88.0f),
                    PathNode.CurveTo(80.0f, 105.67311f, 94.32689f, 120.0f, 112.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(178.49825f, 120.02756f, 199.97244f, 141.50175f, 200.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
