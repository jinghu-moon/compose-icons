package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Square: ImageVector
    get() {
        if (_square != null) return _square!!
        _square = tablerFilledIcon(
            name = "Square",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 L 5.000 2.000 C 3.343 2.000 2.000 3.343 2.000 5.000 L 2.000 19.000 C 2.000 20.657 3.343 22.000 5.000 22.000 L 19.000 22.000 C 20.657 22.000 22.000 20.657 22.000 19.000 L 22.000 5.000 C 22.000 3.343 20.657 2.000 19.000 2.000 Z"),
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
        return _square!!
    }

private var _square: ImageVector? = null
