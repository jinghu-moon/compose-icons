package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContactsBook2Fill: ImageVector
    get() {
        if (_contactsBook2Fill != null) return _contactsBook2Fill!!
        _contactsBook2Fill = remixIcon(
            name = "ContactsBook2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 22h-14C4.343 22 3 20.657 3 19v-14C3 3.343 4.343 2 6 2h14c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1ZM19 20v-2h-13c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h13ZM12 10c1.105 0 2-.895 2-2C14 6.895 13.105 6 12 6c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM9 14h6c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3Z"),
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
        return _contactsBook2Fill!!
    }

private var _contactsBook2Fill: ImageVector? = null
