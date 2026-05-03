package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorFillIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 168.000 184.000 L 88.000 184.000 C 83.582 184.000 80.000 180.418 80.000 176.000 C 80.000 171.582 83.582 168.000 88.000 168.000 C 96.837 168.000 104.000 160.837 104.000 152.000 L 104.000 136.000 L 88.000 136.000 C 83.582 136.000 80.000 132.418 80.000 128.000 C 80.000 123.582 83.582 120.000 88.000 120.000 L 104.000 120.000 L 104.000 96.000 C 104.000 81.710 111.624 68.505 124.000 61.360 C 136.376 54.215 151.624 54.215 164.000 61.360 C 167.696 63.627 168.914 68.426 166.745 72.181 C 164.576 75.936 159.811 77.279 156.000 75.210 C 148.574 70.922 139.424 70.923 131.998 75.211 C 124.572 79.500 119.998 87.425 120.000 96.000 L 120.000 120.000 L 136.000 120.000 C 140.418 120.000 144.000 123.582 144.000 128.000 C 144.000 132.418 140.418 136.000 136.000 136.000 L 120.000 136.000 L 120.000 152.000 C 120.007 157.621 118.519 163.143 115.690 168.000 L 168.000 168.000 C 172.418 168.000 176.000 171.582 176.000 176.000 C 176.000 180.418 172.418 184.000 168.000 184.000 Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
