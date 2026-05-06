package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Replay15Line: ImageVector
    get() {
        if (_replay15Line != null) return _replay15Line!!
        _replay15Line = remixIcon(
            name = "Replay15Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12h2c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 9.25 4 6.824 5.387 5.385 7.5L8 7.5v2h-6v-6h2L4 5.999C5.824 3.571 8.729 2 12 2ZM8.5 15.5v-7h1.5v7h-1.5ZM12 8.5h4.75v1.5h-3.25v1.25h1.375c1.174 0 2.125 .951 2.125 2.125 0 1.174-.951 2.125-2.125 2.125h-2.875v-1.5h2.875c.345 0 .625-.28 .625-.625 0-.345-.28-.625-.625-.625h-2.875v-4.25Z"),
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
        return _replay15Line!!
    }

private var _replay15Line: ImageVector? = null
