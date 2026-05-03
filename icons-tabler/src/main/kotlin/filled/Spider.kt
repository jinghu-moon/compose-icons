package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Spider: ImageVector
    get() {
        if (_spider != null) return _spider!!
        _spider = tablerFilledIcon(
            name = "Spider",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 3.000 C 19.552 3.000 20.000 3.448 20.000 4.000 L 20.000 6.000 C 20.000 6.265 19.895 6.520 19.707 6.707 L 16.414 10.000 L 19.584 10.000 L 20.793 8.793 C 21.185 8.414 21.809 8.419 22.195 8.805 C 22.581 9.191 22.586 9.815 22.207 10.207 L 20.707 11.707 C 20.520 11.895 20.265 12.000 20.000 12.000 L 16.415 12.000 L 20.707 16.293 C 20.895 16.480 21.000 16.735 21.000 17.000 L 21.000 19.000 C 21.000 19.552 20.552 20.000 20.000 20.000 C 19.448 20.000 19.000 19.552 19.000 19.000 L 19.000 17.415 L 16.984 15.399 C 16.776 17.997 14.606 19.999 12.000 19.999 C 9.394 19.999 7.224 17.997 7.016 15.399 L 5.000 17.414 L 5.000 19.000 C 5.000 19.507 4.620 19.934 4.117 19.993 L 4.000 20.000 C 3.448 20.000 3.000 19.552 3.000 19.000 L 3.000 17.000 C 3.000 16.735 3.105 16.480 3.293 16.293 L 7.584 12.000 L 4.000 12.000 C 3.735 12.000 3.480 11.895 3.293 11.707 L 1.793 10.207 C 1.414 9.815 1.419 9.191 1.805 8.805 C 2.191 8.419 2.815 8.414 3.207 8.793 L 4.415 10.000 L 7.585 10.000 L 4.293 6.707 C 4.105 6.520 4.000 6.265 4.000 6.000 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 C 5.552 3.000 6.000 3.448 6.000 4.000 L 6.000 5.585 L 9.025 8.610 C 9.219 7.115 10.493 5.996 12.000 5.996 C 13.507 5.996 14.781 7.115 14.975 8.610 L 18.000 5.584 L 18.000 4.000 C 18.000 3.493 18.380 3.066 18.883 3.007 Z"),
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
        return _spider!!
    }

private var _spider: ImageVector? = null
