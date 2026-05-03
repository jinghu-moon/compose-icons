package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorThinIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 168.000 C 195.972 192.289 176.289 211.972 152.000 212.000 L 132.000 212.000 L 132.000 232.000 C 132.000 234.209 130.209 236.000 128.000 236.000 C 125.791 236.000 124.000 234.209 124.000 232.000 L 124.000 212.000 L 104.000 212.000 C 79.711 211.972 60.028 192.289 60.000 168.000 C 60.000 165.791 61.791 164.000 64.000 164.000 C 66.209 164.000 68.000 165.791 68.000 168.000 C 68.000 187.882 84.118 204.000 104.000 204.000 L 152.000 204.000 C 171.882 204.000 188.000 187.882 188.000 168.000 C 188.000 148.118 171.882 132.000 152.000 132.000 L 112.000 132.000 C 87.699 132.000 68.000 112.301 68.000 88.000 C 68.000 63.699 87.699 44.000 112.000 44.000 L 124.000 44.000 L 124.000 24.000 C 124.000 21.791 125.791 20.000 128.000 20.000 C 130.209 20.000 132.000 21.791 132.000 24.000 L 132.000 44.000 L 144.000 44.000 C 168.289 44.028 187.972 63.711 188.000 88.000 C 188.000 90.209 186.209 92.000 184.000 92.000 C 181.791 92.000 180.000 90.209 180.000 88.000 C 180.000 68.118 163.882 52.000 144.000 52.000 L 112.000 52.000 C 92.118 52.000 76.000 68.118 76.000 88.000 C 76.000 107.882 92.118 124.000 112.000 124.000 L 152.000 124.000 C 176.289 124.028 195.972 143.711 196.000 168.000 Z"),
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
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
