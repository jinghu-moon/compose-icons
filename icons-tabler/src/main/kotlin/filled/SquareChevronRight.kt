package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronRight: ImageVector
    get() {
        if (_squareChevronRight != null) return _squareChevronRight!!
        _squareChevronRight = tablerFilledIcon(
            name = "SquareChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 11.613 8.210 C 11.215 7.901 10.649 7.937 10.293 8.293 L 10.210 8.387 C 9.901 8.785 9.937 9.351 10.293 9.707 L 12.585 12.000 L 10.293 14.293 L 10.210 14.387 C 9.887 14.804 9.944 15.400 10.340 15.749 C 10.735 16.097 11.334 16.079 11.707 15.707 L 14.707 12.707 L 14.790 12.613 C 15.099 12.215 15.063 11.649 14.707 11.293 L 11.707 8.293 Z"),
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
        return _squareChevronRight!!
    }

private var _squareChevronRight: ImageVector? = null
