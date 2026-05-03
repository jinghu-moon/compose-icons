package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorBoldIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.880 207.930 L 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 52.000 62.240 L 52.000 216.000 C 52.000 231.464 64.536 244.000 80.000 244.000 L 176.000 244.000 C 187.452 244.000 197.750 237.025 202.000 226.390 C 207.120 229.342 213.627 228.126 217.336 223.525 C 221.045 218.923 220.851 212.307 216.880 207.930 ZM 176.000 220.000 L 80.000 220.000 C 77.791 220.000 76.000 218.209 76.000 216.000 L 76.000 88.640 L 180.000 203.000 L 180.000 216.000 C 180.000 218.209 178.209 220.000 176.000 220.000 ZM 75.510 24.000 C 75.510 17.373 80.883 12.000 87.510 12.000 L 176.000 12.000 C 191.464 12.000 204.000 24.536 204.000 40.000 L 204.000 138.940 C 204.000 145.567 198.627 150.940 192.000 150.940 C 185.373 150.940 180.000 145.567 180.000 138.940 L 180.000 40.000 C 180.000 37.791 178.209 36.000 176.000 36.000 L 87.510 36.000 C 80.883 36.000 75.510 30.627 75.510 24.000 Z"),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
