package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Book2Line: ImageVector
    get() {
        if (_book2Line != null) return _book2Line!!
        _book2Line = remixIcon(
            name = "Book2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 18.000 L 6.000 18.000 C 5.448 18.000 5.000 18.448 5.000 19.000 C 5.000 19.552 5.448 20.000 6.000 20.000 L 21.000 20.000 L 21.000 22.000 L 6.000 22.000 C 4.343 22.000 3.000 20.657 3.000 19.000 L 3.000 4.000 C 3.000 2.895 3.895 2.000 5.000 2.000 L 21.000 2.000 L 21.000 18.000 ZM 5.000 16.050 C 5.162 16.017 5.329 16.000 5.500 16.000 L 19.000 16.000 L 19.000 4.000 L 5.000 4.000 L 5.000 16.050 ZM 16.000 9.000 L 8.000 9.000 L 8.000 7.000 L 16.000 7.000 L 16.000 9.000 Z"),
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
        return _book2Line!!
    }

private var _book2Line: ImageVector? = null
