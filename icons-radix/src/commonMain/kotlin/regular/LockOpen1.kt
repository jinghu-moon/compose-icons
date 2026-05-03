package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LockOpen1: ImageVector
    get() {
        if (_lockOpen1 != null) return _lockOpen1!!
        _lockOpen1 = radixIcon(
            name = "LockOpen1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.000 C 8.571 0.000 9.465 0.338 10.088 1.002 C 10.707 1.661 11.000 2.581 11.000 3.636 L 11.000 6.000 L 12.000 6.000 C 12.552 6.000 13.000 6.448 13.000 7.000 L 13.000 13.000 C 13.000 13.552 12.552 14.000 12.000 14.000 L 3.000 14.000 C 2.448 14.000 2.000 13.552 2.000 13.000 L 2.000 7.000 C 2.000 6.448 2.448 6.000 3.000 6.000 L 10.000 6.000 L 10.000 3.636 C 10.000 2.760 9.758 2.112 9.358 1.687 C 8.963 1.265 8.357 1.000 7.499 1.000 C 6.611 1.000 5.997 1.269 5.604 1.715 L 5.527 1.807 C 5.197 2.233 5.000 2.843 5.000 3.633 L 4.000 3.633 C 4.000 2.682 4.237 1.838 4.737 1.193 L 4.858 1.048 C 5.482 0.342 6.399 0.000 7.499 0.000 ZM 3.000 13.000 L 12.000 13.000 L 12.000 7.000 L 3.000 7.000 L 3.000 13.000 Z"),
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
        return _lockOpen1!!
    }

private var _lockOpen1: ImageVector? = null
