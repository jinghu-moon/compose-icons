package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorBoldIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 124.000 L 223.830 124.000 L 243.120 76.520 C 245.405 70.427 242.417 63.624 236.386 61.183 C 230.354 58.742 223.476 61.553 220.880 67.520 L 197.880 124.030 L 162.080 124.030 L 139.080 67.520 C 137.244 62.993 132.846 60.031 127.960 60.031 C 123.074 60.031 118.676 62.993 116.840 67.520 L 93.920 124.000 L 58.080 124.000 L 35.080 67.490 C 32.484 61.523 25.606 58.712 19.574 61.153 C 13.543 63.594 10.555 70.397 12.840 76.490 L 32.170 124.000 L 16.000 124.000 C 9.373 124.000 4.000 129.373 4.000 136.000 C 4.000 142.627 9.373 148.000 16.000 148.000 L 41.920 148.000 L 64.920 204.520 C 66.756 209.047 71.154 212.009 76.040 212.009 C 80.926 212.009 85.324 209.047 87.160 204.520 L 110.160 148.000 L 146.000 148.000 L 169.000 204.520 C 170.836 209.047 175.234 212.009 180.120 212.009 C 185.006 212.009 189.404 209.047 191.240 204.520 L 214.240 148.000 L 240.000 148.000 C 246.627 148.000 252.000 142.627 252.000 136.000 C 252.000 129.373 246.627 124.000 240.000 124.000 ZM 76.000 168.120 L 67.830 148.000 L 84.170 148.000 ZM 119.830 124.000 L 128.000 103.890 L 136.170 124.000 ZM 180.000 168.120 L 171.830 148.000 L 188.170 148.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
