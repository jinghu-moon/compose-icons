package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorBoldIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 92.000 C 193.673 92.000 208.000 77.673 208.000 60.000 C 208.000 42.327 193.673 28.000 176.000 28.000 C 158.327 28.000 144.000 42.327 144.000 60.000 C 144.000 77.673 158.327 92.000 176.000 92.000 ZM 176.000 52.000 C 180.418 52.000 184.000 55.582 184.000 60.000 C 184.000 64.418 180.418 68.000 176.000 68.000 C 171.582 68.000 168.000 64.418 168.000 60.000 C 168.000 55.582 171.582 52.000 176.000 52.000 ZM 28.480 80.640 C 30.336 74.278 36.998 70.624 43.360 72.480 L 110.860 92.160 L 119.520 83.510 C 121.772 81.251 124.830 79.981 128.020 79.981 C 131.210 79.981 134.268 81.251 136.520 83.510 L 165.000 112.000 L 200.000 112.000 C 206.627 112.000 212.000 117.373 212.000 124.000 C 212.000 130.627 206.627 136.000 200.000 136.000 L 160.000 136.000 C 156.820 136.000 153.770 134.737 151.520 132.490 L 146.630 127.600 L 36.630 95.530 C 33.574 94.637 30.999 92.566 29.470 89.773 C 27.942 86.981 27.585 83.695 28.480 80.640 ZM 238.650 211.570 C 220.505 223.673 197.934 227.125 177.000 221.000 L 20.650 175.510 C 16.307 174.515 12.874 171.196 11.731 166.890 C 10.589 162.583 11.927 157.999 15.205 154.982 C 18.484 151.966 23.164 151.014 27.360 152.510 L 107.280 175.780 L 121.090 161.970 L 84.700 151.530 C 80.503 150.417 77.234 147.122 76.154 142.916 C 75.074 138.710 76.350 134.249 79.492 131.251 C 82.633 128.252 87.149 127.185 91.300 128.460 L 147.300 144.460 C 151.379 145.632 154.535 148.871 155.601 152.979 C 156.667 157.087 155.484 161.452 152.490 164.460 L 133.560 183.400 L 183.660 198.000 C 197.814 202.146 213.078 199.806 225.340 191.610 C 230.863 187.935 238.320 189.432 241.995 194.955 C 245.670 200.478 244.173 207.935 238.650 211.610 Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
