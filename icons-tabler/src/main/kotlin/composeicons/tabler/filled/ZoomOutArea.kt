package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomOutArea: ImageVector
    get() {
        if (_zoomOutArea != null) return _zoomOutArea!!
        _zoomOutArea = tablerFilledIcon(
            name = "ZoomOutArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 9c2.245-0 4.302 1.253 5.332 3.248 1.03 1.995 .86 4.398-.441 6.228l2.816 2.817c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L18.476 19.891c-1.83 1.301-4.233 1.471-6.228 .441C10.253 19.302 9 17.245 9 15l.004-.225C9.125 11.551 11.774 9 15 9M17 14h-4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h4c.552 0 1-.448 1-1 0-.552-.448-1-1-1M3 14c.552 0 1 .448 1 1v1c0 .552 .448 1 1 1h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1C3.343 19 2 17.657 2 16v-1c0-.552 .448-1 1-1M3 9c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1C2.448 12 2 11.552 2 11v-1C2 9.448 2.448 9 3 9M6 2c.552 0 1 .448 1 1C7 3.552 6.552 4 6 4h-1C4.448 4 4 4.448 4 5v1C4 6.552 3.552 7 3 7 2.448 7 2 6.552 2 6v-1C2 3.343 3.343 2 5 2ZM11 2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1C9.448 4 9 3.552 9 3 9 2.448 9.448 2 10 2ZM16 2c1.657 0 3 1.343 3 3v1c0 .552-.448 1-1 1C17.448 7 17 6.552 17 6v-1C17 4.448 16.552 4 16 4h-1C14.448 4 14 3.552 14 3c0-.552 .448-1 1-1Z"),
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
        return _zoomOutArea!!
    }

private var _zoomOutArea: ImageVector? = null
