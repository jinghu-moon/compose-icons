package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ViewHorizontal: ImageVector
    get() {
        if (_viewHorizontal != null) return _viewHorizontal!!
        _viewHorizontal = radixIcon(
            name = "ViewHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.653 1.008 C 14.410 1.085 15.000 1.723 15.000 2.500 L 15.000 12.500 L 14.992 12.653 C 14.920 13.359 14.359 13.920 13.653 13.992 L 13.500 14.000 L 1.500 14.000 L 1.347 13.992 C 0.641 13.920 0.079 13.359 0.008 12.653 L 0.000 12.500 L 0.000 2.500 C 0.000 1.723 0.590 1.085 1.347 1.008 L 1.500 1.000 L 13.500 1.000 L 13.653 1.008 ZM 1.000 8.000 L 1.000 12.500 C 1.000 12.776 1.224 13.000 1.500 13.000 L 13.500 13.000 C 13.776 13.000 14.000 12.776 14.000 12.500 L 14.000 8.000 L 1.000 8.000 ZM 1.500 2.000 C 1.224 2.000 1.000 2.224 1.000 2.500 L 1.000 7.000 L 14.000 7.000 L 14.000 2.500 C 14.000 2.224 13.776 2.000 13.500 2.000 L 1.500 2.000 Z"),
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
        return _viewHorizontal!!
    }

private var _viewHorizontal: ImageVector? = null
