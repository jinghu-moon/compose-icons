package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WheelchairFill: ImageVector
    get() {
        if (_wheelchairFill != null) return _wheelchairFill!!
        _wheelchairFill = remixIcon(
            name = "WheelchairFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.998 10.341l-0 2.194C6.802 13.227 5.998 14.519 5.998 16c0 2.209 1.791 4 4 4 1.481 0 2.773-.804 3.465-2l2.194 0C14.833 20.331 12.61 22 9.998 22 6.684 22 3.998 19.314 3.998 16c0-2.613 1.67-4.835 4-5.659ZM11.998 17C10.341 17 8.998 15.657 8.998 14v-4c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v5h1.434c.648 0 1.253 .314 1.626 .836l.088 .135 2.709 4.515-1.715 1.029L16.432 17h-4.434ZM11.998 2c1.381 0 2.5 1.119 2.5 2.5C14.498 5.881 13.379 7 11.998 7 10.617 7 9.498 5.881 9.498 4.5 9.498 3.119 10.617 2 11.998 2Z"),
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
        return _wheelchairFill!!
    }

private var _wheelchairFill: ImageVector? = null
