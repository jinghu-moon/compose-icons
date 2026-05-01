package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorThinIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 53.79086f, 61.79086f, 52.0f, 64.0f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.CurveTo(194.20914f, 52.0f, 196.0f, 53.79086f, 196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 58.20914f, 194.20914f, 60.0f, 192.0f, 60.0f),
                    PathNode.LineTo(64.0f, 60.0f),
                    PathNode.CurveTo(61.79086f, 60.0f, 60.0f, 58.20914f, 60.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 164.0f),
                    PathNode.CurveTo(213.79086f, 164.0f, 212.0f, 165.79086f, 212.0f, 168.0f),
                    PathNode.LineTo(212.0f, 188.0f),
                    PathNode.LineTo(176.0f, 188.0f),
                    PathNode.CurveTo(164.9543f, 188.0f, 156.0f, 179.0457f, 156.0f, 168.0f),
                    PathNode.LineTo(156.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(210.20914f, 116.0f, 212.0f, 114.20914f, 212.0f, 112.0f),
                    PathNode.CurveTo(212.0f, 109.79086f, 210.20914f, 108.0f, 208.0f, 108.0f),
                    PathNode.LineTo(48.0f, 108.0f),
                    PathNode.CurveTo(45.79086f, 108.0f, 44.0f, 109.79086f, 44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 114.20914f, 45.79086f, 116.0f, 48.0f, 116.0f),
                    PathNode.LineTo(100.0f, 116.0f),
                    PathNode.LineTo(100.0f, 128.0f),
                    PathNode.CurveTo(99.961426f, 161.1211f, 73.12109f, 187.96143f, 40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.CurveTo(77.53937f, 195.96141f, 107.96142f, 165.53935f, 108.0f, 128.0f),
                    PathNode.LineTo(108.0f, 116.0f),
                    PathNode.LineTo(148.0f, 116.0f),
                    PathNode.LineTo(148.0f, 168.0f),
                    PathNode.CurveTo(148.0f, 183.46397f, 160.53603f, 196.0f, 176.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(218.20914f, 196.0f, 220.0f, 194.20914f, 220.0f, 192.0f),
                    PathNode.LineTo(220.0f, 168.0f),
                    PathNode.CurveTo(220.0f, 165.79086f, 218.20914f, 164.0f, 216.0f, 164.0f),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
