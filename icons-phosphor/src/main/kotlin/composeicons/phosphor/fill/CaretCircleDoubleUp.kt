package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorFillIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.58 54.43C160.956 13.841 95.123 13.859 54.522 54.471c-40.601 40.612-40.601 106.445 0 147.058 40.601 40.612 106.434 40.631 147.058 .041 40.562-40.66 40.562-106.48 0-147.14ZM165.68 173.68c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L128 147.32l-26.35 26.36c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l32 32c1.506 1.497 2.356 3.531 2.361 5.654 .006 2.123-.833 4.162-2.331 5.666ZM165.68 117.68c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L128 91.29l-26.35 26.36c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l32 32c1.506 1.497 2.356 3.531 2.361 5.654 .006 2.123-.833 4.162-2.331 5.666Z"),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
