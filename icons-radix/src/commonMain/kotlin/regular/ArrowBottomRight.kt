package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowBottomRight: ImageVector
    get() {
        if (_arrowBottomRight != null) return _arrowBottomRight!!
        _arrowBottomRight = radixIcon(
            name = "ArrowBottomRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 12.000 C 11.632 12.000 11.760 11.947 11.853 11.854 C 11.947 11.760 12.000 11.632 12.000 11.500 L 12.000 6.000 L 11.990 5.898 C 11.943 5.671 11.741 5.500 11.500 5.500 C 11.258 5.500 11.056 5.672 11.010 5.899 L 11.000 6.000 L 11.000 10.293 L 4.353 3.646 C 4.158 3.451 3.842 3.452 3.646 3.646 C 3.451 3.842 3.451 4.158 3.646 4.354 L 10.293 11.000 L 6.000 11.000 C 5.724 11.000 5.500 11.224 5.500 11.500 C 5.500 11.776 5.724 12.000 6.000 12.000 L 11.500 12.000 Z"),
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
        return _arrowBottomRight!!
    }

private var _arrowBottomRight: ImageVector? = null
