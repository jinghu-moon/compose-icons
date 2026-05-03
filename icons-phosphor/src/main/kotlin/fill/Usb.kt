package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorFillIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.000 128.000 C 252.001 129.338 251.333 130.588 250.220 131.330 L 202.220 163.330 C 200.992 164.149 199.413 164.226 198.112 163.529 C 196.811 162.832 195.999 161.476 196.000 160.000 L 196.000 136.000 L 72.000 136.000 L 72.000 184.000 L 108.000 184.000 L 108.000 176.000 C 108.000 169.373 113.373 164.000 120.000 164.000 L 152.000 164.000 C 158.627 164.000 164.000 169.373 164.000 176.000 L 164.000 208.000 C 164.000 214.627 158.627 220.000 152.000 220.000 L 120.000 220.000 C 113.373 220.000 108.000 214.627 108.000 208.000 L 108.000 200.000 L 72.000 200.000 C 63.163 200.000 56.000 192.837 56.000 184.000 L 56.000 136.000 L 8.000 136.000 C 3.582 136.000 0.000 132.418 0.000 128.000 C 0.000 123.582 3.582 120.000 8.000 120.000 L 56.000 120.000 L 56.000 72.000 C 56.000 63.163 63.163 56.000 72.000 56.000 L 109.170 56.000 C 113.142 42.677 126.288 34.286 140.045 36.293 C 153.802 38.300 164.003 50.097 164.003 64.000 C 164.003 77.903 153.802 89.700 140.045 91.707 C 126.288 93.714 113.142 85.323 109.170 72.000 L 72.000 72.000 L 72.000 120.000 L 196.000 120.000 L 196.000 96.000 C 195.999 94.524 196.811 93.168 198.112 92.471 C 199.413 91.774 200.992 91.851 202.220 92.670 L 250.220 124.670 C 251.333 125.412 252.001 126.662 252.000 128.000 Z"),
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
