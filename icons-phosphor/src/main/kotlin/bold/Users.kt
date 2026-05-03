package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorBoldIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 125.180 156.940 C 145.769 139.634 153.341 111.303 144.131 86.033 C 134.921 60.764 110.896 43.948 84.000 43.948 C 57.104 43.948 33.079 60.764 23.869 86.033 C 14.659 111.303 22.231 139.634 42.820 156.940 C 27.126 164.036 13.525 175.057 3.330 188.940 C -0.591 194.283 0.562 201.794 5.905 205.715 C 11.248 209.636 18.759 208.483 22.680 203.140 C 36.994 183.591 59.771 172.038 84.000 172.038 C 108.229 172.038 131.006 183.591 145.320 203.140 C 149.241 208.486 156.754 209.641 162.100 205.720 C 167.446 201.799 168.601 194.286 164.680 188.940 C 154.479 175.059 140.875 164.039 125.180 156.940 ZM 44.000 108.000 C 44.000 85.909 61.909 68.000 84.000 68.000 C 106.091 68.000 124.000 85.909 124.000 108.000 C 124.000 130.091 106.091 148.000 84.000 148.000 C 61.909 148.000 44.000 130.091 44.000 108.000 ZM 250.100 205.670 C 247.534 207.555 244.325 208.344 241.178 207.862 C 238.030 207.380 235.204 205.667 233.320 203.100 C 218.973 183.591 196.217 172.049 172.000 172.000 C 165.373 172.000 160.000 166.627 160.000 160.000 C 160.000 153.373 165.373 148.000 172.000 148.000 C 187.521 147.972 201.625 138.968 208.183 124.900 C 214.741 110.833 212.569 94.241 202.610 82.336 C 192.652 70.431 176.705 65.361 161.700 69.330 C 157.521 70.539 153.016 69.392 149.924 66.332 C 146.832 63.272 145.638 58.778 146.804 54.587 C 147.970 50.396 151.312 47.164 155.540 46.140 C 184.490 38.469 214.888 51.900 228.709 78.469 C 242.530 105.037 236.079 137.638 213.180 156.940 C 228.874 164.036 242.475 175.057 252.670 188.940 C 256.562 194.274 255.414 201.750 250.100 205.670 Z"),
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
        return _users!!
    }

private var _users: ImageVector? = null
