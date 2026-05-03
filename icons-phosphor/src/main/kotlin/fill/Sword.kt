package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorFillIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 32.000 L 152.000 32.000 C 149.517 32.000 147.175 33.152 145.660 35.120 L 81.660 118.330 L 72.000 108.690 C 68.999 105.686 64.927 103.997 60.680 103.997 C 56.433 103.997 52.361 105.686 49.360 108.690 L 40.670 117.390 C 37.669 120.391 35.982 124.461 35.982 128.705 C 35.982 132.949 37.669 137.019 40.670 140.020 L 62.670 162.020 L 30.670 194.020 C 27.669 197.021 25.982 201.091 25.982 205.335 C 25.982 209.579 27.669 213.649 30.670 216.650 L 39.360 225.330 C 45.608 231.573 55.732 231.573 61.980 225.330 L 93.980 193.330 L 115.980 215.330 C 118.981 218.334 123.053 220.023 127.300 220.023 C 131.547 220.023 135.619 218.334 138.620 215.330 L 147.310 206.630 C 150.311 203.629 151.998 199.559 151.998 195.315 C 151.998 191.071 150.311 187.001 147.310 184.000 L 137.670 174.360 L 220.880 110.360 C 222.853 108.841 224.006 106.490 224.000 104.000 L 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 ZM 208.000 100.060 L 126.260 162.940 L 115.320 152.000 L 165.660 101.660 C 168.783 98.534 168.781 93.468 165.655 90.345 C 162.529 87.222 157.463 87.224 154.340 90.350 L 104.000 140.680 L 93.070 129.740 L 155.940 48.000 L 208.000 48.000 Z"),
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
