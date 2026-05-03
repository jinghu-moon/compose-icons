package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorLightIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.000 100.000 C 134.000 105.523 129.523 110.000 124.000 110.000 C 118.477 110.000 114.000 105.523 114.000 100.000 C 114.000 94.477 118.477 90.000 124.000 90.000 C 129.523 90.000 134.000 94.477 134.000 100.000 ZM 230.000 129.450 C 229.080 184.361 184.964 228.746 130.060 230.000 L 127.930 230.000 C 102.911 230.168 78.715 221.074 60.000 204.470 C 58.345 203.056 57.585 200.857 58.015 198.724 C 58.445 196.590 59.996 194.856 62.069 194.193 C 64.142 193.530 66.412 194.042 68.000 195.530 C 74.591 201.419 82.039 206.272 90.090 209.920 L 119.090 170.030 C 95.160 158.660 68.910 163.100 54.290 165.580 C 43.005 167.551 31.588 162.888 24.910 153.580 C 24.831 153.477 24.758 153.371 24.690 153.260 L 10.900 131.260 C 10.053 129.904 9.783 128.265 10.149 126.709 C 10.515 125.153 11.487 123.807 12.850 122.970 L 114.000 60.650 L 114.000 32.000 C 114.000 28.686 116.686 26.000 120.000 26.000 L 128.000 26.000 C 155.305 25.997 181.471 36.942 200.642 56.386 C 219.813 75.829 230.388 102.148 230.000 129.450 ZM 218.000 129.280 C 218.343 105.190 209.012 81.967 192.096 64.811 C 175.181 47.655 152.093 37.998 128.000 38.000 L 126.000 38.000 L 126.000 64.000 C 125.999 66.084 124.916 68.019 123.140 69.110 L 24.290 129.940 L 34.760 146.680 C 38.787 152.179 45.586 154.916 52.300 153.740 C 68.120 151.070 100.720 145.560 129.530 161.960 C 152.111 161.137 169.993 142.596 170.000 120.000 C 170.000 116.686 172.686 114.000 176.000 114.000 C 179.314 114.000 182.000 116.686 182.000 120.000 C 181.965 148.592 159.672 172.213 131.130 173.900 L 101.770 214.270 C 110.874 216.939 120.334 218.197 129.820 218.000 C 178.258 216.880 217.176 177.724 218.000 129.280 Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
