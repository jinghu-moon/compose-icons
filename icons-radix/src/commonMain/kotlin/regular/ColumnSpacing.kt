package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ColumnSpacing: ImageVector
    get() {
        if (_columnSpacing != null) return _columnSpacing!!
        _columnSpacing = radixIcon(
            name = "ColumnSpacing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 1.000 C 7.776 1.000 8.000 1.224 8.000 1.500 L 8.000 13.500 C 8.000 13.776 7.776 14.000 7.500 14.000 C 7.224 14.000 7.000 13.776 7.000 13.500 L 7.000 1.500 C 7.000 1.224 7.224 1.000 7.500 1.000 ZM 11.682 5.182 C 11.836 5.028 12.073 5.009 12.248 5.124 L 12.318 5.182 L 14.318 7.182 L 14.376 7.252 C 14.491 7.427 14.472 7.665 14.318 7.818 L 12.318 9.818 C 12.143 9.994 11.858 9.994 11.682 9.818 C 11.506 9.643 11.506 9.357 11.682 9.182 L 12.913 7.950 L 9.500 7.950 C 9.252 7.950 9.050 7.748 9.050 7.500 C 9.050 7.252 9.252 7.050 9.500 7.050 L 12.913 7.050 L 11.682 5.818 L 11.624 5.748 C 11.509 5.573 11.528 5.335 11.682 5.182 ZM 2.752 5.124 C 2.927 5.009 3.165 5.028 3.318 5.182 C 3.472 5.335 3.492 5.573 3.376 5.748 L 3.318 5.818 L 2.087 7.050 L 5.500 7.050 L 5.591 7.060 C 5.796 7.102 5.950 7.283 5.950 7.500 C 5.950 7.717 5.796 7.898 5.591 7.940 L 5.500 7.950 L 2.087 7.950 L 3.318 9.182 L 3.376 9.252 C 3.491 9.427 3.472 9.665 3.318 9.818 C 3.165 9.972 2.927 9.991 2.752 9.876 L 2.682 9.818 L 0.682 7.818 C 0.506 7.643 0.506 7.357 0.682 7.182 L 2.682 5.182 L 2.752 5.124 Z"),
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
        return _columnSpacing!!
    }

private var _columnSpacing: ImageVector? = null
