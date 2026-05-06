package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StackshareLine: ImageVector
    get() {
        if (_stackshareLine != null) return _stackshareLine!!
        _stackshareLine = remixIcon(
            name = "StackshareLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.537 13l-2.207 .001C6.918 14.166 5.807 15 4.501 15 2.844 15 1.501 13.657 1.501 12c0-1.657 1.343-3 3-3 1.306 0 2.418 .835 2.829 2L9.537 11 13.001 5l3.171 0C16.583 3.835 17.695 3 19.001 3c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C17.695 9 16.584 8.166 16.172 7.001L14.155 7l-2.886 4.999L14.156 17l2.016 0C16.583 15.835 17.695 15 19.001 15c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.306 0-2.417-.834-2.829-1.999L13.001 19 9.537 13ZM19.001 17c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM4.501 11c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM19.001 5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _stackshareLine!!
    }

private var _stackshareLine: ImageVector? = null
