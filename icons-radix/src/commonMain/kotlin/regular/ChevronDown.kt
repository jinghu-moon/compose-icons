package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) return _chevronDown!!
        _chevronDown = radixIcon(
            name = "ChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.158 6.135 C 11.359 5.946 11.676 5.957 11.865 6.158 C 12.054 6.360 12.043 6.677 11.842 6.865 L 7.842 10.616 C 7.649 10.795 7.350 10.795 7.158 10.616 L 3.158 6.865 L 3.092 6.788 C 2.957 6.599 2.970 6.335 3.135 6.158 C 3.300 5.982 3.563 5.952 3.762 6.073 L 3.842 6.135 L 7.500 9.564 L 11.158 6.135 Z"),
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
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
