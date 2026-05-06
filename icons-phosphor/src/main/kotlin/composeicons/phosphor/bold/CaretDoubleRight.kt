package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorBoldIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144.49 136.49l-80 80c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L119 128 47.51 56.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l80 80c2.257 2.254 3.523 5.314 3.519 8.504-.004 3.19-1.277 6.247-3.539 8.496ZM224.49 119.49l-80-80c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L199 128l-71.52 71.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l80-80c2.261-2.25 3.533-5.308 3.534-8.498 .002-3.19-1.266-6.249-3.524-8.502Z"),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
