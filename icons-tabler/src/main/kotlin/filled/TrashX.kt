package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TrashX: ImageVector
    get() {
        if (_trashX != null) return _trashX!!
        _trashX = tablerFilledIcon(
            name = "TrashX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 6.000 C 20.529 6.001 20.966 6.413 20.997 6.941 C 21.028 7.470 20.642 7.931 20.117 7.993 L 20.000 8.000 L 19.919 8.000 L 19.000 19.000 C 19.000 20.589 17.762 21.902 16.176 21.995 L 16.000 22.000 L 8.000 22.000 C 6.402 22.000 5.096 20.751 5.008 19.250 L 5.003 19.083 L 4.080 8.000 L 4.000 8.000 C 3.471 7.999 3.034 7.587 3.003 7.059 C 2.972 6.530 3.358 6.069 3.883 6.007 L 4.000 6.000 L 20.000 6.000 ZM 10.511 11.140 C 10.077 10.882 9.520 10.987 9.210 11.386 C 8.900 11.784 8.936 12.351 9.293 12.707 L 10.585 14.000 L 9.293 15.293 L 9.210 15.387 C 8.887 15.804 8.944 16.400 9.340 16.749 C 9.735 17.097 10.334 17.079 10.707 16.707 L 12.000 15.415 L 13.293 16.707 L 13.387 16.790 C 13.804 17.113 14.400 17.056 14.749 16.660 C 15.097 16.265 15.079 15.666 14.707 15.293 L 13.415 14.000 L 14.707 12.707 L 14.790 12.613 C 15.113 12.196 15.056 11.600 14.660 11.251 C 14.265 10.903 13.666 10.921 13.293 11.293 L 12.000 12.585 L 10.707 11.293 L 10.613 11.210 Z"),
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
        pathData = parseSvgPathData("M 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 C 15.999 4.529 15.587 4.966 15.059 4.997 C 14.530 5.028 14.069 4.642 14.007 4.117 L 14.000 4.000 L 10.000 4.000 L 9.993 4.117 C 9.931 4.642 9.470 5.028 8.941 4.997 C 8.413 4.966 8.001 4.529 8.000 4.000 C 8.000 2.953 8.806 2.083 9.850 2.005 L 10.000 2.000 L 14.000 2.000 Z"),
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
        return _trashX!!
    }

private var _trashX: ImageVector? = null
