package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TreeLine: ImageVector
    get() {
        if (_treeLine != null) return _treeLine!!
        _treeLine = remixIcon(
            name = "TreeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 7.000 C 6.000 3.686 8.686 1.000 12.000 1.000 C 15.314 1.000 18.000 3.686 18.000 7.000 C 18.000 7.262 17.983 7.521 17.950 7.775 C 19.770 8.804 21.000 10.757 21.000 13.000 C 21.000 16.314 18.314 19.000 15.000 19.000 L 13.000 19.000 L 13.000 22.000 L 11.000 22.000 L 11.000 19.000 L 8.500 19.000 C 5.462 19.000 3.000 16.538 3.000 13.500 C 3.000 11.286 4.307 9.380 6.191 8.507 C 6.066 8.026 6.000 7.520 6.000 7.000 ZM 7.010 10.332 C 5.822 10.892 5.000 12.101 5.000 13.500 C 5.000 15.433 6.567 17.000 8.500 17.000 L 15.000 17.000 C 17.209 17.000 19.000 15.209 19.000 13.000 C 19.000 11.306 17.946 9.855 16.454 9.272 L 15.613 8.944 C 15.791 8.303 16.000 7.672 16.000 7.000 C 16.000 4.791 14.209 3.000 12.000 3.000 C 9.791 3.000 8.000 4.791 8.000 7.000 C 8.000 8.308 8.627 9.469 9.600 10.200 L 8.399 11.800 C 7.858 11.393 7.387 10.896 7.010 10.332 Z"),
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
        return _treeLine!!
    }

private var _treeLine: ImageVector? = null
