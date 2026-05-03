package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorLightIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.490 50.500 C 224.354 49.524 221.846 49.884 220.070 51.420 C 191.070 76.530 166.790 64.500 138.660 50.580 C 110.740 36.760 79.090 21.090 44.070 51.420 C 42.743 52.570 41.987 54.244 42.000 56.000 L 42.000 224.000 C 42.000 227.314 44.686 230.000 48.000 230.000 C 51.314 230.000 54.000 227.314 54.000 224.000 L 54.000 178.780 C 82.080 155.990 105.880 167.780 133.340 181.370 C 161.260 195.190 192.920 210.850 227.930 180.520 C 229.241 179.384 229.996 177.735 230.000 176.000 L 230.000 56.000 C 230.016 53.635 228.642 51.481 226.490 50.500 ZM 218.000 68.000 L 218.000 113.200 C 202.470 125.800 188.250 127.850 174.000 124.850 L 174.000 76.880 C 188.000 79.330 202.640 77.780 218.000 68.000 ZM 162.000 73.870 L 162.000 121.270 C 154.400 118.420 146.690 114.610 138.660 110.630 C 129.500 106.100 119.950 101.370 110.000 98.130 L 110.000 50.710 C 117.953 53.860 125.743 57.408 133.340 61.340 C 142.500 65.870 152.050 70.590 162.000 73.830 ZM 98.000 47.130 L 98.000 95.000 C 84.000 92.550 69.360 94.110 54.000 103.930 L 54.000 58.750 C 69.530 46.150 83.750 44.130 98.000 47.130 ZM 86.630 154.000 C 76.130 154.000 65.240 156.790 54.000 164.000 L 54.000 118.790 C 69.530 106.180 83.750 104.140 98.000 107.140 L 98.000 155.070 C 94.248 154.387 90.444 154.029 86.630 154.000 ZM 110.000 158.110 L 110.000 110.720 C 117.600 113.560 125.310 117.380 133.340 121.350 C 142.500 125.880 152.050 130.610 162.000 133.850 L 162.000 181.240 C 154.400 178.390 146.690 174.580 138.660 170.610 C 129.500 166.070 120.000 161.350 110.000 158.110 ZM 174.000 184.810 L 174.000 136.890 C 177.754 137.549 181.558 137.884 185.370 137.890 C 195.870 137.890 206.760 135.110 218.000 127.890 L 218.000 173.130 C 202.470 185.790 188.250 187.810 174.000 184.810 Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
