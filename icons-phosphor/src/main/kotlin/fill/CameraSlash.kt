package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorFillIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 80.000 L 232.000 192.000 C 231.998 193.561 231.848 195.118 231.550 196.650 C 231.286 198.154 230.190 199.376 228.724 199.801 C 227.257 200.227 225.677 199.780 224.650 198.650 L 86.000 46.080 C 84.765 44.722 84.612 42.698 85.630 41.170 L 89.370 35.560 C 90.849 33.343 93.335 32.008 96.000 32.000 L 160.000 32.000 C 162.676 31.998 165.175 33.334 166.660 35.560 L 180.280 56.000 L 208.000 56.000 C 221.255 56.000 232.000 66.745 232.000 80.000 ZM 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 197.190 216.000 L 48.000 216.000 C 34.745 216.000 24.000 205.255 24.000 192.000 L 24.000 80.000 C 24.000 66.745 34.745 56.000 48.000 56.000 L 51.730 56.000 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 148.000 161.920 L 100.120 109.240 C 88.890 123.050 89.438 142.994 101.410 156.166 C 113.382 169.338 133.183 171.784 148.000 161.920 Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
