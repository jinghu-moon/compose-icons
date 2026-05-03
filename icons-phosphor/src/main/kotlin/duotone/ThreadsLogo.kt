package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorDuotoneIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 128.000 C 208.000 176.000 192.000 224.000 128.000 224.000 C 64.000 224.000 48.000 176.000 48.000 128.000 C 48.000 80.000 64.000 32.000 128.000 32.000 C 192.000 32.000 208.000 80.000 208.000 128.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 186.420 123.650 C 182.948 121.037 179.219 118.785 175.290 116.930 C 171.290 87.040 151.290 77.620 142.190 74.860 C 122.410 68.860 99.680 76.050 89.340 91.560 C 86.888 95.238 87.882 100.208 91.560 102.660 C 95.238 105.112 100.208 104.118 102.660 100.440 C 109.030 90.880 124.660 86.280 137.550 90.170 C 147.500 93.170 154.370 100.470 157.700 111.170 C 152.660 110.210 147.540 109.732 142.410 109.740 C 128.490 109.740 115.460 113.330 105.740 119.840 C 94.300 127.570 88.000 139.000 88.000 152.000 C 88.000 172.580 103.860 187.520 125.710 187.520 C 138.692 187.432 151.084 182.089 160.060 172.710 C 166.500 166.010 174.060 154.350 175.670 135.610 C 176.050 135.870 176.410 136.140 176.770 136.410 C 186.880 144.050 192.000 154.680 192.000 168.000 C 192.000 187.360 171.660 216.000 128.000 216.000 C 101.270 216.000 82.520 207.350 70.660 189.560 C 60.930 175.000 56.000 154.260 56.000 128.000 C 56.000 101.740 60.930 81.000 70.660 66.440 C 82.520 48.650 101.270 40.000 128.000 40.000 C 160.930 40.000 182.000 53.250 192.530 80.520 C 193.535 83.219 195.912 85.169 198.755 85.627 C 201.598 86.085 204.468 84.980 206.269 82.734 C 208.070 80.487 208.525 77.445 207.460 74.770 C 194.680 41.560 167.200 24.000 128.000 24.000 C 96.000 24.000 72.190 35.290 57.340 57.560 C 45.830 74.830 40.000 98.520 40.000 128.000 C 40.000 157.480 45.830 181.170 57.340 198.440 C 72.190 220.710 96.000 232.000 128.000 232.000 C 158.070 232.000 176.900 220.520 187.400 210.900 C 200.300 199.080 208.000 183.000 208.000 168.000 C 208.000 149.660 200.540 134.320 186.420 123.650 ZM 148.530 161.650 C 142.574 167.898 134.342 171.469 125.710 171.550 C 114.900 171.550 104.000 165.550 104.000 152.030 C 104.000 139.400 116.000 125.820 142.410 125.820 C 148.357 125.804 154.278 126.618 160.000 128.240 C 160.000 142.320 156.000 153.860 148.530 161.620 Z"),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
