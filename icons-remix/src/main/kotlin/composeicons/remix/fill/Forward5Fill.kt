package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Forward5Fill: ImageVector
    get() {
        if (_forward5Fill != null) return _forward5Fill!!
        _forward5Fill = remixIcon(
            name = "Forward5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 12C2 6.477 6.477 2 12 2c3.016 0 5.72 1.335 7.553 3.446L22 3v6h-6L18.135 6.865C16.668 5.114 14.464 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8h2c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12ZM14.5 10v-1.5h-5v4.25h3.125c.345 0 .625 .28 .625 .625 0 .345-.28 .625-.625 .625h-3.125v1.5h3.125c1.174 0 2.125-.951 2.125-2.125 0-1.174-.951-2.125-2.125-2.125h-1.625v-1.25h3.5Z"),
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
        return _forward5Fill!!
    }

private var _forward5Fill: ImageVector? = null
