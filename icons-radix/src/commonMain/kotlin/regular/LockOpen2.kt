package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LockOpen2: ImageVector
    get() {
        if (_lockOpen2 != null) return _lockOpen2!!
        _lockOpen2 = radixIcon(
            name = "LockOpen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.501 0.000 C 12.674 0.000 13.639 0.389 14.263 1.193 L 14.354 1.316 C 14.792 1.944 15.000 2.742 15.000 3.633 L 14.000 3.633 C 14.000 2.942 13.849 2.388 13.590 1.975 L 13.473 1.807 C 13.084 1.306 12.448 1.000 11.501 1.000 C 10.643 1.000 10.037 1.265 9.642 1.687 C 9.242 2.112 9.000 2.760 9.000 3.636 L 9.000 6.000 L 10.000 6.000 C 10.552 6.000 11.000 6.448 11.000 7.000 L 11.000 13.000 C 11.000 13.552 10.552 14.000 10.000 14.000 L 1.000 14.000 C 0.448 14.000 0.000 13.552 0.000 13.000 L 0.000 7.000 C 0.000 6.448 0.448 6.000 1.000 6.000 L 8.000 6.000 L 8.000 3.636 C 8.000 2.581 8.293 1.661 8.912 1.002 C 9.535 0.338 10.429 0.000 11.501 0.000 ZM 1.000 13.000 L 10.000 13.000 L 10.000 7.000 L 1.000 7.000 L 1.000 13.000 Z"),
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
        return _lockOpen2!!
    }

private var _lockOpen2: ImageVector? = null
