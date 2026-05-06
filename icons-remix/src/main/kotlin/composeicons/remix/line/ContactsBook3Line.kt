package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContactsBook3Line: ImageVector
    get() {
        if (_contactsBook3Line != null) return _contactsBook3Line!!
        _contactsBook3Line = remixIcon(
            name = "ContactsBook3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 2C3.448 2 3 2.448 3 3v2h2v-1h14v16h-14v-1h-2v2c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-18C21 2.448 20.552 2 20 2h-16ZM9 16c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3h-6ZM12 12c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM6 9v-2h-4v2h4ZM6 11v2h-4v-2h4ZM6 17v-2h-4v2h4Z"),
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
        return _contactsBook3Line!!
    }

private var _contactsBook3Line: ImageVector? = null
