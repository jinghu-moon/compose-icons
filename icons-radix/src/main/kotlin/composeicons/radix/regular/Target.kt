package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = radixIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.501 .9c3.645 0 6.6 2.956 6.6 6.601-0 3.645-2.955 6.599-6.6 6.6C3.856 14.1 .9 11.145 .9 7.501 .9 3.855 3.856 .9 7.501 .9ZM7.501 1.8C4.353 1.8 1.8 4.353 1.8 7.501c0 3.148 2.552 5.699 5.7 5.699 3.147-0 5.699-2.552 5.699-5.699C13.2 4.353 10.648 1.801 7.501 1.8ZM7.5 3.075c2.444 0 4.425 1.981 4.425 4.425 0 2.444-1.981 4.425-4.425 4.425C5.056 11.924 3.075 9.943 3.075 7.5 3.075 5.056 5.056 3.075 7.5 3.075ZM7.5 3.924C5.526 3.925 3.925 5.525 3.924 7.5c0 1.974 1.601 3.575 3.575 3.575 1.974 0 3.575-1.601 3.575-3.575C11.075 5.525 9.474 3.924 7.5 3.924ZM7.5 5.25c1.243 0 2.25 1.008 2.25 2.25 0 1.243-1.007 2.25-2.25 2.25C6.257 9.749 5.25 8.742 5.25 7.5 5.25 6.257 6.257 5.25 7.5 5.25ZM7.5 6.05C6.699 6.051 6.051 6.699 6.05 7.5c0 .801 .649 1.45 1.449 1.45 .801 0 1.45-.649 1.45-1.45C8.95 6.699 8.3 6.05 7.5 6.05Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
