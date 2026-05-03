package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignTop: ImageVector
    get() {
        if (_layoutAlignTop != null) return _layoutAlignTop!!
        _layoutAlignTop = tablerFilledIcon(
            name = "LayoutAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 C 21.000 4.552 20.552 5.000 20.000 5.000 L 4.000 5.000 C 3.448 5.000 3.000 4.552 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 13.000 7.000 C 14.657 7.000 16.000 8.343 16.000 10.000 L 16.000 18.000 C 16.000 19.657 14.657 21.000 13.000 21.000 L 11.000 21.000 C 9.343 21.000 8.000 19.657 8.000 18.000 L 8.000 10.000 C 8.000 8.343 9.343 7.000 11.000 7.000 Z"),
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
        return _layoutAlignTop!!
    }

private var _layoutAlignTop: ImageVector? = null
