package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.User5Line: ImageVector
    get() {
        if (_user5Line != null) return _user5Line!!
        _user5Line = remixIcon(
            name = "User5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.389 16.539C5.339 15.09 4 12.701 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 2.701-1.339 5.09-3.389 6.539l2.083 4.761c.111 .253-.005 .548-.258 .658-.063 .028-.131 .042-.2 .042h-12.471c-.276 0-.5-.224-.5-.5 0-.069 .014-.137 .042-.2L7.389 16.539ZM14.125 15.846l1.332-.941C17.041 13.786 18 11.975 18 10 18 6.686 15.314 4 12 4 8.686 4 6 6.686 6 10c0 1.975 .959 3.786 2.543 4.905l1.332 .941L8.058 20h7.884L14.125 15.846ZM8.119 10.97l1.941-.485C10.276 11.355 11.063 12 12 12c.937 0 1.724-.645 1.941-1.515l1.941 .485C15.448 12.711 13.875 14 12 14 10.125 14 8.552 12.711 8.119 10.97Z"),
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
        return _user5Line!!
    }

private var _user5Line: ImageVector? = null
