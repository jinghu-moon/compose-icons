package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorThinIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.000 56.740 C 179.374 38.298 154.212 27.967 128.000 28.000 L 127.000 28.000 C 72.162 28.548 27.997 73.160 28.000 128.000 C 28.000 169.220 53.550 203.850 94.690 218.380 C 97.715 219.453 100.900 220.004 104.110 220.010 C 119.535 219.949 132.006 207.425 132.000 192.000 C 132.000 180.954 140.954 172.000 152.000 172.000 L 198.210 172.000 C 211.292 172.062 222.653 163.007 225.510 150.240 C 227.231 142.662 228.067 134.910 228.000 127.140 C 227.811 100.607 217.008 75.254 198.000 56.740 ZM 217.740 148.460 C 215.694 157.588 207.564 164.057 198.210 164.000 L 152.000 164.000 C 136.536 164.000 124.000 176.536 124.000 192.000 C 123.988 198.481 120.837 204.555 115.544 208.296 C 110.251 212.038 103.474 212.982 97.360 210.830 C 59.510 197.460 36.000 165.720 36.000 128.000 C 35.997 77.559 76.611 36.521 127.050 36.000 L 128.000 36.000 C 156.000 35.993 182.479 48.737 199.941 70.625 C 217.403 92.513 223.947 121.161 217.720 148.460 ZM 136.000 76.000 C 136.000 80.418 132.418 84.000 128.000 84.000 C 123.582 84.000 120.000 80.418 120.000 76.000 C 120.000 71.582 123.582 68.000 128.000 68.000 C 132.418 68.000 136.000 71.582 136.000 76.000 ZM 92.000 100.000 C 92.000 104.418 88.418 108.000 84.000 108.000 C 79.582 108.000 76.000 104.418 76.000 100.000 C 76.000 95.582 79.582 92.000 84.000 92.000 C 88.418 92.000 92.000 95.582 92.000 100.000 ZM 92.000 156.000 C 92.000 160.418 88.418 164.000 84.000 164.000 C 79.582 164.000 76.000 160.418 76.000 156.000 C 76.000 151.582 79.582 148.000 84.000 148.000 C 88.418 148.000 92.000 151.582 92.000 156.000 ZM 180.000 100.000 C 180.000 104.418 176.418 108.000 172.000 108.000 C 167.582 108.000 164.000 104.418 164.000 100.000 C 164.000 95.582 167.582 92.000 172.000 92.000 C 176.418 92.000 180.000 95.582 180.000 100.000 Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
