package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AttachmentFill: ImageVector
    get() {
        if (_attachmentFill != null) return _attachmentFill!!
        _attachmentFill = remixIcon(
            name = "AttachmentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.997 2.992 L 21.000 21.008 C 21.000 21.545 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.556 3.000 21.008 L 3.000 2.992 C 3.000 2.455 3.445 2.000 3.993 2.000 L 20.004 2.000 C 20.552 2.000 20.997 2.444 20.997 2.992 ZM 9.000 13.000 L 9.000 9.000 C 9.000 8.448 9.448 8.000 10.000 8.000 C 10.552 8.000 11.000 8.448 11.000 9.000 L 11.000 13.000 C 11.000 13.552 11.448 14.000 12.000 14.000 C 12.552 14.000 13.000 13.552 13.000 13.000 L 13.000 9.000 C 13.000 7.343 11.657 6.000 10.000 6.000 C 8.343 6.000 7.000 7.343 7.000 9.000 L 7.000 13.000 C 7.000 15.761 9.239 18.000 12.000 18.000 C 14.761 18.000 17.000 15.761 17.000 13.000 L 17.000 8.000 L 15.000 8.000 L 15.000 13.000 C 15.000 14.657 13.657 16.000 12.000 16.000 C 10.343 16.000 9.000 14.657 9.000 13.000 Z"),
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
        return _attachmentFill!!
    }

private var _attachmentFill: ImageVector? = null
