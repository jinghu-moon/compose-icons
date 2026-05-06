package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorThinIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 116h160c5.73 .008 10.665-4.036 11.785-9.655 1.119-5.619-1.89-11.246-7.185-13.435L60.6 28.91C56.896 27.373 52.669 27.787 49.334 30.015 45.999 32.243 43.998 35.99 44 40v64c0 6.627 5.373 12 12 12ZM52 40c0-2.209 1.791-4 4-4 .54-0 1.074 .109 1.57 .32h.07l159.91 64c1.746 .744 2.729 2.611 2.353 4.471-.375 1.86-2.006 3.2-3.903 3.209h-160c-2.209 0-4-1.791-4-4ZM227.74 149.61C226.696 143.971 221.734 139.909 216 140h-160c-6.627 0-12 5.373-12 12v64c0 6.627 5.373 12 12 12 1.577-0 3.138-.316 4.59-.93l160-64h.08c5.333-2.152 8.325-7.848 7.07-13.46ZM217.57 155.67l-160 64c-1.234 .527-2.65 .399-3.771-.339C52.679 218.593 52.003 217.342 52 216v-64c0-2.209 1.791-4 4-4h160c1.896 0 3.531 1.332 3.916 3.188 .385 1.856-.586 3.728-2.326 4.482Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
