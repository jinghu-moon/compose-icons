package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) return _bookmarks!!
        _bookmarks = tablerFilledIcon(
            name = "Bookmarks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 6.000 C 14.209 6.000 16.000 7.791 16.000 10.000 L 16.000 21.000 C 16.000 21.360 15.806 21.692 15.493 21.869 C 15.179 22.047 14.795 22.042 14.486 21.857 L 10.000 19.166 L 5.514 21.857 C 5.223 22.032 4.862 22.047 4.557 21.897 C 4.253 21.746 4.045 21.452 4.006 21.114 L 4.000 21.000 L 4.000 10.000 C 4.000 7.791 5.791 6.000 8.000 6.000 L 12.000 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 C 18.209 2.000 20.000 3.791 20.000 6.000 L 20.000 17.000 C 20.000 17.552 19.552 18.000 19.000 18.000 C 18.448 18.000 18.000 17.552 18.000 17.000 L 18.000 6.000 C 18.000 4.895 17.105 4.000 16.000 4.000 L 11.000 4.000 C 10.448 4.000 10.000 3.552 10.000 3.000 C 10.000 2.448 10.448 2.000 11.000 2.000 L 16.000 2.000 Z"),
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
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
