package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = radixIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.050 7.500 C 5.050 7.619 5.097 7.734 5.182 7.818 L 8.182 10.818 L 8.252 10.876 C 8.427 10.991 8.665 10.972 8.818 10.818 C 8.972 10.665 8.991 10.427 8.876 10.252 L 8.818 10.182 L 6.137 7.500 L 8.818 4.818 C 8.994 4.643 8.994 4.358 8.818 4.182 C 8.643 4.006 8.357 4.006 8.182 4.182 L 5.182 7.182 C 5.097 7.266 5.050 7.381 5.050 7.500 Z"),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
