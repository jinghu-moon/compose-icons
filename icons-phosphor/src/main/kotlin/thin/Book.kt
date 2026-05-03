package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorThinIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 72.000 28.000 C 56.536 28.000 44.000 40.536 44.000 56.000 L 44.000 224.000 C 44.000 226.209 45.791 228.000 48.000 228.000 L 192.000 228.000 C 194.209 228.000 196.000 226.209 196.000 224.000 C 196.000 221.791 194.209 220.000 192.000 220.000 L 52.000 220.000 L 52.000 216.000 C 52.000 204.954 60.954 196.000 72.000 196.000 L 208.000 196.000 C 210.209 196.000 212.000 194.209 212.000 192.000 L 212.000 32.000 C 212.000 29.791 210.209 28.000 208.000 28.000 ZM 204.000 188.000 L 72.000 188.000 C 64.471 187.997 57.260 191.033 52.000 196.420 L 52.000 56.000 C 52.000 44.954 60.954 36.000 72.000 36.000 L 204.000 36.000 Z"),
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
