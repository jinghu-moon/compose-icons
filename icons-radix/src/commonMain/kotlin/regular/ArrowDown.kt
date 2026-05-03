package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = radixIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 2.000 C 7.776 2.000 8.000 2.224 8.000 2.500 L 8.000 11.293 L 11.147 8.146 C 11.342 7.951 11.658 7.951 11.854 8.146 C 12.049 8.342 12.049 8.658 11.854 8.854 L 7.854 12.854 C 7.760 12.947 7.633 13.000 7.500 13.000 C 7.368 13.000 7.240 12.947 7.147 12.854 L 3.147 8.854 L 3.082 8.775 C 2.954 8.581 2.976 8.317 3.147 8.146 C 3.318 7.976 3.582 7.954 3.776 8.082 L 3.854 8.146 L 7.000 11.293 L 7.000 2.500 C 7.000 2.224 7.224 2.000 7.500 2.000 Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
