package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorThinIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 124.000 L 132.000 124.000 L 132.000 52.000 L 144.000 52.000 C 163.882 52.000 180.000 68.118 180.000 88.000 C 180.000 90.209 181.791 92.000 184.000 92.000 C 186.209 92.000 188.000 90.209 188.000 88.000 C 187.972 63.711 168.289 44.028 144.000 44.000 L 132.000 44.000 L 132.000 24.000 C 132.000 21.791 130.209 20.000 128.000 20.000 C 125.791 20.000 124.000 21.791 124.000 24.000 L 124.000 44.000 L 112.000 44.000 C 87.699 44.000 68.000 63.699 68.000 88.000 C 68.000 112.301 87.699 132.000 112.000 132.000 L 124.000 132.000 L 124.000 204.000 L 104.000 204.000 C 84.118 204.000 68.000 187.882 68.000 168.000 C 68.000 165.791 66.209 164.000 64.000 164.000 C 61.791 164.000 60.000 165.791 60.000 168.000 C 60.028 192.289 79.711 211.972 104.000 212.000 L 124.000 212.000 L 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 212.000 L 152.000 212.000 C 176.301 212.000 196.000 192.301 196.000 168.000 C 196.000 143.699 176.301 124.000 152.000 124.000 ZM 112.000 124.000 C 92.118 124.000 76.000 107.882 76.000 88.000 C 76.000 68.118 92.118 52.000 112.000 52.000 L 124.000 52.000 L 124.000 124.000 ZM 152.000 204.000 L 132.000 204.000 L 132.000 132.000 L 152.000 132.000 C 171.882 132.000 188.000 148.118 188.000 168.000 C 188.000 187.882 171.882 204.000 152.000 204.000 Z"),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
