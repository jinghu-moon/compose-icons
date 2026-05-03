package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorThinIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 160.000 C 172.002 180.508 159.950 199.101 141.229 207.474 C 122.508 215.846 100.615 212.433 85.330 198.760 C 83.673 197.285 83.525 194.747 85.000 193.090 C 86.475 191.433 89.013 191.285 90.670 192.760 C 105.281 205.860 126.800 207.701 143.424 197.274 C 160.048 186.846 167.757 166.671 162.322 147.815 C 156.888 128.959 139.624 115.981 120.000 116.000 C 118.485 116.000 117.100 115.144 116.422 113.789 C 115.745 112.434 115.891 110.812 116.800 109.600 L 160.000 52.000 L 88.000 52.000 C 85.791 52.000 84.000 50.209 84.000 48.000 C 84.000 45.791 85.791 44.000 88.000 44.000 L 168.000 44.000 C 169.515 44.000 170.900 44.856 171.578 46.211 C 172.255 47.566 172.109 49.188 171.200 50.400 L 127.590 108.550 C 153.086 112.346 171.969 134.223 172.000 160.000 Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
