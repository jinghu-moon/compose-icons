package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorLightIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.860 47.240 C 221.419 40.192 215.799 34.575 208.750 34.140 C 196.440 33.410 164.980 34.530 138.870 60.640 L 133.520 66.000 L 74.350 66.000 C 70.638 65.991 67.077 67.468 64.460 70.100 L 30.110 104.440 C 26.359 108.192 25.051 113.743 26.733 118.775 C 28.414 123.808 32.796 127.457 38.050 128.200 L 77.180 133.660 L 122.340 178.820 L 127.800 218.000 C 128.549 223.250 132.201 227.626 137.232 229.303 C 142.263 230.980 147.810 229.670 151.560 225.920 L 185.910 191.570 C 188.541 188.952 190.018 185.392 190.010 181.680 L 190.010 122.480 L 195.360 117.130 L 195.360 117.130 C 221.460 91.000 222.590 59.560 221.860 47.240 ZM 38.110 115.000 C 37.891 114.294 38.080 113.525 38.600 113.000 L 72.940 78.580 C 73.315 78.208 73.822 78.000 74.350 78.000 L 121.520 78.000 L 77.870 121.640 L 39.730 116.320 C 38.978 116.236 38.344 115.720 38.110 115.000 ZM 178.000 181.650 C 177.998 182.180 177.786 182.687 177.410 183.060 L 143.080 217.400 C 142.548 217.938 141.757 218.130 141.037 217.895 C 140.318 217.660 139.792 217.039 139.680 216.290 L 134.360 178.130 L 178.000 134.480 ZM 186.870 108.650 L 186.870 108.650 L 128.000 167.510 L 88.490 128.000 L 147.360 69.120 C 163.323 53.055 185.449 44.669 208.050 46.120 C 209.043 46.203 209.824 47.005 209.880 48.000 C 211.316 70.584 202.932 92.689 186.880 108.640 ZM 100.000 190.310 C 95.680 199.840 81.130 222.000 40.000 222.000 C 36.686 222.000 34.000 219.314 34.000 216.000 C 34.000 174.870 56.160 160.320 65.690 156.000 C 68.705 154.619 72.269 155.945 73.650 158.960 C 75.031 161.975 73.705 165.539 70.690 166.920 C 63.690 170.090 48.160 180.440 46.220 209.830 C 75.610 207.890 85.960 192.310 89.130 185.360 C 90.511 182.345 94.075 181.019 97.090 182.400 C 100.105 183.781 101.431 187.345 100.050 190.360 Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
