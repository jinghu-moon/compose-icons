package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorFillIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.650 194.550 L 198.460 36.750 C 197.593 32.582 195.101 28.932 191.535 26.606 C 187.969 24.281 183.624 23.473 179.460 24.360 L 132.650 34.420 C 124.032 36.307 118.544 44.785 120.350 53.420 L 153.540 211.220 C 155.065 218.641 161.584 223.975 169.160 224.000 C 170.296 223.998 171.429 223.878 172.540 223.640 L 219.350 213.580 C 227.979 211.689 233.469 203.194 231.650 194.550 ZM 136.000 50.150 C 136.000 50.090 136.000 50.060 136.000 50.060 L 182.800 40.060 L 186.130 55.930 L 139.330 66.000 ZM 146.000 97.530 L 142.650 81.630 L 189.470 71.570 L 192.810 87.470 ZM 216.000 197.940 L 169.200 207.940 L 165.870 192.070 L 212.670 182.000 L 216.000 197.850 C 216.000 197.910 216.000 197.940 216.000 197.940 ZM 104.000 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 208.000 C 40.000 216.837 47.163 224.000 56.000 224.000 L 104.000 224.000 C 112.837 224.000 120.000 216.837 120.000 208.000 L 120.000 48.000 C 120.000 39.163 112.837 32.000 104.000 32.000 ZM 56.000 48.000 L 104.000 48.000 L 104.000 64.000 L 56.000 64.000 ZM 104.000 208.000 L 56.000 208.000 L 56.000 192.000 L 104.000 192.000 L 104.000 208.000 Z"),
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
        return _books!!
    }

private var _books: ImageVector? = null
