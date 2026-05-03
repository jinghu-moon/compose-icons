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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 2.000 L 7.000 22.000 L 3.000 22.000 L 3.000 2.000 L 7.000 2.000 ZM 9.000 2.000 L 19.005 2.000 C 20.107 2.000 21.000 2.898 21.000 3.991 L 21.000 20.009 C 21.000 21.109 20.107 22.000 19.005 22.000 L 9.000 22.000 L 9.000 2.000 ZM 22.000 6.000 L 24.000 6.000 L 24.000 10.000 L 22.000 10.000 L 22.000 6.000 ZM 22.000 12.000 L 24.000 12.000 L 24.000 16.000 L 22.000 16.000 L 22.000 12.000 ZM 15.000 12.000 C 16.105 12.000 17.000 11.105 17.000 10.000 C 17.000 8.895 16.105 8.000 15.000 8.000 C 13.895 8.000 13.000 8.895 13.000 10.000 C 13.000 11.105 13.895 12.000 15.000 12.000 ZM 12.000 16.000 L 18.000 16.000 C 18.000 14.343 16.657 13.000 15.000 13.000 C 13.343 13.000 12.000 14.343 12.000 16.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _contactsBookFill!!
    }

private var _contactsBookFill: ImageVector? = null
