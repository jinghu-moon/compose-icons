package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = radixIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.653 3.008 C 14.410 3.085 15.000 3.723 15.000 4.500 L 15.000 10.500 L 14.992 10.653 C 14.920 11.359 14.359 11.920 13.653 11.992 L 13.500 12.000 L 1.500 12.000 L 1.347 11.992 C 0.641 11.920 0.079 11.359 0.008 10.653 L 0.000 10.500 L 0.000 4.500 C 0.000 3.723 0.590 3.085 1.347 3.008 L 1.500 3.000 L 13.500 3.000 L 13.653 3.008 ZM 1.500 4.000 C 1.224 4.000 1.000 4.224 1.000 4.500 L 1.000 10.500 C 1.000 10.776 1.224 11.000 1.500 11.000 L 13.500 11.000 C 13.776 11.000 14.000 10.776 14.000 10.500 L 14.000 4.500 C 14.000 4.224 13.776 4.000 13.500 4.000 L 1.500 4.000 ZM 3.000 10.000 L 2.000 10.000 L 2.000 9.000 L 3.000 9.000 L 3.000 10.000 ZM 11.000 10.000 L 4.000 10.000 L 4.000 9.000 L 11.000 9.000 L 11.000 10.000 ZM 13.000 10.000 L 12.000 10.000 L 12.000 9.000 L 13.000 9.000 L 13.000 10.000 ZM 4.000 8.000 L 3.000 8.000 L 3.000 7.000 L 4.000 7.000 L 4.000 8.000 ZM 6.000 8.000 L 5.000 8.000 L 5.000 7.000 L 6.000 7.000 L 6.000 8.000 ZM 8.000 8.000 L 7.000 8.000 L 7.000 7.000 L 8.000 7.000 L 8.000 8.000 ZM 10.000 8.000 L 9.000 8.000 L 9.000 7.000 L 10.000 7.000 L 10.000 8.000 ZM 12.000 8.000 L 11.000 8.000 L 11.000 7.000 L 12.000 7.000 L 12.000 8.000 ZM 3.000 6.000 L 2.000 6.000 L 2.000 5.000 L 3.000 5.000 L 3.000 6.000 ZM 5.000 6.000 L 4.000 6.000 L 4.000 5.000 L 5.000 5.000 L 5.000 6.000 ZM 7.000 6.000 L 6.000 6.000 L 6.000 5.000 L 7.000 5.000 L 7.000 6.000 ZM 9.000 6.000 L 8.000 6.000 L 8.000 5.000 L 9.000 5.000 L 9.000 6.000 ZM 11.000 6.000 L 10.000 6.000 L 10.000 5.000 L 11.000 5.000 L 11.000 6.000 ZM 13.000 6.000 L 12.000 6.000 L 12.000 5.000 L 13.000 5.000 L 13.000 6.000 Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
