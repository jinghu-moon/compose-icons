package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorThinIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 153.820 53.160 C 155.161 52.477 156.006 51.100 156.006 49.595 C 156.006 48.090 155.161 46.713 153.820 46.030 C 140.880 39.397 126.541 35.958 112.000 36.000 C 61.190 36.000 20.000 77.190 20.000 128.000 C 20.000 178.810 61.190 220.000 112.000 220.000 C 126.538 220.052 140.878 216.623 153.820 210.000 C 155.161 209.317 156.006 207.940 156.006 206.435 C 156.006 204.930 155.161 203.553 153.820 202.870 C 125.680 188.528 107.964 159.614 107.964 128.030 C 107.964 96.446 125.680 67.532 153.820 53.190 ZM 100.000 128.000 C 99.928 159.727 116.274 189.234 143.210 206.000 C 133.289 209.986 122.692 212.023 112.000 212.000 C 65.608 212.000 28.000 174.392 28.000 128.000 C 28.000 81.608 65.608 44.000 112.000 44.000 C 122.692 43.977 133.289 46.014 143.210 50.000 C 116.274 66.766 99.928 96.273 100.000 128.000 ZM 249.580 124.330 L 220.870 111.930 L 218.380 79.690 C 218.258 78.060 217.156 76.668 215.598 76.175 C 214.039 75.682 212.337 76.187 211.300 77.450 L 191.110 101.910 L 161.000 94.450 C 159.437 94.063 157.795 94.650 156.832 95.940 C 155.870 97.231 155.774 98.972 156.590 100.360 L 172.820 128.000 L 156.550 155.640 C 155.734 157.028 155.830 158.769 156.792 160.060 C 157.755 161.350 159.397 161.937 160.960 161.550 L 191.110 154.090 L 211.300 178.550 C 212.062 179.471 213.195 180.002 214.390 180.000 C 214.798 180.001 215.203 179.937 215.590 179.810 C 217.147 179.322 218.251 177.937 218.380 176.310 L 220.870 144.070 L 249.580 131.670 C 251.043 131.036 251.989 129.594 251.989 128.000 C 251.989 126.406 251.043 124.964 249.580 124.330 ZM 215.480 137.680 C 214.119 138.269 213.195 139.562 213.080 141.040 L 211.160 165.810 L 195.670 147.050 C 194.911 146.132 193.781 145.601 192.590 145.600 C 192.253 145.598 191.917 145.638 191.590 145.720 L 168.230 151.500 L 180.910 130.000 C 181.648 128.747 181.648 127.193 180.910 125.940 L 168.270 104.500 L 191.630 110.280 C 193.108 110.632 194.657 110.117 195.630 108.950 L 211.120 90.190 L 213.080 115.000 C 213.195 116.478 214.119 117.771 215.480 118.360 L 237.900 128.000 Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
