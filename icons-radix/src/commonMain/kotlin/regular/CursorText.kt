package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = radixIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 1.000 C 10.776 1.000 11.000 1.224 11.000 1.500 C 11.000 1.776 10.776 2.000 10.500 2.000 C 9.578 2.000 8.960 2.230 8.579 2.563 C 8.207 2.889 8.000 3.366 8.000 4.000 L 8.000 7.000 L 9.250 7.000 C 9.526 7.000 9.750 7.224 9.750 7.500 C 9.750 7.776 9.526 8.000 9.250 8.000 L 8.000 8.000 L 8.000 11.000 C 8.000 11.634 8.207 12.111 8.579 12.436 C 8.960 12.770 9.578 13.000 10.500 13.000 C 10.776 13.000 11.000 13.224 11.000 13.500 C 11.000 13.776 10.776 14.000 10.500 14.000 C 9.422 14.000 8.540 13.730 7.921 13.189 C 7.758 13.046 7.618 12.889 7.500 12.719 C 7.382 12.889 7.242 13.046 7.079 13.189 C 6.460 13.730 5.578 14.000 4.500 14.000 C 4.224 14.000 4.000 13.776 4.000 13.500 C 4.000 13.224 4.224 13.000 4.500 13.000 C 5.422 13.000 6.040 12.770 6.421 12.436 C 6.793 12.111 7.000 11.634 7.000 11.000 L 7.000 8.000 L 5.750 8.000 C 5.474 8.000 5.250 7.776 5.250 7.500 C 5.250 7.224 5.474 7.000 5.750 7.000 L 7.000 7.000 L 7.000 4.000 C 7.000 3.366 6.793 2.889 6.421 2.563 C 6.040 2.230 5.422 2.000 4.500 2.000 C 4.224 2.000 4.000 1.776 4.000 1.500 C 4.000 1.224 4.224 1.000 4.500 1.000 C 5.578 1.000 6.460 1.270 7.079 1.812 C 7.242 1.954 7.382 2.110 7.500 2.280 C 7.618 2.110 7.758 1.954 7.921 1.812 C 8.540 1.270 9.422 1.000 10.500 1.000 Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
