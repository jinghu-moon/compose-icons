package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignCenter: ImageVector
    get() {
        if (_layoutAlignCenter != null) return _layoutAlignCenter!!
        _layoutAlignCenter = tablerFilledIcon(
            name = "LayoutAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 12.552 3.000 13.000 3.448 13.000 4.000 L 13.000 8.000 L 16.000 8.000 C 17.657 8.000 19.000 9.343 19.000 11.000 L 19.000 13.000 C 19.000 14.657 17.657 16.000 16.000 16.000 L 13.000 16.000 L 13.000 20.000 C 13.000 20.552 12.552 21.000 12.000 21.000 C 11.448 21.000 11.000 20.552 11.000 20.000 L 11.000 16.000 L 8.000 16.000 C 6.343 16.000 5.000 14.657 5.000 13.000 L 5.000 11.000 C 5.000 9.343 6.343 8.000 8.000 8.000 L 11.000 8.000 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000"),
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
        return _layoutAlignCenter!!
    }

private var _layoutAlignCenter: ImageVector? = null
