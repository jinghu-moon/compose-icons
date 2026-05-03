package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Checkbox: ImageVector
    get() {
        if (_checkbox != null) return _checkbox!!
        _checkbox = radixIcon(
            name = "Checkbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.102 2.005 C 12.607 2.056 13.000 2.482 13.000 3.000 L 13.000 12.000 L 12.995 12.102 C 12.947 12.573 12.573 12.947 12.102 12.995 L 12.000 13.000 L 3.000 13.000 L 2.897 12.995 C 2.427 12.947 2.053 12.573 2.005 12.102 L 2.000 12.000 L 2.000 3.000 C 2.000 2.482 2.393 2.056 2.897 2.005 L 3.000 2.000 L 12.000 2.000 L 12.102 2.005 ZM 3.000 12.000 L 12.000 12.000 L 12.000 3.000 L 3.000 3.000 L 3.000 12.000 ZM 9.525 4.945 C 9.682 4.718 9.993 4.660 10.221 4.816 C 10.448 4.973 10.506 5.284 10.350 5.512 L 7.091 10.261 C 7.002 10.390 6.858 10.470 6.701 10.477 C 6.545 10.485 6.393 10.417 6.293 10.297 L 4.428 8.048 L 4.371 7.964 C 4.261 7.759 4.307 7.498 4.493 7.344 C 4.679 7.190 4.944 7.193 5.125 7.338 L 5.197 7.409 L 6.640 9.147 L 9.525 4.945 Z"),
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
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
