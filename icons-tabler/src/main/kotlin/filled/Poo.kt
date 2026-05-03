package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Poo: ImageVector
    get() {
        if (_poo != null) return _poo!!
        _poo = tablerFilledIcon(
            name = "Poo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.063 2.995 L 11.149 3.004 L 11.219 3.004 C 13.456 3.102 15.089 4.690 15.433 7.050 L 15.443 7.125 L 15.576 7.165 C 16.260 7.386 16.860 7.812 17.294 8.385 L 17.419 8.564 C 17.857 9.226 18.057 10.017 17.986 10.807 L 17.980 10.856 L 18.012 10.881 C 18.868 11.572 19.402 12.584 19.488 13.681 L 19.498 13.872 L 19.648 13.997 C 20.692 14.919 21.180 16.318 20.938 17.690 L 20.896 17.898 C 20.496 19.626 19.006 20.884 17.176 20.990 L 7.000 20.990 C 5.334 20.991 3.842 19.958 3.255 18.399 C 2.668 16.840 3.109 15.080 4.362 13.982 L 4.502 13.864 L 4.513 13.674 C 4.600 12.578 5.133 11.566 5.989 10.876 L 6.021 10.851 L 6.015 10.803 C 5.951 10.087 6.109 9.368 6.467 8.745 L 6.581 8.559 C 7.184 7.647 8.179 7.069 9.336 6.995 L 9.500 6.995 C 10.243 6.995 10.760 5.753 10.106 4.442 L 10.112 4.457 L 10.102 4.440 C 10.052 4.338 10.020 4.229 10.007 4.117 L 10.000 4.000 C 10.000 3.346 10.539 2.969 11.063 2.995M 14.821 15.429 C 14.670 15.211 14.438 15.063 14.177 15.016 C 13.916 14.969 13.647 15.028 13.429 15.179 C 12.570 15.777 11.430 15.777 10.571 15.179 C 10.118 14.864 9.494 14.976 9.179 15.429 C 8.864 15.882 8.976 16.506 9.429 16.821 C 10.974 17.897 13.026 17.897 14.571 16.821 C 14.789 16.670 14.937 16.438 14.984 16.177 C 15.031 15.916 14.972 15.647 14.821 15.429M 10.010 11.000 L 10.000 11.000 C 9.448 11.000 9.000 11.448 9.000 12.000 C 9.000 12.552 9.448 13.000 10.000 13.000 L 10.010 13.000 C 10.562 13.000 11.010 12.552 11.010 12.000 C 11.010 11.448 10.562 11.000 10.010 11.000M 14.010 11.000 L 14.000 11.000 C 13.448 11.000 13.000 11.448 13.000 12.000 C 13.000 12.552 13.448 13.000 14.000 13.000 L 14.010 13.000 C 14.562 13.000 15.010 12.552 15.010 12.000 C 15.010 11.448 14.562 11.000 14.010 11.000"),
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
        return _poo!!
    }

private var _poo: ImageVector? = null
