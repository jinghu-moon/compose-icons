package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) return _chevronLeft!!
        _chevronLeft = radixIcon(
            name = "ChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.212 3.092 C 8.402 2.957 8.666 2.970 8.842 3.135 C 9.018 3.300 9.049 3.563 8.927 3.761 L 8.865 3.842 L 5.436 7.500 L 8.865 11.158 L 8.927 11.238 C 9.049 11.436 9.018 11.700 8.842 11.865 C 8.666 12.030 8.402 12.042 8.212 11.908 L 8.135 11.842 L 4.385 7.842 C 4.205 7.649 4.205 7.350 4.385 7.158 L 8.135 3.158 L 8.212 3.092 Z"),
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
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
