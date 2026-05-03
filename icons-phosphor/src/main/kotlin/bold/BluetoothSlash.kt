package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) return _bluetoothSlash!!
        _bluetoothSlash = phosphorBoldIcon(
            name = "BluetoothSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.880 207.930 L 64.880 31.930 C 60.402 27.120 52.889 26.806 48.026 31.226 C 43.163 35.645 42.759 43.154 47.120 48.070 L 115.000 122.750 L 56.800 166.400 C 51.498 170.376 50.424 177.898 54.400 183.200 C 58.376 188.502 65.898 189.576 71.200 185.600 L 116.000 152.000 L 116.000 224.000 C 116.000 228.545 118.568 232.700 122.633 234.733 C 126.699 236.766 131.564 236.327 135.200 233.600 L 183.110 197.660 L 207.110 224.070 C 211.588 228.880 219.101 229.194 223.964 224.774 C 228.827 220.355 229.231 212.846 224.870 207.930 ZM 140.000 200.000 L 140.000 152.000 L 145.000 155.770 L 166.870 179.830 ZM 116.000 59.740 L 116.000 32.000 C 116.000 27.455 118.568 23.300 122.633 21.267 C 126.699 19.234 131.564 19.673 135.200 22.400 L 199.200 70.400 C 202.222 72.666 204.000 76.223 204.000 80.000 C 204.000 83.777 202.222 87.334 199.200 89.600 L 172.100 109.930 C 166.798 113.906 159.276 112.832 155.300 107.530 C 151.324 102.228 152.398 94.706 157.700 90.730 L 172.000 80.000 L 140.000 56.000 L 140.000 59.740 C 140.000 66.367 134.627 71.740 128.000 71.740 C 121.373 71.740 116.000 66.367 116.000 59.740 Z"),
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
