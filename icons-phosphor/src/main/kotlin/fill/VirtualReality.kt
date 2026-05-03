package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorFillIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 48.000 L 80.000 48.000 C 35.817 48.000 0.000 83.817 0.000 128.000 C 0.000 172.183 35.817 208.000 80.000 208.000 L 176.000 208.000 C 220.183 208.000 256.000 172.183 256.000 128.000 C 256.000 83.817 220.183 48.000 176.000 48.000 ZM 123.490 98.810 L 99.490 162.810 C 98.326 165.946 95.335 168.026 91.990 168.026 C 88.645 168.026 85.654 165.946 84.490 162.810 L 60.490 98.810 C 58.938 94.668 61.038 90.052 65.180 88.500 C 69.322 86.948 73.938 89.048 75.490 93.190 L 92.000 137.190 L 108.510 93.190 C 110.062 89.048 114.678 86.948 118.820 88.500 C 122.962 90.052 125.062 94.668 123.510 98.810 ZM 191.000 156.000 C 193.193 159.838 191.858 164.727 188.020 166.920 C 184.182 169.113 179.293 167.778 177.100 163.940 L 165.660 143.940 C 165.130 143.940 164.590 143.990 164.050 143.990 L 152.000 143.990 L 152.000 159.990 C 152.000 164.408 148.418 167.990 144.000 167.990 C 139.582 167.990 136.000 164.408 136.000 159.990 L 136.000 96.000 C 136.000 91.582 139.582 88.000 144.000 88.000 L 164.000 88.000 C 176.032 88.011 186.711 95.708 190.528 107.119 C 194.344 118.529 190.444 131.102 180.840 138.350 ZM 176.000 116.000 C 176.000 122.627 170.627 128.000 164.000 128.000 L 152.000 128.000 L 152.000 104.000 L 164.000 104.000 C 170.627 104.000 176.000 109.373 176.000 116.000 Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
