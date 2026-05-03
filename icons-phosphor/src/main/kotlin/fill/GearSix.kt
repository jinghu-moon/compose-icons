package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GearSix: ImageVector
    get() {
        if (_gearSix != null) return _gearSix!!
        _gearSix = phosphorFillIcon(
            name = "GearSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.940 107.210 C 237.489 104.930 236.069 102.960 234.050 101.810 L 204.220 84.810 L 204.100 51.190 C 204.093 48.847 203.058 46.624 201.270 45.110 C 190.449 35.957 177.988 28.943 164.550 24.440 C 162.410 23.716 160.063 23.930 158.090 25.030 L 128.000 41.850 L 97.880 25.000 C 95.905 23.894 93.554 23.676 91.410 24.400 C 77.980 28.932 65.532 35.973 54.730 45.150 C 52.944 46.662 51.910 48.880 51.900 51.220 L 51.750 84.870 L 21.920 101.870 C 19.901 103.020 18.481 104.990 18.030 107.270 C 15.300 120.989 15.300 135.111 18.030 148.830 C 18.481 151.110 19.901 153.080 21.920 154.230 L 51.750 171.230 L 51.870 204.860 C 51.877 207.203 52.912 209.426 54.700 210.940 C 65.521 220.093 77.982 227.107 91.420 231.610 C 93.560 232.334 95.907 232.120 97.880 231.020 L 128.000 214.150 L 158.120 231.000 C 159.312 231.664 160.656 232.009 162.020 232.000 C 162.894 232.000 163.762 231.858 164.590 231.580 C 178.017 227.050 190.463 220.016 201.270 210.850 C 203.056 209.338 204.090 207.120 204.100 204.780 L 204.250 171.130 L 234.080 154.130 C 236.099 152.980 237.519 151.010 237.970 148.730 C 240.685 135.022 240.675 120.914 237.940 107.210 ZM 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 Z"),
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
        return _gearSix!!
    }

private var _gearSix: ImageVector? = null
