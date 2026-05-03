package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorBoldIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 20.000 L 64.000 20.000 C 52.954 20.000 44.000 28.954 44.000 40.000 L 44.000 60.000 L 32.000 60.000 C 25.373 60.000 20.000 65.373 20.000 72.000 C 20.000 78.627 25.373 84.000 32.000 84.000 L 44.000 84.000 L 44.000 116.000 L 32.000 116.000 C 25.373 116.000 20.000 121.373 20.000 128.000 C 20.000 134.627 25.373 140.000 32.000 140.000 L 44.000 140.000 L 44.000 172.000 L 32.000 172.000 C 25.373 172.000 20.000 177.373 20.000 184.000 C 20.000 190.627 25.373 196.000 32.000 196.000 L 44.000 196.000 L 44.000 216.000 C 44.000 227.046 52.954 236.000 64.000 236.000 L 208.000 236.000 C 219.046 236.000 228.000 227.046 228.000 216.000 L 228.000 40.000 C 228.000 28.954 219.046 20.000 208.000 20.000 ZM 204.000 212.000 L 68.000 212.000 L 68.000 44.000 L 204.000 44.000 ZM 100.800 171.370 C 109.883 161.572 122.639 156.004 136.000 156.004 C 149.361 156.004 162.117 161.572 171.200 171.370 C 175.707 176.230 183.300 176.517 188.160 172.010 C 193.020 167.503 193.307 159.910 188.800 155.050 C 183.270 149.109 176.775 144.146 169.590 140.370 C 184.670 122.541 183.195 96.037 166.231 79.991 C 149.267 63.944 122.723 63.944 105.759 79.991 C 88.795 96.037 87.320 122.541 102.400 140.370 C 95.220 144.148 88.729 149.111 83.200 155.050 C 78.693 159.910 78.980 167.503 83.840 172.010 C 88.700 176.517 96.293 176.230 100.800 171.370 ZM 116.000 112.000 C 116.000 100.954 124.954 92.000 136.000 92.000 C 147.046 92.000 156.000 100.954 156.000 112.000 C 156.000 123.046 147.046 132.000 136.000 132.000 C 124.954 132.000 116.000 123.046 116.000 112.000 Z"),
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
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
