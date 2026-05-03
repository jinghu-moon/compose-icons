package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowAutofitContent: ImageVector
    get() {
        if (_arrowAutofitContent != null) return _arrowAutofitContent!!
        _arrowAutofitContent = tablerFilledIcon(
            name = "ArrowAutofitContent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.707 3.293 C 7.063 3.649 7.099 4.215 6.790 4.613 L 6.707 4.707 L 5.415 6.000 L 10.000 6.000 C 10.529 6.001 10.966 6.413 10.997 6.941 C 11.028 7.470 10.642 7.931 10.117 7.993 L 10.000 8.000 L 5.415 8.000 L 6.707 9.293 C 7.063 9.649 7.099 10.215 6.790 10.613 L 6.707 10.707 C 6.351 11.063 5.785 11.099 5.387 10.790 L 5.293 10.707 L 2.293 7.707 C 2.258 7.672 2.226 7.635 2.196 7.595 L 2.125 7.485 L 2.071 7.371 L 2.036 7.266 L 2.011 7.148 L 2.004 7.090 L 2.000 7.000 L 2.003 6.925 L 2.020 6.799 L 2.050 6.688 L 2.094 6.577 L 2.146 6.479 L 2.210 6.387 L 2.293 6.293 L 5.293 3.293 C 5.683 2.903 6.317 2.903 6.707 3.293 Z"),
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
                pathData = parseSvgPathData("M 18.613 3.210 L 18.707 3.293 L 21.707 6.293 C 21.742 6.328 21.775 6.365 21.804 6.405 L 21.875 6.515 L 21.929 6.629 L 21.964 6.734 L 21.994 6.882 L 22.000 7.000 L 21.997 7.075 L 21.980 7.201 L 21.950 7.312 L 21.906 7.423 L 21.854 7.521 L 21.780 7.625 L 21.707 7.707 L 18.707 10.707 C 18.334 11.079 17.735 11.097 17.340 10.749 C 16.944 10.400 16.887 9.804 17.210 9.387 L 17.293 9.293 L 18.585 8.000 L 14.000 8.000 C 13.471 7.999 13.034 7.587 13.003 7.059 C 12.972 6.530 13.358 6.069 13.883 6.007 L 14.000 6.000 L 18.585 6.000 L 17.293 4.707 C 16.937 4.351 16.901 3.785 17.210 3.387 L 17.293 3.293 C 17.649 2.937 18.215 2.901 18.613 3.210 Z"),
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
                pathData = parseSvgPathData("M 18.000 13.000 L 6.000 13.000 C 4.343 13.000 3.000 14.343 3.000 16.000 L 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 L 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 L 21.000 16.000 C 21.000 14.343 19.657 13.000 18.000 13.000 Z"),
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
        return _arrowAutofitContent!!
    }

private var _arrowAutofitContent: ImageVector? = null
