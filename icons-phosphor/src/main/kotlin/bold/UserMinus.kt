package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorBoldIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 256.000 136.000 C 256.000 142.627 250.627 148.000 244.000 148.000 L 204.000 148.000 C 197.373 148.000 192.000 142.627 192.000 136.000 C 192.000 129.373 197.373 124.000 204.000 124.000 L 244.000 124.000 C 250.627 124.000 256.000 129.373 256.000 136.000 ZM 201.190 192.280 C 205.454 197.355 204.796 204.926 199.720 209.190 C 194.645 213.454 187.074 212.796 182.810 207.720 C 169.120 191.420 145.000 172.000 108.000 172.000 C 79.110 172.000 52.540 184.680 33.190 207.720 C 28.926 212.796 21.355 213.454 16.280 209.190 C 11.205 204.926 10.546 197.355 14.810 192.280 C 27.847 176.534 44.573 164.254 63.500 156.530 C 39.374 137.562 29.923 105.386 39.958 76.384 C 49.994 47.382 77.310 27.928 108.000 27.928 C 138.690 27.928 166.006 47.382 176.042 76.384 C 186.077 105.386 176.626 137.562 152.500 156.530 C 171.429 164.251 188.155 176.532 201.190 192.280 ZM 108.000 148.000 C 134.510 148.000 156.000 126.510 156.000 100.000 C 156.000 73.490 134.510 52.000 108.000 52.000 C 81.490 52.000 60.000 73.490 60.000 100.000 C 60.028 126.498 81.502 147.972 108.000 148.000 Z"),
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
