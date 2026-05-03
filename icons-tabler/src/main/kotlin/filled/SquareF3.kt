package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF3: ImageVector
    get() {
        if (_squareF3 != null) return _squareF3!!
        _squareF3 = tablerFilledIcon(
            name = "SquareF3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 14.500 8.000 L 13.500 8.000 L 13.356 8.007 C 12.587 8.081 12.000 8.727 12.000 9.500 C 12.000 10.052 12.448 10.500 13.000 10.500 L 13.117 10.493 C 13.416 10.458 13.683 10.290 13.844 10.036 L 13.864 10.000 L 14.500 10.000 L 14.590 10.008 C 14.828 10.051 15.001 10.258 15.001 10.500 C 15.001 10.742 14.828 10.949 14.590 10.992 L 14.500 11.000 L 14.000 11.000 L 13.867 11.007 C 12.711 11.131 12.711 12.869 13.867 12.993 L 14.000 13.000 L 14.500 13.000 L 14.590 13.008 C 14.828 13.051 15.000 13.259 15.000 13.500 L 14.992 13.590 C 14.949 13.828 14.741 14.000 14.500 14.000 L 13.865 14.000 L 13.845 13.964 C 13.607 13.588 13.149 13.414 12.721 13.538 C 12.293 13.663 11.999 14.055 12.000 14.500 C 12.000 15.328 12.672 16.000 13.500 16.000 L 14.500 16.000 L 14.664 15.995 C 15.978 15.909 17.000 14.817 17.000 13.500 L 16.995 13.336 C 16.965 12.862 16.799 12.407 16.518 12.024 L 16.499 12.000 L 16.625 11.817 C 17.103 11.046 17.126 10.077 16.684 9.284 C 16.243 8.491 15.407 8.000 14.500 8.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.380 8.066 7.000 8.493 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.066 15.620 7.493 16.000 8.000 16.000 L 8.117 15.993 C 8.620 15.934 9.000 15.507 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.642 12.931 11.028 12.470 10.997 11.941 C 10.966 11.413 10.529 11.001 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.642 9.931 11.028 9.470 10.997 8.941 C 10.966 8.413 10.529 8.001 10.000 8.000 Z"),
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
        return _squareF3!!
    }

private var _squareF3: ImageVector? = null
