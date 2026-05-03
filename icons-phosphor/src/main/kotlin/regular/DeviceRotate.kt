package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorRegularIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 221.660 L 181.660 245.660 C 178.534 248.786 173.466 248.786 170.340 245.660 C 167.214 242.534 167.214 237.466 170.340 234.340 L 180.690 224.000 L 80.000 224.000 C 66.745 224.000 56.000 213.255 56.000 200.000 L 56.000 104.000 C 56.000 99.582 59.582 96.000 64.000 96.000 C 68.418 96.000 72.000 99.582 72.000 104.000 L 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 L 180.690 208.000 L 170.340 197.660 C 167.214 194.534 167.214 189.466 170.340 186.340 C 173.466 183.214 178.534 183.214 181.660 186.340 L 205.660 210.340 C 207.162 211.841 208.006 213.877 208.006 216.000 C 208.006 218.123 207.162 220.159 205.660 221.660 ZM 80.000 72.000 C 83.238 72.003 86.158 70.053 87.397 67.062 C 88.636 64.071 87.951 60.628 85.660 58.340 L 75.310 48.000 L 176.000 48.000 C 180.418 48.000 184.000 51.582 184.000 56.000 L 184.000 152.000 C 184.000 156.418 187.582 160.000 192.000 160.000 C 196.418 160.000 200.000 156.418 200.000 152.000 L 200.000 56.000 C 200.000 42.745 189.255 32.000 176.000 32.000 L 75.310 32.000 L 85.660 21.660 C 88.786 18.534 88.786 13.466 85.660 10.340 C 82.534 7.214 77.466 7.214 74.340 10.340 L 50.340 34.340 C 48.838 35.841 47.994 37.877 47.994 40.000 C 47.994 42.123 48.838 44.159 50.340 45.660 L 74.340 69.660 C 75.842 71.160 77.878 72.002 80.000 72.000 Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
