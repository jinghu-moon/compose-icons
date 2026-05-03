package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) return _redditLogo!!
        _redditLogo = phosphorFillIcon(
            name = "RedditLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 104.000 C 247.997 91.477 240.689 80.107 229.299 74.902 C 217.909 69.697 204.530 71.615 195.060 79.810 C 178.310 70.910 158.300 65.530 137.400 64.280 L 142.590 33.110 L 160.310 35.830 C 162.166 47.371 172.067 55.896 183.755 56.018 C 195.443 56.140 205.519 47.823 207.616 36.324 C 209.713 24.825 203.220 13.487 192.241 9.476 C 181.262 5.465 168.990 9.947 163.180 20.090 L 137.180 16.090 C 132.851 15.423 128.791 18.360 128.070 22.680 L 121.200 64.160 C 99.360 65.100 78.380 70.540 60.940 79.810 C 47.696 68.622 27.952 70.015 16.411 82.952 C 4.870 95.889 5.729 115.664 18.350 127.550 C 16.795 132.895 16.003 138.433 16.000 144.000 C 16.000 165.930 28.000 186.350 49.910 201.490 C 70.880 216.000 98.610 224.000 128.000 224.000 C 157.390 224.000 185.120 216.000 206.090 201.490 C 228.000 186.350 240.000 165.930 240.000 144.000 C 239.997 138.433 239.205 132.895 237.650 127.550 C 244.226 121.482 247.976 112.948 248.000 104.000 ZM 72.000 128.000 C 72.000 119.163 79.163 112.000 88.000 112.000 C 96.837 112.000 104.000 119.163 104.000 128.000 C 104.000 136.837 96.837 144.000 88.000 144.000 C 79.163 144.000 72.000 136.837 72.000 128.000 ZM 163.750 183.070 C 141.397 194.949 114.603 194.949 92.250 183.070 C 88.345 180.999 86.859 176.155 88.930 172.250 C 91.001 168.345 95.845 166.859 99.750 168.930 C 117.413 178.320 138.587 178.320 156.250 168.930 C 160.155 166.859 164.999 168.345 167.070 172.250 C 169.141 176.155 167.655 180.999 163.750 183.070 ZM 168.000 144.000 C 159.163 144.000 152.000 136.837 152.000 128.000 C 152.000 119.163 159.163 112.000 168.000 112.000 C 176.837 112.000 184.000 119.163 184.000 128.000 C 184.000 136.837 176.837 144.000 168.000 144.000 Z"),
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
        return _redditLogo!!
    }

private var _redditLogo: ImageVector? = null
