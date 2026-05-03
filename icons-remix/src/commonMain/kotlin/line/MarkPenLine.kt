package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MarkPenLine: ImageVector
    get() {
        if (_markPenLine != null) return _markPenLine!!
        _markPenLine = remixIcon(
            name = "MarkPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.243 4.511 L 8.505 11.249 L 7.798 13.370 L 6.757 14.411 L 9.586 17.239 L 10.627 16.198 L 12.748 15.491 L 19.485 8.754 L 15.243 4.511 ZM 21.607 8.047 C 21.997 8.438 21.997 9.071 21.607 9.461 L 13.828 17.239 L 11.707 17.947 L 10.293 19.361 C 9.902 19.751 9.269 19.751 8.879 19.361 L 4.636 15.118 C 4.246 14.728 4.246 14.094 4.636 13.704 L 6.050 12.290 L 6.757 10.168 L 14.536 2.390 C 14.926 2.000 15.559 2.000 15.950 2.390 L 21.607 8.047 ZM 15.243 7.340 L 16.657 8.754 L 11.707 13.704 L 10.293 12.290 L 15.243 7.340 ZM 4.283 16.886 L 7.111 19.714 L 5.697 21.128 L 1.454 19.714 L 4.283 16.886 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _markPenLine!!
    }

private var _markPenLine: ImageVector? = null
