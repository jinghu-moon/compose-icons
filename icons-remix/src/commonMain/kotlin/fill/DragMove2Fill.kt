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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 11.000 L 18.000 8.000 L 22.000 12.000 L 18.000 16.000 L 18.000 13.000 L 13.000 13.000 L 13.000 18.000 L 16.000 18.000 L 12.000 22.000 L 8.000 18.000 L 11.000 18.000 L 11.000 13.000 L 6.000 13.000 L 6.000 16.000 L 2.000 12.000 L 6.000 8.000 L 6.000 11.000 L 11.000 11.000 L 11.000 6.000 L 8.000 6.000 L 12.000 2.000 L 16.000 6.000 L 13.000 6.000 L 13.000 11.000 L 18.000 11.000 Z"),
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
        return _dragMove2Fill!!
    }

private var _dragMove2Fill: ImageVector? = null
