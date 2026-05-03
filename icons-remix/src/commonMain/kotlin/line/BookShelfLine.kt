package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BookShelfLine: ImageVector
    get() {
        if (_bookShelfLine != null) return _bookShelfLine!!
        _bookShelfLine = remixIcon(
            name = "BookShelfLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 14.000 21.000 C 14.552 21.000 15.000 20.552 15.000 20.000 L 15.000 15.297 L 16.000 20.000 C 16.114 20.540 16.645 20.885 17.186 20.770 L 21.098 19.938 C 21.638 19.823 21.983 19.292 21.868 18.752 L 18.958 5.058 C 18.843 4.518 18.312 4.173 17.772 4.288 L 14.993 4.879 C 14.933 4.384 14.511 4.000 14.000 4.000 L 10.000 4.000 C 10.000 3.448 9.552 3.000 9.000 3.000 L 4.000 3.000 ZM 10.000 6.000 L 13.000 6.000 L 13.000 14.000 L 10.000 14.000 L 10.000 6.000 ZM 10.000 19.000 L 10.000 16.000 L 13.000 16.000 L 13.000 19.000 L 10.000 19.000 ZM 8.000 5.000 L 8.000 15.000 L 5.000 15.000 L 5.000 5.000 L 8.000 5.000 ZM 8.000 17.000 L 8.000 19.000 L 5.000 19.000 L 5.000 17.000 L 8.000 17.000 ZM 17.332 16.650 L 19.288 16.234 L 19.704 18.190 L 17.748 18.606 L 17.332 16.650 ZM 16.916 14.693 L 15.253 6.868 L 17.209 6.452 L 18.873 14.278 L 16.916 14.693 Z"),
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
        return _bookShelfLine!!
    }

private var _bookShelfLine: ImageVector? = null
