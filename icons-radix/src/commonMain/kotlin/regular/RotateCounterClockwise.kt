package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RotateCounterClockwise: ImageVector
    get() {
        if (_rotateCounterClockwise != null) return _rotateCounterClockwise!!
        _rotateCounterClockwise = radixIcon(
            name = "RotateCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.653 4.008 C 10.410 4.085 11.000 4.724 11.000 5.500 L 11.000 12.500 L 10.992 12.654 C 10.920 13.360 10.359 13.921 9.653 13.993 L 9.500 14.000 L 2.500 14.000 L 2.347 13.993 C 1.641 13.921 1.080 13.360 1.008 12.654 L 1.000 12.500 L 1.000 5.500 C 1.000 4.724 1.590 4.085 2.347 4.008 L 2.500 4.000 L 9.500 4.000 L 9.653 4.008 ZM 2.500 5.000 C 2.224 5.000 2.000 5.224 2.000 5.500 L 2.000 12.500 C 2.000 12.776 2.224 13.000 2.500 13.000 L 9.500 13.000 C 9.776 13.000 10.000 12.776 10.000 12.500 L 10.000 5.500 C 10.000 5.224 9.776 5.000 9.500 5.000 L 2.500 5.000 ZM 7.597 0.064 C 7.761 -0.064 8.000 0.053 8.000 0.261 L 8.000 1.000 L 8.380 1.004 C 10.248 1.048 11.666 1.432 12.617 2.383 C 13.632 3.398 14.000 4.944 14.000 7.000 C 14.000 7.276 13.776 7.500 13.500 7.500 C 13.224 7.500 13.000 7.276 13.000 7.000 C 13.000 5.019 12.636 3.816 11.910 3.090 C 11.230 2.410 10.130 2.047 8.362 2.004 L 8.000 2.000 L 8.000 2.740 C 8.000 2.947 7.761 3.064 7.597 2.937 L 6.004 1.698 C 5.875 1.597 5.875 1.403 6.004 1.303 L 7.597 0.064 Z"),
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
        return _rotateCounterClockwise!!
    }

private var _rotateCounterClockwise: ImageVector? = null
