package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.QuestionMarkCircled: ImageVector
    get() {
        if (_questionMarkCircled != null) return _questionMarkCircled!!
        _questionMarkCircled = radixIcon(
            name = "QuestionMarkCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.171 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 7.500 9.750 C 7.914 9.750 8.250 10.086 8.250 10.500 C 8.250 10.914 7.914 11.250 7.500 11.250 C 7.086 11.250 6.750 10.914 6.750 10.500 C 6.750 10.086 7.086 9.750 7.500 9.750 ZM 7.500 3.825 C 8.935 3.825 10.050 4.928 10.050 6.250 C 10.050 7.354 9.320 7.890 8.785 8.215 C 8.486 8.397 8.305 8.486 8.151 8.606 C 8.086 8.657 8.060 8.689 8.051 8.703 L 8.049 8.704 C 8.047 9.006 7.802 9.250 7.500 9.250 C 7.196 9.250 6.950 9.004 6.950 8.700 C 6.950 8.232 7.232 7.927 7.475 7.738 C 7.695 7.566 8.015 7.397 8.215 7.275 C 8.680 6.993 8.950 6.741 8.950 6.250 C 8.950 5.572 8.365 4.925 7.500 4.925 C 6.635 4.925 6.050 5.572 6.050 6.250 C 6.050 6.554 5.804 6.800 5.500 6.800 C 5.196 6.800 4.950 6.554 4.950 6.250 C 4.950 4.928 6.065 3.825 7.500 3.825 Z"),
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
        return _questionMarkCircled!!
    }

private var _questionMarkCircled: ImageVector? = null
