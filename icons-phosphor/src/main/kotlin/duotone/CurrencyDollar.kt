package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorDuotoneIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 168.000 C 192.000 190.091 174.091 208.000 152.000 208.000 L 128.000 208.000 L 128.000 128.000 L 152.000 128.000 C 174.091 128.000 192.000 145.909 192.000 168.000 ZM 112.000 48.000 C 89.909 48.000 72.000 65.909 72.000 88.000 C 72.000 110.091 89.909 128.000 112.000 128.000 L 128.000 128.000 L 128.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 152.000 120.000 L 136.000 120.000 L 136.000 56.000 L 144.000 56.000 C 161.673 56.000 176.000 70.327 176.000 88.000 C 176.000 92.418 179.582 96.000 184.000 96.000 C 188.418 96.000 192.000 92.418 192.000 88.000 C 191.972 61.502 170.498 40.028 144.000 40.000 L 136.000 40.000 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 40.000 L 112.000 40.000 C 85.490 40.000 64.000 61.490 64.000 88.000 C 64.000 114.510 85.490 136.000 112.000 136.000 L 120.000 136.000 L 120.000 200.000 L 104.000 200.000 C 86.327 200.000 72.000 185.673 72.000 168.000 C 72.000 163.582 68.418 160.000 64.000 160.000 C 59.582 160.000 56.000 163.582 56.000 168.000 C 56.028 194.498 77.502 215.972 104.000 216.000 L 120.000 216.000 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 216.000 L 152.000 216.000 C 178.510 216.000 200.000 194.510 200.000 168.000 C 200.000 141.490 178.510 120.000 152.000 120.000 ZM 112.000 120.000 C 94.327 120.000 80.000 105.673 80.000 88.000 C 80.000 70.327 94.327 56.000 112.000 56.000 L 120.000 56.000 L 120.000 120.000 ZM 152.000 200.000 L 136.000 200.000 L 136.000 136.000 L 152.000 136.000 C 169.673 136.000 184.000 150.327 184.000 168.000 C 184.000 185.673 169.673 200.000 152.000 200.000 Z"),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
