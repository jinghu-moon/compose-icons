package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Forward30Fill: ImageVector
    get() {
        if (_forward30Fill != null) return _forward30Fill!!
        _forward30Fill = remixIcon(
            name = "Forward30Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 12C2 6.477 6.477 2 12 2c3.016 0 5.72 1.335 7.553 3.446L22 3v6h-5.215c.442 .451 .715 1.069 .715 1.75v2.5c0 1.381-1.119 2.5-2.5 2.5-1.381 0-2.5-1.119-2.5-2.5v-2.5C12.5 9.369 13.619 8.25 15 8.25c.498 0 .963 .146 1.353 .397L18.135 6.865C16.668 5.114 14.464 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8h2c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12ZM15 9.75c-.552 0-1 .448-1 1v2.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2.5c0-.552-.448-1-1-1ZM10 13.375c0-.345-.28-.625-.625-.625h-1.875v-1.5h1.875c.345 0 .625-.28 .625-.625C10 10.28 9.72 10 9.375 10h-2.625v-1.5h2.625c1.174 0 2.125 .951 2.125 2.125 0 .524-.19 1.004-.505 1.375 .315 .371 .505 .851 .505 1.375 0 1.174-.951 2.125-2.125 2.125h-2.625v-1.5h2.625c.345 0 .625-.28 .625-.625Z"),
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
        return _forward30Fill!!
    }

private var _forward30Fill: ImageVector? = null
