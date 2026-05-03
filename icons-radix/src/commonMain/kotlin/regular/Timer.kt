package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Timer: ImageVector
    get() {
        if (_timer != null) return _timer!!
        _timer = radixIcon(
            name = "Timer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 0.850 C 11.173 0.850 14.150 3.828 14.150 7.500 C 14.150 11.173 11.173 14.150 7.500 14.150 C 3.828 14.150 0.850 11.173 0.850 7.500 C 0.850 5.861 1.444 4.358 2.428 3.199 L 2.501 3.128 C 2.684 2.985 2.949 2.985 3.133 3.141 C 3.344 3.320 3.369 3.636 3.191 3.846 L 3.037 4.034 C 2.293 4.991 1.850 6.194 1.850 7.500 C 1.850 10.621 4.380 13.150 7.500 13.150 C 10.620 13.150 13.150 10.620 13.150 7.500 C 13.150 4.549 10.886 2.127 8.000 1.873 L 8.000 3.522 C 8.000 3.798 7.776 4.022 7.500 4.022 C 7.224 4.022 7.000 3.798 7.000 3.522 L 7.000 1.350 L 7.010 1.249 C 7.057 1.021 7.259 0.850 7.500 0.850 ZM 4.250 4.250 C 4.337 4.164 4.473 4.153 4.573 4.224 L 8.080 6.741 C 8.562 7.086 8.619 7.780 8.200 8.200 C 7.780 8.619 7.086 8.562 6.741 8.080 L 4.224 4.573 C 4.153 4.473 4.164 4.337 4.250 4.250 Z"),
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
        return _timer!!
    }

private var _timer: ImageVector? = null
