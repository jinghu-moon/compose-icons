package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorThinIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 124.000 C 214.622 124.001 213.341 124.711 212.610 125.880 C 206.893 135.113 200.328 143.794 193.000 151.810 L 174.380 53.810 C 173.609 49.642 170.697 46.190 166.718 44.729 C 162.740 43.267 158.286 44.013 155.000 46.690 L 130.500 67.130 C 129.062 68.283 127.021 68.304 125.560 67.180 L 100.900 46.640 C 97.611 44.008 93.182 43.294 89.232 44.758 C 85.282 46.222 82.389 49.650 81.610 53.790 L 63.000 151.810 C 55.676 143.794 49.114 135.113 43.400 125.880 C 42.668 124.708 41.382 123.997 40.000 124.000 C 20.118 124.000 4.000 140.118 4.000 160.000 C 4.000 179.882 20.118 196.000 40.000 196.000 L 216.000 196.000 C 235.882 196.000 252.000 179.882 252.000 160.000 C 252.000 140.118 235.882 124.000 216.000 124.000 ZM 89.480 55.280 C 89.735 53.912 90.682 52.774 91.982 52.276 C 93.281 51.778 94.746 51.992 95.850 52.840 L 120.500 73.380 C 124.909 76.905 131.179 76.880 135.560 73.320 L 160.090 52.890 C 161.179 51.996 162.664 51.756 163.980 52.260 C 165.297 52.743 166.265 53.882 166.530 55.260 L 181.110 132.000 L 74.890 132.000 ZM 40.000 188.000 C 24.941 188.019 12.564 176.124 11.985 161.076 C 11.407 146.028 22.834 133.217 37.850 132.080 C 58.300 164.000 80.590 180.000 97.900 188.000 ZM 128.000 188.000 L 128.000 188.000 C 127.730 188.000 116.220 187.790 100.230 180.160 C 89.021 174.677 78.750 167.454 69.800 158.760 L 73.370 140.000 L 182.630 140.000 L 186.190 158.760 C 177.240 167.454 166.969 174.677 155.760 180.160 C 139.770 187.790 128.260 188.000 128.000 188.000 ZM 216.000 188.000 L 158.100 188.000 C 175.410 180.000 197.700 164.000 218.150 132.080 C 233.166 133.217 244.593 146.028 244.015 161.076 C 243.436 176.124 231.059 188.019 216.000 188.000 Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
