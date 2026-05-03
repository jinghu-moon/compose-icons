package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorLightIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 179.600 171.200 L 122.000 128.000 L 147.600 108.800 C 150.251 106.812 150.788 103.051 148.800 100.400 C 146.812 97.749 143.051 97.212 140.400 99.200 L 118.000 116.000 L 118.000 44.000 L 140.400 60.800 C 143.051 62.788 146.812 62.251 148.800 59.600 C 150.788 56.949 150.251 53.188 147.600 51.200 L 115.600 27.200 C 113.782 25.836 111.349 25.617 109.317 26.633 C 107.284 27.650 106.000 29.727 106.000 32.000 L 106.000 116.000 L 51.600 75.200 C 48.949 73.212 45.188 73.749 43.200 76.400 C 41.212 79.051 41.749 82.812 44.400 84.800 L 102.000 128.000 L 44.400 171.200 C 41.749 173.188 41.212 176.949 43.200 179.600 C 45.188 182.251 48.949 182.788 51.600 180.800 L 106.000 140.000 L 106.000 224.000 C 106.000 226.273 107.284 228.350 109.317 229.367 C 111.349 230.383 113.782 230.164 115.600 228.800 L 179.600 180.800 C 181.111 179.667 182.000 177.889 182.000 176.000 C 182.000 174.111 181.111 172.333 179.600 171.200 ZM 118.000 212.000 L 118.000 140.000 L 166.000 176.000 ZM 236.240 99.760 C 237.845 101.256 238.506 103.508 237.963 105.634 C 237.420 107.760 235.760 109.420 233.634 109.963 C 231.508 110.506 229.256 109.845 227.760 108.240 L 208.000 88.490 L 188.240 108.240 C 185.876 110.443 182.192 110.378 179.907 108.093 C 177.622 105.808 177.557 102.124 179.760 99.760 L 199.510 80.000 L 179.760 60.240 C 177.557 57.876 177.622 54.192 179.907 51.907 C 182.192 49.622 185.876 49.557 188.240 51.760 L 208.000 71.510 L 227.760 51.760 C 230.124 49.557 233.808 49.622 236.093 51.907 C 238.378 54.192 238.443 57.876 236.240 60.240 L 216.490 80.000 Z"),
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
