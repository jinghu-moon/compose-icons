package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorRegularIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 32.000 L 152.000 32.000 C 149.517 32.000 147.175 33.152 145.660 35.120 L 81.660 118.330 L 72.000 108.690 C 68.999 105.686 64.927 103.997 60.680 103.997 C 56.433 103.997 52.361 105.686 49.360 108.690 L 36.670 121.390 C 33.669 124.391 31.982 128.461 31.982 132.705 C 31.982 136.949 33.669 141.019 36.670 144.020 L 56.670 164.020 L 28.670 192.020 C 25.669 195.021 23.982 199.091 23.982 203.335 C 23.982 207.579 25.669 211.649 28.670 214.650 L 41.360 227.330 C 47.608 233.573 57.732 233.573 63.980 227.330 L 91.980 199.330 L 111.980 219.330 C 114.981 222.334 119.053 224.023 123.300 224.023 C 127.547 224.023 131.619 222.334 134.620 219.330 L 147.310 206.630 C 150.311 203.629 151.998 199.559 151.998 195.315 C 151.998 191.071 150.311 187.001 147.310 184.000 L 137.670 174.360 L 220.880 110.360 C 222.853 108.841 224.006 106.490 224.000 104.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 ZM 52.690 216.000 L 40.000 203.320 L 68.000 175.320 L 80.680 188.000 ZM 123.300 208.000 L 48.000 132.710 L 60.700 120.000 L 136.000 195.310 ZM 208.000 100.060 L 126.260 162.940 L 115.320 152.000 L 165.660 101.660 C 168.783 98.534 168.781 93.468 165.655 90.345 C 162.529 87.222 157.463 87.224 154.340 90.350 L 104.000 140.680 L 93.070 129.740 L 155.940 48.000 L 208.000 48.000 Z"),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
