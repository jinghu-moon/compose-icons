package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorBoldIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.47 38.53C205.074 26.091 185.513 24.411 171.178 34.553 156.842 44.696 151.916 63.701 159.52 79.53l-80 80c-13.771-6.575-30.19-3.771-41 7h0c-12.917 12.955-14.064 33.538-2.666 47.848 11.398 14.31 31.716 17.796 47.232 8.103 15.516-9.693 21.295-29.481 13.434-46.001L176.52 96.48c15.829 7.604 34.834 2.678 44.977-11.658 10.142-14.335 8.462-33.897-3.977-46.292ZM72.47 200.53c-4.691 4.674-12.281 4.666-16.961-.02-4.68-4.685-4.68-12.276 0-16.961 4.68-4.685 12.27-4.694 16.961-.02 4.689 4.683 4.693 12.281 .01 16.97ZM200.47 72.53c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529h0c-4.674-4.691-4.666-12.281 .02-16.961 4.685-4.68 12.276-4.68 16.961 0 4.685 4.68 4.694 12.27 .02 16.961Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
