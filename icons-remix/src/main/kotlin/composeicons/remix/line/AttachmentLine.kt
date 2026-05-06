package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AttachmentLine: ImageVector
    get() {
        if (_attachmentLine != null) return _attachmentLine!!
        _attachmentLine = remixIcon(
            name = "AttachmentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 13.5v-5.5C14 5.791 12.209 4 10 4 7.791 4 6 5.791 6 8v5.5C6 17.09 8.91 20 12.5 20 16.09 20 19 17.09 19 13.5v-9.5h2v9.5C21 18.194 17.194 22 12.5 22 7.806 22 4 18.194 4 13.5v-5.5C4 4.686 6.686 2 10 2c3.314 0 6 2.686 6 6v5.5C16 15.433 14.433 17 12.5 17 10.567 17 9 15.433 9 13.5v-5.5h2v5.5c0 .828 .672 1.5 1.5 1.5C13.328 15 14 14.328 14 13.5Z"),
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
        return _attachmentLine!!
    }

private var _attachmentLine: ImageVector? = null
