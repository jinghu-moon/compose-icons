package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorThinIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 209.000 47.000 C 176.640 14.650 114.000 24.670 69.300 69.340 C 24.600 114.010 14.630 176.660 47.000 209.000 C 59.820 221.810 77.380 228.000 96.710 228.000 C 126.170 228.000 159.710 213.660 186.710 186.680 C 231.350 142.000 241.370 79.340 209.000 47.000 ZM 75.000 75.000 C 100.470 49.540 132.000 35.910 159.260 35.910 C 173.770 35.910 187.090 39.780 197.690 47.750 C 171.930 54.800 134.690 74.150 124.090 127.240 C 113.590 179.760 74.840 196.500 51.180 201.820 C 23.770 172.120 34.160 115.810 75.000 75.000 ZM 181.000 181.000 C 142.000 220.000 88.830 231.230 58.290 208.250 C 84.040 201.250 121.290 181.860 131.910 128.770 C 142.410 76.240 181.160 59.510 204.820 54.180 C 232.230 83.880 221.840 140.190 181.000 181.000 Z"),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
