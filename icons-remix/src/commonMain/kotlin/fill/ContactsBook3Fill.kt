package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContactsBook3Fill: ImageVector
    get() {
        if (_contactsBook3Fill != null) return _contactsBook3Fill!!
        _contactsBook3Fill = remixIcon(
            name = "ContactsBook3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 2.000 C 3.448 2.000 3.000 2.448 3.000 3.000 L 3.000 5.000 L 5.000 5.000 L 5.000 7.000 L 2.000 7.000 L 2.000 9.000 L 5.000 9.000 L 5.000 11.000 L 2.000 11.000 L 2.000 13.000 L 5.000 13.000 L 5.000 15.000 L 2.000 15.000 L 2.000 17.000 L 5.000 17.000 L 5.000 19.000 L 3.000 19.000 L 3.000 21.000 C 3.000 21.552 3.448 22.000 4.000 22.000 L 20.000 22.000 C 20.552 22.000 21.000 21.552 21.000 21.000 L 21.000 3.000 C 21.000 2.448 20.552 2.000 20.000 2.000 L 4.000 2.000 ZM 9.000 16.000 C 9.000 14.343 10.343 13.000 12.000 13.000 C 13.657 13.000 15.000 14.343 15.000 16.000 L 9.000 16.000 ZM 12.000 12.000 C 10.895 12.000 10.000 11.105 10.000 10.000 C 10.000 8.895 10.895 8.000 12.000 8.000 C 13.105 8.000 14.000 8.895 14.000 10.000 C 14.000 11.105 13.105 12.000 12.000 12.000 Z"),
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
        return _contactsBook3Fill!!
    }

private var _contactsBook3Fill: ImageVector? = null
