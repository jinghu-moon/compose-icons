package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Frame: ImageVector
    get() {
        if (_frame != null) return _frame!!
        _frame = radixIcon(
            name = "Frame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.500 1.000 C 10.776 1.000 11.000 1.224 11.000 1.500 L 11.000 4.000 L 13.500 4.000 L 13.601 4.010 C 13.829 4.056 14.000 4.258 14.000 4.500 C 14.000 4.742 13.829 4.944 13.601 4.990 L 13.500 5.000 L 11.000 5.000 L 11.000 10.000 L 13.500 10.000 L 13.601 10.010 C 13.829 10.056 14.000 10.258 14.000 10.500 C 14.000 10.742 13.829 10.944 13.601 10.990 L 13.500 11.000 L 11.000 11.000 L 11.000 13.500 L 10.990 13.601 C 10.944 13.829 10.742 14.000 10.500 14.000 C 10.258 14.000 10.056 13.829 10.010 13.601 L 10.000 13.500 L 10.000 11.000 L 5.000 11.000 L 5.000 13.500 C 5.000 13.776 4.776 14.000 4.500 14.000 C 4.224 14.000 4.000 13.776 4.000 13.500 L 4.000 11.000 L 1.500 11.000 C 1.224 11.000 1.000 10.776 1.000 10.500 C 1.000 10.224 1.224 10.000 1.500 10.000 L 4.000 10.000 L 4.000 5.000 L 1.500 5.000 C 1.224 5.000 1.000 4.776 1.000 4.500 C 1.000 4.224 1.224 4.000 1.500 4.000 L 4.000 4.000 L 4.000 1.500 C 4.000 1.224 4.224 1.000 4.500 1.000 C 4.776 1.000 5.000 1.224 5.000 1.500 L 5.000 4.000 L 10.000 4.000 L 10.000 1.500 C 10.000 1.224 10.224 1.000 10.500 1.000 ZM 5.000 10.000 L 10.000 10.000 L 10.000 5.000 L 5.000 5.000 L 5.000 10.000 Z"),
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
        return _frame!!
    }

private var _frame: ImageVector? = null
