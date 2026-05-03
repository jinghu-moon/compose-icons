package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = tablerOutlineIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 13.657 2.000 15.000 3.343 15.000 5.000 C 15.000 5.562 14.741 6.442 14.224 7.640 L 13.500 9.000 L 15.260 7.107 C 15.759 6.507 16.182 6.107 16.530 5.902 C 17.215 5.504 18.030 5.397 18.794 5.603 C 19.558 5.810 20.209 6.313 20.600 7.001 C 21.423 8.435 20.937 10.264 19.510 11.099 C 19.136 11.316 18.520 11.495 17.664 11.634 L 15.000 12.000 L 17.400 12.326 C 18.400 12.471 19.098 12.663 19.510 12.902 C 20.937 13.737 21.423 15.566 20.600 17.000 C 20.208 17.688 19.558 18.191 18.794 18.397 C 18.030 18.603 17.215 18.496 16.530 18.098 C 16.182 17.896 15.759 17.494 15.260 16.893 L 13.500 15.000 L 14.224 16.360 C 14.740 17.559 15.000 18.439 15.000 19.000 C 15.000 20.657 13.657 22.000 12.000 22.000 C 10.343 22.000 9.000 20.657 9.000 19.000 C 9.000 18.438 9.259 17.558 9.776 16.360 L 10.500 15.000 L 8.740 16.893 C 8.241 17.494 7.818 17.893 7.470 18.098 C 6.785 18.496 5.970 18.603 5.206 18.397 C 4.442 18.191 3.792 17.688 3.400 17.000 C 2.577 15.566 3.063 13.737 4.490 12.902 C 4.864 12.684 5.480 12.506 6.336 12.366 L 9.000 12.000 L 6.600 11.675 C 5.600 11.530 4.902 11.338 4.490 11.099 C 3.063 10.264 2.576 8.434 3.400 7.000 C 3.791 6.312 4.442 5.809 5.206 5.602 C 5.970 5.396 6.785 5.503 7.470 5.901 C 7.818 6.104 8.241 6.505 8.740 7.106 L 10.500 9.000 C 9.500 6.708 9.000 5.375 9.000 5.000 C 9.000 3.343 10.343 2.000 12.000 2.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _flower!!
    }

private var _flower: ImageVector? = null
