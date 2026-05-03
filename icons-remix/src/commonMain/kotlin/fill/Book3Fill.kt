package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Book3Fill: ImageVector
    get() {
        if (_book3Fill != null) return _book3Fill!!
        _book3Fill = remixIcon(
            name = "Book3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 4.000 L 7.000 4.000 C 5.895 4.000 5.000 4.895 5.000 6.000 C 5.000 7.105 5.895 8.000 7.000 8.000 L 21.000 8.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 7.000 22.000 C 4.791 22.000 3.000 20.209 3.000 18.000 L 3.000 6.000 C 3.000 3.791 4.791 2.000 7.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 4.000 ZM 20.000 7.000 L 7.000 7.000 C 6.448 7.000 6.000 6.552 6.000 6.000 C 6.000 5.448 6.448 5.000 7.000 5.000 L 20.000 5.000 L 20.000 7.000 Z"),
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
        return _book3Fill!!
    }

private var _book3Fill: ImageVector? = null
