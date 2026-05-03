package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber1: ImageVector
    get() {
        if (_squareNumber1 != null) return _squareNumber1!!
        _squareNumber1 = tablerFilledIcon(
            name = "SquareNumber1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 12.994 7.886 C 12.911 7.109 11.986 6.726 11.377 7.216 L 11.293 7.293 L 9.293 9.293 L 9.210 9.387 C 8.930 9.748 8.930 10.252 9.210 10.613 L 9.293 10.707 L 9.387 10.790 C 9.748 11.070 10.252 11.070 10.613 10.790 L 10.707 10.707 L 11.000 10.414 L 11.000 16.000 L 11.007 16.117 C 11.067 16.620 11.493 16.999 12.000 16.999 C 12.507 16.999 12.933 16.620 12.993 16.117 L 13.000 16.000 L 13.000 8.000 L 12.994 7.886 Z"),
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
        return _squareNumber1!!
    }

private var _squareNumber1: ImageVector? = null
