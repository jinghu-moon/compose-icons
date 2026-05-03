package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorBoldIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 181.360 114.730 L 133.360 138.730 C 129.641 140.587 125.226 140.386 121.691 138.201 C 118.155 136.016 116.002 132.156 116.000 128.000 L 116.000 72.000 C 116.000 65.373 121.373 60.000 128.000 60.000 C 134.627 60.000 140.000 65.373 140.000 72.000 L 140.000 108.580 L 170.630 93.270 C 174.478 91.228 179.131 91.433 182.785 93.803 C 186.440 96.174 188.522 100.340 188.226 104.686 C 187.930 109.032 185.302 112.876 181.360 114.730 ZM 227.080 235.590 C 220.676 237.293 214.105 233.483 212.400 227.080 C 210.000 218.200 201.650 212.000 192.000 212.000 C 182.350 212.000 174.000 218.200 171.600 227.080 C 170.203 232.340 165.442 236.001 160.000 236.000 C 158.956 236.001 157.917 235.863 156.910 235.590 C 153.833 234.774 151.207 232.768 149.609 230.015 C 148.011 227.262 147.573 223.987 148.390 220.910 C 150.814 211.822 156.102 203.757 163.470 197.910 C 152.050 183.112 153.855 162.037 167.624 149.396 C 181.394 136.756 202.546 136.756 216.316 149.396 C 230.085 162.037 231.890 183.112 220.470 197.910 C 227.841 203.754 233.130 211.820 235.550 220.910 C 237.256 227.301 233.467 233.868 227.080 235.590 ZM 180.000 176.000 C 180.000 182.627 185.373 188.000 192.000 188.000 C 198.627 188.000 204.000 182.627 204.000 176.000 C 204.000 169.373 198.627 164.000 192.000 164.000 C 185.373 164.000 180.000 169.373 180.000 176.000 ZM 117.480 211.350 C 74.159 205.875 42.257 168.121 44.087 124.494 C 45.916 80.866 80.866 45.916 124.494 44.087 C 168.121 42.257 205.875 74.159 211.350 117.480 C 211.838 121.774 214.598 125.474 218.575 127.166 C 222.552 128.858 227.131 128.281 230.564 125.655 C 233.996 123.030 235.752 118.761 235.160 114.480 C 228.127 58.773 179.582 17.748 123.482 20.102 C 67.382 22.456 22.445 67.405 20.104 123.505 C 17.764 179.606 58.801 228.141 114.510 235.160 C 115.007 235.227 115.508 235.261 116.010 235.260 C 122.353 235.262 127.601 230.327 127.990 223.996 C 128.380 217.666 123.775 212.125 117.480 211.350 Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
