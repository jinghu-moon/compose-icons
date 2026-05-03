package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorLightIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.440 212.000 L 60.440 36.000 C 58.163 33.887 54.650 33.861 52.342 35.940 C 50.034 38.019 49.695 41.516 51.560 44.000 L 123.880 123.550 L 60.400 171.200 C 57.749 173.188 57.212 176.949 59.200 179.600 C 61.188 182.251 64.949 182.788 67.600 180.800 L 122.000 140.000 L 122.000 224.000 C 122.000 226.273 123.284 228.350 125.317 229.367 C 127.349 230.383 129.782 230.164 131.600 228.800 L 183.880 189.590 L 211.560 220.000 C 213.791 222.452 217.588 222.631 220.040 220.400 C 222.492 218.169 222.671 214.372 220.440 211.920 ZM 134.000 212.000 L 134.000 140.000 L 149.090 151.310 L 175.770 180.670 ZM 122.000 71.630 L 122.000 32.000 C 122.000 29.727 123.284 27.650 125.317 26.633 C 127.349 25.617 129.782 25.836 131.600 27.200 L 195.600 75.200 C 197.111 76.333 198.000 78.111 198.000 80.000 C 198.000 81.889 197.111 83.667 195.600 84.800 L 162.070 110.000 C 159.419 111.988 155.658 111.451 153.670 108.800 C 151.682 106.149 152.219 102.388 154.870 100.400 L 182.000 80.000 L 134.000 44.000 L 134.000 71.630 C 134.000 74.944 131.314 77.630 128.000 77.630 C 124.686 77.630 122.000 74.944 122.000 71.630 Z"),
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
