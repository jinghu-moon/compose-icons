package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mickey: ImageVector
    get() {
        if (_mickey != null) return _mickey!!
        _mickey = tablerFilledIcon(
            name = "Mickey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.501 2.000 C 20.814 2.001 22.750 3.757 22.977 6.059 C 23.204 8.361 21.648 10.460 19.379 10.913 C 20.617 13.870 19.971 17.280 17.737 19.579 C 15.504 21.877 12.113 22.621 9.123 21.468 C 6.132 20.315 4.118 17.488 4.005 14.285 L 4.000 14.000 L 4.005 13.715 C 4.039 12.751 4.248 11.802 4.620 10.912 C 3.258 10.642 2.097 9.758 1.475 8.517 C 0.852 7.276 0.836 5.818 1.433 4.564 C 2.108 3.150 3.470 2.188 5.029 2.025 L 5.254 2.007 L 5.535 2.000 L 5.779 2.009 C 8.058 2.150 9.870 3.976 9.994 6.256 C 11.310 5.915 12.691 5.915 14.007 6.256 C 14.137 3.869 16.110 2.000 18.500 2.000 Z"),
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
        return _mickey!!
    }

private var _mickey: ImageVector? = null
