package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorBoldIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 104.000 C 144.000 112.837 136.837 120.000 128.000 120.000 C 119.163 120.000 112.000 112.837 112.000 104.000 C 112.000 95.163 119.163 88.000 128.000 88.000 C 136.837 88.000 144.000 95.163 144.000 104.000 ZM 236.000 129.530 C 235.032 187.675 188.318 234.676 130.180 236.000 L 127.930 236.000 C 101.435 236.169 75.814 226.531 56.000 208.940 C 52.690 206.113 51.171 201.715 52.030 197.447 C 52.889 193.180 55.992 189.712 60.138 188.386 C 64.285 187.060 68.824 188.083 72.000 191.060 C 76.924 195.456 82.364 199.237 88.200 202.320 L 109.740 172.700 C 89.340 165.700 67.830 169.370 55.310 171.490 C 41.764 173.851 28.062 168.242 20.060 157.060 C 19.900 156.850 19.750 156.630 19.610 156.410 L 5.830 134.410 C 2.362 128.872 3.962 121.578 9.430 118.000 L 108.000 53.510 L 108.000 32.000 C 108.000 25.373 113.373 20.000 120.000 20.000 L 128.000 20.000 C 156.910 19.997 184.615 31.585 204.914 52.171 C 225.212 72.758 236.410 100.622 236.000 129.530 ZM 212.000 129.200 C 212.650 83.898 177.256 46.243 132.000 44.090 L 132.000 60.000 C 131.986 64.034 129.946 67.791 126.570 70.000 L 32.410 131.610 L 39.720 143.290 C 42.433 146.842 46.896 148.591 51.300 147.830 C 67.530 145.080 100.700 139.470 130.940 155.830 C 149.601 154.301 163.974 138.723 164.000 120.000 C 164.000 113.373 169.373 108.000 176.000 108.000 C 182.627 108.000 188.000 113.373 188.000 120.000 C 187.958 150.659 164.841 176.369 134.360 179.660 L 111.910 210.530 C 117.778 211.619 123.743 212.105 129.710 211.980 C 174.899 210.915 211.203 174.394 212.000 129.200 Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
