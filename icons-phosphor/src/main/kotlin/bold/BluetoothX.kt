package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorBoldIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 183.200 166.400 L 132.000 128.000 L 143.610 119.290 C 148.912 115.314 149.986 107.792 146.010 102.490 C 142.034 97.188 134.512 96.114 129.210 100.090 L 124.000 104.000 L 124.000 56.000 L 129.210 59.910 C 134.512 63.886 142.034 62.812 146.010 57.510 C 149.986 52.208 148.912 44.686 143.610 40.710 L 119.200 22.400 C 115.564 19.673 110.699 19.234 106.633 21.267 C 102.568 23.300 100.000 27.455 100.000 32.000 L 100.000 104.000 L 55.200 70.400 C 49.898 66.424 42.376 67.498 38.400 72.800 C 34.424 78.102 35.498 85.624 40.800 89.600 L 92.000 128.000 L 40.800 166.400 C 35.498 170.376 34.424 177.898 38.400 183.200 C 42.376 188.502 49.898 189.576 55.200 185.600 L 100.000 152.000 L 100.000 224.000 C 100.000 228.545 102.568 232.700 106.633 234.733 C 110.699 236.766 115.564 236.327 119.200 233.600 L 183.200 185.600 C 186.222 183.334 188.000 179.777 188.000 176.000 C 188.000 172.223 186.222 168.666 183.200 166.400 ZM 124.000 200.000 L 124.000 152.000 L 156.000 176.000 ZM 240.490 95.510 C 245.184 100.204 245.184 107.816 240.490 112.510 C 235.796 117.204 228.184 117.204 223.490 112.510 L 208.000 97.000 L 192.490 112.520 C 187.796 117.214 180.184 117.214 175.490 112.520 C 170.796 107.826 170.796 100.214 175.490 95.520 L 191.000 80.000 L 175.520 64.490 C 170.826 59.796 170.826 52.184 175.520 47.490 C 180.214 42.796 187.826 42.796 192.520 47.490 L 208.000 63.000 L 223.510 47.480 C 228.204 42.786 235.816 42.786 240.510 47.480 C 245.204 52.174 245.204 59.786 240.510 64.480 L 225.000 80.000 Z"),
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
