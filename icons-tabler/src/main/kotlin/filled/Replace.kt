package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Replace: ImageVector
    get() {
        if (_replace != null) return _replace!!
        _replace = tablerFilledIcon(
            name = "Replace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 2.000 L 4.000 2.000 C 2.895 2.000 2.000 2.895 2.000 4.000 L 2.000 8.000 C 2.000 9.105 2.895 10.000 4.000 10.000 L 8.000 10.000 C 9.105 10.000 10.000 9.105 10.000 8.000 L 10.000 4.000 C 10.000 2.895 9.105 2.000 8.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 20.000 14.000 L 16.000 14.000 C 14.895 14.000 14.000 14.895 14.000 16.000 L 14.000 20.000 C 14.000 21.105 14.895 22.000 16.000 22.000 L 20.000 22.000 C 21.105 22.000 22.000 21.105 22.000 20.000 L 22.000 16.000 C 22.000 14.895 21.105 14.000 20.000 14.000 Z"),
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
                pathData = parseSvgPathData("M 16.707 2.293 C 17.063 2.649 17.099 3.215 16.790 3.613 L 16.707 3.707 L 15.414 5.000 L 19.000 5.000 C 20.589 5.000 21.902 6.238 21.995 7.824 L 22.000 8.000 L 22.000 11.000 C 21.999 11.529 21.587 11.966 21.059 11.997 C 20.530 12.028 20.069 11.642 20.007 11.117 L 20.000 11.000 L 20.000 8.000 C 20.000 7.493 19.620 7.066 19.117 7.007 L 19.000 7.000 L 15.415 7.000 L 16.707 8.293 C 17.079 8.666 17.097 9.265 16.749 9.660 C 16.400 10.056 15.804 10.113 15.387 9.790 L 15.293 9.707 L 12.293 6.707 C 12.061 6.481 11.956 6.154 12.013 5.835 L 12.049 5.689 L 12.089 5.585 C 12.147 5.459 12.229 5.345 12.334 5.251 L 15.293 2.293 C 15.684 1.903 16.316 1.903 16.707 2.293 Z"),
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
                pathData = parseSvgPathData("M 3.000 12.000 C 3.507 12.000 3.934 12.380 3.993 12.883 L 4.000 13.000 L 4.000 16.000 C 4.000 16.507 4.380 16.934 4.883 16.993 L 5.000 17.000 L 8.585 17.000 L 7.293 15.707 C 6.937 15.351 6.901 14.785 7.210 14.387 L 7.293 14.293 C 7.649 13.937 8.215 13.901 8.613 14.210 L 8.707 14.293 L 11.707 17.293 C 11.939 17.519 12.044 17.846 11.987 18.165 L 11.951 18.311 L 11.911 18.415 C 11.853 18.542 11.770 18.656 11.666 18.749 L 8.707 21.707 C 8.334 22.079 7.735 22.097 7.340 21.749 C 6.944 21.400 6.887 20.804 7.210 20.387 L 7.293 20.293 L 8.584 19.000 L 5.000 19.000 C 3.411 19.000 2.098 17.762 2.005 16.176 L 2.000 16.000 L 2.000 13.000 C 2.000 12.448 2.448 12.000 3.000 12.000 Z"),
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
        return _replace!!
    }

private var _replace: ImageVector? = null
