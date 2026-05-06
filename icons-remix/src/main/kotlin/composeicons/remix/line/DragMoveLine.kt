package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DragMoveLine: ImageVector
    get() {
        if (_dragMoveLine != null) return _dragMoveLine!!
        _dragMoveLine = remixIcon(
            name = "DragMoveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l4.243 4.243L14.828 7.657 12 4.828 9.172 7.657 7.757 6.243 12 2ZM2 12 6.243 7.757 7.657 9.172 4.828 12l2.828 2.828L6.243 16.243 2 12ZM22 12l-4.243 4.243L16.343 14.828 19.172 12 16.343 9.172 17.757 7.757 22 12ZM12 14c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM12 22 7.757 17.757 9.172 16.343 12 19.172l2.828-2.829 1.414 1.414L12 22Z"),
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
        return _dragMoveLine!!
    }

private var _dragMoveLine: ImageVector? = null
