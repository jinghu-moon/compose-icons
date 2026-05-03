package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF1: ImageVector
    get() {
        if (_squareF1 != null) return _squareF1!!
        _squareF1 = tablerFilledIcon(
            name = "SquareF1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.424 8.061 7.061 8.424 7.007 8.883 L 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.061 15.576 7.424 15.939 7.883 15.993 L 8.000 16.000 L 8.117 15.993 C 8.576 15.939 8.939 15.576 8.993 15.117 L 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.620 12.933 10.999 12.507 10.999 12.000 C 10.999 11.493 10.620 11.067 10.117 11.007 L 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.620 9.933 10.999 9.507 10.999 9.000 C 10.999 8.493 10.620 8.067 10.117 8.007 L 10.000 8.000 ZM 15.994 8.886 C 15.911 8.109 14.986 7.726 14.377 8.216 L 14.293 8.293 L 12.293 10.293 L 12.210 10.387 C 11.930 10.748 11.930 11.252 12.210 11.613 L 12.293 11.707 L 12.387 11.790 C 12.748 12.070 13.252 12.070 13.613 11.790 L 13.707 11.707 L 14.000 11.414 L 14.000 15.000 L 14.007 15.117 C 14.067 15.620 14.493 15.999 15.000 15.999 C 15.507 15.999 15.933 15.620 15.993 15.117 L 16.000 15.000 L 16.000 9.000 L 15.994 8.886 Z"),
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
        return _squareF1!!
    }

private var _squareF1: ImageVector? = null
