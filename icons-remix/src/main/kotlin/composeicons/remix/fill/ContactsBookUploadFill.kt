package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ContactsBookUploadFill: ImageVector
    get() {
        if (_contactsBookUploadFill != null) return _contactsBookUploadFill!!
        _contactsBookUploadFill = remixIcon(
            name = "ContactsBookUploadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 2v20h-4v-20h4ZM19.005 2C20.107 2 21 2.898 21 3.991v16.018C21 21.109 20.107 22 19.005 22h-10.005v-20h10.005ZM15 8l-4 4h3v4h2v-4h3L15 8ZM24 12v4h-2v-4h2ZM24 6v4h-2v-4h2Z"),
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
        return _contactsBookUploadFill!!
    }

private var _contactsBookUploadFill: ImageVector? = null
