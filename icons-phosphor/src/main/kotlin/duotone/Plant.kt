package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorDuotoneIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 138.540 149.460 C 106.620 96.250 149.180 43.050 239.630 48.370 C 245.000 138.820 191.750 181.390 138.540 149.460 ZM 16.260 88.260 C 12.460 152.870 50.470 183.260 88.470 160.470 C 111.270 122.470 80.870 84.460 16.260 88.260 Z"),
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
        pathData = parseSvgPathData("M 247.630 47.890 C 247.393 43.839 244.161 40.607 240.110 40.370 C 188.350 37.370 146.790 53.110 128.930 82.590 C 117.130 102.070 117.150 125.750 128.770 148.330 C 122.163 156.189 117.330 165.382 114.600 175.280 L 98.330 159.000 C 106.150 142.670 105.850 125.640 97.330 111.510 C 84.090 89.730 53.620 78.000 15.790 80.270 C 11.739 80.507 8.507 83.739 8.270 87.790 C 6.040 125.620 17.730 156.090 39.520 169.290 C 46.723 173.687 55.001 176.009 63.440 176.000 C 71.619 175.899 79.671 173.962 87.000 170.330 L 112.000 195.330 L 112.000 224.000 C 112.000 228.418 115.582 232.000 120.000 232.000 C 124.418 232.000 128.000 228.418 128.000 224.000 L 128.000 194.510 C 127.964 181.783 132.295 169.429 140.270 159.510 C 150.559 164.887 161.971 167.765 173.580 167.910 C 184.804 167.946 195.819 164.880 205.410 159.050 C 234.890 141.210 250.670 99.650 247.630 47.890 ZM 86.060 146.740 L 61.650 122.340 C 58.505 119.352 53.551 119.415 50.483 122.483 C 47.415 125.551 47.352 130.505 50.340 133.650 L 74.750 158.060 C 65.140 161.240 55.820 160.450 47.810 155.600 C 32.470 146.310 23.790 124.320 24.000 96.000 C 52.310 95.750 74.310 104.470 83.600 119.810 C 88.450 127.820 89.240 137.140 86.060 146.740 ZM 197.120 145.380 C 183.720 153.490 167.970 154.110 151.970 147.380 L 205.660 93.680 C 208.786 90.557 208.788 85.491 205.665 82.365 C 202.542 79.239 197.476 79.237 194.350 82.360 L 140.650 136.000 C 133.890 120.000 134.500 104.240 142.650 90.850 C 156.590 67.850 189.650 55.050 231.980 56.020 C 232.940 98.340 220.140 131.440 197.120 145.380 Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
