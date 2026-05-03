package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartCandle: ImageVector
    get() {
        if (_chartCandle != null) return _chartCandle!!
        _chartCandle = tablerFilledIcon(
            name = "ChartCandle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 3.000 C 6.507 3.000 6.934 3.380 6.993 3.883 L 7.000 4.000 L 7.000 5.000 C 8.047 5.000 8.917 5.806 8.995 6.850 L 9.000 7.000 L 9.000 10.000 C 9.000 11.047 8.194 11.917 7.150 11.995 L 7.000 12.000 L 7.000 20.000 C 6.999 20.529 6.587 20.966 6.059 20.997 C 5.530 21.028 5.069 20.642 5.007 20.117 L 5.000 20.000 L 5.000 12.000 C 3.953 12.000 3.083 11.194 3.005 10.150 L 3.000 10.000 L 3.000 7.000 C 3.000 5.953 3.806 5.083 4.850 5.005 L 5.000 5.000 L 5.000 4.000 C 5.000 3.448 5.448 3.000 6.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 3.000 C 12.507 3.000 12.934 3.380 12.993 3.883 L 13.000 4.000 L 13.000 13.000 C 14.047 13.000 14.917 13.806 14.995 14.850 L 15.000 15.000 L 15.000 18.000 C 15.000 19.047 14.194 19.917 13.150 19.995 L 13.000 20.000 C 12.999 20.529 12.587 20.966 12.059 20.997 C 11.530 21.028 11.069 20.642 11.007 20.117 L 11.000 20.000 L 10.850 19.995 C 9.866 19.921 9.083 19.141 9.006 18.157 L 9.000 18.000 L 9.000 15.000 C 9.000 13.953 9.806 13.083 10.850 13.005 L 11.000 13.000 L 11.000 4.000 C 11.000 3.448 11.448 3.000 12.000 3.000 Z"),
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
        pathData = parseSvgPathData("M 18.000 3.000 C 18.507 3.000 18.934 3.380 18.993 3.883 L 19.000 4.000 C 20.047 4.000 20.917 4.806 20.995 5.850 L 21.000 6.000 L 21.000 10.000 C 21.000 11.047 20.194 11.917 19.150 11.995 L 19.000 12.000 L 19.000 20.000 C 18.999 20.529 18.587 20.966 18.059 20.997 C 17.530 21.028 17.069 20.642 17.007 20.117 L 17.000 20.000 L 17.000 12.000 C 15.953 12.000 15.083 11.194 15.005 10.150 L 15.000 10.000 L 15.000 6.000 C 15.000 4.953 15.806 4.083 16.850 4.005 L 17.000 4.000 C 17.000 3.448 17.448 3.000 18.000 3.000 Z"),
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
        return _chartCandle!!
    }

private var _chartCandle: ImageVector? = null
