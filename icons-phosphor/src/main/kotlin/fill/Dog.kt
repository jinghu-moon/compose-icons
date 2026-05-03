package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = phosphorFillIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 239.710 125.000 L 223.290 37.000 C 222.479 32.665 219.914 28.856 216.202 26.475 C 212.490 24.093 207.959 23.350 203.680 24.420 L 203.370 24.510 L 150.850 40.000 L 105.150 40.000 L 52.630 24.560 L 52.320 24.470 C 48.041 23.400 43.510 24.143 39.798 26.525 C 36.086 28.906 33.521 32.715 32.710 37.050 L 16.290 125.000 C 14.843 132.256 18.636 139.543 25.410 142.520 C 27.516 143.486 29.803 143.990 32.120 144.000 C 34.893 143.999 37.614 143.253 40.000 141.840 L 40.000 184.000 C 40.000 206.091 57.909 224.000 80.000 224.000 L 176.000 224.000 C 198.091 224.000 216.000 206.091 216.000 184.000 L 216.000 141.850 C 218.383 143.260 221.101 144.006 223.870 144.010 C 226.189 144.003 228.480 143.502 230.590 142.540 C 237.372 139.561 241.167 132.263 239.710 125.000 ZM 176.000 208.000 L 136.000 208.000 L 136.000 195.310 L 149.660 181.660 C 152.786 178.534 152.786 173.466 149.660 170.340 C 146.534 167.214 141.466 167.214 138.340 170.340 L 128.000 180.690 L 117.660 170.340 C 114.534 167.214 109.466 167.214 106.340 170.340 C 103.214 173.466 103.214 178.534 106.340 181.660 L 120.000 195.310 L 120.000 208.000 L 80.000 208.000 C 66.745 208.000 56.000 197.255 56.000 184.000 L 56.000 123.110 L 107.930 56.000 L 148.070 56.000 L 200.000 123.110 L 200.000 184.000 C 200.000 197.255 189.255 208.000 176.000 208.000 ZM 104.000 140.000 C 104.000 146.627 98.627 152.000 92.000 152.000 C 85.373 152.000 80.000 146.627 80.000 140.000 C 80.000 133.373 85.373 128.000 92.000 128.000 C 98.627 128.000 104.000 133.373 104.000 140.000 ZM 176.000 140.000 C 176.000 146.627 170.627 152.000 164.000 152.000 C 157.373 152.000 152.000 146.627 152.000 140.000 C 152.000 133.373 157.373 128.000 164.000 128.000 C 170.627 128.000 176.000 133.373 176.000 140.000 Z"),
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
        return _dog!!
    }

private var _dog: ImageVector? = null
