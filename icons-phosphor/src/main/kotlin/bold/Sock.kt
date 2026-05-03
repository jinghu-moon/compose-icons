package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorBoldIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 12.000 L 104.000 12.000 C 92.954 12.000 84.000 20.954 84.000 32.000 L 84.000 107.000 L 46.430 144.600 C 21.853 169.177 21.853 209.023 46.430 233.600 C 71.007 258.177 110.853 258.177 135.430 233.600 L 203.830 165.200 C 209.099 159.960 212.052 152.830 212.030 145.400 L 212.030 32.000 C 212.030 26.690 209.919 21.599 206.162 17.847 C 202.404 14.096 197.310 11.992 192.000 12.000 ZM 188.000 36.000 L 188.000 52.000 L 108.000 52.000 L 108.000 36.000 ZM 118.430 216.600 C 108.714 226.945 94.136 231.180 80.390 227.650 C 66.644 224.120 55.910 213.386 52.380 199.640 C 48.850 185.894 53.085 171.316 63.430 161.600 L 104.520 120.520 C 106.766 118.255 108.018 115.190 108.000 112.000 L 108.000 76.000 L 188.000 76.000 L 188.000 101.210 C 160.083 106.944 140.034 131.500 140.000 160.000 C 139.983 169.791 142.388 179.434 147.000 188.070 ZM 186.830 148.200 L 165.320 169.710 C 160.242 151.462 170.149 132.395 188.000 126.060 L 188.000 145.370 C 188.001 146.431 187.580 147.449 186.830 148.200 Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
