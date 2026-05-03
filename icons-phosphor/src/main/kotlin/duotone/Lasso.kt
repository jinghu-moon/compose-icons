package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorDuotoneIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 112.000 C 232.000 147.350 185.440 176.000 128.000 176.000 C 70.560 176.000 24.000 147.350 24.000 112.000 C 24.000 76.650 70.560 48.000 128.000 48.000 C 185.440 48.000 232.000 76.650 232.000 112.000 Z"),
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
                pathData = parseSvgPathData("M 205.730 59.930 C 184.850 47.080 157.240 40.000 128.000 40.000 C 98.760 40.000 71.150 47.080 50.270 59.930 C 28.170 73.520 16.000 92.000 16.000 112.000 C 16.000 132.000 28.170 150.440 50.270 164.000 C 69.270 175.670 93.760 182.560 120.000 183.730 L 120.000 183.730 C 120.256 197.287 113.144 209.918 101.420 216.730 C 86.780 225.590 66.800 226.250 51.700 218.370 C 49.158 216.960 46.051 217.039 43.585 218.577 C 41.118 220.116 39.680 222.871 39.829 225.774 C 39.978 228.677 41.689 231.271 44.300 232.550 C 53.785 237.467 64.316 240.023 75.000 240.000 C 87.228 240.048 99.238 236.763 109.740 230.500 C 126.740 220.230 136.030 203.640 136.030 183.800 L 136.030 183.800 C 162.270 182.630 186.790 175.740 205.760 164.070 C 227.830 150.440 240.000 132.000 240.000 112.000 C 240.000 92.000 227.830 73.520 205.730 59.930 ZM 67.410 155.180 C 72.650 145.630 82.860 143.180 90.940 144.180 C 101.840 145.600 112.800 153.310 117.550 167.600 C 99.110 166.450 81.850 162.160 67.410 155.180 ZM 197.350 150.410 C 180.400 160.840 158.180 166.940 134.220 167.840 C 132.324 159.350 128.418 151.438 122.830 144.770 C 115.278 135.773 104.641 129.918 93.000 128.350 C 76.000 126.150 61.280 133.460 53.620 147.050 C 39.640 137.000 32.000 124.730 32.000 112.000 C 32.000 97.790 41.470 84.140 58.650 73.570 C 77.050 62.230 101.680 56.000 128.000 56.000 C 154.320 56.000 179.000 62.230 197.350 73.550 C 214.530 84.120 224.000 97.770 224.000 112.000 C 224.000 126.230 214.530 139.840 197.350 150.410 Z"),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
