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
                pathData = parseSvgPathData("M 7.000 2.000 L 7.000 22.000 L 3.000 22.000 L 3.000 2.000 L 7.000 2.000 ZM 19.005 2.000 C 20.107 2.000 21.000 2.898 21.000 3.991 L 21.000 20.009 C 21.000 21.109 20.107 22.000 19.005 22.000 L 9.000 22.000 L 9.000 2.000 L 19.005 2.000 ZM 15.000 8.000 L 11.000 12.000 L 14.000 12.000 L 14.000 16.000 L 16.000 16.000 L 16.000 12.000 L 19.000 12.000 L 15.000 8.000 ZM 24.000 12.000 L 24.000 16.000 L 22.000 16.000 L 22.000 12.000 L 24.000 12.000 ZM 24.000 6.000 L 24.000 10.000 L 22.000 10.000 L 22.000 6.000 L 24.000 6.000 Z"),
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
