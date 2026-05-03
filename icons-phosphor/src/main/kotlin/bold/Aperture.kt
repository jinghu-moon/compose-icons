package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorBoldIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.410 51.630 C 162.233 9.455 93.852 9.457 51.677 51.633 C 9.501 93.810 9.501 162.190 51.677 204.367 C 93.852 246.543 162.233 246.545 204.410 204.370 C 224.819 184.198 236.304 156.696 236.304 128.000 C 236.304 99.304 224.819 71.802 204.410 51.630 ZM 187.410 68.630 C 190.637 71.841 193.596 75.309 196.260 79.000 L 169.000 111.090 L 145.700 45.880 C 161.516 49.254 176.013 57.146 187.430 68.600 ZM 68.560 68.630 C 82.260 54.860 100.336 46.302 119.670 44.430 L 133.830 84.080 L 65.710 71.610 C 66.640 70.590 67.590 69.590 68.580 68.600 ZM 48.000 153.700 C 41.664 133.868 42.875 112.394 51.400 93.400 L 92.840 101.000 ZM 68.550 187.400 C 65.336 184.178 62.390 180.700 59.740 177.000 L 87.000 144.910 L 110.300 210.120 C 94.487 206.744 79.995 198.852 68.580 187.400 ZM 104.910 123.790 L 120.090 105.940 L 143.150 110.150 L 151.030 132.210 L 135.860 150.060 L 112.800 145.850 ZM 187.400 187.400 C 173.697 201.166 155.623 209.724 136.290 211.600 L 122.150 172.000 L 190.290 184.440 C 189.360 185.410 188.410 186.410 187.430 187.400 ZM 163.160 155.000 L 208.000 102.300 C 214.337 122.133 213.123 143.608 204.590 162.600 Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
