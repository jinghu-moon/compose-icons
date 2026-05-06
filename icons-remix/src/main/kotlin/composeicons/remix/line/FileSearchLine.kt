package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileSearchLine: ImageVector
    get() {
        if (_fileSearchLine != null) return _fileSearchLine!!
        _fileSearchLine = remixIcon(
            name = "FileSearchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 4h-10v16h14v-12h-4v-4ZM3 2.992C3 2.444 3.447 2 3.999 2h12.001l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016ZM13.529 14.446c-1.534 .906-3.543 .7-4.861-.618C7.106 12.266 7.106 9.734 8.668 8.172c1.562-1.562 4.095-1.562 5.657 0 1.318 1.318 1.524 3.327 .618 4.861l2.21 2.21-1.414 1.414L13.529 14.446ZM12.911 12.414c.781-.781 .781-2.047 0-2.828-.781-.781-2.047-.781-2.828 0-.781 .781-.781 2.047 0 2.828 .781 .781 2.047 .781 2.828 0Z"),
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
        return _fileSearchLine!!
    }

private var _fileSearchLine: ImageVector? = null
