package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LeafLine: ImageVector
    get() {
        if (_leafLine != null) return _leafLine!!
        _leafLine = remixIcon(
            name = "LeafLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.998 3.000 L 20.998 5.000 C 20.998 14.627 15.625 19.000 8.998 19.000 L 5.241 19.000 C 5.079 19.912 4.998 20.907 4.998 22.000 L 2.998 22.000 C 2.998 20.637 3.114 19.400 3.344 18.268 C 3.113 16.974 2.998 15.218 2.998 13.000 C 2.998 7.477 7.475 3.000 12.998 3.000 C 14.998 3.000 16.998 4.000 20.998 3.000 ZM 12.998 5.000 C 8.580 5.000 4.998 8.582 4.998 13.000 C 4.998 13.362 5.001 13.711 5.008 14.046 C 6.262 12.068 8.099 10.505 10.502 9.132 L 11.494 10.868 C 8.639 12.500 6.746 14.354 5.773 17.000 L 8.998 17.000 C 15.013 17.000 18.869 13.027 18.995 5.388 C 17.623 5.521 16.348 5.436 14.775 5.200 C 13.624 5.027 13.399 5.000 12.998 5.000 Z"),
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
        return _leafLine!!
    }

private var _leafLine: ImageVector? = null
