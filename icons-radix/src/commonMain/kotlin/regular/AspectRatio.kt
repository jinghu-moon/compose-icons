package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AspectRatio: ImageVector
    get() {
        if (_aspectRatio != null) return _aspectRatio!!
        _aspectRatio = radixIcon(
            name = "AspectRatio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.653 1.008 C 13.410 1.085 14.000 1.723 14.000 2.500 L 14.000 12.500 L 13.992 12.653 C 13.920 13.359 13.359 13.920 12.653 13.992 L 12.500 14.000 L 2.500 14.000 L 2.347 13.992 C 1.641 13.920 1.079 13.359 1.008 12.653 L 1.000 12.500 L 1.000 2.500 C 1.000 1.723 1.590 1.085 2.347 1.008 L 2.500 1.000 L 12.500 1.000 L 12.653 1.008 ZM 2.500 2.000 C 2.224 2.000 2.000 2.224 2.000 2.500 L 2.000 12.500 C 2.000 12.776 2.224 13.000 2.500 13.000 L 12.500 13.000 C 12.776 13.000 13.000 12.776 13.000 12.500 L 13.000 2.500 C 13.000 2.224 12.776 2.000 12.500 2.000 L 2.500 2.000 ZM 7.500 7.000 C 7.776 7.000 8.000 7.224 8.000 7.500 C 8.000 7.776 7.776 8.000 7.500 8.000 C 7.224 8.000 7.000 7.776 7.000 7.500 C 7.000 7.224 7.224 7.000 7.500 7.000 ZM 9.500 7.000 C 9.776 7.000 10.000 7.224 10.000 7.500 C 10.000 7.776 9.776 8.000 9.500 8.000 C 9.224 8.000 9.000 7.776 9.000 7.500 C 9.000 7.224 9.224 7.000 9.500 7.000 ZM 11.500 7.000 C 11.776 7.000 12.000 7.224 12.000 7.500 C 12.000 7.776 11.776 8.000 11.500 8.000 C 11.224 8.000 11.000 7.776 11.000 7.500 C 11.000 7.224 11.224 7.000 11.500 7.000 ZM 7.500 5.000 C 7.776 5.000 8.000 5.224 8.000 5.500 C 8.000 5.776 7.776 6.000 7.500 6.000 C 7.224 6.000 7.000 5.776 7.000 5.500 C 7.000 5.224 7.224 5.000 7.500 5.000 ZM 7.500 3.000 C 7.776 3.000 8.000 3.224 8.000 3.500 C 8.000 3.776 7.776 4.000 7.500 4.000 C 7.224 4.000 7.000 3.776 7.000 3.500 C 7.000 3.224 7.224 3.000 7.500 3.000 Z"),
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
        return _aspectRatio!!
    }

private var _aspectRatio: ImageVector? = null
