package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bottle: ImageVector
    get() {
        if (_bottle != null) return _bottle!!
        _bottle = tablerFilledIcon(
            name = "Bottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 1.000 C 14.047 1.000 14.917 1.806 14.995 2.850 L 15.000 3.000 L 15.000 3.500 C 15.000 4.817 15.381 6.104 16.094 7.205 L 16.264 7.455 L 16.314 7.527 C 17.341 8.969 17.925 10.678 17.994 12.447 L 18.000 12.801 L 18.000 19.000 C 18.000 20.589 16.762 21.902 15.176 21.995 L 15.000 22.000 L 9.000 22.000 C 7.411 22.000 6.098 20.762 6.005 19.176 L 6.000 19.000 L 6.000 12.800 C 6.000 11.030 6.517 9.299 7.486 7.818 L 7.686 7.526 L 7.736 7.457 C 8.558 6.301 9.000 4.918 9.000 3.500 L 9.000 3.000 C 9.000 1.953 9.806 1.083 10.850 1.005 L 11.000 1.000 L 13.000 1.000 ZM 13.362 6.000 L 10.638 6.000 C 10.394 6.827 10.030 7.613 9.558 8.334 L 9.364 8.618 L 9.314 8.687 C 8.521 9.801 8.068 11.119 8.007 12.485 L 8.004 12.610 C 8.581 12.202 9.273 11.989 9.979 12.000 C 11.099 11.977 12.159 12.507 12.812 13.417 C 13.082 13.792 13.518 14.010 14.021 14.000 C 14.482 14.010 14.918 13.791 15.187 13.417 C 15.410 13.107 15.684 12.836 15.997 12.617 L 16.000 12.800 C 16.000 11.430 15.604 10.093 14.863 8.948 L 14.635 8.616 C 14.069 7.820 13.639 6.936 13.362 6.000 Z"),
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
        return _bottle!!
    }

private var _bottle: ImageVector? = null
