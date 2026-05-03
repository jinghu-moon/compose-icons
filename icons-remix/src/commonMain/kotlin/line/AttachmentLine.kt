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
                pathData = parseSvgPathData("M 14.000 13.500 L 14.000 8.000 C 14.000 5.791 12.209 4.000 10.000 4.000 C 7.791 4.000 6.000 5.791 6.000 8.000 L 6.000 13.500 C 6.000 17.090 8.910 20.000 12.500 20.000 C 16.090 20.000 19.000 17.090 19.000 13.500 L 19.000 4.000 L 21.000 4.000 L 21.000 13.500 C 21.000 18.194 17.194 22.000 12.500 22.000 C 7.806 22.000 4.000 18.194 4.000 13.500 L 4.000 8.000 C 4.000 4.686 6.686 2.000 10.000 2.000 C 13.314 2.000 16.000 4.686 16.000 8.000 L 16.000 13.500 C 16.000 15.433 14.433 17.000 12.500 17.000 C 10.567 17.000 9.000 15.433 9.000 13.500 L 9.000 8.000 L 11.000 8.000 L 11.000 13.500 C 11.000 14.328 11.672 15.000 12.500 15.000 C 13.328 15.000 14.000 14.328 14.000 13.500 Z"),
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
