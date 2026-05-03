package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseToggle: ImageVector
    get() {
        if (_letterCaseToggle != null) return _letterCaseToggle!!
        _letterCaseToggle = radixIcon(
            name = "LetterCaseToggle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.289 2.750 C 11.496 2.750 11.681 2.877 11.756 3.070 L 14.966 11.389 L 14.993 11.487 C 15.032 11.716 14.905 11.949 14.680 12.036 C 14.454 12.123 14.205 12.035 14.079 11.840 L 14.033 11.750 L 12.982 9.025 L 9.610 9.025 L 8.567 11.749 L 8.521 11.840 C 8.396 12.035 8.146 12.123 7.921 12.037 C 7.663 11.938 7.534 11.648 7.633 11.390 L 10.823 3.071 L 10.856 3.002 C 10.943 2.848 11.108 2.750 11.289 2.750 ZM 2.899 5.207 C 3.792 5.207 4.605 5.602 5.154 6.224 L 5.154 5.720 C 5.154 5.471 5.355 5.270 5.604 5.269 C 5.852 5.269 6.054 5.471 6.054 5.720 L 6.054 11.529 C 6.054 11.778 5.852 11.979 5.604 11.979 C 5.355 11.979 5.154 11.777 5.154 11.529 L 5.154 11.019 C 4.574 11.667 3.722 12.012 2.899 12.012 C 1.358 12.012 0.009 10.633 0.009 8.609 C 0.009 6.685 1.258 5.207 2.899 5.207 ZM 3.086 6.057 C 2.108 6.058 1.036 6.966 1.035 8.609 C 1.035 10.153 2.009 11.160 3.086 11.161 C 3.970 11.161 4.772 10.492 5.154 9.795 L 5.154 7.305 C 4.764 6.583 3.942 6.057 3.086 6.057 ZM 9.937 8.176 L 12.654 8.176 L 11.291 4.642 L 9.937 8.176 Z"),
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
        return _letterCaseToggle!!
    }

private var _letterCaseToggle: ImageVector? = null
