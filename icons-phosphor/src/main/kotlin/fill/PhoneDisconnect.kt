package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorFillIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.280 161.840 C 231.937 167.391 224.472 169.446 217.900 166.900 L 168.900 149.510 L 168.610 149.400 C 163.633 147.409 159.984 143.058 158.890 137.810 L 152.680 108.060 L 152.680 108.060 C 136.569 102.570 119.087 102.609 103.000 108.170 L 97.100 137.690 C 96.043 142.997 92.375 147.410 87.350 149.420 L 87.060 149.530 L 38.060 166.900 C 36.241 167.617 34.305 167.990 32.350 168.000 C 27.419 168.009 22.759 165.744 19.720 161.860 C 2.490 139.640 4.420 110.150 24.410 90.150 C 80.560 33.980 175.410 33.980 231.590 90.150 L 231.590 90.150 C 251.580 110.130 253.510 139.620 236.280 161.840 ZM 216.000 192.000 L 40.000 192.000 C 35.582 192.000 32.000 195.582 32.000 200.000 C 32.000 204.418 35.582 208.000 40.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 204.418 224.000 200.000 C 224.000 195.582 220.418 192.000 216.000 192.000 Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
