package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorBoldIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 191.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L128 137 56.49 208.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l80-80c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM56.49 128.51 128 57l71.51 71.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-80-80c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L39.51 111.52c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
