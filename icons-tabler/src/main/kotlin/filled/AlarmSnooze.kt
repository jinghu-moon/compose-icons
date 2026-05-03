package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlarmSnooze: ImageVector
    get() {
        if (_alarmSnooze != null) return _alarmSnooze!!
        _alarmSnooze = tablerFilledIcon(
            name = "AlarmSnooze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 6.072 C 19.331 7.995 20.822 12.017 19.549 15.647 C 18.277 19.277 14.601 21.487 10.798 20.909 C 6.995 20.332 4.142 17.129 4.005 13.285 L 4.000 13.000 L 4.005 12.715 C 4.105 9.910 5.668 7.362 8.124 6.002 C 10.580 4.642 13.569 4.668 16.000 6.072 ZM 14.000 10.000 L 10.000 10.000 L 9.883 10.007 C 9.380 10.066 9.000 10.493 9.000 11.000 L 9.007 11.117 C 9.066 11.620 9.493 12.000 10.000 12.000 L 11.584 12.000 L 9.293 14.293 L 9.217 14.377 C 8.703 15.014 9.147 16.000 10.000 16.000 L 14.000 16.000 L 14.117 15.993 C 14.620 15.934 15.000 15.507 15.000 15.000 L 14.993 14.883 C 14.934 14.380 14.507 14.000 14.000 14.000 L 12.414 14.000 L 14.707 11.707 L 14.783 11.623 C 15.297 10.986 14.853 10.000 14.000 10.000 Z"),
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
        pathData = parseSvgPathData("M 6.412 3.191 C 6.839 2.874 7.440 2.947 7.779 3.356 C 8.118 3.766 8.077 4.370 7.685 4.730 L 7.588 4.810 L 4.838 6.810 C 4.411 7.132 3.806 7.061 3.465 6.649 C 3.124 6.236 3.168 5.629 3.565 5.270 L 3.662 5.190 L 6.412 3.190 Z"),
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
        pathData = parseSvgPathData("M 16.191 3.412 C 16.487 3.004 17.041 2.881 17.482 3.124 L 17.588 3.191 L 20.338 5.191 C 20.765 5.501 20.877 6.090 20.594 6.536 C 20.311 6.981 19.731 7.130 19.268 6.876 L 19.162 6.809 L 16.412 4.809 C 16.198 4.653 16.054 4.418 16.013 4.156 C 15.971 3.894 16.036 3.626 16.192 3.412 Z"),
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
        return _alarmSnooze!!
    }

private var _alarmSnooze: ImageVector? = null
