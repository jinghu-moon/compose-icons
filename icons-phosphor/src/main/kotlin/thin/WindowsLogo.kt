package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorThinIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 140.000 L 128.000 140.000 C 125.791 140.000 124.000 141.791 124.000 144.000 L 124.000 201.450 C 123.997 203.383 125.378 205.042 127.280 205.390 L 207.280 219.940 C 207.518 219.980 207.759 220.000 208.000 220.000 C 208.936 219.999 209.842 219.670 210.560 219.070 C 211.471 218.311 211.999 217.186 212.000 216.000 L 212.000 144.000 C 212.000 141.791 210.209 140.000 208.000 140.000 ZM 204.000 211.210 L 132.000 198.120 L 132.000 148.000 L 204.000 148.000 ZM 96.000 140.000 L 32.000 140.000 C 29.791 140.000 28.000 141.791 28.000 144.000 L 28.000 184.000 C 27.997 185.933 29.378 187.592 31.280 187.940 L 95.280 199.570 C 95.517 199.618 95.758 199.642 96.000 199.640 C 98.209 199.640 100.000 197.849 100.000 195.640 L 100.000 144.000 C 100.000 141.791 98.209 140.000 96.000 140.000 ZM 92.000 190.840 L 36.000 180.660 L 36.000 148.000 L 92.000 148.000 ZM 210.560 36.930 C 209.650 36.168 208.448 35.849 207.280 36.060 L 127.280 50.610 C 125.378 50.958 123.997 52.617 124.000 54.550 L 124.000 112.000 C 124.000 114.209 125.791 116.000 128.000 116.000 L 208.000 116.000 C 210.209 116.000 212.000 114.209 212.000 112.000 L 212.000 40.000 C 211.999 38.814 211.471 37.689 210.560 36.930 ZM 204.000 108.000 L 132.000 108.000 L 132.000 57.880 L 204.000 44.790 ZM 95.280 56.430 L 31.280 68.060 C 29.378 68.408 27.997 70.067 28.000 72.000 L 28.000 112.000 C 28.000 114.209 29.791 116.000 32.000 116.000 L 96.000 116.000 C 98.209 116.000 100.000 114.209 100.000 112.000 L 100.000 60.360 C 99.999 59.174 99.471 58.050 98.559 57.291 C 97.648 56.532 96.447 56.217 95.280 56.430 ZM 92.000 108.000 L 36.000 108.000 L 36.000 75.340 L 92.000 65.160 Z"),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
