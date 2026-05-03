package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorDuotoneIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 176.000 L 112.000 224.000 L 112.000 128.000 ZM 167.470 73.600 L 112.000 32.000 L 112.000 128.000 L 167.470 86.400 C 169.484 84.889 170.670 82.518 170.670 80.000 C 170.670 77.482 169.484 75.111 167.470 73.600 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 180.800 169.600 L 125.330 128.000 L 148.800 110.400 C 152.335 107.749 153.051 102.735 150.400 99.200 C 147.749 95.665 142.735 94.949 139.200 97.600 L 120.000 112.000 L 120.000 48.000 L 139.200 62.400 C 142.735 65.051 147.749 64.335 150.400 60.800 C 153.051 57.265 152.335 52.251 148.800 49.600 L 116.800 25.600 C 114.376 23.782 111.133 23.489 108.422 24.845 C 105.712 26.200 104.000 28.970 104.000 32.000 L 104.000 112.000 L 52.800 73.600 C 49.265 70.949 44.251 71.665 41.600 75.200 C 38.949 78.735 39.665 83.749 43.200 86.400 L 98.670 128.000 L 43.200 169.600 C 39.665 172.251 38.949 177.265 41.600 180.800 C 44.251 184.335 49.265 185.051 52.800 182.400 L 104.000 144.000 L 104.000 224.000 C 104.000 227.030 105.712 229.800 108.422 231.155 C 111.133 232.511 114.376 232.218 116.800 230.400 L 180.800 182.400 C 182.814 180.889 184.000 178.518 184.000 176.000 C 184.000 173.482 182.814 171.111 180.800 169.600 ZM 120.000 208.000 L 120.000 144.000 L 162.670 176.000 ZM 237.660 98.340 C 240.786 101.466 240.786 106.534 237.660 109.660 C 234.534 112.786 229.466 112.786 226.340 109.660 L 208.000 91.310 L 189.660 109.660 C 186.534 112.786 181.466 112.786 178.340 109.660 C 175.214 106.534 175.214 101.466 178.340 98.340 L 196.690 80.000 L 178.340 61.660 C 175.214 58.534 175.214 53.466 178.340 50.340 C 181.466 47.214 186.534 47.214 189.660 50.340 L 208.000 68.690 L 226.340 50.340 C 229.466 47.214 234.534 47.214 237.660 50.340 C 240.786 53.466 240.786 58.534 237.660 61.660 L 219.310 80.000 Z"),
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
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
