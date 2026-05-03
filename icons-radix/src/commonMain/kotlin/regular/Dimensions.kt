package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Dimensions: ImageVector
    get() {
        if (_dimensions != null) return _dimensions!!
        _dimensions = radixIcon(
            name = "Dimensions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.303 4.004 C 13.403 3.875 13.597 3.875 13.697 4.004 L 14.936 5.597 C 15.064 5.761 14.946 6.000 14.738 6.000 L 14.000 6.000 L 14.000 12.000 L 14.738 12.000 C 14.946 12.000 15.064 12.239 14.936 12.403 L 13.697 13.996 C 13.597 14.125 13.403 14.125 13.303 13.996 L 12.063 12.403 C 11.936 12.239 12.053 12.000 12.261 12.000 L 13.000 12.000 L 13.000 6.000 L 12.261 6.000 C 12.053 6.000 11.936 5.761 12.063 5.597 L 13.303 4.004 ZM 9.653 4.008 C 10.410 4.085 11.000 4.724 11.000 5.500 L 11.000 12.500 L 10.992 12.653 C 10.920 13.359 10.359 13.921 9.653 13.992 L 9.500 14.000 L 2.500 14.000 L 2.347 13.992 C 1.641 13.921 1.079 13.359 1.008 12.653 L 1.000 12.500 L 1.000 5.500 C 1.000 4.724 1.590 4.085 2.347 4.008 L 2.500 4.000 L 9.500 4.000 L 9.653 4.008 ZM 2.500 5.000 C 2.224 5.000 2.000 5.224 2.000 5.500 L 2.000 12.500 C 2.000 12.776 2.224 13.000 2.500 13.000 L 9.500 13.000 C 9.776 13.000 10.000 12.776 10.000 12.500 L 10.000 5.500 C 10.000 5.224 9.776 5.000 9.500 5.000 L 2.500 5.000 ZM 9.000 0.262 C 9.000 0.054 9.239 -0.064 9.403 0.064 L 10.996 1.303 C 11.125 1.403 11.125 1.597 10.996 1.697 L 9.403 2.937 C 9.239 3.064 9.000 2.947 9.000 2.739 L 9.000 2.000 L 3.000 2.000 L 3.000 2.739 C 3.000 2.947 2.761 3.064 2.597 2.937 L 1.004 1.697 C 0.875 1.597 0.875 1.403 1.004 1.303 L 2.597 0.064 C 2.761 -0.064 3.000 0.053 3.000 0.261 L 3.000 1.000 L 9.000 1.000 L 9.000 0.262 Z"),
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
        return _dimensions!!
    }

private var _dimensions: ImageVector? = null
