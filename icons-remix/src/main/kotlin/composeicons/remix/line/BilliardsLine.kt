package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BilliardsLine: ImageVector
    get() {
        if (_billiardsLine != null) return _billiardsLine!!
        _billiardsLine = remixIcon(
            name = "BilliardsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM12 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6C8.686 18 6 15.314 6 12 6 8.686 8.686 6 12 6ZM12 7.75c-1.381 0-2.5 1.119-2.5 2.5 0 .632 .234 1.208 .621 1.647-.566 .457-.921 1.118-.921 1.853 0 1.381 1.254 2.5 2.8 2.5 1.546 0 2.8-1.119 2.8-2.5 0-.735-.355-1.396-.92-1.852 .386-.44 .62-1.017 .62-1.648C14.5 8.869 13.381 7.75 12 7.75ZM12 12.75c.753 0 1.3 .488 1.3 1 0 .512-.547 1-1.3 1-.753 0-1.3-.488-1.3-1 0-.512 .547-1 1.3-1ZM12 9.25c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z"),
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
        return _billiardsLine!!
    }

private var _billiardsLine: ImageVector? = null
