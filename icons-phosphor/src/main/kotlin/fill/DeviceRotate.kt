package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorFillIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 205.660 221.660 L 181.660 245.660 C 179.372 247.951 175.929 248.636 172.938 247.397 C 169.947 246.158 167.997 243.238 168.000 240.000 L 168.000 224.000 L 80.000 224.000 C 66.745 224.000 56.000 213.255 56.000 200.000 L 56.000 104.000 C 56.000 99.582 59.582 96.000 64.000 96.000 C 68.418 96.000 72.000 99.582 72.000 104.000 L 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 L 168.000 208.000 L 168.000 192.000 C 167.997 188.762 169.947 185.842 172.938 184.603 C 175.929 183.364 179.372 184.049 181.660 186.340 L 205.660 210.340 C 207.162 211.841 208.006 213.877 208.006 216.000 C 208.006 218.123 207.162 220.159 205.660 221.660 ZM 80.000 72.000 C 84.418 72.000 88.000 68.418 88.000 64.000 L 88.000 48.000 L 176.000 48.000 C 180.418 48.000 184.000 51.582 184.000 56.000 L 184.000 152.000 C 184.000 156.418 187.582 160.000 192.000 160.000 C 196.418 160.000 200.000 156.418 200.000 152.000 L 200.000 56.000 C 200.000 42.745 189.255 32.000 176.000 32.000 L 88.000 32.000 L 88.000 16.000 C 88.003 12.762 86.053 9.842 83.062 8.603 C 80.071 7.364 76.628 8.049 74.340 10.340 L 50.340 34.340 C 48.838 35.841 47.994 37.877 47.994 40.000 C 47.994 42.123 48.838 44.159 50.340 45.660 L 74.340 69.660 C 75.842 71.160 77.878 72.002 80.000 72.000 Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
