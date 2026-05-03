package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF7: ImageVector
    get() {
        if (_squareF7 != null) return _squareF7!!
        _squareF7 = tablerFilledIcon(
            name = "SquareF7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 16.000 8.000 L 13.000 8.000 L 12.883 8.007 C 12.380 8.066 12.000 8.493 12.000 9.000 L 12.007 9.117 C 12.066 9.620 12.493 10.000 13.000 10.000 L 14.718 10.000 L 13.530 14.757 L 13.508 14.872 C 13.440 15.397 13.794 15.884 14.315 15.982 C 14.835 16.080 15.342 15.756 15.470 15.242 L 16.970 9.242 L 16.991 9.132 C 17.029 8.846 16.942 8.558 16.752 8.341 C 16.562 8.124 16.288 8.000 16.000 8.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.380 8.066 7.000 8.493 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.066 15.620 7.493 16.000 8.000 16.000 L 8.117 15.993 C 8.620 15.934 9.000 15.507 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.642 12.931 11.028 12.470 10.997 11.941 C 10.966 11.413 10.529 11.001 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.642 9.931 11.028 9.470 10.997 8.941 C 10.966 8.413 10.529 8.001 10.000 8.000 Z"),
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
        return _squareF7!!
    }

private var _squareF7: ImageVector? = null
