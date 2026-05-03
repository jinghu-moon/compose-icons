package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorFillIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 64.000 L 72.000 64.000 C 32.254 64.044 0.044 96.254 0.000 136.000 C 0.000 146.568 6.897 155.899 17.000 159.000 C 23.060 179.370 54.630 192.000 72.000 192.000 C 91.001 191.977 107.373 178.612 111.200 160.000 L 144.800 160.000 C 148.627 178.612 164.999 191.977 184.000 192.000 C 201.330 192.000 232.900 179.340 239.000 159.000 C 249.103 155.899 256.000 146.568 256.000 136.000 C 255.956 96.254 223.746 64.044 184.000 64.000 ZM 89.000 169.000 C 85.876 172.122 80.814 172.122 77.690 169.000 L 53.140 144.450 C 50.152 141.305 50.215 136.351 53.283 133.283 C 56.351 130.215 61.305 130.152 64.450 133.140 L 89.000 157.650 C 90.511 159.152 91.361 161.194 91.361 163.325 C 91.361 165.456 90.511 167.498 89.000 169.000 ZM 208.520 168.510 C 205.396 171.632 200.334 171.632 197.210 168.510 L 171.800 143.110 C 168.674 139.984 168.674 134.916 171.800 131.790 C 174.926 128.664 179.994 128.664 183.120 131.790 L 208.520 157.200 C 211.611 160.331 211.593 165.371 208.480 168.480 ZM 237.720 141.650 C 229.340 123.250 200.340 112.000 184.000 112.000 C 164.999 112.023 148.627 125.388 144.800 144.000 L 111.200 144.000 C 107.373 125.388 91.001 112.023 72.000 112.000 C 55.660 112.000 26.660 123.250 18.320 141.620 C 16.837 140.125 16.004 138.106 16.000 136.000 C 16.033 105.086 41.086 80.033 72.000 80.000 L 184.000 80.000 C 214.914 80.033 239.967 105.086 240.000 136.000 C 239.996 138.106 239.163 140.125 237.680 141.620 Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
