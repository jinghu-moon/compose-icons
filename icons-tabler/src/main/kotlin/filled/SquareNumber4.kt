package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber4: ImageVector
    get() {
        if (_squareNumber4 != null) return _squareNumber4!!
        _squareNumber4 = tablerFilledIcon(
            name = "SquareNumber4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 14.000 7.000 C 13.493 7.000 13.066 7.380 13.007 7.883 L 13.000 8.000 L 13.000 11.000 L 11.000 11.000 L 11.000 8.000 L 10.993 7.883 C 10.933 7.380 10.507 7.001 10.000 7.001 C 9.493 7.001 9.067 7.380 9.007 7.883 L 9.000 8.000 L 9.000 11.000 L 9.005 11.150 C 9.079 12.134 9.859 12.917 10.843 12.994 L 11.000 13.000 L 13.000 13.000 L 13.000 16.000 L 13.007 16.117 C 13.067 16.620 13.493 16.999 14.000 16.999 C 14.507 16.999 14.933 16.620 14.993 16.117 L 15.000 16.000 L 15.000 8.000 L 14.993 7.883 C 14.934 7.380 14.507 7.000 14.000 7.000 Z"),
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
        return _squareNumber4!!
    }

private var _squareNumber4: ImageVector? = null
