package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = phosphorDuotoneIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 16.000 152.000 L 48.000 152.000 L 48.000 208.000 L 16.000 208.000 C 11.582 208.000 8.000 204.418 8.000 200.000 L 8.000 160.000 C 8.000 155.582 11.582 152.000 16.000 152.000 ZM 192.540 40.000 C 176.609 39.813 162.157 49.306 156.000 64.000 C 149.843 49.306 135.391 39.813 119.460 40.000 C 97.670 40.000 80.000 58.310 80.000 80.000 C 80.000 94.560 87.000 107.710 96.730 120.000 L 140.000 120.000 C 151.046 120.000 160.000 128.954 160.000 140.000 C 160.000 151.046 151.046 160.000 140.000 160.000 L 144.000 160.000 L 181.780 151.320 C 203.820 135.070 232.000 109.230 232.000 80.000 C 232.000 58.310 214.330 40.000 192.540 40.000 Z"),
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
                pathData = parseSvgPathData("M 230.330 141.060 C 225.043 136.986 218.315 135.261 211.720 136.290 C 230.500 117.330 240.000 98.480 240.000 80.000 C 240.000 53.530 218.710 32.000 192.540 32.000 C 178.484 31.912 165.108 38.043 156.000 48.750 C 146.892 38.043 133.516 31.912 119.460 32.000 C 93.290 32.000 72.000 53.530 72.000 80.000 C 72.000 91.000 75.240 101.690 82.060 113.000 C 76.474 114.415 71.377 117.318 67.310 121.400 L 44.690 144.000 L 16.000 144.000 C 7.163 144.000 0.000 151.163 0.000 160.000 L 0.000 200.000 C 0.000 208.837 7.163 216.000 16.000 216.000 L 120.000 216.000 C 120.654 216.000 121.306 215.920 121.940 215.760 L 185.940 199.760 C 186.348 199.663 186.746 199.529 187.130 199.360 L 226.000 182.820 L 226.440 182.620 C 234.035 178.825 239.135 171.382 239.935 162.930 C 240.734 154.478 237.119 146.211 230.370 141.060 ZM 119.460 48.000 C 132.134 47.815 143.657 55.328 148.600 67.000 C 149.833 70.001 152.756 71.960 156.000 71.960 C 159.244 71.960 162.167 70.001 163.400 67.000 C 168.343 55.328 179.866 47.815 192.540 48.000 C 209.590 48.000 224.000 62.650 224.000 80.000 C 224.000 99.510 208.210 121.580 178.340 143.900 L 167.250 146.450 C 169.222 138.119 167.275 129.344 161.963 122.629 C 156.652 115.915 148.561 111.999 140.000 112.000 L 100.680 112.000 C 92.050 100.360 88.000 90.120 88.000 80.000 C 88.000 62.650 102.410 48.000 119.460 48.000 ZM 16.000 160.000 L 40.000 160.000 L 40.000 200.000 L 16.000 200.000 ZM 219.430 168.210 L 181.430 184.390 L 119.000 200.000 L 56.000 200.000 L 56.000 155.310 L 78.630 132.690 C 81.620 129.676 85.694 127.986 89.940 128.000 L 140.000 128.000 C 146.627 128.000 152.000 133.373 152.000 140.000 C 152.000 146.627 146.627 152.000 140.000 152.000 L 112.000 152.000 C 107.582 152.000 104.000 155.582 104.000 160.000 C 104.000 164.418 107.582 168.000 112.000 168.000 L 144.000 168.000 C 144.602 167.998 145.202 167.931 145.790 167.800 L 212.790 152.390 L 213.100 152.310 C 217.336 151.134 221.776 153.342 223.396 157.429 C 225.015 161.515 223.292 166.166 219.400 168.210 Z"),
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
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
