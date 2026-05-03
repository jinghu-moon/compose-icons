package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorRegularIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 123.490 98.810 L 99.490 162.810 C 98.326 165.946 95.335 168.026 91.990 168.026 C 88.645 168.026 85.654 165.946 84.490 162.810 L 60.490 98.810 C 58.938 94.668 61.038 90.052 65.180 88.500 C 69.322 86.948 73.938 89.048 75.490 93.190 L 92.000 137.190 L 108.510 93.190 C 110.062 89.048 114.678 86.948 118.820 88.500 C 122.962 90.052 125.062 94.668 123.510 98.810 ZM 256.000 128.000 C 255.950 172.162 220.162 207.950 176.000 208.000 L 80.000 208.000 C 35.817 208.000 0.000 172.183 0.000 128.000 C -0.000 83.817 35.817 48.000 80.000 48.000 L 176.000 48.000 C 220.162 48.050 255.950 83.838 256.000 128.000 ZM 240.000 128.000 C 239.961 92.670 211.330 64.039 176.000 64.000 L 80.000 64.000 C 44.654 64.000 16.000 92.654 16.000 128.000 C 16.000 163.346 44.654 192.000 80.000 192.000 L 176.000 192.000 C 211.330 191.961 239.961 163.330 240.000 128.000 ZM 180.840 138.350 L 191.000 156.000 C 193.193 159.838 191.858 164.727 188.020 166.920 C 184.182 169.113 179.293 167.778 177.100 163.940 L 165.660 143.940 C 165.130 143.940 164.590 143.990 164.050 143.990 L 152.000 143.990 L 152.000 159.990 C 152.000 164.408 148.418 167.990 144.000 167.990 C 139.582 167.990 136.000 164.408 136.000 159.990 L 136.000 96.000 C 136.000 91.582 139.582 88.000 144.000 88.000 L 164.000 88.000 C 176.032 88.011 186.711 95.708 190.528 107.119 C 194.344 118.529 190.444 131.102 180.840 138.350 ZM 152.000 128.000 L 164.000 128.000 C 170.627 128.000 176.000 122.627 176.000 116.000 C 176.000 109.373 170.627 104.000 164.000 104.000 L 152.000 104.000 Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
