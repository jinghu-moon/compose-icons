package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Slider: ImageVector
    get() {
        if (_slider != null) return _slider!!
        _slider = radixIcon(
            name = "Slider",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.780 4.764 C 10.001 4.888 10.985 5.810 11.204 7.000 L 14.500 7.000 L 14.601 7.010 C 14.828 7.057 15.000 7.259 15.000 7.500 C 15.000 7.742 14.828 7.944 14.601 7.991 L 14.500 8.000 L 11.203 8.000 C 10.968 9.280 9.848 10.250 8.500 10.250 L 8.219 10.236 C 6.998 10.112 6.015 9.190 5.796 8.000 L 0.500 8.000 C 0.224 8.000 0.000 7.776 0.000 7.500 C 0.000 7.224 0.224 7.000 0.500 7.000 L 5.797 7.000 C 6.032 5.720 7.152 4.750 8.500 4.749 L 8.780 4.764 ZM 8.500 5.700 C 7.506 5.700 6.699 6.506 6.699 7.500 C 6.699 8.494 7.506 9.300 8.500 9.300 C 9.494 9.300 10.300 8.494 10.300 7.500 C 10.300 6.506 9.494 5.700 8.500 5.700 Z"),
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
        return _slider!!
    }

private var _slider: ImageVector? = null
