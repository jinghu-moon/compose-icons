package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContactsBook2Line: ImageVector
    get() {
        if (_contactsBook2Line != null) return _contactsBook2Line!!
        _contactsBook2Line = remixIcon(
            name = "ContactsBook2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 22h-14C4.343 22 3 20.657 3 19v-14C3 3.343 4.343 2 6 2h14c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1ZM19 20v-2h-13c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h13ZM5 16.171C5.313 16.06 5.649 16 6 16h13v-12h-13C5.448 4 5 4.448 5 5v11.171ZM12 10C10.895 10 10 9.105 10 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM9 14c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3h-6Z"),
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
        return _contactsBook2Line!!
    }

private var _contactsBook2Line: ImageVector? = null
