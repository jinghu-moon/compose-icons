package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorLightIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.880 30.120 C 222.317 26.502 217.058 25.128 212.180 26.540 L 212.070 26.540 L 20.140 84.770 C 14.559 86.386 10.557 91.282 10.082 97.072 C 9.606 102.863 12.757 108.346 18.000 110.850 L 103.560 152.490 L 145.120 238.000 C 147.406 242.895 152.327 246.017 157.730 246.000 C 158.130 246.000 158.540 246.000 158.940 245.950 C 164.746 245.493 169.652 241.466 171.230 235.860 L 229.430 43.930 L 229.430 43.820 C 230.850 38.948 229.487 33.689 225.880 30.120 ZM 217.880 40.520 L 159.730 232.430 L 159.730 232.540 C 159.502 233.355 158.786 233.939 157.942 233.997 C 157.097 234.055 156.308 233.576 155.970 232.800 L 115.290 149.220 L 164.290 100.220 C 166.634 97.876 166.634 94.074 164.290 91.730 C 161.946 89.386 158.144 89.386 155.800 91.730 L 106.800 140.730 L 23.150 100.000 C 22.391 99.646 21.932 98.857 22.002 98.022 C 22.071 97.187 22.653 96.484 23.460 96.260 L 23.570 96.260 L 215.480 38.080 C 216.167 37.887 216.904 38.087 217.400 38.600 C 217.902 39.102 218.100 39.833 217.920 40.520 Z"),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
