package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorBoldIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M39.51 80.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 135 199.51 63.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-80 80c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529ZM208 180h-160c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
