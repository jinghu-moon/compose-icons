package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LinkedinBoxLine: ImageVector
    get() {
        if (_linkedinBoxLine != null) return _linkedinBoxLine!!
        _linkedinBoxLine = remixIcon(
            name = "LinkedinBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.001 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM5.001 5v14h14v-14h-14ZM7.501 9C6.673 9 6.001 8.328 6.001 7.5 6.001 6.672 6.673 6 7.501 6c.828 0 1.5 .672 1.5 1.5C9.001 8.328 8.329 9 7.501 9ZM6.501 10h2v7.5h-2v-7.5ZM12.001 10.429c.584-.564 1.266-.929 2-.929 2.071 0 3.5 1.679 3.5 3.75v4.25h-2v-4.25c0-.967-.784-1.75-1.75-1.75-.967 0-1.75 .783-1.75 1.75v4.25h-2v-7.5h2v.429Z"),
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
        return _linkedinBoxLine!!
    }

private var _linkedinBoxLine: ImageVector? = null
