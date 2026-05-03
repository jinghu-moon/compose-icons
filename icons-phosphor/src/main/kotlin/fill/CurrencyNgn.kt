package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorFillIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 143.550 136.000 L 160.000 136.000 L 160.000 159.000 ZM 96.000 120.000 L 112.450 120.000 L 96.000 97.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 200.000 128.000 C 200.000 123.582 196.418 120.000 192.000 120.000 L 176.000 120.000 L 176.000 72.000 C 176.000 67.582 172.418 64.000 168.000 64.000 C 163.582 64.000 160.000 67.582 160.000 72.000 L 160.000 120.000 L 132.120 120.000 L 94.510 67.350 C 92.489 64.520 88.870 63.320 85.559 64.381 C 82.247 65.443 80.000 68.522 80.000 72.000 L 80.000 120.000 L 64.000 120.000 C 59.582 120.000 56.000 123.582 56.000 128.000 C 56.000 132.418 59.582 136.000 64.000 136.000 L 80.000 136.000 L 80.000 184.000 C 80.000 188.418 83.582 192.000 88.000 192.000 C 92.418 192.000 96.000 188.418 96.000 184.000 L 96.000 136.000 L 123.880 136.000 L 161.490 188.650 C 162.992 190.752 165.416 192.000 168.000 192.000 C 168.828 192.002 169.652 191.874 170.440 191.620 C 173.753 190.559 176.001 187.479 176.000 184.000 L 176.000 136.000 L 192.000 136.000 C 196.418 136.000 200.000 132.418 200.000 128.000 Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
