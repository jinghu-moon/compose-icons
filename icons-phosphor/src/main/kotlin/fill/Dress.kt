package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorFillIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 66.260 80.230 C 64.030 76.583 63.431 72.169 64.610 68.060 C 65.007 66.373 65.683 64.764 66.610 63.300 L 88.000 32.700 L 88.000 8.000 C 87.995 5.783 88.910 3.664 90.527 2.147 C 92.144 0.631 94.318 -0.147 96.530 0.000 C 100.805 0.367 104.068 3.979 104.000 8.270 L 104.000 32.420 L 109.250 39.000 C 113.882 44.809 120.951 48.135 128.380 48.000 C 135.708 47.793 142.564 44.337 147.090 38.570 L 152.000 32.420 L 152.000 8.000 C 151.995 5.783 152.910 3.664 154.527 2.147 C 156.144 0.631 158.318 -0.147 160.530 0.000 C 164.805 0.367 168.068 3.979 168.000 8.270 L 168.000 32.700 L 189.420 63.300 C 190.347 64.764 191.023 66.373 191.420 68.060 C 192.599 72.169 192.000 76.583 189.770 80.230 C 189.730 80.288 189.693 80.348 189.660 80.410 L 175.800 102.150 C 175.060 103.310 173.776 104.009 172.400 104.000 L 83.600 104.000 C 82.235 103.999 80.964 103.301 80.230 102.150 L 66.370 80.410 C 66.337 80.348 66.300 80.288 66.260 80.230 ZM 214.760 209.790 C 214.718 209.673 214.668 209.559 214.610 209.450 L 173.690 122.300 C 173.030 120.893 171.614 119.996 170.060 120.000 L 85.940 120.000 C 84.386 119.996 82.970 120.893 82.310 122.300 L 41.390 209.450 C 41.332 209.559 41.282 209.673 41.240 209.790 C 39.476 214.044 39.607 218.848 41.600 223.000 C 44.281 228.510 49.873 232.005 56.000 232.000 L 200.000 232.000 C 206.124 232.001 211.711 228.507 214.390 223.000 C 216.387 218.850 216.521 214.046 214.760 209.790 Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
