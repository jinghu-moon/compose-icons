package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) return _bookOpen!!
        _bookOpen = phosphorFillIcon(
            name = "BookOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 56.000 L 240.000 200.000 C 240.000 204.418 236.418 208.000 232.000 208.000 L 160.000 208.000 C 146.769 208.000 136.033 218.709 136.000 231.940 C 136.066 235.287 134.014 238.312 130.880 239.490 C 128.415 240.441 125.640 240.114 123.464 238.616 C 121.287 237.118 119.991 234.642 120.000 232.000 C 120.000 218.745 109.255 208.000 96.000 208.000 L 24.000 208.000 C 19.582 208.000 16.000 204.418 16.000 200.000 L 16.000 56.000 C 16.000 51.582 19.582 48.000 24.000 48.000 L 88.000 48.000 C 105.673 48.000 120.000 62.327 120.000 80.000 L 120.000 167.730 C 119.942 172.013 123.202 175.613 127.470 175.980 C 129.682 176.127 131.856 175.349 133.473 173.833 C 135.090 172.316 136.005 170.197 136.000 167.980 L 136.000 80.000 C 136.000 62.327 150.327 48.000 168.000 48.000 L 232.000 48.000 C 236.418 48.000 240.000 51.582 240.000 56.000 Z"),
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
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
