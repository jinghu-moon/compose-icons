package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF0: ImageVector
    get() {
        if (_squareF0 != null) return _squareF0!!
        _squareF0 = tablerFilledIcon(
            name = "SquareF0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 14.500 8.000 C 13.183 8.000 12.091 9.022 12.005 10.336 L 12.000 10.500 L 12.000 13.500 L 12.005 13.664 C 12.088 14.981 13.181 16.006 14.500 16.006 C 15.819 16.006 16.912 14.981 16.995 13.664 L 17.000 13.500 L 17.000 10.500 L 16.995 10.336 C 16.909 9.022 15.817 8.000 14.500 8.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.424 8.061 7.061 8.424 7.007 8.883 L 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.061 15.576 7.424 15.939 7.883 15.993 L 8.000 16.000 L 8.117 15.993 C 8.576 15.939 8.939 15.576 8.993 15.117 L 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.620 12.933 10.999 12.507 10.999 12.000 C 10.999 11.493 10.620 11.067 10.117 11.007 L 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.620 9.933 10.999 9.507 10.999 9.000 C 10.999 8.493 10.620 8.067 10.117 8.007 L 10.000 8.000 ZM 14.500 10.000 C 14.741 10.000 14.949 10.172 14.992 10.410 L 15.000 10.500 L 15.000 13.500 L 14.992 13.590 C 14.949 13.828 14.742 14.001 14.500 14.001 C 14.258 14.001 14.051 13.828 14.008 13.590 L 14.000 13.500 L 14.000 10.500 L 14.008 10.410 C 14.051 10.172 14.259 10.000 14.500 10.000 Z"),
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
        return _squareF0!!
    }

private var _squareF0: ImageVector? = null
