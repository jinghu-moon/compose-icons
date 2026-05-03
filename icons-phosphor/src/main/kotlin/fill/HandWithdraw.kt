package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorFillIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 56.000 L 112.000 56.000 L 112.000 16.000 C 112.000 11.582 115.582 8.000 120.000 8.000 C 124.418 8.000 128.000 11.582 128.000 16.000 ZM 192.000 123.620 L 192.000 72.000 C 192.000 63.163 184.837 56.000 176.000 56.000 L 128.000 56.000 L 128.000 116.690 L 146.340 98.340 C 149.466 95.214 154.534 95.214 157.660 98.340 C 160.786 101.466 160.786 106.534 157.660 109.660 L 125.660 141.660 C 124.159 143.162 122.123 144.006 120.000 144.006 C 117.877 144.006 115.841 143.162 114.340 141.660 L 82.340 109.660 C 79.214 106.534 79.214 101.466 82.340 98.340 C 85.466 95.214 90.534 95.214 93.660 98.340 L 112.000 116.690 L 112.000 56.000 L 64.000 56.000 C 55.163 56.000 48.000 63.163 48.000 72.000 L 48.000 200.000 C 48.000 204.418 51.582 208.000 56.000 208.000 L 130.700 208.000 C 131.020 208.670 131.370 209.340 131.750 210.000 L 131.990 210.380 L 154.250 244.380 C 156.669 248.078 161.627 249.114 165.325 246.695 C 169.023 244.276 170.059 239.318 167.640 235.620 L 145.510 201.830 C 142.243 196.061 144.271 188.737 150.040 185.470 C 155.809 182.203 163.133 184.231 166.400 190.000 C 166.470 190.130 166.550 190.260 166.630 190.380 L 177.310 206.690 C 179.249 209.646 182.898 210.980 186.286 209.970 C 189.674 208.960 191.997 205.845 192.000 202.310 L 192.000 144.000 C 207.243 158.110 215.936 177.919 216.000 198.690 L 216.000 240.000 C 216.000 244.418 219.582 248.000 224.000 248.000 C 228.418 248.000 232.000 244.418 232.000 240.000 L 232.000 198.650 C 231.908 168.561 216.931 140.467 192.000 123.620 Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
