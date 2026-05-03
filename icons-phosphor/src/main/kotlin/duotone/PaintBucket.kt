package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorDuotoneIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 248.000 208.000 C 248.000 216.837 240.837 224.000 232.000 224.000 C 223.163 224.000 216.000 216.837 216.000 208.000 C 216.000 192.000 232.000 168.000 232.000 168.000 C 232.000 168.000 248.000 192.000 248.000 208.000 ZM 232.000 131.480 L 208.000 139.480 L 128.170 219.310 C 125.169 222.311 121.099 223.998 116.855 223.998 C 112.611 223.998 108.541 222.311 105.540 219.310 L 20.690 134.460 C 17.689 131.459 16.002 127.389 16.002 123.145 C 16.002 118.901 17.689 114.831 20.690 111.830 L 116.520 16.000 ZM 138.140 101.860 C 132.421 96.139 123.818 94.427 116.343 97.522 C 108.869 100.617 103.996 107.910 103.996 116.000 C 103.996 124.090 108.869 131.383 116.343 134.478 C 123.818 137.573 132.421 135.861 138.140 130.140 C 145.948 122.330 145.948 109.670 138.140 101.860 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 238.660 163.560 C 237.177 161.331 234.677 159.992 232.000 159.992 C 229.323 159.992 226.823 161.331 225.340 163.560 C 223.570 166.230 208.000 190.090 208.000 208.000 C 208.000 221.255 218.745 232.000 232.000 232.000 C 245.255 232.000 256.000 221.255 256.000 208.000 C 256.000 190.090 240.430 166.230 238.660 163.560 ZM 232.000 216.000 C 227.582 216.000 224.000 212.418 224.000 208.000 C 224.000 201.200 228.000 191.680 232.000 183.920 C 236.000 191.680 240.000 201.260 240.000 208.000 C 240.000 212.418 236.418 216.000 232.000 216.000 ZM 234.530 139.070 C 237.158 138.193 239.146 136.018 239.783 133.322 C 240.421 130.625 239.617 127.791 237.660 125.830 L 122.170 10.340 C 119.046 7.218 113.984 7.218 110.860 10.340 L 70.250 51.000 L 45.650 26.340 C 42.524 23.217 37.458 23.219 34.335 26.345 C 31.212 29.471 31.214 34.537 34.340 37.660 L 58.940 62.260 L 15.000 106.170 C 5.628 115.542 5.628 130.738 15.000 140.110 L 99.890 225.000 C 109.262 234.372 124.458 234.372 133.830 225.000 L 212.320 146.510 ZM 202.340 133.830 L 122.510 213.660 C 119.386 216.782 114.324 216.782 111.200 213.660 L 26.340 128.800 C 23.218 125.676 23.218 120.614 26.340 117.490 L 70.250 73.570 L 99.370 102.690 C 92.764 114.923 96.133 130.150 107.284 138.453 C 118.434 146.756 133.988 145.620 143.815 135.785 C 153.641 125.951 154.763 110.396 146.450 99.252 C 138.137 88.109 122.907 84.753 110.680 91.370 L 81.570 62.260 L 116.570 27.310 L 217.190 128.000 L 205.470 131.900 C 204.292 132.295 203.221 132.955 202.340 133.830 ZM 115.510 107.520 L 115.510 107.520 C 120.210 101.914 128.562 101.173 134.175 105.865 C 139.789 110.556 140.542 118.908 135.858 124.528 C 131.175 130.148 122.825 130.913 117.198 126.238 C 111.571 121.563 110.793 113.214 115.460 107.580 C 115.460 107.580 115.510 107.530 115.510 107.520 Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
