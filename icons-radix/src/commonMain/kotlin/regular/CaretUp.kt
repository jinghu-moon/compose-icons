package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = radixIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 5.050 C 7.620 5.050 7.734 5.097 7.819 5.182 L 10.819 8.182 C 10.994 8.358 10.994 8.643 10.819 8.819 C 10.643 8.994 10.358 8.994 10.182 8.819 L 7.500 6.137 L 4.819 8.819 L 4.748 8.876 C 4.574 8.992 4.336 8.972 4.182 8.819 C 4.028 8.665 4.009 8.427 4.124 8.252 L 4.182 8.182 L 7.182 5.182 C 7.266 5.097 7.381 5.050 7.500 5.050 Z"),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
