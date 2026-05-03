package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Polaroid: ImageVector
    get() {
        if (_polaroid != null) return _polaroid!!
        _polaroid = tablerFilledIcon(
            name = "Polaroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.199 9.623 L 9.307 9.721 L 13.293 13.707 L 13.387 13.790 C 13.785 14.099 14.351 14.063 14.707 13.707 C 15.063 13.351 15.099 12.785 14.790 12.387 L 14.707 12.293 L 14.415 12.000 L 15.707 10.707 L 15.813 10.612 C 16.270 10.232 16.731 10.232 17.199 10.623 L 17.307 10.721 L 21.809 15.224 C 21.300 16.803 19.870 17.905 18.213 17.994 L 18.000 18.000 L 6.000 18.000 C 4.263 18.000 2.724 16.879 2.191 15.225 L 7.707 9.707 L 7.813 9.612 C 8.270 9.232 8.731 9.232 9.199 9.623 ZM 18.000 2.000 C 20.131 2.000 21.888 3.671 21.995 5.800 L 22.000 6.000 L 22.000 12.585 L 18.707 9.293 L 18.557 9.156 C 17.301 8.061 15.707 8.059 14.461 9.139 L 14.307 9.279 L 13.000 10.585 L 10.707 8.293 L 10.557 8.156 C 9.301 7.061 7.707 7.059 6.461 8.139 L 6.307 8.279 L 2.000 12.585 L 2.000 6.000 C 2.000 3.869 3.671 2.112 5.800 2.005 L 6.000 2.000 L 18.000 2.000 ZM 15.010 5.000 L 14.883 5.007 C 14.380 5.067 14.001 5.493 14.001 6.000 C 14.001 6.507 14.380 6.933 14.883 6.993 L 15.000 7.000 L 15.127 6.993 C 15.630 6.933 16.009 6.507 16.009 6.000 C 16.009 5.493 15.630 5.067 15.127 5.007 L 15.010 5.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 8.010 20.000 C 8.539 20.001 8.976 20.413 9.007 20.941 C 9.038 21.470 8.652 21.931 8.127 21.993 L 8.000 22.000 C 7.471 21.999 7.034 21.587 7.003 21.059 C 6.972 20.530 7.358 20.069 7.883 20.007 L 8.010 20.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.010 20.000 C 12.539 20.001 12.976 20.413 13.007 20.941 C 13.038 21.470 12.652 21.931 12.127 21.993 L 12.000 22.000 C 11.471 21.999 11.034 21.587 11.003 21.059 C 10.972 20.530 11.358 20.069 11.883 20.007 L 12.010 20.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 16.010 20.000 C 16.539 20.001 16.976 20.413 17.007 20.941 C 17.038 21.470 16.652 21.931 16.127 21.993 L 16.000 22.000 C 15.471 21.999 15.034 21.587 15.003 21.059 C 14.972 20.530 15.358 20.069 15.883 20.007 L 16.010 20.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _polaroid!!
    }

private var _polaroid: ImageVector? = null
