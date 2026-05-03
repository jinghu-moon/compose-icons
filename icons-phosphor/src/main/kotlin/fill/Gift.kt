package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = phosphorFillIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 72.000 L 180.920 72.000 C 181.310 71.670 181.710 71.350 182.090 71.000 C 188.230 65.545 191.820 57.781 192.000 49.570 C 192.266 40.590 188.815 31.897 182.464 25.544 C 176.112 19.190 167.420 15.737 158.440 16.000 C 150.226 16.177 142.457 19.768 137.000 25.910 C 133.265 30.239 130.228 35.124 128.000 40.390 C 125.772 35.124 122.735 30.239 119.000 25.910 C 113.543 19.768 105.774 16.177 97.560 16.000 C 88.580 15.737 79.888 19.190 73.536 25.544 C 67.185 31.897 63.735 40.590 64.000 49.570 C 64.180 57.781 67.770 65.545 73.910 71.000 C 74.290 71.330 74.690 71.650 75.080 72.000 L 40.000 72.000 C 31.163 72.000 24.000 79.163 24.000 88.000 L 24.000 120.000 C 24.000 128.837 31.163 136.000 40.000 136.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 116.000 216.000 C 118.209 216.000 120.000 214.209 120.000 212.000 L 120.000 120.000 L 40.000 120.000 L 40.000 88.000 L 120.000 88.000 L 120.000 120.000 L 136.000 120.000 L 136.000 88.000 L 216.000 88.000 L 216.000 120.000 L 136.000 120.000 L 136.000 212.000 C 136.000 214.209 137.791 216.000 140.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 136.000 C 224.837 136.000 232.000 128.837 232.000 120.000 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 84.510 59.000 C 81.682 56.439 80.051 52.815 80.010 49.000 C 79.908 44.534 81.608 40.214 84.727 37.016 C 87.847 33.817 92.122 32.010 96.590 32.000 L 97.080 32.000 C 100.895 32.041 104.519 33.672 107.080 36.500 C 115.470 45.980 118.430 61.700 119.470 71.420 C 109.710 70.390 94.000 67.430 84.510 59.000 ZM 171.510 59.000 C 162.020 67.400 146.270 70.360 136.510 71.400 C 137.700 60.890 141.000 45.500 149.000 36.510 C 151.561 33.682 155.185 32.051 159.000 32.010 L 159.490 32.010 C 163.958 32.038 168.226 33.864 171.333 37.075 C 174.439 40.287 176.121 44.614 176.000 49.080 C 175.934 52.868 174.301 56.460 171.490 59.000 Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
