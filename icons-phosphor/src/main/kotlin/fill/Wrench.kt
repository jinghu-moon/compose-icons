package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorFillIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 96.000 C 232.024 120.327 219.763 143.021 199.402 156.334 C 179.042 169.647 153.335 171.778 131.060 162.000 L 79.000 222.220 C 78.880 222.360 78.740 222.510 78.610 222.640 C 66.112 235.138 45.848 235.138 33.350 222.640 C 20.852 210.142 20.852 189.878 33.350 177.380 C 33.490 177.250 33.630 177.110 33.780 176.990 L 94.000 124.940 C 82.993 99.761 87.262 70.515 105.007 49.533 C 122.751 28.551 150.883 19.486 177.540 26.160 C 180.280 26.847 182.455 28.928 183.262 31.636 C 184.069 34.343 183.388 37.275 181.470 39.350 L 144.000 80.000 L 149.660 106.350 L 176.000 112.000 L 216.650 74.480 C 218.725 72.562 221.657 71.881 224.364 72.688 C 227.072 73.495 229.153 75.670 229.840 78.410 C 231.276 84.163 232.001 90.070 232.000 96.000 Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
