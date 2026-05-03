package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlowerOff: ImageVector
    get() {
        if (_flowerOff != null) return _flowerOff!!
        _flowerOff = tablerOutlineIcon(
            name = "FlowerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.875 9.882 C 8.721 11.057 8.730 12.944 9.897 14.107 C 11.063 15.271 12.949 15.277 14.122 14.120M 14.703 10.697 C 14.405 10.080 13.904 9.583 13.285 9.288"),
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
        pathData = parseSvgPathData("M 9.000 5.000 C 9.000 3.343 10.343 2.000 12.000 2.000 C 13.657 2.000 15.000 3.343 15.000 5.000 C 15.000 5.562 14.741 6.442 14.224 7.640 L 13.500 9.000 L 15.260 7.107 C 15.759 6.507 16.182 6.107 16.530 5.902 C 17.215 5.504 18.030 5.397 18.794 5.603 C 19.558 5.810 20.209 6.313 20.600 7.001 C 21.423 8.435 20.937 10.264 19.510 11.099 C 19.136 11.316 18.520 11.495 17.664 11.634 L 15.885 11.878M 16.177 12.160 L 17.400 12.326 C 18.400 12.471 19.098 12.663 19.510 12.902 C 20.837 13.679 21.366 15.331 20.736 16.734M 18.459 18.467 C 17.793 18.566 17.112 18.436 16.530 18.098 C 16.182 17.896 15.759 17.494 15.260 16.893 L 13.500 15.000 L 14.224 16.360 C 14.740 17.559 15.000 18.439 15.000 19.000 C 15.000 20.657 13.657 22.000 12.000 22.000 C 10.343 22.000 9.000 20.657 9.000 19.000 C 9.000 18.438 9.259 17.558 9.776 16.360 L 10.500 15.000 L 8.740 16.893 C 8.241 17.494 7.818 17.893 7.470 18.098 C 6.785 18.496 5.970 18.603 5.206 18.397 C 4.442 18.191 3.792 17.688 3.400 17.000 C 2.577 15.566 3.063 13.737 4.490 12.902 C 4.864 12.684 5.480 12.506 6.336 12.366 L 9.000 12.000 L 6.600 11.675 C 5.600 11.530 4.902 11.338 4.490 11.099 C 3.063 10.264 2.576 8.434 3.400 7.000 C 3.849 6.210 4.636 5.670 5.534 5.533"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _flowerOff!!
    }

private var _flowerOff: ImageVector? = null
