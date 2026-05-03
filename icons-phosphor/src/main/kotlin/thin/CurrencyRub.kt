package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorThinIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 36.000 L 88.000 36.000 C 85.791 36.000 84.000 37.791 84.000 40.000 L 84.000 140.000 L 56.000 140.000 C 53.791 140.000 52.000 141.791 52.000 144.000 C 52.000 146.209 53.791 148.000 56.000 148.000 L 84.000 148.000 L 84.000 172.000 L 56.000 172.000 C 53.791 172.000 52.000 173.791 52.000 176.000 C 52.000 178.209 53.791 180.000 56.000 180.000 L 84.000 180.000 L 84.000 216.000 C 84.000 218.209 85.791 220.000 88.000 220.000 C 90.209 220.000 92.000 218.209 92.000 216.000 L 92.000 180.000 L 144.000 180.000 C 146.209 180.000 148.000 178.209 148.000 176.000 C 148.000 173.791 146.209 172.000 144.000 172.000 L 92.000 172.000 L 92.000 148.000 L 148.000 148.000 C 178.928 148.000 204.000 122.928 204.000 92.000 C 204.000 61.072 178.928 36.000 148.000 36.000 ZM 148.000 140.000 L 92.000 140.000 L 92.000 44.000 L 148.000 44.000 C 174.510 44.000 196.000 65.490 196.000 92.000 C 196.000 118.510 174.510 140.000 148.000 140.000 Z"),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
