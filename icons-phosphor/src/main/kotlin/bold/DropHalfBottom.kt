package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorBoldIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.880 6.170 C 130.749 3.279 125.251 3.279 121.120 6.170 C 105.657 17.566 91.510 30.646 78.940 45.170 C 50.850 77.430 36.000 111.630 36.000 144.000 C 36.000 194.810 77.190 236.000 128.000 236.000 C 178.810 236.000 220.000 194.810 220.000 144.000 C 220.000 66.640 138.360 8.600 134.880 6.170 ZM 191.610 168.000 L 64.390 168.000 C 62.438 162.847 61.128 157.473 60.490 152.000 L 195.490 152.000 C 194.858 157.472 193.555 162.846 191.610 168.000 ZM 96.700 61.290 C 106.235 50.338 116.708 40.239 128.000 31.110 C 139.292 40.239 149.765 50.338 159.300 61.290 C 173.300 77.480 189.570 101.180 194.500 128.000 L 61.500 128.000 C 66.430 101.180 82.690 77.480 96.700 61.290 ZM 128.000 212.000 C 109.936 212.012 92.614 204.813 79.880 192.000 L 176.120 192.000 C 163.386 204.813 146.064 212.012 128.000 212.000 Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
