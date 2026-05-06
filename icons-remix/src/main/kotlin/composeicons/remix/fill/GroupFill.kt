package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GroupFill: ImageVector
    get() {
        if (_groupFill != null) return _groupFill!!
        _groupFill = remixIcon(
            name = "GroupFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 22c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8h-16ZM10 13C6.685 13 4 10.315 4 7 4 3.685 6.685 1 10 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM17.363 15.233c3.085 .788 5.405 3.49 5.621 6.767h-2.984c0-2.61-1-4.986-2.637-6.767ZM15.34 12.957C16.973 11.492 18 9.366 18 7 18 5.583 17.631 4.251 16.985 3.097 19.275 3.554 21 5.575 21 8c0 2.762-2.237 5-5 5-.224 0-.444-.015-.66-.043Z"),
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
        return _groupFill!!
    }

private var _groupFill: ImageVector? = null
