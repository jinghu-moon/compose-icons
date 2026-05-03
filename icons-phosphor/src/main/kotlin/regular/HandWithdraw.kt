package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorRegularIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 198.650 L 232.000 240.000 C 232.000 244.418 228.418 248.000 224.000 248.000 C 219.582 248.000 216.000 244.418 216.000 240.000 L 216.000 198.650 C 215.925 177.893 207.232 158.100 192.000 144.000 L 192.000 202.350 C 191.997 205.885 189.674 209.000 186.286 210.010 C 182.898 211.020 179.249 209.686 177.310 206.730 L 166.630 190.420 C 166.550 190.300 166.470 190.170 166.400 190.040 C 163.133 184.271 155.809 182.243 150.040 185.510 C 144.271 188.777 142.243 196.101 145.510 201.870 L 167.640 235.660 C 170.059 239.358 169.023 244.316 165.325 246.735 C 161.627 249.154 156.669 248.118 154.250 244.420 L 131.990 210.420 L 131.750 210.040 C 124.619 197.820 127.725 182.201 138.988 173.638 C 150.251 165.075 166.132 166.261 176.000 176.400 L 176.000 64.000 L 160.000 64.000 C 155.582 64.000 152.000 60.418 152.000 56.000 C 152.000 51.582 155.582 48.000 160.000 48.000 L 176.000 48.000 C 184.837 48.000 192.000 55.163 192.000 64.000 L 192.000 123.620 C 216.931 140.467 231.908 168.561 232.000 198.650 ZM 88.000 56.000 C 88.000 51.582 84.418 48.000 80.000 48.000 L 64.000 48.000 C 55.163 48.000 48.000 55.163 48.000 64.000 L 48.000 200.000 C 48.000 204.418 51.582 208.000 56.000 208.000 C 60.418 208.000 64.000 204.418 64.000 200.000 L 64.000 64.000 L 80.000 64.000 C 84.418 64.000 88.000 60.418 88.000 56.000 ZM 157.660 98.340 C 156.159 96.838 154.123 95.994 152.000 95.994 C 149.877 95.994 147.841 96.838 146.340 98.340 L 128.000 116.690 L 128.000 16.000 C 128.000 11.582 124.418 8.000 120.000 8.000 C 115.582 8.000 112.000 11.582 112.000 16.000 L 112.000 116.690 L 93.660 98.340 C 90.534 95.214 85.466 95.214 82.340 98.340 C 79.214 101.466 79.214 106.534 82.340 109.660 L 114.340 141.660 C 115.841 143.162 117.877 144.006 120.000 144.006 C 122.123 144.006 124.159 143.162 125.660 141.660 L 157.660 109.660 C 159.162 108.159 160.006 106.123 160.006 104.000 C 160.006 101.877 159.162 99.841 157.660 98.340 Z"),
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
