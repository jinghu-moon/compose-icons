package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContactsBookFill: ImageVector
    get() {
        if (_contactsBookFill != null) return _contactsBookFill!!
        _contactsBookFill = remixIcon(
            name = "ContactsBookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 2v20h-4v-20h4ZM9 2h10.005C20.107 2 21 2.898 21 3.991v16.018C21 21.109 20.107 22 19.005 22h-10.005v-20ZM22 6h2v4h-2v-4ZM22 12h2v4h-2v-4ZM15 12c1.105 0 2-.895 2-2C17 8.895 16.105 8 15 8c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 16h6c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3Z"),
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
        return _contactsBookFill!!
    }

private var _contactsBookFill: ImageVector? = null
