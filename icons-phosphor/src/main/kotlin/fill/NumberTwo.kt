package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorFillIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 160.000 176.000 C 164.418 176.000 168.000 179.582 168.000 184.000 C 168.000 188.418 164.418 192.000 160.000 192.000 L 96.000 192.000 C 92.799 192.000 89.907 190.092 88.646 187.149 C 87.386 184.207 88.001 180.797 90.210 178.480 L 145.900 120.000 C 154.131 110.070 153.042 95.410 143.435 86.805 C 133.827 78.201 119.136 78.728 110.170 88.000 C 108.947 89.332 107.883 90.802 107.000 92.380 C 104.854 96.246 99.981 97.641 96.115 95.495 C 92.249 93.349 90.854 88.476 93.000 84.610 C 94.476 81.959 96.247 79.483 98.280 77.230 C 113.065 60.813 138.358 59.490 154.775 74.275 C 171.192 89.060 172.515 114.353 157.730 130.770 L 157.570 130.930 L 114.660 176.000 Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
