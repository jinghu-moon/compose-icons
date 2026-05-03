package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorDuotoneIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 160.000 C 200.000 182.091 182.091 200.000 160.000 200.000 L 88.000 200.000 L 88.000 48.000 L 148.000 48.000 C 167.882 48.000 184.000 64.118 184.000 84.000 C 184.000 103.882 167.882 120.000 148.000 120.000 L 160.000 120.000 C 182.091 120.000 200.000 137.909 200.000 160.000 Z"),
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
        pathData = parseSvgPathData("M 178.480 115.700 C 190.880 103.761 195.179 85.687 189.482 69.444 C 183.786 53.200 169.141 41.770 152.000 40.190 L 152.000 24.000 C 152.000 19.582 148.418 16.000 144.000 16.000 C 139.582 16.000 136.000 19.582 136.000 24.000 L 136.000 40.000 L 120.000 40.000 L 120.000 24.000 C 120.000 19.582 116.418 16.000 112.000 16.000 C 107.582 16.000 104.000 19.582 104.000 24.000 L 104.000 40.000 L 72.000 40.000 C 67.582 40.000 64.000 43.582 64.000 48.000 C 64.000 52.418 67.582 56.000 72.000 56.000 L 80.000 56.000 L 80.000 192.000 L 72.000 192.000 C 67.582 192.000 64.000 195.582 64.000 200.000 C 64.000 204.418 67.582 208.000 72.000 208.000 L 104.000 208.000 L 104.000 224.000 C 104.000 228.418 107.582 232.000 112.000 232.000 C 116.418 232.000 120.000 228.418 120.000 224.000 L 120.000 208.000 L 136.000 208.000 L 136.000 224.000 C 136.000 228.418 139.582 232.000 144.000 232.000 C 148.418 232.000 152.000 228.418 152.000 224.000 L 152.000 208.000 L 160.000 208.000 C 182.877 208.000 202.575 191.855 207.066 169.423 C 211.557 146.992 199.594 124.508 178.480 115.700 ZM 96.000 56.000 L 148.000 56.000 C 163.464 56.000 176.000 68.536 176.000 84.000 C 176.000 99.464 163.464 112.000 148.000 112.000 L 96.000 112.000 ZM 160.000 192.000 L 96.000 192.000 L 96.000 128.000 L 160.000 128.000 C 177.673 128.000 192.000 142.327 192.000 160.000 C 192.000 177.673 177.673 192.000 160.000 192.000 Z"),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
