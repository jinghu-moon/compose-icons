package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PsychotherapyFill: ImageVector
    get() {
        if (_psychotherapyFill != null) return _psychotherapyFill!!
        _psychotherapyFill = remixIcon(
            name = "PsychotherapyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2c4.068 0 7.426 3.036 7.934 6.965l2.25 3.539c.148 .233 .118 .581-.225 .728L19 14.071v2.929c0 1.105-.895 2-2 2h-1.999L15 22h-9l0-3.694C6 17.125 5.564 16.009 4.755 15.001 3.657 13.631 3 11.892 3 10 3 5.582 6.582 2 11 2ZM11 7c-.552 0-1 .448-1 1v.999L9 9C8.448 9 8 9.448 8 10c0 .552 .448 1 1 1l1-.001v1.001c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1h1c.552 0 1-.448 1-1C14 9.448 13.552 9 13 9h-1v-1C12 7.448 11.552 7 11 7Z"),
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
        return _psychotherapyFill!!
    }

private var _psychotherapyFill: ImageVector? = null
