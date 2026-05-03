package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorThinIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 250.220 124.670 L 202.220 92.670 C 200.992 91.851 199.413 91.774 198.112 92.471 C 196.811 93.168 195.999 94.524 196.000 96.000 L 196.000 124.000 L 68.000 124.000 L 68.000 72.000 C 68.000 69.791 69.791 68.000 72.000 68.000 L 108.290 68.000 C 110.388 82.535 123.360 92.980 138.008 91.928 C 152.656 90.876 164.003 78.686 164.003 64.000 C 164.003 49.314 152.656 37.124 138.008 36.072 C 123.360 35.020 110.388 45.465 108.290 60.000 L 72.000 60.000 C 65.373 60.000 60.000 65.373 60.000 72.000 L 60.000 124.000 L 8.000 124.000 C 5.791 124.000 4.000 125.791 4.000 128.000 C 4.000 130.209 5.791 132.000 8.000 132.000 L 60.000 132.000 L 60.000 184.000 C 60.000 190.627 65.373 196.000 72.000 196.000 L 108.000 196.000 L 108.000 208.000 C 108.000 214.627 113.373 220.000 120.000 220.000 L 152.000 220.000 C 158.627 220.000 164.000 214.627 164.000 208.000 L 164.000 176.000 C 164.000 169.373 158.627 164.000 152.000 164.000 L 120.000 164.000 C 113.373 164.000 108.000 169.373 108.000 176.000 L 108.000 188.000 L 72.000 188.000 C 69.791 188.000 68.000 186.209 68.000 184.000 L 68.000 132.000 L 196.000 132.000 L 196.000 160.000 C 195.998 161.476 196.809 162.833 198.110 163.530 C 199.412 164.227 200.992 164.150 202.220 163.330 L 250.220 131.330 C 251.334 130.588 252.004 129.339 252.004 128.000 C 252.004 126.661 251.334 125.412 250.220 124.670 ZM 136.000 44.000 C 147.046 44.000 156.000 52.954 156.000 64.000 C 156.000 75.046 147.046 84.000 136.000 84.000 C 124.954 84.000 116.000 75.046 116.000 64.000 C 116.000 52.954 124.954 44.000 136.000 44.000 ZM 116.000 176.000 C 116.000 173.791 117.791 172.000 120.000 172.000 L 152.000 172.000 C 154.209 172.000 156.000 173.791 156.000 176.000 L 156.000 208.000 C 156.000 210.209 154.209 212.000 152.000 212.000 L 120.000 212.000 C 117.791 212.000 116.000 210.209 116.000 208.000 ZM 204.000 152.530 L 204.000 103.470 L 240.790 128.000 Z"),
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
