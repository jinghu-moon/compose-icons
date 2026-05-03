package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MaskOff: ImageVector
    get() {
        if (_maskOff != null) return _maskOff!!
        _maskOff = radixIcon(
            name = "MaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.102 1.005 C 14.607 1.056 15.000 1.482 15.000 2.000 L 15.000 13.000 L 14.995 13.102 C 14.947 13.573 14.573 13.947 14.102 13.995 L 14.000 14.000 L 1.000 14.000 L 0.897 13.995 C 0.427 13.947 0.053 13.573 0.005 13.102 L 0.000 13.000 L 0.000 2.000 C 0.000 1.482 0.393 1.056 0.897 1.005 L 1.000 1.000 L 14.000 1.000 L 14.102 1.005 ZM 1.000 13.000 L 14.000 13.000 L 14.000 2.000 L 1.000 2.000 L 1.000 13.000 ZM 7.500 3.875 C 9.502 3.875 11.125 5.498 11.125 7.500 C 11.125 9.502 9.502 11.125 7.500 11.125 C 5.498 11.125 3.875 9.502 3.875 7.500 C 3.875 5.498 5.498 3.875 7.500 3.875 ZM 7.500 4.875 C 6.050 4.875 4.875 6.050 4.875 7.500 C 4.875 8.950 6.050 10.125 7.500 10.125 C 8.950 10.125 10.125 8.950 10.125 7.500 C 10.125 6.050 8.950 4.875 7.500 4.875 Z"),
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
        return _maskOff!!
    }

private var _maskOff: ImageVector? = null
