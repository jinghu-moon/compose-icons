package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowBottomLeft: ImageVector
    get() {
        if (_arrowBottomLeft != null) return _arrowBottomLeft!!
        _arrowBottomLeft = radixIcon(
            name = "ArrowBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.500 12.000 C 3.368 12.000 3.240 11.947 3.147 11.854 C 3.053 11.760 3.000 11.632 3.000 11.500 L 3.000 6.000 L 3.010 5.898 C 3.057 5.671 3.259 5.500 3.500 5.500 C 3.742 5.500 3.944 5.672 3.990 5.899 L 4.000 6.000 L 4.000 10.293 L 10.647 3.646 C 10.842 3.451 11.158 3.452 11.354 3.646 C 11.549 3.842 11.549 4.158 11.354 4.354 L 4.707 11.000 L 9.000 11.000 C 9.276 11.000 9.500 11.224 9.500 11.500 C 9.500 11.776 9.276 12.000 9.000 12.000 L 3.500 12.000 Z"),
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
        return _arrowBottomLeft!!
    }

private var _arrowBottomLeft: ImageVector? = null
