package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorBoldIcon(
            name = "CurrencyCircleDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 172.000 148.000 C 172.000 165.673 157.673 180.000 140.000 180.000 L 140.000 184.000 C 140.000 190.627 134.627 196.000 128.000 196.000 C 121.373 196.000 116.000 190.627 116.000 184.000 L 116.000 180.000 L 104.000 180.000 C 97.373 180.000 92.000 174.627 92.000 168.000 C 92.000 161.373 97.373 156.000 104.000 156.000 L 140.000 156.000 C 144.418 156.000 148.000 152.418 148.000 148.000 C 148.000 143.582 144.418 140.000 140.000 140.000 L 116.000 140.000 C 98.327 140.000 84.000 125.673 84.000 108.000 C 84.000 90.327 98.327 76.000 116.000 76.000 L 116.000 72.000 C 116.000 65.373 121.373 60.000 128.000 60.000 C 134.627 60.000 140.000 65.373 140.000 72.000 L 140.000 76.000 L 152.000 76.000 C 158.627 76.000 164.000 81.373 164.000 88.000 C 164.000 94.627 158.627 100.000 152.000 100.000 L 116.000 100.000 C 111.582 100.000 108.000 103.582 108.000 108.000 C 108.000 112.418 111.582 116.000 116.000 116.000 L 140.000 116.000 C 157.673 116.000 172.000 130.327 172.000 148.000 Z"),
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
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
