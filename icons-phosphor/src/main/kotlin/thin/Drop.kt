package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorThinIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 171.000 50.380 C 158.862 36.355 145.202 23.724 130.270 12.720 C 128.894 11.759 127.066 11.759 125.690 12.720 C 110.772 23.726 97.125 36.357 85.000 50.380 C 58.170 81.210 44.000 113.580 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 C 174.392 228.000 212.000 190.392 212.000 144.000 C 212.000 113.580 197.830 81.210 171.000 50.380 ZM 128.000 220.000 C 86.045 219.956 52.044 185.955 52.000 144.000 C 52.000 108.100 73.150 76.200 90.900 55.760 C 102.078 42.966 114.506 31.322 128.000 21.000 C 141.496 31.334 153.924 42.992 165.100 55.800 C 182.850 76.200 204.000 108.100 204.000 144.000 C 203.956 185.955 169.955 219.956 128.000 220.000 ZM 179.940 152.670 C 175.999 174.734 158.725 192.004 136.660 195.940 C 136.442 195.980 136.221 196.000 136.000 196.000 C 133.931 195.985 132.215 194.394 132.043 192.331 C 131.872 190.269 133.302 188.417 135.340 188.060 C 153.520 185.000 168.970 169.550 172.060 151.330 C 172.507 149.232 174.528 147.861 176.643 148.220 C 178.757 148.580 180.212 150.543 179.940 152.670 Z"),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
