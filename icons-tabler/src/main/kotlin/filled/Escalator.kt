package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Escalator: ImageVector
    get() {
        if (_escalator != null) return _escalator!!
        _escalator = tablerFilledIcon(
            name = "Escalator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.500 4.000 C 21.433 4.000 23.000 5.567 23.000 7.500 C 23.000 9.433 21.433 11.000 19.500 11.000 L 18.414 11.000 L 10.294 19.121 C 9.780 19.635 9.096 19.945 8.370 19.993 L 8.172 20.000 L 4.500 20.000 C 2.567 20.000 1.000 18.433 1.000 16.500 C 1.000 14.567 2.567 13.000 4.500 13.000 L 6.584 13.000 L 14.707 4.879 C 15.221 4.365 15.905 4.055 16.630 4.007 L 16.828 4.000 Z"),
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
        return _escalator!!
    }

private var _escalator: ImageVector? = null
