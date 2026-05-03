package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorFillIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.660 77.600 C 236.159 79.102 234.123 79.946 232.000 79.946 C 229.877 79.946 227.841 79.102 226.340 77.600 L 208.000 59.250 L 179.300 88.000 L 213.650 122.350 C 216.776 125.476 216.776 130.544 213.650 133.670 C 210.524 136.796 205.456 136.796 202.330 133.670 L 196.000 127.270 L 112.000 211.270 C 108.998 214.296 104.912 215.998 100.650 216.000 L 51.260 216.000 L 29.600 237.660 C 28.027 239.235 25.870 240.083 23.646 240.001 C 21.422 239.920 19.333 238.916 17.880 237.230 C 15.166 233.934 15.432 229.109 18.490 226.130 L 39.940 204.670 L 39.940 155.280 C 39.950 151.048 41.636 146.992 44.630 144.000 L 59.810 128.820 C 60.560 128.069 61.578 127.647 62.640 127.647 C 63.702 127.647 64.720 128.069 65.470 128.820 L 94.300 157.630 C 97.426 160.756 102.494 160.756 105.620 157.630 C 108.746 154.504 108.746 149.436 105.620 146.310 L 76.780 117.470 C 76.029 116.720 75.607 115.702 75.607 114.640 C 75.607 113.578 76.029 112.560 76.780 111.810 L 87.780 100.810 C 88.530 100.059 89.548 99.637 90.610 99.637 C 91.672 99.637 92.690 100.059 93.440 100.810 L 122.280 129.650 C 125.406 132.776 130.474 132.776 133.600 129.650 C 136.726 126.524 136.726 121.456 133.600 118.330 L 104.790 89.460 C 104.039 88.710 103.617 87.692 103.617 86.630 C 103.617 85.568 104.039 84.550 104.790 83.800 L 128.660 59.940 L 122.310 53.590 C 120.778 52.059 119.933 49.972 119.967 47.807 C 120.001 45.641 120.911 43.582 122.490 42.100 C 125.778 39.168 130.792 39.349 133.860 42.510 L 168.000 76.630 L 196.690 47.930 L 178.330 29.580 C 176.797 28.050 175.950 25.964 175.982 23.799 C 176.014 21.634 176.923 19.574 178.500 18.090 C 181.791 15.157 186.809 15.338 189.880 18.500 L 237.660 66.280 C 239.162 67.781 240.006 69.817 240.006 71.940 C 240.006 74.063 239.162 76.099 237.660 77.600 Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
