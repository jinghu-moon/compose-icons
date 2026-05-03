package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorDuotoneIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 160.000 92.000 C 160.000 120.719 136.719 144.000 108.000 144.000 L 72.000 144.000 L 72.000 40.000 L 108.000 40.000 C 136.719 40.000 160.000 63.281 160.000 92.000 Z"),
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
        pathData = parseSvgPathData("M 208.000 80.000 C 208.000 84.418 204.418 88.000 200.000 88.000 L 167.850 88.000 C 167.940 89.320 168.000 90.650 168.000 92.000 C 167.961 125.121 141.121 151.961 108.000 152.000 L 92.690 152.000 L 165.380 218.080 C 167.535 219.992 168.496 222.915 167.895 225.733 C 167.294 228.550 165.225 230.827 162.478 231.694 C 159.730 232.561 156.729 231.883 154.620 229.920 L 66.620 149.920 C 64.174 147.697 63.347 144.199 64.539 141.116 C 65.730 138.033 68.695 136.000 72.000 136.000 L 108.000 136.000 C 132.289 135.972 151.972 116.289 152.000 92.000 C 152.000 90.650 151.930 89.320 151.810 88.000 L 72.000 88.000 C 67.582 88.000 64.000 84.418 64.000 80.000 C 64.000 75.582 67.582 72.000 72.000 72.000 L 147.170 72.000 C 139.657 57.278 124.528 48.008 108.000 48.000 L 72.000 48.000 C 67.582 48.000 64.000 44.418 64.000 40.000 C 64.000 35.582 67.582 32.000 72.000 32.000 L 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 C 208.000 44.418 204.418 48.000 200.000 48.000 L 148.740 48.000 C 155.876 54.603 161.305 62.839 164.560 72.000 L 200.000 72.000 C 204.418 72.000 208.000 75.582 208.000 80.000 Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
