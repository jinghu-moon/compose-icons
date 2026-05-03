package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorBoldIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 232.000 C 180.000 238.627 174.627 244.000 168.000 244.000 L 88.000 244.000 C 81.373 244.000 76.000 238.627 76.000 232.000 C 76.000 225.373 81.373 220.000 88.000 220.000 L 168.000 220.000 C 174.627 220.000 180.000 225.373 180.000 232.000 ZM 220.000 104.000 C 220.074 132.253 207.093 158.956 184.830 176.350 C 181.815 178.647 180.032 182.210 180.000 186.000 L 180.000 188.000 C 180.000 199.046 171.046 208.000 160.000 208.000 L 96.000 208.000 C 84.954 208.000 76.000 199.046 76.000 188.000 L 76.000 186.000 C 75.996 182.272 74.259 178.758 71.300 176.490 C 49.100 159.198 36.083 132.660 36.000 104.520 C 35.730 54.690 76.000 13.200 125.790 12.000 C 150.571 11.405 174.543 20.834 192.277 38.152 C 210.012 55.470 220.007 79.212 220.000 104.000 ZM 196.000 104.000 C 196.005 85.676 188.615 68.125 175.503 55.324 C 162.392 42.523 144.669 35.555 126.350 36.000 C 89.560 36.880 59.800 67.550 60.000 104.380 C 60.069 125.177 69.693 144.789 86.100 157.570 C 94.355 163.941 99.428 173.588 100.000 184.000 L 156.100 184.000 C 156.683 173.569 161.752 163.902 170.000 157.490 C 186.456 144.627 196.051 124.887 196.000 104.000 ZM 175.930 98.680 C 173.764 80.364 161.397 64.861 144.020 58.680 C 137.828 56.657 131.152 59.944 128.980 66.085 C 126.808 72.227 129.932 78.980 136.020 81.300 C 144.753 84.361 150.990 92.114 152.110 101.300 C 152.839 107.889 158.771 112.639 165.360 111.910 C 171.949 111.181 176.699 105.249 175.970 98.660 Z"),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
