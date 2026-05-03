package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorThinIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 108.000 L 211.900 108.000 C 209.715 63.254 172.799 28.098 128.000 28.098 C 83.201 28.098 46.285 63.254 44.100 108.000 L 32.000 108.000 C 29.791 108.000 28.000 109.791 28.000 112.000 C 28.068 150.153 49.772 184.965 84.000 201.820 L 84.000 208.000 C 84.000 214.627 89.373 220.000 96.000 220.000 L 160.000 220.000 C 166.627 220.000 172.000 214.627 172.000 208.000 L 172.000 201.820 C 206.228 184.965 227.932 150.153 228.000 112.000 C 228.000 109.791 226.209 108.000 224.000 108.000 ZM 203.890 108.000 L 141.050 108.000 C 151.455 88.621 169.754 74.707 191.210 69.860 C 198.807 81.193 203.190 94.374 203.890 108.000 ZM 186.000 62.930 C 162.299 69.342 142.595 85.812 132.080 108.000 L 94.680 108.000 C 103.765 74.982 133.755 52.076 168.000 52.000 C 170.330 52.000 172.680 52.130 175.000 52.340 C 179.009 55.496 182.694 59.043 186.000 62.930 ZM 128.000 36.000 C 139.921 35.990 151.675 38.803 162.300 44.210 C 125.847 46.768 95.198 72.530 86.410 108.000 L 52.110 108.000 C 54.282 67.659 87.601 36.048 128.000 36.000 ZM 166.330 195.660 C 164.908 196.313 163.998 197.735 164.000 199.300 L 164.000 208.000 C 164.000 210.209 162.209 212.000 160.000 212.000 L 96.000 212.000 C 93.791 212.000 92.000 210.209 92.000 208.000 L 92.000 199.300 C 92.002 197.735 91.092 196.313 89.670 195.660 C 58.324 181.209 37.656 150.481 36.090 116.000 L 219.910 116.000 C 218.344 150.481 197.676 181.209 166.330 195.660 Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
