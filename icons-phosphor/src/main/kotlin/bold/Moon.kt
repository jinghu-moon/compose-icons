package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorBoldIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.370 139.400 C 233.233 136.257 228.617 135.103 224.370 136.400 C 194.706 145.355 162.522 137.267 140.615 115.353 C 118.709 93.438 110.634 61.250 119.600 31.590 C 120.908 27.341 119.760 22.717 116.617 19.573 C 113.473 16.430 108.849 15.282 104.600 16.590 C 82.704 23.320 63.489 36.786 49.690 55.070 C 25.078 87.783 21.078 131.601 39.360 168.230 C 57.641 204.859 95.062 228.003 136.000 228.000 C 159.434 228.069 182.243 220.449 200.930 206.310 C 219.205 192.497 232.656 173.272 239.370 151.370 C 240.655 147.132 239.502 142.531 236.370 139.400 ZM 186.490 187.140 C 153.047 212.316 106.172 209.027 76.572 179.428 C 46.973 149.828 43.684 102.953 68.860 69.510 C 75.267 61.035 83.208 53.837 92.270 48.290 Q 92.000 52.130 92.000 56.000 C 92.066 115.619 140.381 163.934 200.000 164.000 Q 203.870 164.000 207.710 163.730 C 202.166 172.794 194.968 180.735 186.490 187.140 Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
