package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorDuotoneIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 136.500 150.450 C 139.093 169.939 130.473 189.224 114.222 200.290 C 97.971 211.356 76.868 212.310 59.685 202.756 C 42.502 193.202 32.176 174.774 33.000 155.130 L 104.910 134.590 L 104.910 134.590 C 107.854 144.899 117.279 152.006 128.000 152.000 C 130.905 152.004 133.786 151.475 136.500 150.440 ZM 104.310 124.140 L 104.310 124.140 C 105.390 117.513 109.197 111.641 114.807 107.950 C 120.417 104.260 127.316 103.088 133.830 104.720 L 133.830 104.720 L 152.000 32.170 C 135.398 21.690 114.310 21.454 97.477 31.560 C 80.645 41.665 70.939 60.389 72.384 79.968 C 73.828 99.548 86.177 116.644 104.310 124.170 ZM 201.000 105.500 C 182.715 94.938 159.858 96.484 143.160 109.410 L 143.160 109.410 C 148.355 113.659 151.534 119.888 151.925 126.588 C 152.316 133.288 149.885 139.845 145.220 144.670 L 145.220 144.670 L 198.960 196.670 C 215.821 187.913 226.564 170.657 226.981 151.663 C 227.397 132.668 217.421 114.958 200.960 105.470 Z"),
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
                pathData = parseSvgPathData("M 233.000 135.000 C 228.087 116.650 214.775 101.710 197.111 94.723 C 179.446 87.735 159.516 89.526 143.380 99.550 L 159.770 34.110 C 160.604 30.776 159.215 27.282 156.320 25.430 C 137.793 13.731 114.362 13.062 95.198 23.685 C 76.033 34.307 64.183 54.532 64.286 76.443 C 64.388 98.354 76.427 118.467 95.690 128.910 L 30.820 147.440 C 27.515 148.381 25.181 151.328 25.020 154.760 C 23.752 182.900 42.230 208.134 69.440 215.420 C 74.534 216.788 79.785 217.484 85.060 217.490 C 101.299 217.447 116.828 210.831 128.109 199.151 C 139.390 187.470 145.462 171.720 144.940 155.490 L 193.420 202.410 C 195.892 204.802 199.617 205.346 202.670 203.760 C 227.660 190.794 240.274 162.197 233.000 135.000 ZM 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 ZM 80.000 76.000 C 79.995 60.931 87.701 46.908 100.425 38.834 C 113.148 30.760 129.118 29.759 142.750 36.180 L 127.770 96.000 C 116.096 96.088 105.395 102.526 99.850 112.800 C 87.434 104.681 79.966 90.835 80.000 76.000 ZM 107.000 195.570 C 93.953 203.109 77.956 203.447 64.602 196.466 C 51.249 189.485 42.396 176.156 41.140 161.140 L 100.450 144.200 C 106.187 153.974 116.667 159.984 128.000 160.000 L 128.910 160.000 C 128.092 174.799 119.849 188.182 107.000 195.570 ZM 213.170 172.570 C 209.933 178.185 205.494 183.014 200.170 186.710 L 155.850 143.820 C 161.627 133.673 161.401 121.181 155.260 111.250 C 172.637 102.478 193.713 106.166 207.078 120.318 C 220.443 134.470 222.921 155.723 213.170 172.570 Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
