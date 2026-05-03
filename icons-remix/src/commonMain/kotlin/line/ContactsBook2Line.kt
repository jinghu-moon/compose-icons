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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 22.000 L 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 ZM 19.000 20.000 L 19.000 18.000 L 6.000 18.000 C 5.448 18.000 5.000 18.448 5.000 19.000 C 5.000 19.552 5.448 20.000 6.000 20.000 L 19.000 20.000 ZM 5.000 16.171 C 5.313 16.060 5.649 16.000 6.000 16.000 L 19.000 16.000 L 19.000 4.000 L 6.000 4.000 C 5.448 4.000 5.000 4.448 5.000 5.000 L 5.000 16.171 ZM 12.000 10.000 C 10.895 10.000 10.000 9.105 10.000 8.000 C 10.000 6.895 10.895 6.000 12.000 6.000 C 13.105 6.000 14.000 6.895 14.000 8.000 C 14.000 9.105 13.105 10.000 12.000 10.000 ZM 9.000 14.000 C 9.000 12.343 10.343 11.000 12.000 11.000 C 13.657 11.000 15.000 12.343 15.000 14.000 L 9.000 14.000 Z"),
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
        return _contactsBook2Line!!
    }

private var _contactsBook2Line: ImageVector? = null
