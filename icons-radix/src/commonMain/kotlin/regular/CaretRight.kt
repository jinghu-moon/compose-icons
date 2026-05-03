package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = radixIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.950 7.500 C 9.950 7.620 9.903 7.734 9.818 7.819 L 6.818 10.819 C 6.643 10.994 6.357 10.994 6.182 10.819 C 6.006 10.643 6.006 10.358 6.182 10.182 L 8.863 7.500 L 6.182 4.819 L 6.124 4.748 C 6.008 4.574 6.028 4.336 6.182 4.182 C 6.335 4.028 6.573 4.009 6.748 4.124 L 6.818 4.182 L 9.818 7.182 C 9.903 7.266 9.950 7.381 9.950 7.500 Z"),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
