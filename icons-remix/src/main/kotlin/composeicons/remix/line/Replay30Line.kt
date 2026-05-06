package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Replay30Line: ImageVector
    get() {
        if (_replay30Line != null) return _replay30Line!!
        _replay30Line = remixIcon(
            name = "Replay30Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12C22 6.477 17.523 2 12 2 8.729 2 5.824 3.571 4 5.999L4 3.5h-2v6h4.75v.5h2.625c.345 0 .625 .28 .625 .625 0 .345-.28 .625-.625 .625h-1.875v1.5h1.875c.345 0 .625 .28 .625 .625 0 .345-.28 .625-.625 .625h-2.625v1.5h2.625c1.174 0 2.125-.951 2.125-2.125 0-.524-.19-1.004-.505-1.375 .315-.371 .505-.851 .505-1.375 0-1.174-.951-2.125-2.125-2.125h-1.375v-1L5.385 7.5C6.824 5.387 9.25 4 12 4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12h-2c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10ZM12.5 10.75C12.5 9.369 13.619 8.25 15 8.25c1.381 0 2.5 1.119 2.5 2.5v2.5c0 1.381-1.119 2.5-2.5 2.5-1.381 0-2.5-1.119-2.5-2.5v-2.5ZM15 9.75c-.552 0-1 .448-1 1v2.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2.5c0-.552-.448-1-1-1Z"),
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
        return _replay30Line!!
    }

private var _replay30Line: ImageVector? = null
