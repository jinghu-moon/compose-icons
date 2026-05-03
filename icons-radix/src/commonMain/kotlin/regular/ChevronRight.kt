package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) return _chevronRight!!
        _chevronRight = radixIcon(
            name = "ChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.159 11.865 C 6.360 12.054 6.677 12.043 6.866 11.842 L 10.616 7.842 C 10.796 7.649 10.796 7.350 10.616 7.158 L 6.866 3.158 L 6.789 3.092 C 6.599 2.957 6.335 2.970 6.159 3.135 C 5.983 3.300 5.952 3.563 6.074 3.762 L 6.135 3.842 L 9.564 7.500 L 6.135 11.158 C 5.947 11.359 5.957 11.676 6.159 11.865 Z"),
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
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
