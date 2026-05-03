package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorDuotoneIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 184.000 120.000 L 184.000 181.650 C 183.999 183.769 183.157 185.801 181.660 187.300 L 147.310 221.650 C 145.166 223.789 141.999 224.534 139.126 223.575 C 136.254 222.616 134.169 220.118 133.740 217.120 L 128.000 176.000 ZM 136.000 72.000 L 74.350 72.000 C 72.231 72.001 70.199 72.843 68.700 74.340 L 34.350 108.690 C 32.211 110.834 31.466 114.001 32.425 116.874 C 33.384 119.746 35.882 121.831 38.880 122.260 L 80.000 128.000 ZM 40.000 216.000 C 77.650 216.000 90.690 196.310 94.560 187.820 L 68.180 161.440 C 59.690 165.310 40.000 178.350 40.000 216.000 Z"),
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
                pathData = parseSvgPathData("M 223.850 47.120 C 223.359 39.048 216.922 32.611 208.850 32.120 C 196.270 31.370 164.120 32.520 137.440 59.190 L 132.690 64.000 L 74.360 64.000 C 70.099 63.976 66.007 65.662 63.000 68.680 L 28.700 103.000 C 24.410 107.287 22.912 113.632 24.834 119.386 C 26.755 125.139 31.764 129.311 37.770 130.160 L 76.240 135.530 L 120.450 179.740 L 125.820 218.230 C 126.662 224.237 130.841 229.245 136.600 231.150 C 138.244 231.699 139.966 231.980 141.700 231.980 C 145.940 231.988 150.007 230.303 153.000 227.300 L 187.320 193.000 C 190.338 189.993 192.024 185.901 192.000 181.640 L 192.000 123.310 L 196.770 118.540 C 223.450 91.860 224.600 59.710 223.850 47.120 ZM 74.360 80.000 L 116.690 80.000 L 77.160 119.520 L 40.000 114.340 ZM 148.770 70.550 C 164.322 54.903 185.861 46.715 207.880 48.080 C 209.298 70.112 201.124 91.682 185.460 107.240 L 128.000 164.680 L 91.320 128.000 ZM 176.000 181.640 L 141.670 216.000 L 136.480 178.830 L 176.000 139.310 ZM 101.840 191.140 C 97.340 201.000 82.290 224.000 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 173.710 55.000 158.660 64.860 154.150 C 68.881 152.316 73.626 154.089 75.460 158.110 C 77.294 162.131 75.521 166.876 71.500 168.710 C 65.070 171.640 50.880 181.070 48.380 207.620 C 74.930 205.120 84.380 190.930 87.290 184.500 C 89.124 180.479 93.869 178.706 97.890 180.540 C 101.911 182.374 103.684 187.119 101.850 191.140 Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
