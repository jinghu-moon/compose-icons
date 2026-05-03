package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Squares: ImageVector
    get() {
        if (_squares != null) return _squares!!
        _squares = tablerFilledIcon(
            name = "Squares",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 7.000 C 20.657 7.000 22.000 8.343 22.000 10.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 10.000 22.000 C 8.343 22.000 7.000 20.657 7.000 19.000 L 7.000 10.000 C 7.000 8.343 8.343 7.000 10.000 7.000 Z"),
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
        pathData = parseSvgPathData("M 14.000 2.000 C 15.656 2.000 16.999 3.343 17.000 4.999 L 10.000 5.000 C 7.239 5.000 5.000 7.239 5.000 10.000 L 4.999 17.000 L 4.824 16.995 C 3.238 16.902 2.000 15.589 2.000 14.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 Z"),
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
        return _squares!!
    }

private var _squares: ImageVector? = null
