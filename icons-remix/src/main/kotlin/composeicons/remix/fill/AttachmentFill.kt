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
                pathData = parseSvgPathData("M20.997 2.992l.003 18.016c0 .537-.445 .992-.993 .992h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.445 2 3.993 2h16.01c.548 0 .993 .444 .993 .992ZM9 13v-4C9 8.448 9.448 8 10 8c.552 0 1 .448 1 1v4c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-4C13 7.343 11.657 6 10 6 8.343 6 7 7.343 7 9v4c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-5h-2v5c0 1.657-1.343 3-3 3C10.343 16 9 14.657 9 13Z"),
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
