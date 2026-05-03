package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RectangleVertical: ImageVector
    get() {
        if (_rectangleVertical != null) return _rectangleVertical!!
        _rectangleVertical = tablerFilledIcon(
            name = "RectangleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 L 7.000 2.000 C 5.343 2.000 4.000 3.343 4.000 5.000 L 4.000 19.000 C 4.000 20.657 5.343 22.000 7.000 22.000 L 17.000 22.000 C 18.657 22.000 20.000 20.657 20.000 19.000 L 20.000 5.000 C 20.000 3.343 18.657 2.000 17.000 2.000 Z"),
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
        return _rectangleVertical!!
    }

private var _rectangleVertical: ImageVector? = null
