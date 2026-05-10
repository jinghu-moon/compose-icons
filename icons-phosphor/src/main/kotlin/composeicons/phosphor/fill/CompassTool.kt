package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorFillIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.12 123.64c1.403-2.555 1.305-5.67-.254-8.132-1.56-2.462-4.335-3.881-7.244-3.704-2.909 .177-5.492 1.923-6.741 4.556-7.396 14.247-18.927 25.925-33.08 33.5L149.56 108.81c11.219-8.408 16.536-22.565 13.625-36.28C160.275 58.815 149.667 48.037 136 44.91v-20.91c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v20.91C106.333 48.037 95.725 58.815 92.815 72.53c-2.91 13.715 2.406 27.872 13.625 36.28L56.69 220.75c-1.177 2.614-.865 5.659 .818 7.98 1.683 2.321 4.479 3.564 7.33 3.259 2.851-.306 5.32-2.113 6.472-4.739L96.45 170.69c10.143 3.532 20.81 5.327 31.55 5.31 10.746-.012 21.419-1.772 31.6-5.21l25.09 56.46c1.808 4.015 6.521 5.815 10.545 4.026 4.024-1.789 5.845-6.494 4.075-10.526l-25-56.25c17.482-9.099 31.733-23.367 40.81-40.86ZM128 160c-8.493 .01-16.934-1.34-25-4l18.08-40.68c4.582 .907 9.298 .907 13.88 0l18.14 40.8c-8.119 2.57-16.584 3.879-25.1 3.88Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
