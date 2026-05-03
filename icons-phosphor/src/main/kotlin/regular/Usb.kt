package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorRegularIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.440 121.340 L 204.440 89.340 C 201.985 87.702 198.826 87.549 196.224 88.942 C 193.622 90.335 191.998 93.048 192.000 96.000 L 192.000 120.000 L 72.000 120.000 L 72.000 72.000 L 105.000 72.000 C 109.029 87.602 124.030 97.775 140.016 95.745 C 156.002 93.715 167.984 80.114 167.984 64.000 C 167.984 47.886 156.002 34.285 140.016 32.255 C 124.030 30.225 109.029 40.398 105.000 56.000 L 72.000 56.000 C 63.163 56.000 56.000 63.163 56.000 72.000 L 56.000 120.000 L 8.000 120.000 C 3.582 120.000 -0.000 123.582 -0.000 128.000 C -0.000 132.418 3.582 136.000 8.000 136.000 L 56.000 136.000 L 56.000 184.000 C 56.000 192.837 63.163 200.000 72.000 200.000 L 104.000 200.000 L 104.000 208.000 C 104.000 216.837 111.163 224.000 120.000 224.000 L 152.000 224.000 C 160.837 224.000 168.000 216.837 168.000 208.000 L 168.000 176.000 C 168.000 167.163 160.837 160.000 152.000 160.000 L 120.000 160.000 C 111.163 160.000 104.000 167.163 104.000 176.000 L 104.000 184.000 L 72.000 184.000 L 72.000 136.000 L 192.000 136.000 L 192.000 160.000 C 191.998 162.952 193.622 165.665 196.224 167.058 C 198.826 168.451 201.985 168.298 204.440 166.660 L 252.440 134.660 C 254.669 133.177 256.008 130.677 256.008 128.000 C 256.008 125.323 254.669 122.823 252.440 121.340 ZM 136.000 48.000 C 144.837 48.000 152.000 55.163 152.000 64.000 C 152.000 72.837 144.837 80.000 136.000 80.000 C 127.163 80.000 120.000 72.837 120.000 64.000 C 120.000 55.163 127.163 48.000 136.000 48.000 ZM 120.000 176.000 L 152.000 176.000 L 152.000 208.000 L 120.000 208.000 ZM 208.000 145.050 L 208.000 111.000 L 233.580 128.000 Z"),
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
