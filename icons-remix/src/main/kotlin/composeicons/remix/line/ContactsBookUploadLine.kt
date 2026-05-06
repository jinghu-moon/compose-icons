package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContactsBookUploadLine: ImageVector
    get() {
        if (_contactsBookUploadLine != null) return _contactsBookUploadLine!!
        _contactsBookUploadLine = remixIcon(
            name = "ContactsBookUploadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.005 2C20.107 2 21 2.898 21 3.991v16.018C21 21.109 20.107 22 19.005 22h-16.005v-20h16.005ZM7 4h-2v16h2v-16ZM19 4h-10v16h10v-16ZM14 8l4 4h-3v4h-2v-4h-3L14 8ZM24 12v4h-2v-4h2ZM24 6v4h-2v-4h2Z"),
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
        return _contactsBookUploadLine!!
    }

private var _contactsBookUploadLine: ImageVector? = null
