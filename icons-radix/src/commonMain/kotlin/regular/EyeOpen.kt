package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EyeOpen: ImageVector
    get() {
        if (_eyeOpen != null) return _eyeOpen!!
        _eyeOpen = radixIcon(
            name = "EyeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.500 3.000 C 10.692 3.000 13.344 4.707 14.924 7.235 C 15.012 7.377 15.024 7.552 14.957 7.702 L 14.924 7.765 C 13.344 10.293 10.692 12.000 7.500 12.000 C 4.308 12.000 1.657 10.293 0.076 7.765 C -0.025 7.603 -0.025 7.397 0.076 7.235 L 0.228 7.000 C 1.823 4.601 4.408 3.000 7.500 3.000 ZM 7.500 4.000 C 4.804 4.000 2.533 5.379 1.100 7.500 C 2.533 9.621 4.804 11.000 7.500 11.000 C 10.196 11.000 12.466 9.621 13.899 7.500 C 12.466 5.379 10.196 4.000 7.500 4.000 ZM 7.500 5.500 C 8.605 5.500 9.500 6.395 9.500 7.500 C 9.500 8.605 8.605 9.500 7.500 9.500 C 6.395 9.500 5.500 8.605 5.500 7.500 C 5.500 6.395 6.395 5.500 7.500 5.500 Z"),
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
        return _eyeOpen!!
    }

private var _eyeOpen: ImageVector? = null
