package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = radixIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M -0.000 3.500 C 0.000 3.224 0.224 3.000 0.500 3.000 L 3.000 3.000 L 3.000 0.500 C 3.000 0.224 3.224 -0.000 3.500 -0.000 C 3.776 -0.000 4.000 0.224 4.000 0.500 L 4.000 3.000 L 11.500 3.000 C 11.776 3.000 12.000 3.224 12.000 3.500 L 12.000 11.000 L 14.500 11.000 L 14.601 11.010 C 14.828 11.056 15.000 11.258 15.000 11.500 C 15.000 11.742 14.829 11.944 14.601 11.990 L 14.500 12.000 L 12.000 12.000 L 12.000 14.500 C 12.000 14.776 11.776 15.000 11.500 15.000 C 11.224 15.000 11.000 14.776 11.000 14.500 L 11.000 12.000 L 3.500 12.000 C 3.224 12.000 3.000 11.776 3.000 11.500 L 3.000 4.000 L 0.500 4.000 C 0.224 4.000 -0.000 3.776 -0.000 3.500 ZM 11.000 11.000 L 11.000 4.000 L 4.000 4.000 L 4.000 11.000 L 11.000 11.000 Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
