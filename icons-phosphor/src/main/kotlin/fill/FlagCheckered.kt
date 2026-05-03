package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorFillIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.320 48.750 C 224.468 47.455 221.123 47.944 218.760 50.000 C 190.760 74.220 167.040 62.480 139.550 48.870 C 111.070 34.760 78.780 18.790 42.760 50.000 L 42.760 50.000 C 41.019 51.509 40.013 53.696 40.000 56.000 L 40.000 224.000 C 40.000 228.418 43.582 232.000 48.000 232.000 C 52.418 232.000 56.000 228.418 56.000 224.000 L 56.000 179.770 C 82.790 158.610 105.870 170.020 132.450 183.180 C 148.850 191.290 166.510 200.030 185.450 200.030 C 199.380 200.030 213.990 195.280 229.270 182.030 C 231.011 180.521 232.017 178.334 232.030 176.030 L 232.030 56.000 C 232.013 52.870 230.173 50.037 227.320 48.750 ZM 56.000 160.440 L 56.000 109.880 C 72.850 98.600 88.640 98.290 104.000 102.540 L 104.000 154.280 C 88.870 150.470 72.870 150.710 56.000 160.440 ZM 104.000 50.870 C 113.250 53.700 122.610 58.320 132.450 63.190 C 143.710 68.760 155.560 74.620 168.000 77.750 L 168.000 129.490 C 183.350 133.740 199.140 133.430 216.000 122.140 L 216.000 172.250 C 199.130 185.570 183.730 185.970 168.000 181.160 L 168.000 129.490 C 146.380 123.490 125.620 108.490 104.000 102.540 Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
