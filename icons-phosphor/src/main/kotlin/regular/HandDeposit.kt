package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorRegularIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 35.310 L 128.000 128.000 C 128.000 132.418 124.418 136.000 120.000 136.000 C 115.582 136.000 112.000 132.418 112.000 128.000 L 112.000 35.310 L 93.660 53.660 C 90.534 56.786 85.466 56.786 82.340 53.660 C 79.214 50.534 79.214 45.466 82.340 42.340 L 114.340 10.340 C 115.841 8.838 117.877 7.994 120.000 7.994 C 122.123 7.994 124.159 8.838 125.660 10.340 L 157.660 42.340 C 160.786 45.466 160.786 50.534 157.660 53.660 C 154.534 56.786 149.466 56.786 146.340 53.660 ZM 192.000 123.620 L 192.000 96.000 C 192.000 87.163 184.837 80.000 176.000 80.000 L 160.000 80.000 C 155.582 80.000 152.000 83.582 152.000 88.000 C 152.000 92.418 155.582 96.000 160.000 96.000 L 176.000 96.000 L 176.000 176.400 C 166.129 166.316 150.297 165.154 139.058 173.687 C 127.820 182.221 124.688 197.783 131.750 210.000 L 131.990 210.380 L 154.250 244.380 C 156.669 248.078 161.627 249.114 165.325 246.695 C 169.023 244.276 170.059 239.318 167.640 235.620 L 145.510 201.830 C 142.243 196.061 144.271 188.737 150.040 185.470 C 155.809 182.203 163.133 184.231 166.400 190.000 C 166.470 190.130 166.550 190.260 166.630 190.380 L 177.310 206.690 C 179.249 209.646 182.898 210.980 186.286 209.970 C 189.674 208.960 191.997 205.845 192.000 202.310 L 192.000 144.000 C 207.243 158.110 215.936 177.919 216.000 198.690 L 216.000 240.000 C 216.000 244.418 219.582 248.000 224.000 248.000 C 228.418 248.000 232.000 244.418 232.000 240.000 L 232.000 198.650 C 231.908 168.561 216.931 140.467 192.000 123.620 ZM 80.000 80.000 L 64.000 80.000 C 55.163 80.000 48.000 87.163 48.000 96.000 L 48.000 200.000 C 48.000 204.418 51.582 208.000 56.000 208.000 C 60.418 208.000 64.000 204.418 64.000 200.000 L 64.000 96.000 L 80.000 96.000 C 84.418 96.000 88.000 92.418 88.000 88.000 C 88.000 83.582 84.418 80.000 80.000 80.000 Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
