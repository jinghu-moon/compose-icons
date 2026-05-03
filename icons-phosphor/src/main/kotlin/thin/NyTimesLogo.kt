package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorThinIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 140.000 C 176.418 140.000 180.000 143.582 180.000 148.000 C 180.000 152.418 176.418 156.000 172.000 156.000 C 167.582 156.000 164.000 152.418 164.000 148.000 C 164.000 143.582 167.582 140.000 172.000 140.000 ZM 186.310 99.620 L 119.570 68.480 C 81.102 72.773 52.006 105.293 52.000 144.000 C 52.000 145.320 52.000 146.640 52.100 147.950 L 126.100 108.470 C 127.341 107.800 128.843 107.833 130.054 108.557 C 131.264 109.282 132.004 110.590 132.000 112.000 L 132.000 219.880 C 163.718 218.324 191.087 197.123 200.520 166.800 C 200.928 165.411 202.054 164.352 203.465 164.028 C 204.875 163.705 206.350 164.169 207.322 165.242 C 208.294 166.314 208.610 167.828 208.150 169.200 C 198.327 200.432 171.252 223.110 138.782 227.305 C 106.312 231.499 74.363 216.446 56.925 188.736 C 39.488 161.026 39.739 125.709 57.570 98.250 C 42.795 93.152 33.864 78.127 36.447 62.712 C 39.030 47.297 52.370 36.004 68.000 36.000 C 68.584 36.002 69.161 36.131 69.690 36.380 L 188.850 92.000 C 202.105 91.765 212.660 80.830 212.425 67.575 C 212.190 54.320 201.255 43.765 188.000 44.000 C 185.791 44.000 184.000 42.209 184.000 40.000 C 184.000 37.791 185.791 36.000 188.000 36.000 C 205.673 36.000 220.000 50.327 220.000 68.000 C 220.000 85.673 205.673 100.000 188.000 100.000 C 187.416 99.998 186.839 99.869 186.310 99.620 ZM 124.000 118.620 L 100.000 131.420 L 100.000 214.580 C 107.659 217.633 115.766 219.410 124.000 219.840 ZM 53.050 156.510 C 56.956 179.691 71.350 199.768 92.050 210.910 L 92.050 135.730 ZM 107.050 62.650 L 67.150 44.000 C 55.123 44.422 45.268 53.687 44.105 65.665 C 42.941 77.643 50.829 88.631 62.550 91.360 C 63.650 89.990 64.770 88.650 65.960 87.360 C 76.969 75.296 91.260 66.708 107.080 62.650 Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
