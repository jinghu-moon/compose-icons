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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.998 3v2c0 9.627-5.372 14-12 14L5.241 19c-.162 .912-.243 1.907-.243 3h-2c0-1.363 .116-2.6 .346-3.732C3.113 16.974 2.998 15.218 2.998 13 2.998 7.477 7.475 3 12.998 3c2 0 4 1 8 0ZM12.998 5C8.58 5 4.998 8.582 4.998 13c0 .362 .003 .711 .01 1.046C6.262 12.068 8.099 10.505 10.502 9.132l.992 1.736C8.639 12.5 6.746 14.354 5.773 17L8.998 17c6.015 0 9.871-3.973 9.997-11.612-1.372 .133-2.647 .048-4.219-.188C13.624 5.027 13.399 5 12.998 5Z"),
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
        return _leafLine!!
    }

private var _leafLine: ImageVector? = null
