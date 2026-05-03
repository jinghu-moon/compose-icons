package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorBoldIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.200 118.400 L 203.200 82.400 C 199.564 79.673 194.699 79.234 190.633 81.267 C 186.568 83.300 184.000 87.455 184.000 92.000 L 184.000 116.000 L 76.000 116.000 L 76.000 76.000 L 98.060 76.000 C 103.904 92.531 120.808 102.446 138.089 99.482 C 155.370 96.517 168.001 81.533 168.001 64.000 C 168.001 46.467 155.370 31.483 138.089 28.518 C 120.808 25.554 103.904 35.469 98.060 52.000 L 72.000 52.000 C 60.954 52.000 52.000 60.954 52.000 72.000 L 52.000 116.000 L 12.000 116.000 C 5.373 116.000 0.000 121.373 0.000 128.000 C 0.000 134.627 5.373 140.000 12.000 140.000 L 52.000 140.000 L 52.000 184.000 C 52.000 195.046 60.954 204.000 72.000 204.000 L 96.000 204.000 L 96.000 208.000 C 96.000 219.046 104.954 228.000 116.000 228.000 L 148.000 228.000 C 159.046 228.000 168.000 219.046 168.000 208.000 L 168.000 176.000 C 168.000 164.954 159.046 156.000 148.000 156.000 L 116.000 156.000 C 104.954 156.000 96.000 164.954 96.000 176.000 L 96.000 180.000 L 76.000 180.000 L 76.000 140.000 L 184.000 140.000 L 184.000 164.000 C 184.000 168.545 186.568 172.700 190.633 174.733 C 194.699 176.766 199.564 176.327 203.200 173.600 L 251.200 137.600 C 254.222 135.334 256.000 131.777 256.000 128.000 C 256.000 124.223 254.222 120.666 251.200 118.400 ZM 132.000 52.000 C 138.627 52.000 144.000 57.373 144.000 64.000 C 144.000 70.627 138.627 76.000 132.000 76.000 C 125.373 76.000 120.000 70.627 120.000 64.000 C 120.000 57.373 125.373 52.000 132.000 52.000 ZM 120.000 180.000 L 144.000 180.000 L 144.000 204.000 L 120.000 204.000 ZM 208.000 140.000 L 208.000 116.000 L 224.000 128.000 Z"),
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
        return _usb!!
    }

private var _usb: ImageVector? = null
