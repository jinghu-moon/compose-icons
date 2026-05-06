package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorRegularIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 47.75C161.648 33.484 147.745 20.639 132.55 9.45c-2.756-1.93-6.424-1.93-9.18 0C108.203 20.643 94.327 33.489 82 47.75 54.51 79.32 40 112.6 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 112.6 201.49 79.32 174 47.75ZM187.83 184h-119.66c-3.321-4.98-6.009-10.355-8-16h135.7c-2.004 5.647-4.705 11.022-8.04 16ZM200 144c-.002 2.673-.155 5.344-.46 8h-143.08c-.305-2.656-.458-5.327-.46-8q0-4 .36-8h143.28q.36 4 .36 8ZM128 26c14.16 11.1 56.86 47.74 68.84 94h-137.68C71.14 73.76 113.84 37.12 128 26ZM82.81 200h90.38c-26.35 21.332-64.03 21.332-90.38 0Z"),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
