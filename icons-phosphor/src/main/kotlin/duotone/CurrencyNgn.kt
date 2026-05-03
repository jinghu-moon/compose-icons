package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorDuotoneIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 112.000 L 192.000 210.000 L 140.490 144.000 L 64.000 144.000 L 64.000 46.000 L 115.510 112.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 216.000 136.000 L 200.000 136.000 L 200.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 116.418 224.000 112.000 C 224.000 107.582 220.418 104.000 216.000 104.000 L 200.000 104.000 L 200.000 46.000 C 200.000 41.582 196.418 38.000 192.000 38.000 C 187.582 38.000 184.000 41.582 184.000 46.000 L 184.000 104.000 L 119.420 104.000 L 70.310 41.080 C 68.210 38.385 64.630 37.322 61.399 38.432 C 58.168 39.543 55.999 42.583 56.000 46.000 L 56.000 104.000 L 40.000 104.000 C 35.582 104.000 32.000 107.582 32.000 112.000 C 32.000 116.418 35.582 120.000 40.000 120.000 L 56.000 120.000 L 56.000 136.000 L 40.000 136.000 C 35.582 136.000 32.000 139.582 32.000 144.000 C 32.000 148.418 35.582 152.000 40.000 152.000 L 56.000 152.000 L 56.000 210.000 C 56.000 214.418 59.582 218.000 64.000 218.000 C 68.418 218.000 72.000 214.418 72.000 210.000 L 72.000 152.000 L 136.580 152.000 L 185.690 214.920 C 187.206 216.864 189.534 218.001 192.000 218.000 C 192.885 218.002 193.765 217.853 194.600 217.560 C 197.829 216.450 199.998 213.414 200.000 210.000 L 200.000 152.000 L 216.000 152.000 C 220.418 152.000 224.000 148.418 224.000 144.000 C 224.000 139.582 220.418 136.000 216.000 136.000 ZM 184.000 120.000 L 184.000 136.000 L 144.390 136.000 L 131.900 120.000 ZM 72.000 69.250 L 99.120 104.000 L 72.000 104.000 ZM 72.000 136.000 L 72.000 120.000 L 111.610 120.000 L 124.100 136.000 ZM 184.000 186.750 L 156.880 152.000 L 184.000 152.000 Z"),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
