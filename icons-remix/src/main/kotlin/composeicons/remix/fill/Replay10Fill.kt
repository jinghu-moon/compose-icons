package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Replay10Fill: ImageVector
    get() {
        if (_replay10Fill != null) return _replay10Fill!!
        _replay10Fill = remixIcon(
            name = "Replay10Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12h2c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4 9.536 4 7.332 5.114 5.865 6.865L8 9h-6v-6L4.447 5.446C6.28 3.335 8.984 2 12 2ZM14.5 8.25C13.119 8.25 12 9.369 12 10.75v2.5c0 1.381 1.119 2.5 2.5 2.5 1.381 0 2.5-1.119 2.5-2.5v-2.5C17 9.369 15.881 8.25 14.5 8.25ZM15.5 10.75v2.5c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2.5c0-.552 .448-1 1-1 .552 0 1 .448 1 1ZM10 8.5h-1.5v7h1.5v-7Z"),
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
        return _replay10Fill!!
    }

private var _replay10Fill: ImageVector? = null
