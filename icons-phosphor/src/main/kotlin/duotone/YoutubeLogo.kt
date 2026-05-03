package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorDuotoneIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 226.590 71.530 C 225.341 66.525 221.755 62.430 216.960 60.530 C 183.480 47.650 128.000 48.000 128.000 48.000 C 128.000 48.000 72.520 47.650 39.000 60.580 C 34.205 62.480 30.619 66.575 29.370 71.580 C 27.070 80.540 24.000 98.090 24.000 128.000 C 24.000 157.910 27.070 175.460 29.410 184.470 C 30.665 189.447 34.232 193.520 39.000 195.420 C 72.520 208.350 128.000 208.000 128.000 208.000 C 128.000 208.000 183.480 208.350 217.000 195.420 C 221.783 193.530 225.367 189.456 226.630 184.470 C 228.970 175.470 232.040 157.910 232.040 128.000 C 232.040 98.090 228.930 80.540 226.590 71.530 ZM 112.000 160.000 L 112.000 96.000 L 160.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 164.440 121.340 L 116.440 89.340 C 113.985 87.702 110.826 87.549 108.224 88.942 C 105.622 90.335 103.998 93.048 104.000 96.000 L 104.000 160.000 C 103.998 162.952 105.622 165.665 108.224 167.058 C 110.826 168.451 113.985 168.298 116.440 166.660 L 164.440 134.660 C 166.669 133.177 168.008 130.677 168.008 128.000 C 168.008 125.323 166.669 122.823 164.440 121.340 ZM 120.000 145.050 L 120.000 111.000 L 145.580 128.000 ZM 234.330 69.520 C 232.418 62.041 227.026 55.938 219.840 53.120 C 185.560 39.880 131.000 40.000 128.000 40.000 C 125.000 40.000 70.440 39.880 36.160 53.120 C 28.974 55.938 23.582 62.041 21.670 69.520 C 19.080 79.500 16.000 97.740 16.000 128.000 C 16.000 158.260 19.080 176.500 21.670 186.480 C 23.579 193.963 28.971 200.070 36.160 202.890 C 69.000 215.560 120.400 216.000 127.340 216.000 L 128.660 216.000 C 135.600 216.000 187.030 215.560 219.840 202.890 C 227.029 200.070 232.421 193.963 234.330 186.480 C 236.920 176.480 240.000 158.260 240.000 128.000 C 240.000 97.740 236.920 79.500 234.330 69.520 ZM 218.840 182.520 C 218.222 185.009 216.448 187.050 214.070 188.010 C 182.420 200.230 128.590 200.010 127.950 200.010 C 127.310 200.010 73.580 200.190 41.950 188.010 C 39.572 187.050 37.798 185.009 37.180 182.520 C 34.800 173.390 32.000 156.570 32.000 128.000 C 32.000 99.430 34.800 82.610 37.160 73.530 C 37.767 71.026 39.542 68.968 41.930 68.000 C 73.580 55.820 127.400 56.000 128.050 56.000 C 128.700 56.000 182.420 55.820 214.050 68.000 C 216.428 68.960 218.202 71.001 218.820 73.490 C 221.200 82.610 224.000 99.430 224.000 128.000 C 224.000 156.570 221.200 173.390 218.840 182.470 Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
