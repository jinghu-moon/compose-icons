package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorLightIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.330 123.000 L 203.330 91.000 C 201.488 89.771 199.118 89.656 197.166 90.703 C 195.214 91.749 193.997 93.785 194.000 96.000 L 194.000 122.000 L 70.000 122.000 L 70.000 72.000 C 70.000 70.895 70.895 70.000 72.000 70.000 L 106.600 70.000 C 109.680 85.090 123.686 95.396 139.009 93.848 C 154.332 92.300 165.994 79.401 165.994 64.000 C 165.994 48.599 154.332 35.700 139.009 34.152 C 123.686 32.604 109.680 42.910 106.600 58.000 L 72.000 58.000 C 64.268 58.000 58.000 64.268 58.000 72.000 L 58.000 122.000 L 8.000 122.000 C 4.686 122.000 2.000 124.686 2.000 128.000 C 2.000 131.314 4.686 134.000 8.000 134.000 L 58.000 134.000 L 58.000 184.000 C 58.000 191.732 64.268 198.000 72.000 198.000 L 106.000 198.000 L 106.000 208.000 C 106.000 215.732 112.268 222.000 120.000 222.000 L 152.000 222.000 C 159.732 222.000 166.000 215.732 166.000 208.000 L 166.000 176.000 C 166.000 168.268 159.732 162.000 152.000 162.000 L 120.000 162.000 C 112.268 162.000 106.000 168.268 106.000 176.000 L 106.000 186.000 L 72.000 186.000 C 70.895 186.000 70.000 185.105 70.000 184.000 L 70.000 134.000 L 194.000 134.000 L 194.000 160.000 C 193.997 162.215 195.214 164.251 197.166 165.297 C 199.118 166.344 201.488 166.229 203.330 165.000 L 251.330 133.000 C 253.006 131.888 254.013 130.011 254.013 128.000 C 254.013 125.989 253.006 124.112 251.330 123.000 ZM 136.000 46.000 C 145.941 46.000 154.000 54.059 154.000 64.000 C 154.000 73.941 145.941 82.000 136.000 82.000 C 126.059 82.000 118.000 73.941 118.000 64.000 C 118.000 54.059 126.059 46.000 136.000 46.000 ZM 118.000 176.000 C 118.000 174.895 118.895 174.000 120.000 174.000 L 152.000 174.000 C 153.105 174.000 154.000 174.895 154.000 176.000 L 154.000 208.000 C 154.000 209.105 153.105 210.000 152.000 210.000 L 120.000 210.000 C 118.895 210.000 118.000 209.105 118.000 208.000 ZM 206.000 148.790 L 206.000 107.210 L 237.180 128.000 Z"),
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
