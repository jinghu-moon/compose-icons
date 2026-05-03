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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 16.243 6.243 L 14.828 7.657 L 12.000 4.828 L 9.172 7.657 L 7.757 6.243 L 12.000 2.000 ZM 2.000 12.000 L 6.243 7.757 L 7.657 9.172 L 4.828 12.000 L 7.657 14.828 L 6.243 16.243 L 2.000 12.000 ZM 22.000 12.000 L 17.757 16.243 L 16.343 14.828 L 19.172 12.000 L 16.343 9.172 L 17.757 7.757 L 22.000 12.000 ZM 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 ZM 12.000 22.000 L 7.757 17.757 L 9.172 16.343 L 12.000 19.172 L 14.828 16.343 L 16.243 17.757 L 12.000 22.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dragMoveLine!!
    }

private var _dragMoveLine: ImageVector? = null
