package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorBoldIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.000 112.000 C 227.871 109.745 223.849 109.131 220.190 110.350 L 196.380 118.280 C 193.033 119.399 190.349 121.933 189.040 125.210 L 175.370 159.390 L 141.190 173.060 C 137.913 174.369 135.379 177.053 134.260 180.400 L 126.330 204.210 C 125.111 207.871 125.728 211.896 127.986 215.024 C 130.245 218.153 133.871 220.005 137.730 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 121.730 C 235.995 117.871 234.134 114.251 231.000 112.000 ZM 212.000 196.000 L 154.380 196.000 L 155.290 193.270 L 189.080 179.760 C 192.126 178.540 194.540 176.126 195.760 173.080 L 209.270 139.290 L 212.000 138.380 ZM 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 95.570 220.000 C 100.753 220.019 105.363 216.708 107.000 211.790 L 123.210 163.000 L 158.300 149.000 C 161.358 147.780 163.780 145.358 165.000 142.300 L 179.000 107.210 L 227.790 91.000 C 232.708 89.363 236.019 84.753 236.000 79.570 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 102.200 150.160 L 86.920 196.000 L 44.000 196.000 L 44.000 173.660 L 92.000 125.660 L 109.140 142.800 L 109.140 142.800 C 105.855 144.111 103.316 146.804 102.200 150.160 ZM 212.000 70.920 L 166.160 86.200 C 162.810 87.316 160.121 89.851 158.810 93.130 L 144.610 128.610 L 133.390 133.100 L 106.140 105.860 C 98.330 98.052 85.670 98.052 77.860 105.860 L 44.000 139.720 L 44.000 60.000 L 212.000 60.000 Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
