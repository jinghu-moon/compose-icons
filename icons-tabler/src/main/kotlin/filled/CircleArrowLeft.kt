package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowLeft: ImageVector
    get() {
        if (_circleArrowLeft != null) return _circleArrowLeft!!
        _circleArrowLeft = tablerFilledIcon(
            name = "CircleArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.463 1.996 21.918 6.376 22.007 11.838 C 22.095 17.300 17.784 21.822 12.324 21.995 L 12.000 22.000 L 11.676 21.995 C 6.216 21.822 1.905 17.300 1.993 11.838 C 2.082 6.376 6.537 1.996 12.000 2.000 ZM 12.707 7.293 C 12.316 6.903 11.684 6.903 11.293 7.293 L 7.293 11.293 C 7.263 11.323 7.236 11.354 7.210 11.387 L 7.146 11.479 L 7.094 11.577 L 7.050 11.687 L 7.020 11.799 L 7.003 11.925 L 7.000 12.000 L 7.004 12.090 L 7.011 12.148 L 7.036 12.266 L 7.071 12.371 L 7.125 12.484 L 7.168 12.554 L 7.239 12.649 L 7.293 12.707 L 11.293 16.707 L 11.387 16.790 C 11.804 17.113 12.400 17.056 12.749 16.660 C 13.097 16.265 13.079 15.666 12.707 15.293 L 10.415 13.000 L 16.000 13.000 L 16.117 12.993 C 16.642 12.931 17.028 12.470 16.997 11.941 C 16.966 11.413 16.529 11.001 16.000 11.000 L 10.414 11.000 L 12.707 8.707 L 12.790 8.613 C 13.099 8.215 13.063 7.649 12.707 7.293 Z"),
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
        return _circleArrowLeft!!
    }

private var _circleArrowLeft: ImageVector? = null
