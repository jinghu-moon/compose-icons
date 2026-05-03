package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowUpSquare: ImageVector
    get() {
        if (_arrowUpSquare != null) return _arrowUpSquare!!
        _arrowUpSquare = tablerFilledIcon(
            name = "ArrowUpSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.852 2.011 L 11.910 2.004 L 12.000 2.000 L 12.075 2.003 L 12.201 2.020 L 12.312 2.050 L 12.423 2.094 L 12.521 2.146 L 12.625 2.220 L 12.707 2.293 L 15.707 5.293 C 15.967 5.544 16.071 5.916 15.980 6.266 C 15.888 6.615 15.615 6.888 15.266 6.980 C 14.916 7.071 14.544 6.967 14.293 6.707 L 13.000 5.415 L 13.000 16.000 L 14.000 16.000 C 14.552 16.000 15.000 16.448 15.000 17.000 L 15.000 21.000 C 15.000 21.552 14.552 22.000 14.000 22.000 L 10.000 22.000 C 9.448 22.000 9.000 21.552 9.000 21.000 L 9.000 17.000 C 9.000 16.448 9.448 16.000 10.000 16.000 L 11.000 16.000 L 11.000 5.415 L 9.707 6.707 C 9.351 7.063 8.785 7.099 8.387 6.790 L 8.293 6.707 C 7.903 6.317 7.903 5.683 8.293 5.293 L 11.293 2.293 Q 11.346 2.239 11.405 2.196 L 11.515 2.125 L 11.629 2.071 L 11.734 2.036 Z"),
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
        return _arrowUpSquare!!
    }

private var _arrowUpSquare: ImageVector? = null
