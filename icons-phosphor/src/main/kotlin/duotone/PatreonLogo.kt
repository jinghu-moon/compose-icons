package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorDuotoneIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 93.160 C 224.000 142.160 175.830 142.160 151.750 158.500 C 121.880 178.760 119.640 232.000 87.520 232.000 C 55.400 232.000 25.780 107.000 71.520 60.490 C 119.640 11.490 224.000 27.820 224.000 93.160 Z"),
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
                pathData = parseSvgPathData("M 187.370 32.000 C 168.580 24.320 146.230 22.080 124.440 25.700 C 101.000 29.600 80.710 39.700 65.760 54.900 C 54.640 66.220 41.140 88.250 40.060 128.900 C 39.360 155.390 44.450 184.340 53.670 206.350 C 62.890 228.360 74.610 240.000 87.520 240.000 C 110.460 240.000 120.750 219.920 130.690 200.500 C 137.690 186.900 144.850 172.840 156.240 165.120 C 162.100 161.120 170.040 158.120 178.450 154.840 C 202.310 145.640 232.000 134.180 232.000 93.170 C 232.000 65.900 215.730 43.600 187.370 32.000 ZM 172.690 139.910 C 163.410 143.490 154.640 146.910 147.260 151.910 C 132.480 161.910 123.960 178.570 116.450 193.240 C 106.670 212.300 100.050 224.000 87.520 224.000 C 83.000 224.000 75.340 216.630 68.430 200.150 C 60.040 180.150 55.430 153.660 56.060 129.320 C 56.790 101.660 64.290 79.210 77.170 66.110 C 95.230 47.740 120.790 40.000 144.570 40.000 C 157.136 39.889 169.607 42.183 181.310 46.760 C 194.310 52.060 216.000 65.140 216.000 93.130 C 216.000 123.210 195.930 131.000 172.690 139.910 Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
