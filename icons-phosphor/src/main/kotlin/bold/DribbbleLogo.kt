package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorBoldIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 211.130 116.000 C 210.130 116.000 209.050 116.000 208.010 116.000 C 194.060 116.008 180.162 117.707 166.620 121.060 C 163.684 112.913 160.133 105.000 156.000 97.390 C 168.049 89.737 179.100 80.618 188.900 70.240 C 200.877 82.818 208.646 98.810 211.130 116.000 ZM 170.000 55.300 C 161.887 63.625 152.825 70.968 143.000 77.180 C 134.197 65.352 123.921 54.696 112.420 45.470 C 132.171 41.709 152.616 45.200 170.000 55.300 ZM 85.540 55.570 C 99.225 64.488 111.353 75.592 121.440 88.440 C 103.257 96.090 83.726 100.020 64.000 100.000 C 59.000 100.000 54.000 99.740 49.060 99.250 C 55.800 80.911 68.688 65.475 85.530 55.570 ZM 44.000 128.000 C 44.000 126.270 44.070 124.560 44.170 122.860 C 50.753 123.615 57.374 123.995 64.000 124.000 C 88.427 124.020 112.577 118.832 134.840 108.780 C 138.295 115.101 141.276 121.669 143.760 128.430 C 136.351 131.403 129.160 134.891 122.240 138.870 C 101.135 151.055 82.842 167.563 68.560 187.310 C 52.823 171.586 43.986 150.247 44.000 128.000 ZM 87.770 201.720 C 100.100 184.565 115.937 170.228 134.230 159.660 C 139.398 156.692 144.741 154.040 150.230 151.720 C 152.004 160.948 152.898 170.323 152.900 179.720 C 152.908 189.572 151.936 199.400 150.000 209.060 C 129.091 214.749 106.791 212.118 87.780 201.720 ZM 176.060 196.830 C 176.620 191.150 176.920 185.430 176.920 179.690 C 176.913 167.747 175.667 155.836 173.200 144.150 C 184.596 141.401 196.277 140.008 208.000 140.000 C 209.000 140.000 210.070 140.000 211.110 140.000 C 207.773 162.970 195.087 183.537 176.060 196.830 Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
