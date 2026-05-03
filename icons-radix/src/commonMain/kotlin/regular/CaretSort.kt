package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretSort: ImageVector
    get() {
        if (_caretSort != null) return _caretSort!!
        _caretSort = radixIcon(
            name = "CaretSort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.932 8.932 C 5.108 8.756 5.393 8.756 5.569 8.932 L 7.500 10.863 L 9.432 8.932 L 9.502 8.874 C 9.677 8.759 9.915 8.778 10.069 8.932 C 10.222 9.086 10.242 9.324 10.126 9.498 L 10.069 9.569 L 7.819 11.818 L 7.748 11.876 C 7.574 11.992 7.336 11.972 7.182 11.818 L 4.932 9.569 C 4.756 9.393 4.756 9.108 4.932 8.932 ZM 7.500 3.050 C 7.619 3.050 7.734 3.097 7.819 3.182 L 10.069 5.432 C 10.244 5.608 10.244 5.893 10.069 6.069 C 9.893 6.244 9.608 6.244 9.432 6.069 L 7.500 4.137 L 5.569 6.069 L 5.498 6.126 C 5.324 6.242 5.086 6.222 4.932 6.069 C 4.778 5.915 4.759 5.677 4.874 5.502 L 4.932 5.432 L 7.182 3.182 C 7.266 3.097 7.381 3.050 7.500 3.050 Z"),
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
        return _caretSort!!
    }

private var _caretSort: ImageVector? = null
