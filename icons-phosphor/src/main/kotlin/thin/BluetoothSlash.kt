package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorThinIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.000 213.310 L 59.000 37.310 C 57.514 35.653 54.967 35.514 53.310 37.000 C 51.653 38.486 51.514 41.033 53.000 42.690 L 127.000 124.110 L 126.860 124.110 C 126.687 124.161 126.517 124.221 126.350 124.290 L 126.200 124.350 L 126.150 124.350 C 125.954 124.451 125.767 124.568 125.590 124.700 L 125.540 124.700 L 61.540 172.700 C 59.773 174.025 59.415 176.533 60.740 178.300 C 62.065 180.067 64.573 180.425 66.340 179.100 L 124.000 136.000 L 124.000 224.000 C 123.999 225.516 124.855 226.902 126.210 227.580 C 126.767 227.855 127.379 227.999 128.000 228.000 C 128.865 228.000 129.708 227.719 130.400 227.200 L 184.140 186.900 L 213.000 218.690 C 213.956 219.768 215.417 220.248 216.826 219.948 C 218.235 219.647 219.374 218.613 219.807 217.239 C 220.240 215.865 219.902 214.364 218.920 213.310 ZM 132.000 216.000 L 132.000 136.000 L 150.440 149.830 L 178.730 181.000 ZM 124.000 71.630 L 124.000 32.000 C 124.000 30.485 124.856 29.100 126.211 28.422 C 127.566 27.745 129.188 27.891 130.400 28.800 L 194.400 76.800 C 195.407 77.555 196.000 78.741 196.000 80.000 C 196.000 81.259 195.407 82.445 194.400 83.200 L 160.870 108.350 C 160.178 108.869 159.335 109.150 158.470 109.150 C 156.748 109.150 155.220 108.048 154.675 106.415 C 154.131 104.782 154.693 102.983 156.070 101.950 L 185.330 79.950 L 132.000 40.000 L 132.000 71.630 C 132.000 73.839 130.209 75.630 128.000 75.630 C 125.791 75.630 124.000 73.839 124.000 71.630 Z"),
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
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
