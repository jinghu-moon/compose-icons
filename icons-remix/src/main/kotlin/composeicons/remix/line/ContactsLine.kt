package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContactsLine: ImageVector
    get() {
        if (_contactsLine != null) return _contactsLine!!
        _contactsLine = remixIcon(
            name = "ContactsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 7h5v2h-5v-2ZM17 12h7v2h-7v-2ZM20 17h4v2h-4v-2ZM2 22c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8h-2c0-3.314-2.686-6-6-6C6.686 16 4 18.686 4 22h-2ZM10 13C6.685 13 4 10.315 4 7 4 3.685 6.685 1 10 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM10 11c2.21 0 4-1.79 4-4C14 4.79 12.21 3 10 3 7.79 3 6 4.79 6 7c0 2.21 1.79 4 4 4Z"),
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
        return _contactsLine!!
    }

private var _contactsLine: ImageVector? = null
