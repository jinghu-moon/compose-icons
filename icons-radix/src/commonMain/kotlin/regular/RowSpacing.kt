package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RowSpacing: ImageVector
    get() {
        if (_rowSpacing != null) return _rowSpacing!!
        _rowSpacing = radixIcon(
            name = "RowSpacing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 9.050 C 7.748 9.050 7.950 9.252 7.950 9.500 L 7.950 12.913 L 9.182 11.682 C 9.357 11.506 9.643 11.506 9.818 11.682 C 9.994 11.858 9.994 12.143 9.818 12.319 L 7.818 14.319 C 7.734 14.403 7.619 14.450 7.500 14.450 C 7.410 14.450 7.323 14.423 7.250 14.374 L 7.182 14.319 L 5.182 12.319 L 5.124 12.248 C 5.009 12.074 5.028 11.836 5.182 11.682 C 5.335 11.528 5.573 11.509 5.748 11.624 L 5.818 11.682 L 7.050 12.913 L 7.050 9.500 C 7.050 9.252 7.252 9.050 7.500 9.050 ZM 13.601 7.010 C 13.828 7.057 14.000 7.259 14.000 7.500 C 14.000 7.742 13.828 7.944 13.601 7.990 L 13.500 8.000 L 1.500 8.000 C 1.224 8.000 1.000 7.776 1.000 7.500 C 1.000 7.224 1.224 7.000 1.500 7.000 L 13.500 7.000 L 13.601 7.010 ZM 7.252 0.624 C 7.427 0.509 7.664 0.528 7.818 0.682 L 9.818 2.682 L 9.876 2.752 C 9.991 2.927 9.972 3.165 9.818 3.319 C 9.664 3.472 9.427 3.492 9.252 3.376 L 9.182 3.319 L 7.950 2.087 L 7.950 5.500 C 7.950 5.749 7.748 5.950 7.500 5.950 C 7.252 5.950 7.050 5.749 7.050 5.500 L 7.050 2.087 L 5.818 3.319 C 5.643 3.494 5.357 3.494 5.182 3.319 C 5.006 3.143 5.006 2.858 5.182 2.682 L 7.182 0.682 L 7.252 0.624 Z"),
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
        return _rowSpacing!!
    }

private var _rowSpacing: ImageVector? = null
