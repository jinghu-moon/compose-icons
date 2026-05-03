package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorFillIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 128.000 C 232.001 85.935 206.662 48.012 167.799 31.915 C 128.937 15.817 84.204 24.715 54.460 54.460 C 24.715 84.204 15.817 128.937 31.915 167.799 C 48.012 206.662 85.935 232.001 128.000 232.000 L 128.090 232.000 C 185.492 231.950 232.000 185.402 232.000 128.000 ZM 49.180 88.920 L 100.390 98.270 L 46.650 161.530 C 37.047 138.083 37.969 111.642 49.180 88.920 ZM 209.350 94.460 C 218.953 117.911 218.032 144.355 206.820 167.080 L 155.610 157.730 ZM 201.270 79.260 L 167.550 119.000 L 139.630 40.780 C 158.798 43.287 176.593 52.079 190.230 65.780 C 194.343 69.900 198.041 74.415 201.270 79.260 ZM 122.430 40.190 L 139.940 89.190 L 58.300 74.320 C 60.606 71.314 63.101 68.459 65.770 65.770 C 80.882 50.585 101.046 41.482 122.430 40.190 ZM 54.730 176.740 L 88.450 137.000 L 116.370 215.180 C 91.240 211.831 68.774 197.807 54.730 176.700 ZM 133.570 215.800 L 116.060 166.800 L 139.140 171.000 L 139.140 171.000 L 197.660 181.690 C 182.237 201.819 158.841 214.267 133.530 215.810 Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
