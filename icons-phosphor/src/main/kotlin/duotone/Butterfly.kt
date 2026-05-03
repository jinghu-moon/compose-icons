package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorDuotoneIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 225.120 119.710 C 217.260 150.650 195.810 152.420 187.760 151.940 L 186.760 151.940 C 199.718 162.514 203.687 180.619 196.341 195.644 C 188.995 210.669 172.270 218.656 155.967 214.924 C 139.664 211.192 128.078 196.724 128.000 180.000 C 127.937 196.735 116.350 211.220 100.038 214.956 C 83.725 218.692 66.989 210.695 59.648 195.656 C 52.308 180.616 56.299 162.502 69.280 151.940 L 68.280 151.940 C 60.280 152.420 38.780 150.650 30.920 119.710 C 22.790 87.840 15.780 48.000 47.070 48.000 C 78.360 48.000 128.000 95.800 128.000 127.670 C 128.000 95.800 177.640 48.000 208.930 48.000 C 240.220 48.000 233.210 87.840 225.120 119.710 Z"),
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
                pathData = parseSvgPathData("M 232.700 50.480 C 229.000 45.700 221.840 40.000 209.000 40.000 C 192.150 40.000 170.540 51.280 151.190 70.160 C 145.658 75.522 140.577 81.332 136.000 87.530 L 136.000 56.000 C 136.000 51.582 132.418 48.000 128.000 48.000 C 123.582 48.000 120.000 51.582 120.000 56.000 L 120.000 87.530 C 115.436 81.334 110.369 75.524 104.850 70.160 C 85.490 51.280 63.880 40.000 47.000 40.000 C 34.160 40.000 27.000 45.700 23.300 50.480 C 16.480 59.250 11.120 74.560 23.090 121.680 C 29.140 145.510 42.600 154.680 53.720 158.100 C 41.101 178.590 47.284 205.416 67.598 218.316 C 87.912 231.216 114.821 225.404 128.000 205.270 C 141.179 225.404 168.088 231.216 188.402 218.316 C 208.716 205.416 214.899 178.590 202.280 158.100 C 213.400 154.700 226.850 145.510 232.910 121.680 C 239.630 95.240 244.850 66.100 232.700 50.480 ZM 92.000 208.000 C 77.274 207.742 65.242 196.164 64.417 181.459 C 63.593 166.753 74.255 153.903 88.860 152.000 C 91.742 151.736 94.257 149.936 95.437 147.293 C 96.616 144.650 96.276 141.576 94.547 139.255 C 92.818 136.933 89.970 135.727 87.100 136.100 C 79.621 136.902 72.477 139.623 66.360 144.000 C 57.930 144.090 44.360 140.430 38.600 117.740 C 35.720 106.390 27.000 71.860 35.940 60.300 C 37.370 58.460 40.090 56.000 47.000 56.000 C 74.270 56.000 120.000 100.880 120.000 127.670 L 120.000 180.000 C 120.000 195.464 107.464 208.000 92.000 208.000 ZM 217.400 117.740 C 211.630 140.430 198.070 144.080 189.630 144.000 C 183.519 139.604 176.374 136.865 168.890 136.050 C 166.020 135.677 163.172 136.883 161.443 139.205 C 159.714 141.526 159.374 144.600 160.553 147.243 C 161.733 149.886 164.248 151.686 167.130 151.950 C 182.161 153.574 193.216 166.797 192.150 181.879 C 191.084 196.960 178.280 208.497 163.170 207.992 C 148.059 207.486 136.055 195.119 136.000 180.000 L 136.000 127.670 C 136.000 100.880 181.690 56.000 209.000 56.000 C 215.950 56.000 218.660 58.460 220.100 60.300 C 229.050 71.860 220.280 106.390 217.400 117.740 Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
