package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Replay15Fill: ImageVector
    get() {
        if (_replay15Fill != null) return _replay15Fill!!
        _replay15Fill = remixIcon(
            name = "Replay15Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12h2c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 9.536 4 7.332 5.114 5.865 6.865L8 9h-6v-6L4.447 5.446C6.28 3.335 8.984 2 12 2ZM8.5 8.5h1.5v7h-1.5v-7ZM16.75 8.5h-4.75v4.25h2.875c.345 0 .625 .28 .625 .625 0 .345-.28 .625-.625 .625h-2.875v1.5h2.875c1.174 0 2.125-.951 2.125-2.125 0-1.174-.951-2.125-2.125-2.125h-1.375v-1.25h3.25v-1.5Z"),
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
        return _replay15Fill!!
    }

private var _replay15Fill: ImageVector? = null
