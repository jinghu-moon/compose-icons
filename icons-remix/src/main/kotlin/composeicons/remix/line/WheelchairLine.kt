package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WheelchairLine: ImageVector
    get() {
        if (_wheelchairLine != null) return _wheelchairLine!!
        _wheelchairLine = remixIcon(
            name = "WheelchairLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.998 10.341l-0 2.194C6.802 13.227 5.998 14.519 5.998 16c0 2.209 1.791 4 4 4 1.481 0 2.773-.804 3.465-2l2.194 0C14.833 20.331 12.61 22 9.998 22 6.684 22 3.998 19.314 3.998 16c0-2.613 1.67-4.835 4-5.659ZM11.998 17C10.341 17 8.998 15.657 8.998 14v-4c0-1.044 .534-1.964 1.343-2.501C9.532 6.964 8.998 6.044 8.998 5c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.044-.534 1.964-1.343 2.501 .81 .534 1.343 1.454 1.343 2.499v4.999L16.432 15c.648 0 1.253 .314 1.626 .836l.088 .135 2.709 4.515-1.715 1.029L16.432 17l-1.434-.001-3 .001ZM11.998 9c-.552 0-1 .448-1 1v4c0 .552 .448 1 1 1h.999l.001-5c0-.552-.448-1-1-1ZM11.998 4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _wheelchairLine!!
    }

private var _wheelchairLine: ImageVector? = null
