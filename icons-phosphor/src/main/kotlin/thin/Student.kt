package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorThinIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.270 60.210 L 129.270 28.210 C 128.446 27.934 127.554 27.934 126.730 28.210 L 30.730 60.210 C 29.100 60.756 28.001 62.281 28.000 64.000 L 28.000 144.000 C 28.000 146.209 29.791 148.000 32.000 148.000 C 34.209 148.000 36.000 146.209 36.000 144.000 L 36.000 69.550 L 79.880 84.180 C 68.903 98.924 65.290 117.885 70.076 135.633 C 74.862 153.380 87.519 167.954 104.420 175.180 C 83.560 180.920 65.420 194.310 52.650 213.830 C 51.551 215.675 52.105 218.059 53.905 219.230 C 55.705 220.401 58.108 219.942 59.350 218.190 C 75.170 193.920 100.200 180.000 128.000 180.000 C 155.800 180.000 180.830 193.920 196.650 218.180 C 197.892 219.932 200.295 220.391 202.095 219.220 C 203.895 218.049 204.449 215.665 203.350 213.820 C 190.630 194.300 172.440 180.910 151.580 175.170 C 168.481 167.944 181.138 153.370 185.924 135.623 C 190.710 117.875 187.097 98.914 176.120 84.170 L 225.270 67.780 C 226.896 67.231 227.991 65.706 227.991 63.990 C 227.991 62.274 226.896 60.749 225.270 60.200 ZM 180.000 120.000 C 180.001 142.929 164.983 163.153 143.033 169.782 C 121.082 176.410 97.381 167.879 84.690 148.782 C 72.000 129.684 73.316 104.529 87.930 86.860 L 126.730 99.790 C 127.554 100.070 128.446 100.070 129.270 99.790 L 168.070 86.860 C 175.792 96.176 180.012 107.900 180.000 120.000 ZM 128.000 91.780 L 44.650 64.000 L 128.000 36.220 L 211.350 64.000 Z"),
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
        return _student!!
    }

private var _student: ImageVector? = null
