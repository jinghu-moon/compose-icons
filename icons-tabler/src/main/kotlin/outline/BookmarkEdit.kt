package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookmarkEdit: ImageVector
    get() {
        if (_bookmarkEdit != null) return _bookmarkEdit!!
        _bookmarkEdit = tablerOutlineIcon(
            name = "BookmarkEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 17.000 L 6.000 21.000 L 6.000 7.000 C 6.000 4.791 7.791 3.000 10.000 3.000 L 14.000 3.000 C 16.209 3.000 18.000 4.791 18.000 7.000 L 18.000 11.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.420 15.610 C 19.240 14.790 20.570 14.790 21.390 15.610 C 22.210 16.430 22.210 17.760 21.390 18.580 L 18.000 22.000 L 15.000 22.000 L 15.000 19.000 L 18.420 15.610"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _bookmarkEdit!!
    }

private var _bookmarkEdit: ImageVector? = null
