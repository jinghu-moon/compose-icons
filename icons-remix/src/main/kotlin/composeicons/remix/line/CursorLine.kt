package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CursorLine: ImageVector
    get() {
        if (_cursorLine != null) return _cursorLine!!
        _cursorLine = remixIcon(
            name = "CursorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.387 13.498l2.553 7.014-4.698 1.71L10.689 15.208 6.79 17.653 8.409 1.633 19.946 12.865l-4.558 .633ZM15.377 19.316 12.662 11.857l2.959-.411L9.982 5.956l-.791 7.83 2.531-1.587 2.715 7.46 .94-.342Z"),
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
        return _cursorLine!!
    }

private var _cursorLine: ImageVector? = null
