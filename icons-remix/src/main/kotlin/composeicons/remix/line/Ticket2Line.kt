package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ticket2Line: ImageVector
    get() {
        if (_ticket2Line != null) return _ticket2Line!!
        _ticket2Line = remixIcon(
            name = "Ticket2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.005 3c.552 0 1 .448 1 1v5.5c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5v5.5c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-5.5c1.381 0 2.5-1.119 2.5-2.5C4.505 10.619 3.386 9.5 2.005 9.5v-5.5c0-.552 .448-1 1-1h18ZM20.005 5h-16v2.968l.156 .081c1.339 .732 2.264 2.124 2.339 3.739l.005 .212c0 1.704-.947 3.187-2.344 3.951l-.156 .08v2.969h16v-2.969l-.156-.08c-1.339-.732-2.264-2.124-2.339-3.739l-.005-.212c0-1.704 .947-3.187 2.344-3.951l.156-.081v-2.968ZM16.005 9v6h-8v-6h8Z"),
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
        return _ticket2Line!!
    }

private var _ticket2Line: ImageVector? = null
