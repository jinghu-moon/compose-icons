package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorDuotoneIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 67.410 142.560 C 35.710 129.520 45.410 32.070 78.000 32.000 C 111.820 32.050 92.000 90.260 67.410 142.560 Z"),
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
                pathData = parseSvgPathData("M 232.000 168.000 L 63.860 168.000 C 66.520 162.760 69.190 157.370 71.860 151.890 C 86.800 153.540 104.440 143.110 124.520 120.750 C 129.520 134.210 138.970 151.680 155.100 152.000 C 164.190 152.180 173.210 146.800 182.520 135.630 C 189.310 143.750 203.300 152.000 232.000 152.000 C 236.418 152.000 240.000 148.418 240.000 144.000 C 240.000 139.582 236.418 136.000 232.000 136.000 C 201.570 136.000 192.570 125.550 192.000 119.890 C 192.186 116.357 189.930 113.155 186.540 112.140 C 183.022 111.083 179.233 112.513 177.290 115.630 C 165.230 134.170 158.000 136.060 155.380 136.000 C 147.120 135.840 138.720 116.480 135.840 102.580 C 135.213 99.541 132.884 97.139 129.866 96.417 C 126.848 95.695 123.685 96.784 121.750 99.210 C 101.540 124.550 88.000 133.080 79.570 135.290 C 88.060 116.420 94.400 99.850 98.460 85.900 C 105.280 62.460 105.780 46.070 99.970 35.800 C 96.970 30.420 90.630 24.000 77.910 24.000 C 61.850 24.000 49.180 39.180 43.140 65.650 C 39.550 81.360 38.960 98.860 41.520 113.650 C 44.080 128.440 49.390 139.200 57.110 145.590 C 53.380 153.310 49.580 160.850 45.880 168.000 L 24.000 168.000 C 19.582 168.000 16.000 171.582 16.000 176.000 C 16.000 180.418 19.582 184.000 24.000 184.000 L 37.410 184.000 C 26.090 205.000 17.290 219.640 17.150 219.880 C 15.597 222.332 15.495 225.433 16.882 227.983 C 18.269 230.532 20.928 232.130 23.831 232.159 C 26.733 232.188 29.423 230.642 30.860 228.120 C 31.010 227.860 42.130 209.330 55.560 184.000 L 232.000 184.000 C 236.418 184.000 240.000 180.418 240.000 176.000 C 240.000 171.582 236.418 168.000 232.000 168.000 ZM 58.740 69.210 C 62.720 51.740 70.430 40.000 77.910 40.000 C 83.240 40.000 85.010 41.860 86.040 43.670 C 89.040 49.000 92.560 67.860 64.380 130.060 C 56.120 118.780 53.310 93.000 58.740 69.210 Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
