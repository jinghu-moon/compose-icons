package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorLightIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 78.000 C 178.359 78.000 190.000 66.359 190.000 52.000 C 190.000 37.641 178.359 26.000 164.000 26.000 C 149.641 26.000 138.000 37.641 138.000 52.000 C 138.000 66.359 149.641 78.000 164.000 78.000 ZM 164.000 38.000 C 171.732 38.000 178.000 44.268 178.000 52.000 C 178.000 59.732 171.732 66.000 164.000 66.000 C 156.268 66.000 150.000 59.732 150.000 52.000 C 150.000 44.268 156.268 38.000 164.000 38.000 ZM 217.690 114.240 L 81.690 74.240 C 79.614 73.572 77.340 74.083 75.749 75.574 C 74.158 77.065 73.501 79.301 74.033 81.416 C 74.565 83.530 76.203 85.190 78.310 85.750 L 121.760 98.530 L 85.920 152.300 L 39.790 138.930 C 32.736 136.853 25.115 138.244 19.250 142.680 C 13.411 147.034 9.980 153.897 10.000 161.180 C 10.058 171.488 16.877 180.535 26.770 183.430 L 26.770 183.430 L 184.210 229.060 C 186.348 229.681 188.563 229.998 190.790 230.000 C 202.347 230.023 212.154 221.524 213.776 210.081 C 215.398 198.638 208.339 187.750 197.230 184.560 L 143.710 169.050 L 165.000 137.340 C 166.069 135.750 166.314 133.745 165.660 131.944 C 165.005 130.143 163.530 128.763 161.690 128.230 L 123.690 117.230 L 133.800 102.070 L 214.290 125.740 C 214.844 125.911 215.420 125.999 216.000 126.000 C 218.988 126.005 221.524 123.811 221.949 120.853 C 222.374 117.896 220.558 115.077 217.690 114.240 ZM 202.000 206.810 C 202.010 210.316 200.354 213.619 197.540 215.710 C 194.686 217.872 190.973 218.548 187.540 217.530 L 30.110 171.900 L 30.110 171.900 C 25.332 170.515 22.033 166.154 22.000 161.180 C 21.990 157.674 23.646 154.371 26.460 152.280 C 29.314 150.118 33.027 149.442 36.460 150.460 L 193.900 196.090 C 198.674 197.479 201.968 201.839 202.000 206.810 ZM 150.440 137.470 L 131.610 165.540 L 98.000 155.800 L 116.730 127.710 Z"),
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
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
