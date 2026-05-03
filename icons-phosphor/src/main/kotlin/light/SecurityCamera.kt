package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorLightIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 138.000 C 244.686 138.000 242.000 140.686 242.000 144.000 L 242.000 162.000 L 195.310 162.000 C 194.780 161.998 194.273 161.786 193.900 161.410 L 174.140 141.660 L 225.900 89.900 C 228.526 87.274 230.001 83.713 230.001 80.000 C 230.001 76.287 228.526 72.726 225.900 70.100 L 169.900 14.100 C 167.274 11.471 163.711 9.994 159.995 9.994 C 156.279 9.994 152.716 11.471 150.090 14.100 L 4.340 160.350 C 2.057 162.639 1.375 166.078 2.614 169.064 C 3.852 172.051 6.767 173.999 10.000 174.000 L 50.200 174.000 L 86.100 209.900 C 88.726 212.526 92.287 214.001 96.000 214.001 C 99.713 214.001 103.274 212.526 105.900 209.900 L 165.660 150.140 L 185.410 169.900 C 188.032 172.531 191.596 174.007 195.310 174.000 L 242.000 174.000 L 242.000 192.000 C 242.000 195.314 244.686 198.000 248.000 198.000 C 251.314 198.000 254.000 195.314 254.000 192.000 L 254.000 144.000 C 254.000 140.686 251.314 138.000 248.000 138.000 ZM 158.590 22.590 C 159.370 21.815 160.630 21.815 161.410 22.590 L 175.510 36.690 L 50.200 162.000 L 19.640 162.000 ZM 97.410 201.410 C 96.630 202.185 95.370 202.185 94.590 201.410 L 61.170 168.000 L 184.000 45.170 L 217.410 78.590 C 218.185 79.370 218.185 80.630 217.410 81.410 Z"),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
