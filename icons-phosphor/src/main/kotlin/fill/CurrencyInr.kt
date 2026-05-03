package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorFillIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 166.320 96.000 L 176.000 96.000 C 180.418 96.000 184.000 99.582 184.000 104.000 C 184.000 108.418 180.418 112.000 176.000 112.000 L 167.810 112.000 C 165.715 134.640 146.737 151.968 124.000 152.000 L 111.320 152.000 L 164.910 193.690 C 167.278 195.405 168.522 198.275 168.154 201.176 C 167.786 204.076 165.865 206.545 163.143 207.615 C 160.422 208.684 157.334 208.184 155.090 206.310 L 83.090 150.310 C 80.397 148.211 79.332 144.634 80.441 141.404 C 81.549 138.174 84.585 136.003 88.000 136.000 L 124.000 136.000 C 137.918 135.999 149.722 125.775 151.710 112.000 L 88.000 112.000 C 83.582 112.000 80.000 108.418 80.000 104.000 C 80.000 99.582 83.582 96.000 88.000 96.000 L 149.290 96.000 C 144.656 86.231 134.812 80.003 124.000 80.000 L 88.000 80.000 C 83.582 80.000 80.000 76.418 80.000 72.000 C 80.000 67.582 83.582 64.000 88.000 64.000 L 176.000 64.000 C 180.418 64.000 184.000 67.582 184.000 72.000 C 184.000 76.418 180.418 80.000 176.000 80.000 L 157.920 80.000 C 161.800 84.693 164.661 90.142 166.320 96.000 Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
