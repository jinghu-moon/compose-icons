package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorThinIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 60.000 56.000 C 60.000 53.791 61.791 52.000 64.000 52.000 L 192.000 52.000 C 194.209 52.000 196.000 53.791 196.000 56.000 C 196.000 58.209 194.209 60.000 192.000 60.000 L 64.000 60.000 C 61.791 60.000 60.000 58.209 60.000 56.000 ZM 216.000 164.000 C 213.791 164.000 212.000 165.791 212.000 168.000 L 212.000 188.000 L 176.000 188.000 C 164.954 188.000 156.000 179.046 156.000 168.000 L 156.000 116.000 L 208.000 116.000 C 210.209 116.000 212.000 114.209 212.000 112.000 C 212.000 109.791 210.209 108.000 208.000 108.000 L 48.000 108.000 C 45.791 108.000 44.000 109.791 44.000 112.000 C 44.000 114.209 45.791 116.000 48.000 116.000 L 100.000 116.000 L 100.000 128.000 C 99.961 161.121 73.121 187.961 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 C 77.539 195.961 107.961 165.539 108.000 128.000 L 108.000 116.000 L 148.000 116.000 L 148.000 168.000 C 148.000 183.464 160.536 196.000 176.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 L 220.000 168.000 C 220.000 165.791 218.209 164.000 216.000 164.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
