package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorFillIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.470 195.630 C 166.074 198.089 166.202 201.229 164.803 203.810 C 163.405 206.391 160.706 208.000 157.770 208.000 L 10.230 208.000 C 7.294 208.000 4.595 206.391 3.197 203.810 C 1.798 201.229 1.926 198.089 3.530 195.630 C 14.791 178.296 31.355 165.068 50.750 157.920 C 28.735 143.264 18.913 115.922 26.569 90.607 C 34.225 65.292 57.553 47.976 84.000 47.976 C 110.447 47.976 133.775 65.292 141.431 90.607 C 149.087 115.922 139.265 143.264 117.250 157.920 C 136.645 165.068 153.209 178.296 164.470 195.630 ZM 252.380 195.480 C 241.116 178.219 224.589 165.048 205.250 157.920 C 231.522 140.223 239.511 105.152 223.496 77.822 C 207.481 50.493 172.980 40.320 144.700 54.590 C 143.645 55.135 142.887 56.120 142.630 57.279 C 142.373 58.437 142.644 59.651 143.370 60.590 C 164.167 86.532 165.639 122.996 147.000 150.530 C 145.778 152.355 146.256 154.823 148.070 156.060 C 159.909 164.323 170.044 174.790 177.920 186.890 C 181.096 191.755 182.394 197.609 181.570 203.360 C 181.382 204.518 181.712 205.700 182.473 206.593 C 183.233 207.486 184.347 208.000 185.520 208.000 L 245.820 208.000 C 249.442 208.001 252.613 205.569 253.550 202.070 C 254.112 199.807 253.687 197.411 252.380 195.480 Z"),
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
