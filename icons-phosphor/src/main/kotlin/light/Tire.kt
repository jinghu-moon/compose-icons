package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorLightIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 174.000 C 182.440 174.000 190.000 150.860 190.000 128.000 C 190.000 105.140 182.440 82.000 168.000 82.000 C 153.560 82.000 146.000 105.140 146.000 128.000 C 146.000 150.860 153.560 174.000 168.000 174.000 ZM 168.000 94.000 C 170.570 94.000 178.000 105.690 178.000 128.000 C 178.000 150.310 170.570 162.000 168.000 162.000 C 165.430 162.000 158.000 150.310 158.000 128.000 C 158.000 105.690 165.430 94.000 168.000 94.000 ZM 232.000 218.000 L 191.710 218.000 C 209.890 201.000 222.000 167.430 222.000 128.000 C 222.000 70.800 196.520 26.000 164.000 26.000 L 92.000 26.000 C 59.480 26.000 34.000 70.800 34.000 128.000 C 34.000 185.200 59.480 230.000 92.000 230.000 L 232.000 230.000 C 235.314 230.000 238.000 227.314 238.000 224.000 C 238.000 220.686 235.314 218.000 232.000 218.000 ZM 210.000 128.000 C 210.000 176.790 188.930 218.000 164.000 218.000 C 139.070 218.000 118.000 176.790 118.000 128.000 C 118.000 79.210 139.070 38.000 164.000 38.000 C 188.930 38.000 210.000 79.210 210.000 128.000 ZM 46.000 128.000 C 46.000 125.140 46.080 122.310 46.220 119.500 L 80.000 95.370 L 106.500 114.300 C 106.170 118.770 106.000 123.300 106.000 128.000 C 105.942 140.801 107.284 153.570 110.000 166.080 L 83.450 147.080 C 81.358 145.578 78.542 145.578 76.450 147.080 L 50.350 165.720 C 47.410 153.364 45.950 140.701 46.000 128.000 ZM 92.000 38.000 L 136.290 38.000 C 122.490 50.920 112.200 73.350 108.000 100.650 L 83.490 83.120 C 81.398 81.618 78.582 81.618 76.490 83.120 L 47.790 103.630 C 53.370 66.240 71.360 38.000 92.000 38.000 ZM 92.000 218.000 C 76.420 218.000 62.360 201.920 54.000 178.000 L 80.000 159.420 L 115.530 184.810 C 120.750 198.730 127.870 210.160 136.290 218.050 Z"),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
