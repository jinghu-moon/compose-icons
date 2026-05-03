package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorBoldIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.500 164.530 C 176.626 145.562 186.077 113.386 176.042 84.384 C 166.006 55.382 138.690 35.928 108.000 35.928 C 77.310 35.928 49.994 55.382 39.958 84.384 C 29.923 113.386 39.374 145.562 63.500 164.530 C 44.573 172.254 27.847 184.534 14.810 200.280 C 10.546 205.355 11.205 212.926 16.280 217.190 C 21.355 221.454 28.926 220.796 33.190 215.720 C 46.880 199.420 71.000 180.000 108.000 180.000 C 145.000 180.000 169.120 199.420 182.810 215.720 C 187.074 220.796 194.645 221.454 199.720 217.190 C 204.796 212.926 205.454 205.355 201.190 200.280 C 188.155 184.532 171.429 172.251 152.500 164.530 ZM 60.000 108.000 C 60.000 81.490 81.490 60.000 108.000 60.000 C 134.510 60.000 156.000 81.490 156.000 108.000 C 156.000 134.510 134.510 156.000 108.000 156.000 C 81.502 155.972 60.028 134.498 60.000 108.000 ZM 252.000 108.000 C 252.037 127.504 248.086 146.809 240.390 164.730 C 238.897 168.950 235.179 171.988 230.746 172.611 C 226.313 173.233 221.902 171.337 219.304 167.691 C 216.707 164.045 216.354 159.257 218.390 155.270 C 231.271 125.073 231.271 90.927 218.390 60.730 C 216.354 56.743 216.707 51.955 219.304 48.309 C 221.902 44.663 226.313 42.767 230.746 43.389 C 235.179 44.012 238.897 47.050 240.390 51.270 C 248.086 69.191 252.037 88.496 252.000 108.000 ZM 207.000 64.760 C 219.014 92.335 219.014 123.665 207.000 151.240 C 204.344 157.315 197.265 160.086 191.190 157.430 C 185.115 154.774 182.344 147.695 185.000 141.620 C 194.320 120.175 194.320 95.825 185.000 74.380 C 182.344 68.305 185.115 61.226 191.190 58.570 C 197.265 55.914 204.344 58.685 207.000 64.760 Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
