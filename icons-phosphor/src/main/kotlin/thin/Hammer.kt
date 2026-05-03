package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorThinIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.500 114.810 L 181.050 46.900 C 145.066 11.026 86.828 11.071 50.900 47.000 L 37.120 61.180 C 36.094 62.201 35.699 63.697 36.088 65.091 C 36.478 66.485 37.590 67.560 38.996 67.902 C 40.403 68.244 41.884 67.800 42.870 66.740 L 56.600 52.560 C 63.115 46.033 70.663 40.627 78.940 36.560 L 130.340 88.000 L 31.510 186.820 C 29.251 189.072 27.981 192.130 27.981 195.320 C 27.981 198.510 29.251 201.568 31.510 203.820 L 52.200 224.480 C 54.452 226.739 57.510 228.009 60.700 228.009 C 63.890 228.009 66.948 226.739 69.200 224.480 L 168.000 125.630 L 185.170 142.810 L 185.170 142.810 L 202.830 160.470 C 205.082 162.729 208.140 163.999 211.330 163.999 C 214.520 163.999 217.578 162.729 219.830 160.470 L 248.520 131.780 C 253.200 127.088 253.191 119.491 248.500 114.810 ZM 63.500 218.810 C 62.750 219.561 61.732 219.983 60.670 219.983 C 59.608 219.983 58.590 219.561 57.840 218.810 L 37.170 198.140 C 36.419 197.390 35.997 196.372 35.997 195.310 C 35.997 194.248 36.419 193.230 37.170 192.480 L 108.000 121.630 L 134.340 148.000 ZM 165.170 117.150 L 140.000 142.320 L 113.650 116.000 L 138.830 90.800 C 139.581 90.050 140.003 89.032 140.003 87.970 C 140.003 86.908 139.581 85.890 138.830 85.140 L 86.830 33.140 C 117.592 21.795 152.143 29.359 175.350 52.520 L 222.350 99.870 L 188.000 134.320 L 170.830 117.150 C 170.080 116.399 169.062 115.977 168.000 115.977 C 166.938 115.977 165.920 116.399 165.170 117.150 ZM 242.830 126.150 L 214.150 154.840 C 213.400 155.591 212.382 156.013 211.320 156.013 C 210.258 156.013 209.240 155.591 208.490 154.840 L 193.660 140.000 L 228.050 105.600 L 242.830 120.480 C 244.381 122.040 244.381 124.560 242.830 126.120 Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
