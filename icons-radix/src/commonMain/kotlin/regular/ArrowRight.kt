package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) return _arrowRight!!
        _arrowRight = radixIcon(
            name = "ArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.146 3.147 C 8.317 2.976 8.581 2.954 8.775 3.082 L 8.854 3.147 L 12.854 7.147 C 13.049 7.342 13.049 7.658 12.854 7.854 L 8.854 11.854 C 8.658 12.049 8.342 12.049 8.146 11.854 C 7.951 11.658 7.951 11.342 8.146 11.147 L 11.293 8.000 L 2.500 8.000 C 2.224 8.000 2.000 7.776 2.000 7.500 C 2.000 7.224 2.224 7.000 2.500 7.000 L 11.293 7.000 L 8.146 3.854 L 8.082 3.776 C 7.954 3.582 7.976 3.318 8.146 3.147 Z"),
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
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
