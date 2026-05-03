package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorBoldIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 220.000 L 186.410 220.000 L 181.690 187.000 C 190.640 189.978 200.454 186.299 205.240 178.170 L 217.240 157.840 C 219.937 153.267 220.705 147.810 219.375 142.670 C 218.045 137.531 214.726 133.131 210.150 130.440 L 178.580 111.860 L 217.240 46.180 C 219.934 41.609 220.702 36.155 219.374 31.018 C 218.047 25.881 214.732 21.482 210.160 18.790 L 189.820 6.790 C 185.248 4.096 179.793 3.330 174.656 4.660 C 169.519 5.990 165.121 9.306 162.430 13.880 L 143.840 45.430 L 78.150 6.770 C 73.578 4.076 68.123 3.310 62.986 4.640 C 57.849 5.970 53.451 9.286 50.760 13.860 L 38.760 34.190 C 36.063 38.763 35.295 44.220 36.625 49.360 C 37.955 54.499 41.274 58.899 45.850 61.590 L 77.430 80.170 L 38.770 145.850 C 36.076 150.421 35.308 155.875 36.636 161.012 C 37.963 166.149 41.278 170.548 45.850 173.240 L 66.190 185.240 C 68.636 186.686 71.364 187.590 74.190 187.890 L 69.590 220.000 L 32.000 220.000 C 25.373 220.000 20.000 225.373 20.000 232.000 C 20.000 238.627 25.373 244.000 32.000 244.000 L 224.000 244.000 C 230.627 244.000 236.000 238.627 236.000 232.000 C 236.000 225.373 230.627 220.000 224.000 220.000 ZM 186.590 162.530 L 124.330 125.890 L 132.260 112.430 L 194.520 149.080 ZM 181.070 29.530 L 194.530 37.460 L 157.890 99.670 L 144.430 91.750 ZM 69.410 29.530 L 131.670 66.170 L 123.740 79.630 L 61.480 42.930 ZM 61.470 154.590 L 98.110 92.340 L 111.570 100.260 L 74.930 162.520 ZM 101.810 164.150 L 112.160 146.580 L 155.300 172.000 L 162.160 220.000 L 93.840 220.000 Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
