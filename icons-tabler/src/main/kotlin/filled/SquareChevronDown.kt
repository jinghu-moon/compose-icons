package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronDown: ImageVector
    get() {
        if (_squareChevronDown != null) return _squareChevronDown!!
        _squareChevronDown = tablerFilledIcon(
            name = "SquareChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 9.613 10.210 C 9.196 9.887 8.600 9.944 8.251 10.340 C 7.903 10.735 7.921 11.334 8.293 11.707 L 11.293 14.707 L 11.387 14.790 C 11.785 15.099 12.351 15.063 12.707 14.707 L 15.707 11.707 L 15.790 11.613 C 16.099 11.215 16.063 10.649 15.707 10.293 L 15.613 10.210 C 15.215 9.901 14.649 9.937 14.293 10.293 L 12.000 12.585 L 9.707 10.293 Z"),
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
        return _squareChevronDown!!
    }

private var _squareChevronDown: ImageVector? = null
