package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Capture: ImageVector
    get() {
        if (_capture != null) return _capture!!
        _capture = tablerFilledIcon(
            name = "Capture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 3.000 C 8.529 3.001 8.966 3.413 8.997 3.941 C 9.028 4.470 8.642 4.931 8.117 4.993 L 8.000 5.000 L 6.000 5.000 C 5.493 5.000 5.066 5.380 5.007 5.883 L 5.000 6.000 L 5.000 8.000 C 4.999 8.529 4.587 8.966 4.059 8.997 C 3.530 9.028 3.069 8.642 3.007 8.117 L 3.000 8.000 L 3.000 6.000 C 3.000 4.411 4.238 3.098 5.824 3.005 L 6.000 3.000 L 8.000 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 4.000 15.000 C 4.507 15.000 4.934 15.380 4.993 15.883 L 5.000 16.000 L 5.000 18.000 C 5.000 18.507 5.380 18.934 5.883 18.993 L 6.000 19.000 L 8.000 19.000 C 8.529 19.001 8.966 19.413 8.997 19.941 C 9.028 20.470 8.642 20.931 8.117 20.993 L 8.000 21.000 L 6.000 21.000 C 4.411 21.000 3.098 19.762 3.005 18.176 L 3.000 18.000 L 3.000 16.000 C 3.000 15.448 3.448 15.000 4.000 15.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.589 3.000 20.902 4.238 20.995 5.824 L 21.000 6.000 L 21.000 8.000 C 20.999 8.529 20.587 8.966 20.059 8.997 C 19.530 9.028 19.069 8.642 19.007 8.117 L 19.000 8.000 L 19.000 6.000 C 19.000 5.493 18.620 5.066 18.117 5.007 L 18.000 5.000 L 16.000 5.000 C 15.471 4.999 15.034 4.587 15.003 4.059 C 14.972 3.530 15.358 3.069 15.883 3.007 L 16.000 3.000 L 18.000 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 20.000 15.000 C 20.507 15.000 20.934 15.380 20.993 15.883 L 21.000 16.000 L 21.000 18.000 C 21.000 19.589 19.762 20.902 18.176 20.995 L 18.000 21.000 L 16.000 21.000 C 15.471 20.999 15.034 20.587 15.003 20.059 C 14.972 19.530 15.358 19.069 15.883 19.007 L 16.000 19.000 L 18.000 19.000 C 18.507 19.000 18.934 18.620 18.993 18.117 L 19.000 18.000 L 19.000 16.000 C 19.000 15.448 19.448 15.000 20.000 15.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 8.000 C 14.183 8.000 15.963 9.750 15.999 11.933 C 16.036 14.116 14.315 15.925 12.133 15.998 C 9.951 16.071 8.114 14.380 8.005 12.200 L 8.000 12.000 L 8.005 11.800 C 8.112 9.671 9.869 8.000 12.000 8.000 Z"),
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
        return _capture!!
    }

private var _capture: ImageVector? = null
