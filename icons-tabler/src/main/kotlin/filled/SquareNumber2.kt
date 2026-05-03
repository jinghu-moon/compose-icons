package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber2: ImageVector
    get() {
        if (_squareNumber2 != null) return _squareNumber2!!
        _squareNumber2 = tablerFilledIcon(
            name = "SquareNumber2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 13.000 7.000 L 10.000 7.000 L 9.883 7.007 C 9.380 7.067 9.001 7.493 9.001 8.000 C 9.001 8.507 9.380 8.933 9.883 8.993 L 10.000 9.000 L 13.000 9.000 L 13.000 11.000 L 11.000 11.000 L 10.850 11.005 C 9.866 11.079 9.083 11.859 9.006 12.843 L 9.000 13.000 L 9.000 15.000 L 9.005 15.150 C 9.079 16.134 9.859 16.917 10.843 16.994 L 11.000 17.000 L 14.000 17.000 L 14.117 16.993 C 14.620 16.933 14.999 16.507 14.999 16.000 C 14.999 15.493 14.620 15.067 14.117 15.007 L 14.000 15.000 L 11.000 15.000 L 11.000 13.000 L 13.000 13.000 L 13.150 12.995 C 14.134 12.921 14.917 12.141 14.994 11.157 L 15.000 11.000 L 15.000 9.000 L 14.995 8.850 C 14.921 7.866 14.141 7.083 13.157 7.006 L 13.000 7.000 Z"),
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
        return _squareNumber2!!
    }

private var _squareNumber2: ImageVector? = null
