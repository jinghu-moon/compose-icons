package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Racquet: ImageVector
    get() {
        if (_racquet != null) return _racquet!!
        _racquet = phosphorFillIcon(
            name = "Racquet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 26.050 C 202.000 -1.880 151.530 3.160 117.400 37.300 C 85.610 69.090 79.070 115.070 100.890 143.790 L 71.330 173.350 L 70.650 172.670 C 67.649 169.666 63.577 167.977 59.330 167.977 C 55.083 167.977 51.011 169.666 48.010 172.670 L 20.690 200.000 C 17.686 203.001 15.997 207.073 15.997 211.320 C 15.997 215.567 17.686 219.639 20.690 222.640 L 33.380 235.330 C 36.381 238.331 40.451 240.018 44.695 240.018 C 48.939 240.018 53.009 238.331 56.010 235.330 L 56.010 235.330 L 83.340 208.000 C 86.341 204.999 88.028 200.929 88.028 196.685 C 88.028 192.441 86.341 188.371 83.340 185.370 L 82.650 184.680 L 112.210 155.120 C 123.500 163.700 137.450 167.910 152.210 167.910 C 174.930 167.910 199.460 157.910 218.750 138.610 C 252.830 104.470 257.880 54.000 230.000 26.050 ZM 224.230 104.000 L 200.060 104.000 L 200.060 72.000 L 232.060 72.000 C 231.942 83.126 229.263 94.076 224.230 104.000 ZM 136.000 149.610 C 121.779 145.346 110.654 134.221 106.390 120.000 L 136.000 120.000 ZM 104.000 104.000 C 104.120 92.870 106.810 81.919 111.860 72.000 L 136.000 72.000 L 136.000 104.000 ZM 152.000 72.000 L 184.000 72.000 L 184.000 104.000 L 152.000 104.000 ZM 229.670 56.000 L 200.060 56.000 L 200.060 26.280 C 214.304 30.552 225.448 41.696 229.720 55.940 ZM 183.850 24.000 L 184.010 24.000 L 184.010 56.000 L 152.010 56.000 L 152.010 31.760 C 161.898 26.734 172.809 24.045 183.900 23.900 ZM 136.000 42.060 L 136.000 55.940 L 122.160 55.940 C 124.211 53.382 126.401 50.938 128.720 48.620 C 131.030 46.307 133.460 44.117 136.000 42.060 ZM 152.000 151.980 L 152.000 120.000 L 184.000 120.000 L 184.000 144.160 C 174.095 149.196 163.161 151.879 152.050 152.000 ZM 200.000 133.840 L 200.000 120.000 L 214.000 120.000 C 211.946 122.556 209.756 124.999 207.440 127.320 C 205.101 129.627 202.638 131.804 200.060 133.840 Z"),
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
        return _racquet!!
    }

private var _racquet: ImageVector? = null
