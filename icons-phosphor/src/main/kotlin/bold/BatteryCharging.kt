package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorBoldIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 52.000 L 28.000 52.000 C 12.536 52.000 0.000 64.536 0.000 80.000 L 0.000 176.000 C 0.000 191.464 12.536 204.000 28.000 204.000 L 196.000 204.000 C 211.464 204.000 224.000 191.464 224.000 176.000 L 224.000 80.000 C 224.000 64.536 211.464 52.000 196.000 52.000 ZM 200.000 176.000 C 200.000 178.209 198.209 180.000 196.000 180.000 L 28.000 180.000 C 25.791 180.000 24.000 178.209 24.000 176.000 L 24.000 80.000 C 24.000 77.791 25.791 76.000 28.000 76.000 L 196.000 76.000 C 198.209 76.000 200.000 77.791 200.000 80.000 ZM 256.000 104.000 L 256.000 152.000 C 256.000 158.627 250.627 164.000 244.000 164.000 C 237.373 164.000 232.000 158.627 232.000 152.000 L 232.000 104.000 C 232.000 97.373 237.373 92.000 244.000 92.000 C 250.627 92.000 256.000 97.373 256.000 104.000 ZM 142.380 122.000 C 144.524 125.713 144.524 130.287 142.380 134.000 L 126.380 162.000 C 124.283 165.779 120.315 168.138 115.994 168.176 C 111.672 168.214 107.664 165.925 105.500 162.184 C 103.336 158.442 103.352 153.827 105.540 150.100 L 111.320 140.000 L 100.000 140.000 C 95.708 140.010 91.737 137.727 89.587 134.012 C 87.437 130.297 87.434 125.717 89.580 122.000 L 105.580 94.000 C 108.894 88.245 116.245 86.266 122.000 89.580 C 127.755 92.894 129.734 100.245 126.420 106.000 L 120.680 116.000 L 132.000 116.000 C 136.283 116.004 140.239 118.291 142.380 122.000 Z"),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
