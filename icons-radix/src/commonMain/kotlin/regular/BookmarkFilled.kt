package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BookmarkFilled: ImageVector
    get() {
        if (_bookmarkFilled != null) return _bookmarkFilled!!
        _bookmarkFilled = radixIcon(
            name = "BookmarkFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.601 2.010 C 11.829 2.056 12.000 2.258 12.000 2.500 L 12.000 13.500 C 12.000 13.682 11.901 13.849 11.742 13.938 C 11.583 14.025 11.389 14.020 11.235 13.924 L 7.500 11.590 L 3.765 13.924 C 3.611 14.020 3.417 14.025 3.258 13.938 C 3.099 13.849 3.000 13.682 3.000 13.500 L 3.000 2.500 L 3.010 2.399 C 3.056 2.171 3.258 2.000 3.500 2.000 L 11.500 2.000 L 11.601 2.010 Z"),
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
        return _bookmarkFilled!!
    }

private var _bookmarkFilled: ImageVector? = null
