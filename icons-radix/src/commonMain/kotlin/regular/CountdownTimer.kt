package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CountdownTimer: ImageVector
    get() {
        if (_countdownTimer != null) return _countdownTimer!!
        _countdownTimer = radixIcon(
            name = "CountdownTimer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 0.850 C 11.563 0.850 14.150 4.186 14.150 7.500 C 14.150 10.815 11.562 14.150 7.500 14.150 C 5.557 14.150 3.938 13.381 2.786 12.208 L 2.561 11.968 C 2.123 11.477 1.764 10.925 1.489 10.337 L 1.358 10.040 C 1.254 9.785 1.376 9.493 1.631 9.388 C 1.854 9.296 2.106 9.378 2.235 9.571 L 2.283 9.661 C 2.529 10.257 2.874 10.816 3.308 11.303 L 3.499 11.507 C 4.471 12.496 5.835 13.150 7.500 13.150 C 10.940 13.150 13.150 10.335 13.150 7.500 C 13.150 4.665 10.940 1.850 7.500 1.850 C 4.890 1.850 3.520 3.666 2.879 4.792 L 2.768 5.000 L 4.500 5.000 C 4.776 5.000 5.000 5.224 5.000 5.500 C 5.000 5.776 4.776 6.000 4.500 6.000 L 1.500 6.000 C 1.224 6.000 1.000 5.776 1.000 5.500 L 1.000 2.500 C 1.000 2.224 1.224 2.000 1.500 2.000 C 1.776 2.000 2.000 2.224 2.000 2.500 L 2.000 4.312 L 2.001 4.311 C 2.706 3.069 4.336 0.850 7.500 0.850 ZM 8.000 10.000 L 7.000 10.000 L 7.000 5.000 L 8.000 5.000 L 8.000 10.000 Z"),
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
        return _countdownTimer!!
    }

private var _countdownTimer: ImageVector? = null
