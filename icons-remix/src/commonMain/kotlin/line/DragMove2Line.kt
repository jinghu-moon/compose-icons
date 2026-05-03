package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DragMove2Line: ImageVector
    get() {
        if (_dragMove2Line != null) return _dragMove2Line!!
        _dragMove2Line = remixIcon(
            name = "DragMove2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 11.000 L 11.000 5.828 L 9.172 7.657 L 7.757 6.243 L 12.000 2.000 L 16.243 6.243 L 14.828 7.657 L 13.000 5.828 L 13.000 11.000 L 18.172 11.000 L 16.343 9.172 L 17.757 7.757 L 22.000 12.000 L 17.757 16.243 L 16.343 14.828 L 18.172 13.000 L 13.000 13.000 L 13.000 18.172 L 14.828 16.343 L 16.243 17.757 L 12.000 22.000 L 7.757 17.757 L 9.172 16.343 L 11.000 18.172 L 11.000 13.000 L 5.828 13.000 L 7.657 14.828 L 6.243 16.243 L 2.000 12.000 L 6.243 7.757 L 7.657 9.172 L 5.828 11.000 L 11.000 11.000 Z"),
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
        return _dragMove2Line!!
    }

private var _dragMove2Line: ImageVector? = null
