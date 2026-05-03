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
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 164.000 148.000 C 164.000 161.255 153.255 172.000 140.000 172.000 L 132.000 172.000 L 132.000 184.000 C 132.000 186.209 130.209 188.000 128.000 188.000 C 125.791 188.000 124.000 186.209 124.000 184.000 L 124.000 172.000 L 104.000 172.000 C 101.791 172.000 100.000 170.209 100.000 168.000 C 100.000 165.791 101.791 164.000 104.000 164.000 L 140.000 164.000 C 148.837 164.000 156.000 156.837 156.000 148.000 C 156.000 139.163 148.837 132.000 140.000 132.000 L 116.000 132.000 C 102.745 132.000 92.000 121.255 92.000 108.000 C 92.000 94.745 102.745 84.000 116.000 84.000 L 124.000 84.000 L 124.000 72.000 C 124.000 69.791 125.791 68.000 128.000 68.000 C 130.209 68.000 132.000 69.791 132.000 72.000 L 132.000 84.000 L 152.000 84.000 C 154.209 84.000 156.000 85.791 156.000 88.000 C 156.000 90.209 154.209 92.000 152.000 92.000 L 116.000 92.000 C 107.163 92.000 100.000 99.163 100.000 108.000 C 100.000 116.837 107.163 124.000 116.000 124.000 L 140.000 124.000 C 153.255 124.000 164.000 134.745 164.000 148.000 Z"),
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
