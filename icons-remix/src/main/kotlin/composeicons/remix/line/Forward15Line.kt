package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Forward15Line: ImageVector
    get() {
        if (_forward15Line != null) return _forward15Line!!
        _forward15Line = remixIcon(
            name = "Forward15Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10h-2c0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c2.75 0 5.176 1.387 6.615 3.5L16 7.5v1h-4v4.25h2.875c.345 0 .625 .28 .625 .625 0 .345-.28 .625-.625 .625h-2.875v1.5h2.875c1.174 0 2.125-.951 2.125-2.125 0-1.174-.951-2.125-2.125-2.125h-1.375v-1.25h3.25v-.5h5.25v-6h-2l0 2.499C18.176 3.571 15.271 2 12 2ZM8.5 8.5h1.5v7h-1.5v-7Z"),
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
        return _forward15Line!!
    }

private var _forward15Line: ImageVector? = null
