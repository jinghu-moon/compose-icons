package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorFillIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 198.650 L 232.000 240.000 C 232.000 244.418 228.418 248.000 224.000 248.000 C 219.582 248.000 216.000 244.418 216.000 240.000 L 216.000 198.650 C 215.925 177.893 207.232 158.100 192.000 144.000 L 192.000 202.350 C 191.997 205.885 189.674 209.000 186.286 210.010 C 182.898 211.020 179.249 209.686 177.310 206.730 L 166.630 190.420 C 166.550 190.300 166.470 190.170 166.400 190.040 C 163.133 184.271 155.809 182.243 150.040 185.510 C 144.271 188.777 142.243 196.101 145.510 201.870 L 167.640 235.660 C 170.059 239.358 169.023 244.316 165.325 246.735 C 161.627 249.154 156.669 248.118 154.250 244.420 L 131.990 210.420 L 131.750 210.040 C 131.370 209.380 131.020 208.710 130.700 208.040 L 56.000 208.040 C 51.582 208.040 48.000 204.458 48.000 200.040 L 48.000 96.000 C 48.000 87.163 55.163 80.000 64.000 80.000 L 112.000 80.000 L 112.000 128.000 C 112.000 132.418 115.582 136.000 120.000 136.000 C 124.418 136.000 128.000 132.418 128.000 128.000 L 128.000 80.000 L 176.000 80.000 C 184.837 80.000 192.000 87.163 192.000 96.000 L 192.000 123.620 C 216.931 140.467 231.908 168.561 232.000 198.650 ZM 128.000 35.310 L 146.340 53.660 C 149.466 56.786 154.534 56.786 157.660 53.660 C 160.786 50.534 160.786 45.466 157.660 42.340 L 125.660 10.340 C 124.159 8.838 122.123 7.994 120.000 7.994 C 117.877 7.994 115.841 8.838 114.340 10.340 L 82.340 42.340 C 79.214 45.466 79.214 50.534 82.340 53.660 C 85.466 56.786 90.534 56.786 93.660 53.660 L 112.000 35.310 L 112.000 80.000 L 128.000 80.000 Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
