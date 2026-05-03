package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF2: ImageVector
    get() {
        if (_squareF2 != null) return _squareF2!!
        _squareF2 = tablerFilledIcon(
            name = "SquareF2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 15.000 8.000 L 13.000 8.000 L 12.883 8.007 C 12.380 8.067 12.001 8.493 12.001 9.000 C 12.001 9.507 12.380 9.933 12.883 9.993 L 13.000 10.000 L 15.000 10.000 L 15.000 11.000 L 14.000 11.000 L 13.850 11.005 C 12.866 11.079 12.083 11.859 12.006 12.843 L 12.000 13.000 L 12.000 14.000 L 12.005 14.150 C 12.079 15.134 12.859 15.917 13.843 15.994 L 14.000 16.000 L 16.000 16.000 L 16.117 15.993 C 16.620 15.933 16.999 15.507 16.999 15.000 C 16.999 14.493 16.620 14.067 16.117 14.007 L 16.000 14.000 L 14.000 14.000 L 14.000 13.000 L 15.000 13.000 L 15.150 12.995 C 16.134 12.921 16.917 12.141 16.994 11.157 L 17.000 11.000 L 17.000 10.000 L 16.995 9.850 C 16.917 8.806 16.047 8.000 15.000 8.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.424 8.061 7.061 8.424 7.007 8.883 L 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.061 15.576 7.424 15.939 7.883 15.993 L 8.000 16.000 L 8.117 15.993 C 8.576 15.939 8.939 15.576 8.993 15.117 L 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.620 12.933 10.999 12.507 10.999 12.000 C 10.999 11.493 10.620 11.067 10.117 11.007 L 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.620 9.933 10.999 9.507 10.999 9.000 C 10.999 8.493 10.620 8.067 10.117 8.007 L 10.000 8.000 Z"),
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
        return _squareF2!!
    }

private var _squareF2: ImageVector? = null
