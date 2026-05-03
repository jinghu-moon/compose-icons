package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LockClosed: ImageVector
    get() {
        if (_lockClosed != null) return _lockClosed!!
        _lockClosed = radixIcon(
            name = "LockClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.501 0.978 C 8.575 0.978 9.469 1.323 10.091 1.992 C 10.707 2.656 11.000 3.579 11.000 4.634 L 11.000 6.000 L 12.000 6.000 C 12.552 6.000 13.000 6.448 13.000 7.000 L 13.000 13.000 C 13.000 13.552 12.552 14.000 12.000 14.000 L 3.000 14.000 C 2.448 14.000 2.000 13.552 2.000 13.000 L 2.000 7.000 C 2.000 6.448 2.448 6.000 3.000 6.000 L 4.000 6.000 L 4.000 4.636 C 4.000 3.581 4.293 2.657 4.910 1.993 C 5.532 1.323 6.427 0.978 7.501 0.978 ZM 3.000 13.000 L 12.000 13.000 L 12.000 7.000 L 3.000 7.000 L 3.000 13.000 ZM 7.501 1.978 C 6.646 1.978 6.040 2.247 5.644 2.674 C 5.243 3.105 5.000 3.760 5.000 4.636 L 5.000 6.000 L 10.000 6.000 L 10.000 4.634 C 10.000 3.757 9.759 3.103 9.358 2.672 C 8.963 2.246 8.357 1.978 7.501 1.978 Z"),
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
        return _lockClosed!!
    }

private var _lockClosed: ImageVector? = null
