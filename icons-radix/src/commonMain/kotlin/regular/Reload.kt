package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Reload: ImageVector
    get() {
        if (_reload != null) return _reload!!
        _reload = radixIcon(
            name = "Reload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 0.850 C 10.664 0.850 12.294 3.069 12.999 4.311 L 13.000 4.312 L 13.000 2.500 C 13.000 2.224 13.224 2.000 13.500 2.000 C 13.776 2.001 14.000 2.224 14.000 2.500 L 14.000 5.500 C 14.000 5.776 13.776 6.000 13.500 6.000 L 10.500 6.000 C 10.224 6.000 10.001 5.776 10.000 5.500 C 10.000 5.224 10.224 5.000 10.500 5.000 L 12.233 5.000 L 12.122 4.792 C 11.480 3.666 10.111 1.850 7.500 1.850 C 4.060 1.850 1.850 4.665 1.850 7.500 C 1.850 10.336 4.060 13.150 7.500 13.150 C 9.165 13.150 10.530 12.496 11.501 11.507 L 11.693 11.303 C 12.126 10.816 12.472 10.257 12.717 9.661 L 12.765 9.571 C 12.895 9.378 13.146 9.296 13.370 9.388 C 13.625 9.493 13.747 9.785 13.642 10.040 L 13.511 10.337 C 13.236 10.925 12.877 11.477 12.440 11.968 L 12.214 12.208 C 11.062 13.381 9.444 14.150 7.500 14.150 C 3.438 14.150 0.850 10.815 0.850 7.500 C 0.850 4.186 3.438 0.850 7.500 0.850 Z"),
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
        return _reload!!
    }

private var _reload: ImageVector? = null
