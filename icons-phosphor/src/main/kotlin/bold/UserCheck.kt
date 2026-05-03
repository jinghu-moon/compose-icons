package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorBoldIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.500 156.540 C 176.626 137.572 186.077 105.396 176.042 76.394 C 166.006 47.392 138.690 27.938 108.000 27.938 C 77.310 27.938 49.994 47.392 39.958 76.394 C 29.923 105.396 39.374 137.572 63.500 156.540 C 44.572 164.258 27.846 176.536 14.810 192.280 C 10.546 197.355 11.205 204.926 16.280 209.190 C 21.355 213.454 28.926 212.796 33.190 207.720 C 46.880 191.420 71.000 172.000 108.000 172.000 C 145.000 172.000 169.120 191.420 182.810 207.720 C 187.074 212.796 194.645 213.454 199.720 209.190 C 204.796 204.926 205.454 197.355 201.190 192.280 C 188.157 176.532 171.430 164.254 152.500 156.540 ZM 60.000 100.000 C 60.000 73.490 81.490 52.000 108.000 52.000 C 134.510 52.000 156.000 73.490 156.000 100.000 C 156.000 126.510 134.510 148.000 108.000 148.000 C 81.502 147.972 60.028 126.498 60.000 100.000 ZM 252.490 136.490 L 220.490 168.490 C 218.238 170.749 215.180 172.019 211.990 172.019 C 208.800 172.019 205.742 170.749 203.490 168.490 L 187.490 152.490 C 182.796 147.796 182.796 140.184 187.490 135.490 C 192.184 130.796 199.796 130.796 204.490 135.490 L 212.000 143.000 L 235.510 119.480 C 240.204 114.786 247.816 114.786 252.510 119.480 C 257.204 124.174 257.204 131.786 252.510 136.480 Z"),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
