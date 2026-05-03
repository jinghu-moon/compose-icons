package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorThinIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 45.390 53.060 C 44.516 53.813 44.009 54.906 44.000 56.060 L 44.000 224.000 C 44.000 226.209 45.791 228.000 48.000 228.000 C 50.209 228.000 52.000 226.209 52.000 224.000 L 52.000 177.870 C 81.410 153.480 107.080 166.180 134.230 179.600 C 150.730 187.770 167.560 196.100 185.360 196.100 C 198.500 196.100 212.170 191.550 226.620 179.040 C 227.491 178.285 227.993 177.192 228.000 176.040 L 228.000 56.040 C 227.991 54.478 227.074 53.064 225.651 52.419 C 224.228 51.774 222.560 52.017 221.380 53.040 C 191.380 79.040 165.380 66.110 137.770 52.470 C 109.070 38.280 79.400 23.620 45.390 53.060 ZM 220.000 174.170 C 190.590 198.570 164.920 185.870 137.770 172.440 C 110.950 159.170 83.270 145.440 52.000 167.780 L 52.000 57.920 C 81.410 33.520 107.080 46.220 134.230 59.650 C 161.050 72.920 188.730 86.650 220.000 64.310 Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
