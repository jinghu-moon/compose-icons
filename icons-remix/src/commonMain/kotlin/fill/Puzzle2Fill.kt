package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Puzzle2Fill: ImageVector
    get() {
        if (_puzzle2Fill != null) return _puzzle2Fill!!
        _puzzle2Fill = remixIcon(
            name = "Puzzle2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 4.000 C 8.000 2.343 9.343 1.000 11.000 1.000 C 12.657 1.000 14.000 2.343 14.000 4.000 C 14.000 4.351 13.940 4.687 13.829 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 L 21.000 9.126 C 21.000 9.435 20.857 9.727 20.613 9.916 C 20.368 10.106 20.050 10.172 19.751 10.094 C 19.512 10.033 19.260 10.000 19.000 10.000 C 17.343 10.000 16.000 11.343 16.000 13.000 C 16.000 14.657 17.343 16.000 19.000 16.000 C 19.260 16.000 19.512 15.967 19.751 15.906 C 20.050 15.828 20.368 15.894 20.613 16.084 C 20.857 16.273 21.000 16.565 21.000 16.874 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 8.171 5.000 C 8.060 4.687 8.000 4.351 8.000 4.000 Z"),
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
        return _puzzle2Fill!!
    }

private var _puzzle2Fill: ImageVector? = null
