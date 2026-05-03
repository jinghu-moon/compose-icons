package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BracesFill: ImageVector
    get() {
        if (_bracesFill != null) return _bracesFill!!
        _bracesFill = remixIcon(
            name = "BracesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 18.000 L 4.000 14.300 C 4.000 13.472 3.328 12.800 2.500 12.800 L 2.000 12.800 L 2.000 11.200 L 2.500 11.200 C 3.328 11.200 4.000 10.528 4.000 9.700 L 4.000 6.000 C 4.000 4.343 5.343 3.000 7.000 3.000 L 8.000 3.000 L 8.000 5.000 L 7.000 5.000 C 6.448 5.000 6.000 5.448 6.000 6.000 L 6.000 10.100 C 6.000 10.986 5.424 11.737 4.626 12.000 C 5.424 12.263 6.000 13.014 6.000 13.900 L 6.000 18.000 C 6.000 18.552 6.448 19.000 7.000 19.000 L 8.000 19.000 L 8.000 21.000 L 7.000 21.000 C 5.343 21.000 4.000 19.657 4.000 18.000 ZM 20.000 14.300 L 20.000 18.000 C 20.000 19.657 18.657 21.000 17.000 21.000 L 16.000 21.000 L 16.000 19.000 L 17.000 19.000 C 17.552 19.000 18.000 18.552 18.000 18.000 L 18.000 13.900 C 18.000 13.014 18.576 12.263 19.374 12.000 C 18.576 11.737 18.000 10.986 18.000 10.100 L 18.000 6.000 C 18.000 5.448 17.552 5.000 17.000 5.000 L 16.000 5.000 L 16.000 3.000 L 17.000 3.000 C 18.657 3.000 20.000 4.343 20.000 6.000 L 20.000 9.700 C 20.000 10.528 20.672 11.200 21.500 11.200 L 22.000 11.200 L 22.000 12.800 L 21.500 12.800 C 20.672 12.800 20.000 13.472 20.000 14.300 Z"),
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
        return _bracesFill!!
    }

private var _bracesFill: ImageVector? = null
