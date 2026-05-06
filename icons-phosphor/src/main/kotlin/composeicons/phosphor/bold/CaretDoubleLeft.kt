package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorBoldIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 199.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-80-80c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L191.49 39.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L137 128ZM57 128 128.52 56.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L31.52 119.49c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l80 80c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17Z"),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
