package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShipFill: ImageVector
    get() {
        if (_shipFill != null) return _shipFill!!
        _shipFill = remixIcon(
            name = "ShipFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 10.4v-6.4C4 3.448 4.448 3 5 3h5v-2h4v2h5c.552 0 1 .448 1 1v6.4l1.086 .326c.512 .153 .812 .682 .683 1.2l-1.517 6.068C20.168 17.998 20.084 18 20 18c-1.636 0-3.088-.785-4-2C15.088 17.215 13.636 18 12 18 10.364 18 8.912 17.215 8 16 7.088 17.215 5.636 18 4 18c-.084 0-.168-.002-.252-.006L2.232 11.926c-.13-.518 .171-1.047 .683-1.2L4 10.4ZM6 9.8 12 8l2.754 .826 1.809 .543L18 9.8v-4.8h-12v4.8ZM4 20c1.537 0 2.938-.578 4-1.528C9.062 19.422 10.463 20 12 20c1.537 0 2.939-.578 4-1.528 1.062 .95 2.463 1.528 4 1.528h2v2h-2c-1.457 0-2.823-.39-4-1.07C14.823 21.61 13.457 22 12 22 10.543 22 9.177 21.61 8 20.93 6.823 21.61 5.457 22 4 22h-2v-2h2Z"),
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
        return _shipFill!!
    }

private var _shipFill: ImageVector? = null
