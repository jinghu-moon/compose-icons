package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorFillIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 112.000 C 160.000 125.255 149.255 136.000 136.000 136.000 C 122.745 136.000 112.000 125.255 112.000 112.000 C 112.000 98.745 122.745 88.000 136.000 88.000 C 149.255 88.000 160.000 98.745 160.000 112.000 ZM 224.000 40.000 L 224.000 216.000 C 224.000 224.837 216.837 232.000 208.000 232.000 L 64.000 232.000 C 55.163 232.000 48.000 224.837 48.000 216.000 L 48.000 192.000 L 32.000 192.000 C 27.582 192.000 24.000 188.418 24.000 184.000 C 24.000 179.582 27.582 176.000 32.000 176.000 L 48.000 176.000 L 48.000 136.000 L 32.000 136.000 C 27.582 136.000 24.000 132.418 24.000 128.000 C 24.000 123.582 27.582 120.000 32.000 120.000 L 48.000 120.000 L 48.000 80.000 L 32.000 80.000 C 27.582 80.000 24.000 76.418 24.000 72.000 C 24.000 67.582 27.582 64.000 32.000 64.000 L 48.000 64.000 L 48.000 40.000 C 48.000 31.163 55.163 24.000 64.000 24.000 L 208.000 24.000 C 216.837 24.000 224.000 31.163 224.000 40.000 ZM 190.400 163.200 C 183.316 153.703 173.870 146.225 163.000 141.510 C 175.193 130.378 179.293 112.899 173.323 97.506 C 167.354 82.113 152.540 71.970 136.030 71.970 C 119.520 71.970 104.706 82.113 98.737 97.506 C 92.767 112.899 96.867 130.378 109.060 141.510 C 98.168 146.216 88.700 153.694 81.600 163.200 C 78.949 166.735 79.665 171.749 83.200 174.400 C 86.735 177.051 91.749 176.335 94.400 172.800 C 104.220 159.706 119.633 152.000 136.000 152.000 C 152.367 152.000 167.780 159.706 177.600 172.800 C 180.251 176.335 185.265 177.051 188.800 174.400 C 192.335 171.749 193.051 166.735 190.400 163.200 Z"),
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
