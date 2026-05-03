package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorBoldIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.490 103.520 L 160.490 23.520 C 157.059 20.085 151.897 19.056 147.411 20.913 C 142.925 22.769 140.000 27.145 140.000 32.000 L 140.000 68.740 C 114.240 71.860 86.340 84.630 63.250 104.210 C 34.090 128.950 15.930 160.900 12.110 194.210 C 11.316 201.066 15.008 207.658 21.269 210.563 C 27.529 213.469 34.947 212.032 39.670 207.000 L 39.670 207.000 C 50.130 195.860 86.670 161.260 140.000 156.580 L 140.000 192.000 C 140.004 196.850 142.928 201.221 147.409 203.077 C 151.891 204.932 157.048 203.908 160.480 200.480 L 240.480 120.480 C 245.162 115.798 245.166 108.208 240.490 103.520 ZM 164.000 163.000 L 164.000 144.000 C 164.000 137.373 158.627 132.000 152.000 132.000 C 103.000 132.000 65.430 153.560 42.210 172.110 C 49.340 153.950 61.840 136.890 78.780 122.520 C 101.300 103.410 128.670 92.000 152.000 92.000 C 158.627 92.000 164.000 86.627 164.000 80.000 L 164.000 61.000 L 215.000 112.000 Z"),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
