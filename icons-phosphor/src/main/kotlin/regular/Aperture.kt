package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorRegularIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 190.230 65.780 C 194.332 69.900 198.017 74.415 201.230 79.260 L 167.550 119.000 L 139.630 40.780 C 158.799 43.284 176.595 52.077 190.230 65.780 ZM 155.590 133.000 L 137.430 154.370 L 109.840 149.370 L 100.410 123.000 L 118.570 101.630 L 146.160 106.630 ZM 65.770 65.780 C 80.879 50.589 101.044 41.482 122.430 40.190 L 139.940 89.190 L 58.300 74.320 C 60.604 71.316 63.099 68.463 65.770 65.780 ZM 46.650 161.540 C 37.047 138.089 37.968 111.645 49.180 88.920 L 100.390 98.270 ZM 65.770 190.220 C 61.668 186.100 57.983 181.585 54.770 176.740 L 88.450 137.000 L 116.370 215.180 C 97.206 212.687 79.411 203.909 65.770 190.220 ZM 190.230 190.220 C 175.121 205.411 154.956 214.518 133.570 215.810 L 116.060 166.810 L 197.700 181.720 C 195.395 184.711 192.900 187.550 190.230 190.220 ZM 155.610 157.730 L 209.350 94.460 C 218.953 117.911 218.032 144.355 206.820 167.080 Z"),
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
