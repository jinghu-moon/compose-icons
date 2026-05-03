package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowTopRight: ImageVector
    get() {
        if (_arrowTopRight != null) return _arrowTopRight!!
        _arrowTopRight = radixIcon(
            name = "ArrowTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 3.000 C 11.632 3.000 11.760 3.053 11.853 3.146 C 11.947 3.240 12.000 3.368 12.000 3.500 L 12.000 9.000 L 11.990 9.102 C 11.943 9.329 11.741 9.500 11.500 9.500 C 11.258 9.500 11.056 9.328 11.010 9.101 L 11.000 9.000 L 11.000 4.707 L 4.353 11.354 C 4.158 11.549 3.842 11.549 3.646 11.354 C 3.451 11.158 3.451 10.842 3.646 10.646 L 10.293 4.000 L 6.000 4.000 C 5.724 4.000 5.500 3.776 5.500 3.500 C 5.500 3.224 5.724 3.000 6.000 3.000 L 11.500 3.000 Z"),
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
        return _arrowTopRight!!
    }

private var _arrowTopRight: ImageVector? = null
