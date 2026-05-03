package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorDuotoneIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 168.000 208.000 L 60.000 208.000 C 79.882 208.000 96.000 191.882 96.000 172.000 L 96.000 84.000 C 95.997 66.965 105.826 51.459 121.234 44.194 C 136.642 36.928 154.859 39.210 168.000 50.050 Z"),
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
        pathData = parseSvgPathData("M 192.000 208.000 C 192.000 212.418 188.418 216.000 184.000 216.000 L 56.000 216.000 C 51.582 216.000 48.000 212.418 48.000 208.000 C 48.000 203.582 51.582 200.000 56.000 200.000 L 60.000 200.000 C 75.464 200.000 88.000 187.464 88.000 172.000 L 88.000 136.000 L 56.000 136.000 C 51.582 136.000 48.000 132.418 48.000 128.000 C 48.000 123.582 51.582 120.000 56.000 120.000 L 88.000 120.000 L 88.000 84.000 C 88.000 63.873 99.616 45.553 117.821 36.968 C 136.026 28.384 157.550 31.076 173.080 43.880 C 175.347 45.679 176.466 48.563 176.005 51.420 C 175.544 54.277 173.576 56.663 170.858 57.658 C 168.141 58.654 165.097 58.104 162.900 56.220 C 152.148 47.356 137.246 45.493 124.643 51.437 C 112.040 57.382 103.999 70.065 104.000 84.000 L 104.000 120.000 L 136.000 120.000 C 140.418 120.000 144.000 123.582 144.000 128.000 C 144.000 132.418 140.418 136.000 136.000 136.000 L 104.000 136.000 L 104.000 172.000 C 104.009 182.223 100.443 192.128 93.920 200.000 L 184.000 200.000 C 188.418 200.000 192.000 203.582 192.000 208.000 Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
