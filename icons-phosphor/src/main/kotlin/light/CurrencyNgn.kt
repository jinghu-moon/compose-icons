package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorLightIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 138.000 L 198.000 138.000 L 198.000 118.000 L 216.000 118.000 C 219.314 118.000 222.000 115.314 222.000 112.000 C 222.000 108.686 219.314 106.000 216.000 106.000 L 198.000 106.000 L 198.000 46.000 C 198.000 42.686 195.314 40.000 192.000 40.000 C 188.686 40.000 186.000 42.686 186.000 46.000 L 186.000 106.000 L 118.440 106.000 L 68.730 42.310 C 67.154 40.291 64.471 39.495 62.049 40.328 C 59.627 41.161 58.001 43.439 58.000 46.000 L 58.000 106.000 L 40.000 106.000 C 36.686 106.000 34.000 108.686 34.000 112.000 C 34.000 115.314 36.686 118.000 40.000 118.000 L 58.000 118.000 L 58.000 138.000 L 40.000 138.000 C 36.686 138.000 34.000 140.686 34.000 144.000 C 34.000 147.314 36.686 150.000 40.000 150.000 L 58.000 150.000 L 58.000 210.000 C 58.000 213.314 60.686 216.000 64.000 216.000 C 67.314 216.000 70.000 213.314 70.000 210.000 L 70.000 150.000 L 137.560 150.000 L 187.270 213.690 C 188.846 215.709 191.529 216.505 193.951 215.672 C 196.373 214.839 197.999 212.561 198.000 210.000 L 198.000 150.000 L 216.000 150.000 C 219.314 150.000 222.000 147.314 222.000 144.000 C 222.000 140.686 219.314 138.000 216.000 138.000 ZM 186.000 118.000 L 186.000 138.000 L 143.420 138.000 L 127.810 118.000 ZM 70.000 63.440 L 103.220 106.000 L 70.000 106.000 ZM 70.000 138.000 L 70.000 118.000 L 112.580 118.000 L 128.190 138.000 ZM 186.000 192.560 L 152.780 150.000 L 186.000 150.000 Z"),
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
