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
                pathData = parseSvgPathData("M 20.000 22.000 L 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 ZM 19.000 20.000 L 19.000 18.000 L 6.000 18.000 C 5.448 18.000 5.000 18.448 5.000 19.000 C 5.000 19.552 5.448 20.000 6.000 20.000 L 19.000 20.000 ZM 12.000 10.000 C 13.105 10.000 14.000 9.105 14.000 8.000 C 14.000 6.895 13.105 6.000 12.000 6.000 C 10.895 6.000 10.000 6.895 10.000 8.000 C 10.000 9.105 10.895 10.000 12.000 10.000 ZM 9.000 14.000 L 15.000 14.000 C 15.000 12.343 13.657 11.000 12.000 11.000 C 10.343 11.000 9.000 12.343 9.000 14.000 Z"),
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
