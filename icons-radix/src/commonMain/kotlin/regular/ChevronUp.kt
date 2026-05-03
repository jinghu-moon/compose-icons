package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) return _chevronUp!!
        _chevronUp = radixIcon(
            name = "ChevronUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.158 8.865 C 11.359 9.054 11.676 9.043 11.865 8.842 C 12.054 8.640 12.043 8.323 11.842 8.135 L 7.842 4.385 C 7.649 4.205 7.350 4.205 7.158 4.385 L 3.158 8.135 L 3.092 8.212 C 2.957 8.401 2.970 8.665 3.135 8.842 C 3.300 9.018 3.563 9.048 3.762 8.927 L 3.842 8.865 L 7.500 5.436 L 11.158 8.865 Z"),
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
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
