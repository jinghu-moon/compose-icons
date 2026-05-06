package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PsychotherapyLine: ImageVector
    get() {
        if (_psychotherapyLine != null) return _psychotherapyLine!!
        _psychotherapyLine = remixIcon(
            name = "PsychotherapyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2c4.068 0 7.426 3.036 7.934 6.965l2.25 3.539c.148 .233 .118 .581-.225 .728L19 14.071v2.929c0 1.105-.895 2-2 2h-1.999L15 22h-9l0-3.694C6 17.125 5.564 16.009 4.755 15.001 3.657 13.631 3 11.892 3 10 3 5.582 6.582 2 11 2ZM11 4C7.686 4 5 6.686 5 10c0 1.385 .468 2.693 1.316 3.75 1.094 1.364 1.685 2.917 1.684 4.556L8 20h5.001l.001-3h3.998v-4.248l1.55-.664L17.007 9.663l-.057-.441C16.566 6.251 14.024 4 11 4ZM11 7c.552 0 1 .448 1 1v1h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1.001L9 11C8.448 11 8 10.552 8 10 8 9.448 8.448 9 9 9l1-.001v-.999c0-.552 .448-1 1-1Z"),
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
        return _psychotherapyLine!!
    }

private var _psychotherapyLine: ImageVector? = null
