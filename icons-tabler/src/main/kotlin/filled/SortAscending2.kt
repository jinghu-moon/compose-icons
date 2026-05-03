package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SortAscending2: ImageVector
    get() {
        if (_sortAscending2 != null) return _sortAscending2!!
        _sortAscending2 = tablerFilledIcon(
            name = "SortAscending2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.852 5.011 L 16.910 5.004 L 17.000 5.000 L 17.075 5.003 L 17.201 5.020 L 17.312 5.050 L 17.423 5.094 L 17.521 5.146 L 17.625 5.220 L 17.707 5.293 L 20.707 8.293 C 20.967 8.544 21.071 8.916 20.980 9.266 C 20.888 9.615 20.615 9.888 20.266 9.980 C 19.916 10.071 19.544 9.967 19.293 9.707 L 18.000 8.415 L 18.000 18.000 C 18.000 18.552 17.552 19.000 17.000 19.000 C 16.448 19.000 16.000 18.552 16.000 18.000 L 16.000 8.415 L 14.707 9.707 C 14.351 10.063 13.785 10.099 13.387 9.790 L 13.293 9.707 C 12.903 9.316 12.903 8.684 13.293 8.293 L 16.293 5.293 Q 16.346 5.239 16.405 5.196 L 16.515 5.125 L 16.629 5.071 L 16.734 5.036 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 9.500 4.000 C 10.328 4.000 11.000 4.672 11.000 5.500 L 11.000 9.500 C 11.000 10.328 10.328 11.000 9.500 11.000 L 5.500 11.000 C 4.672 11.000 4.000 10.328 4.000 9.500 L 4.000 5.500 C 4.000 4.672 4.672 4.000 5.500 4.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 9.500 13.000 C 10.328 13.000 11.000 13.672 11.000 14.500 L 11.000 18.500 C 11.000 19.328 10.328 20.000 9.500 20.000 L 5.500 20.000 C 4.672 20.000 4.000 19.328 4.000 18.500 L 4.000 14.500 C 4.000 13.672 4.672 13.000 5.500 13.000 Z"),
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
        return _sortAscending2!!
    }

private var _sortAscending2: ImageVector? = null
