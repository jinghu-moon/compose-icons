package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorLightIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.450 156.000 C 251.130 154.540 228.180 129.580 191.080 115.500 C 189.580 97.010 182.950 80.190 172.080 67.500 C 157.740 50.800 137.000 42.000 112.000 42.000 C 61.490 42.000 28.500 87.380 27.120 89.310 C 25.187 92.005 25.805 95.757 28.500 97.690 C 31.195 99.623 34.947 99.005 36.880 96.310 C 37.180 95.870 67.750 54.000 112.000 54.000 C 133.370 54.000 151.000 61.350 162.930 75.270 C 171.190 84.890 176.570 97.410 178.550 111.330 C 166.191 107.805 153.402 106.011 140.550 106.000 C 114.970 106.000 93.550 112.650 78.550 125.220 C 65.450 136.220 57.930 151.560 57.930 167.220 C 57.810 179.439 62.593 191.196 71.210 199.860 C 80.560 209.120 93.470 214.000 108.600 214.000 C 160.330 214.000 189.150 170.910 191.280 128.620 C 223.330 142.110 243.280 163.710 243.550 164.020 C 245.817 166.194 249.378 166.252 251.714 164.152 C 254.050 162.052 254.371 158.505 252.450 156.020 ZM 161.000 177.530 C 151.920 188.690 135.440 202.000 108.600 202.000 C 90.000 202.000 70.000 191.120 70.000 167.250 C 70.000 143.530 92.090 118.000 140.600 118.000 C 153.778 118.044 166.869 120.142 179.400 124.220 C 179.260 143.940 172.580 163.340 161.000 177.530 Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
