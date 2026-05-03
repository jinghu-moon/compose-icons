package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = tablerFilledIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 19.000 L 5.000 19.000 C 4.500 19.000 4.100 18.700 4.000 18.200 L 2.000 8.200 C 2.000 7.800 2.100 7.400 2.500 7.100 C 2.900 6.900 3.300 6.900 3.600 7.100 L 7.700 10.400 L 11.100 5.300 C 11.500 4.700 12.400 4.700 12.800 5.300 L 16.200 10.400 L 20.300 7.100 C 20.600 6.800 21.100 6.800 21.400 7.100 C 21.800 7.300 21.900 7.700 21.900 8.200 L 19.900 18.200 C 19.900 18.700 19.400 19.000 18.900 19.000 Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
