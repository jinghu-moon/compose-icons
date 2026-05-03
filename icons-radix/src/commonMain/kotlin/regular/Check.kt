package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = radixIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.601 3.908 C 10.790 3.619 11.178 3.538 11.467 3.727 C 11.755 3.915 11.837 4.303 11.648 4.592 L 7.398 11.092 C 7.298 11.245 7.136 11.347 6.954 11.370 C 6.773 11.393 6.589 11.336 6.454 11.213 L 3.704 8.713 L 3.620 8.618 C 3.449 8.383 3.459 8.053 3.662 7.829 C 3.865 7.606 4.193 7.564 4.443 7.712 L 4.546 7.787 L 6.753 9.793 L 10.601 3.908 Z"),
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
        return _check!!
    }

private var _check: ImageVector? = null
