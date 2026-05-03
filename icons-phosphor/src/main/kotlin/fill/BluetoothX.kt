package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorFillIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 176.000 C 184.000 178.518 182.814 180.889 180.800 182.400 L 116.800 230.400 C 115.415 231.439 113.731 232.000 112.000 232.000 C 110.551 232.004 109.130 231.610 107.890 230.860 C 105.420 229.317 103.940 226.592 103.990 223.680 L 103.990 144.000 L 52.760 182.400 C 49.245 185.035 44.264 184.343 41.600 180.850 C 38.985 177.186 39.786 172.103 43.400 169.420 L 98.660 128.000 L 43.380 86.570 C 39.921 84.044 38.993 79.280 41.250 75.640 C 42.464 73.788 44.390 72.523 46.571 72.144 C 48.752 71.765 50.993 72.306 52.760 73.640 L 104.000 112.000 L 104.000 32.240 C 103.959 29.812 104.996 27.491 106.830 25.900 C 109.682 23.471 113.838 23.346 116.830 25.600 L 150.450 50.800 C 151.438 51.566 152.012 52.750 152.000 54.000 L 152.000 106.000 C 152.000 107.259 151.407 108.445 150.400 109.200 L 125.340 128.000 L 180.840 169.600 C 182.839 171.119 184.009 173.489 184.000 176.000 ZM 237.470 98.130 L 219.370 80.000 L 237.480 61.890 C 240.646 58.824 240.827 53.806 237.890 50.520 C 236.408 48.941 234.349 48.031 232.183 47.997 C 230.018 47.963 227.931 48.808 226.400 50.340 L 208.050 68.690 L 189.930 50.580 C 187.054 47.607 182.418 47.230 179.100 49.700 C 177.281 51.111 176.159 53.237 176.019 55.535 C 175.879 57.832 176.736 60.079 178.370 61.700 L 196.730 80.000 L 178.580 98.130 C 175.520 101.109 175.259 105.938 177.980 109.230 C 179.433 110.912 181.520 111.914 183.741 111.996 C 185.963 112.078 188.118 111.231 189.690 109.660 L 208.050 91.310 L 226.400 109.660 C 227.973 111.235 230.130 112.083 232.354 112.001 C 234.578 111.920 236.667 110.916 238.120 109.230 C 240.834 105.934 240.568 101.109 237.510 98.130 Z"),
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
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
