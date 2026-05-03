package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = tablerFilledIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.327 2.260 C 9.682 3.757 8.041 5.259 6.404 6.764 C 5.778 7.364 5.192 7.974 4.630 8.607 C 2.582 10.932 2.450 14.378 4.316 16.852 L 4.456 17.029 C 5.468 18.234 7.017 18.784 8.511 18.603 L 8.757 18.566 L 8.051 20.684 C 7.949 20.989 8.001 21.324 8.189 21.585 C 8.377 21.846 8.679 22.000 9.000 22.000 L 15.000 22.000 L 15.118 21.993 C 15.417 21.957 15.683 21.789 15.844 21.535 C 16.005 21.281 16.043 20.968 15.948 20.683 L 15.260 18.618 L 15.364 18.638 C 16.953 18.888 18.626 18.251 19.684 16.853 C 21.550 14.380 21.420 10.936 19.373 8.610 C 18.811 7.977 18.224 7.366 17.613 6.780 L 12.675 2.262 C 12.293 1.913 11.709 1.913 11.327 2.261 Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
