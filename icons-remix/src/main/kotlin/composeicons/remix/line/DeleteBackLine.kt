package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeleteBackLine: ImageVector
    get() {
        if (_deleteBackLine != null) return _deleteBackLine!!
        _deleteBackLine = remixIcon(
            name = "DeleteBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.535 3h14.465c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-14.465c-.334 0-.647-.167-.832-.445L.369 12.555c-.224-.336-.224-.773 0-1.109l5.333-8C5.888 3.167 6.2 3 6.535 3ZM7.07 5 2.403 12l4.667 7h12.93v-14h-12.93ZM15.999 11v2h-7v-2h7Z"),
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
        return _deleteBackLine!!
    }

private var _deleteBackLine: ImageVector? = null
