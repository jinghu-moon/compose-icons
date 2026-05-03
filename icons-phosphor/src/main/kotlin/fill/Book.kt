package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorFillIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 32.000 L 216.000 192.000 C 216.000 196.418 212.418 200.000 208.000 200.000 L 72.000 200.000 C 63.163 200.000 56.000 207.163 56.000 216.000 L 192.000 216.000 C 196.418 216.000 200.000 219.582 200.000 224.000 C 200.000 228.418 196.418 232.000 192.000 232.000 L 48.000 232.000 C 43.582 232.000 40.000 228.418 40.000 224.000 L 40.000 56.000 C 40.000 38.327 54.327 24.000 72.000 24.000 L 208.000 24.000 C 212.418 24.000 216.000 27.582 216.000 32.000 Z"),
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
        return _book!!
    }

private var _book: ImageVector? = null
