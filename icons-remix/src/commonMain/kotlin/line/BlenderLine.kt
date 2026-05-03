package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BlenderLine: ImageVector
    get() {
        if (_blenderLine != null) return _blenderLine!!
        _blenderLine = remixIcon(
            name = "BlenderLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.122 2.217 C 12.690 1.874 12.061 1.945 11.717 2.378 C 11.373 2.810 11.446 3.439 11.878 3.783 L 15.297 6.500 L 4.500 6.500 C 3.948 6.500 3.500 6.948 3.500 7.500 C 3.500 8.052 3.948 8.500 4.500 8.500 L 9.972 8.500 L 0.878 15.717 C 0.446 16.060 0.373 16.689 0.717 17.122 C 1.060 17.554 1.689 17.627 2.122 17.283 L 7.545 12.980 C 7.515 13.232 7.500 13.489 7.500 13.750 C 7.500 17.858 11.191 21.000 15.500 21.000 C 19.809 21.000 23.500 17.858 23.500 13.750 C 23.500 11.503 22.376 9.523 20.665 8.211 L 13.122 2.217 ZM 11.565 9.789 C 12.611 8.992 13.983 8.500 15.500 8.500 C 17.020 8.500 18.395 8.994 19.442 9.795 C 20.726 10.776 21.500 12.198 21.500 13.750 C 21.500 16.546 18.923 19.000 15.500 19.000 C 12.077 19.000 9.500 16.546 9.500 13.750 C 9.500 12.270 10.204 10.908 11.382 9.934 L 11.565 9.789 ZM 14.478 14.092 C 14.201 13.831 14.079 13.526 14.097 13.210 C 14.129 12.645 14.720 12.000 15.595 12.000 C 16.468 12.000 17.060 12.644 17.093 13.209 C 17.111 13.539 16.985 13.842 16.715 14.096 C 16.430 14.365 16.018 14.536 15.595 14.536 C 15.182 14.536 14.769 14.366 14.478 14.092 ZM 15.595 10.000 C 13.849 10.000 12.201 11.295 12.100 13.099 C 11.992 15.045 13.725 16.536 15.595 16.536 C 17.471 16.536 19.197 15.059 19.090 13.098 C 18.988 11.294 17.341 10.000 15.595 10.000 Z"),
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
        return _blenderLine!!
    }

private var _blenderLine: ImageVector? = null
