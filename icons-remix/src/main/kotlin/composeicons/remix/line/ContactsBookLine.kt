package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContactsBookLine: ImageVector
    get() {
        if (_contactsBookLine != null) return _contactsBookLine!!
        _contactsBookLine = remixIcon(
            name = "ContactsBookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 2h16.005C20.107 2 21 2.898 21 3.991v16.018C21 21.109 20.107 22 19.005 22h-16.005v-20ZM7 4h-2v16h2v-16ZM9 20h10v-16h-10v16ZM11 16c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3h-6ZM14 12c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2ZM22 6h2v4h-2v-4ZM22 12h2v4h-2v-4Z"),
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
        return _contactsBookLine!!
    }

private var _contactsBookLine: ImageVector? = null
