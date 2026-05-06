package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorThinIcon(
            name = "CurrencyCircleDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM164 148c0 13.255-10.745 24-24 24h-8v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h36c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16h-24C102.745 132 92 121.255 92 108 92 94.745 102.745 84 116 84h8v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-36c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16h24c13.255 0 24 10.745 24 24Z"),
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
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
