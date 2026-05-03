package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Server: ImageVector
    get() {
        if (_server != null) return _server!!
        _server = radixIcon(
            name = "Server",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.653 8.008 C 13.410 8.085 14.000 8.723 14.000 9.500 L 14.000 11.500 L 13.992 11.653 C 13.920 12.359 13.359 12.920 12.653 12.992 L 12.500 13.000 L 2.500 13.000 L 2.347 12.992 C 1.641 12.920 1.079 12.359 1.008 11.653 L 1.000 11.500 L 1.000 9.500 C 1.000 8.723 1.590 8.085 2.347 8.008 L 2.500 8.000 L 12.500 8.000 L 12.653 8.008 ZM 2.500 9.000 C 2.224 9.000 2.000 9.224 2.000 9.500 L 2.000 11.500 C 2.000 11.776 2.224 12.000 2.500 12.000 L 12.500 12.000 C 12.776 12.000 13.000 11.776 13.000 11.500 L 13.000 9.500 C 13.000 9.224 12.776 9.000 12.500 9.000 L 2.500 9.000 ZM 3.500 10.000 C 3.776 10.000 4.000 10.224 4.000 10.500 C 4.000 10.776 3.776 11.000 3.500 11.000 C 3.224 11.000 3.000 10.776 3.000 10.500 C 3.000 10.224 3.224 10.000 3.500 10.000 ZM 12.653 2.008 C 13.410 2.085 14.000 2.723 14.000 3.500 L 14.000 5.500 L 13.992 5.653 C 13.920 6.359 13.359 6.921 12.653 6.992 L 12.500 7.000 L 2.500 7.000 L 2.347 6.992 C 1.641 6.921 1.079 6.359 1.008 5.653 L 1.000 5.500 L 1.000 3.500 C 1.000 2.723 1.590 2.085 2.347 2.008 L 2.500 2.000 L 12.500 2.000 L 12.653 2.008 ZM 2.500 3.000 C 2.224 3.000 2.000 3.224 2.000 3.500 L 2.000 5.500 C 2.000 5.776 2.224 6.000 2.500 6.000 L 12.500 6.000 C 12.776 6.000 13.000 5.776 13.000 5.500 L 13.000 3.500 C 13.000 3.224 12.776 3.000 12.500 3.000 L 2.500 3.000 ZM 3.500 4.000 C 3.776 4.000 4.000 4.224 4.000 4.500 C 4.000 4.776 3.776 5.000 3.500 5.000 C 3.224 5.000 3.000 4.776 3.000 4.500 C 3.000 4.224 3.224 4.000 3.500 4.000 Z"),
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
        return _server!!
    }

private var _server: ImageVector? = null
