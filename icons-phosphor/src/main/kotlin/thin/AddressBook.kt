package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorThinIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 154.700 142.750 C 168.494 134.365 175.020 117.822 170.666 102.278 C 166.312 86.734 152.143 75.988 136.000 75.988 C 119.857 75.988 105.688 86.734 101.334 102.278 C 96.980 117.822 103.506 134.365 117.300 142.750 C 104.305 146.701 92.916 154.709 84.800 165.600 C 83.475 167.367 83.833 169.875 85.600 171.200 C 87.367 172.525 89.875 172.167 91.200 170.400 C 101.776 156.299 118.374 148.000 136.000 148.000 C 153.626 148.000 170.224 156.299 180.800 170.400 C 182.125 172.167 184.633 172.525 186.400 171.200 C 188.167 169.875 188.525 167.367 187.200 165.600 C 179.082 154.711 167.694 146.704 154.700 142.750 ZM 108.000 112.000 C 108.000 96.536 120.536 84.000 136.000 84.000 C 151.464 84.000 164.000 96.536 164.000 112.000 C 164.000 127.464 151.464 140.000 136.000 140.000 C 120.536 140.000 108.000 127.464 108.000 112.000 ZM 208.000 28.000 L 64.000 28.000 C 57.373 28.000 52.000 33.373 52.000 40.000 L 52.000 68.000 L 32.000 68.000 C 29.791 68.000 28.000 69.791 28.000 72.000 C 28.000 74.209 29.791 76.000 32.000 76.000 L 52.000 76.000 L 52.000 124.000 L 32.000 124.000 C 29.791 124.000 28.000 125.791 28.000 128.000 C 28.000 130.209 29.791 132.000 32.000 132.000 L 52.000 132.000 L 52.000 180.000 L 32.000 180.000 C 29.791 180.000 28.000 181.791 28.000 184.000 C 28.000 186.209 29.791 188.000 32.000 188.000 L 52.000 188.000 L 52.000 216.000 C 52.000 222.627 57.373 228.000 64.000 228.000 L 208.000 228.000 C 214.627 228.000 220.000 222.627 220.000 216.000 L 220.000 40.000 C 220.000 33.373 214.627 28.000 208.000 28.000 ZM 212.000 216.000 C 212.000 218.209 210.209 220.000 208.000 220.000 L 64.000 220.000 C 61.791 220.000 60.000 218.209 60.000 216.000 L 60.000 40.000 C 60.000 37.791 61.791 36.000 64.000 36.000 L 208.000 36.000 C 210.209 36.000 212.000 37.791 212.000 40.000 Z"),
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
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
