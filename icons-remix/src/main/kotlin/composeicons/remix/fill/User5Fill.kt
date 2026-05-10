package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.User5Fill: ImageVector
    get() {
        if (_user5Fill != null) return _user5Fill!!
        _user5Fill = remixIcon(
            name = "User5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.389 16.539C5.339 15.09 4 12.701 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 2.701-1.339 5.09-3.389 6.539l2.083 4.761c.111 .253-.005 .548-.258 .658-.063 .028-.131 .042-.2 .042h-12.471c-.276 0-.5-.224-.5-.5 0-.069 .014-.137 .042-.2L7.389 16.539ZM8.119 10.97C8.552 12.711 10.125 14 12 14c1.875 0 3.448-1.289 3.882-3.03l-1.941-.485C13.724 11.355 12.937 12 12 12c-.937 0-1.724-.645-1.941-1.515l-1.941 .485Z"),
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
        return _user5Fill!!
    }

private var _user5Fill: ImageVector? = null
