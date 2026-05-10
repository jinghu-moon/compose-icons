package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DragMove2Fill: ImageVector
    get() {
        if (_dragMove2Fill != null) return _dragMove2Fill!!
        _dragMove2Fill = remixIcon(
            name = "DragMove2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 11v-3l4 4-4 4v-3h-5v5h3l-4 4L8 18h3v-5h-5v3L2 12 6 8v3h5v-5h-3L12 2l4 4h-3v5h5Z"),
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
        return _dragMove2Fill!!
    }

private var _dragMove2Fill: ImageVector? = null
