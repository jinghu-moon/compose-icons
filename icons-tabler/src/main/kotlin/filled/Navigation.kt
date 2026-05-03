package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Navigation: ImageVector
    get() {
        if (_navigation != null) return _navigation!!
        _navigation = tablerFilledIcon(
            name = "Navigation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.092 2.581 C 11.245 2.248 11.569 2.025 11.934 2.001 C 12.300 1.977 12.650 2.155 12.846 2.465 L 12.908 2.581 L 20.913 19.946 C 21.111 20.512 20.963 21.142 20.535 21.561 C 20.152 21.940 19.598 22.089 19.076 21.954 L 11.999 19.556 L 5.100 21.894 C 4.589 22.095 4.009 22.006 3.580 21.663 L 3.468 21.563 C 3.070 21.177 2.912 20.609 3.075 20.007 L 3.122 19.857 L 11.092 2.581 Z"),
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
        return _navigation!!
    }

private var _navigation: ImageVector? = null
