package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = radixIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 9.950 C 7.620 9.950 7.734 9.903 7.819 9.818 L 10.819 6.818 C 10.994 6.642 10.994 6.357 10.819 6.181 C 10.643 6.006 10.358 6.006 10.182 6.181 L 7.500 8.863 L 4.819 6.181 L 4.748 6.124 C 4.574 6.008 4.336 6.028 4.182 6.181 C 4.028 6.335 4.009 6.573 4.124 6.748 L 4.182 6.818 L 7.182 9.818 C 7.266 9.903 7.381 9.950 7.500 9.950 Z"),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
