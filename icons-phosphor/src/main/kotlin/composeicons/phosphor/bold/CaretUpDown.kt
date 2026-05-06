package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorBoldIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184.49 167.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-48 48c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-48-48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 207l39.51-39.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534ZM88.49 88.51 128 49l39.51 39.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-48-48c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-48 48c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
