package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorBoldIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 108.000 C 99.281 108.000 76.000 131.281 76.000 160.000 C 76.000 188.719 99.281 212.000 128.000 212.000 C 156.719 212.000 180.000 188.719 180.000 160.000 C 179.967 131.295 156.705 108.033 128.000 108.000 ZM 128.000 188.000 C 112.536 188.000 100.000 175.464 100.000 160.000 C 100.000 144.536 112.536 132.000 128.000 132.000 C 143.464 132.000 156.000 144.536 156.000 160.000 C 156.000 175.464 143.464 188.000 128.000 188.000 ZM 214.760 129.320 L 185.000 45.170 C 176.968 20.780 154.306 4.205 128.629 3.941 C 102.952 3.676 79.953 19.781 71.420 44.000 L 71.420 44.000 L 41.920 127.460 C 27.569 165.510 39.901 208.468 72.250 233.111 C 104.600 257.755 149.291 258.236 182.163 234.294 C 215.035 210.353 228.289 167.670 214.760 129.320 ZM 128.000 228.000 C 105.651 227.984 84.734 216.995 72.041 198.600 C 59.347 180.205 56.495 156.751 64.410 135.850 C 64.410 135.760 64.480 135.670 64.510 135.590 L 94.050 52.000 L 94.050 52.000 C 99.176 37.457 112.995 27.794 128.414 27.970 C 143.833 28.146 157.428 38.123 162.220 52.780 L 162.310 53.050 L 192.130 137.330 C 199.491 158.146 196.287 181.240 183.537 199.267 C 170.787 217.293 150.079 228.007 128.000 228.000 Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
