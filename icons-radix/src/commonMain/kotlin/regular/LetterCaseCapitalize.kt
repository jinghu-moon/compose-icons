package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseCapitalize: ImageVector
    get() {
        if (_letterCaseCapitalize != null) return _letterCaseCapitalize!!
        _letterCaseCapitalize = radixIcon(
            name = "LetterCaseCapitalize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.689 2.750 C 3.896 2.750 4.082 2.877 4.156 3.070 L 7.366 11.390 L 7.394 11.487 C 7.432 11.717 7.305 11.949 7.080 12.036 C 6.855 12.123 6.605 12.036 6.479 11.840 L 6.434 11.750 L 5.383 9.025 L 2.011 9.025 L 0.967 11.749 L 0.921 11.840 C 0.796 12.035 0.547 12.123 0.321 12.037 C 0.064 11.938 -0.066 11.648 0.033 11.391 L 3.224 3.071 L 3.256 3.002 C 3.344 2.848 3.508 2.750 3.689 2.750 ZM 10.898 5.207 C 11.792 5.207 12.604 5.602 13.153 6.225 L 13.153 5.720 C 13.153 5.472 13.355 5.270 13.604 5.270 C 13.852 5.270 14.054 5.471 14.054 5.720 L 14.054 11.529 C 14.054 11.778 13.852 11.979 13.604 11.979 C 13.355 11.979 13.153 11.778 13.153 11.529 L 13.153 11.019 C 12.573 11.667 11.721 12.013 10.898 12.013 C 9.358 12.012 8.009 10.633 8.009 8.609 C 8.009 6.686 9.258 5.207 10.898 5.207 ZM 11.086 6.058 C 10.108 6.058 9.035 6.966 9.035 8.609 C 9.035 10.153 10.008 11.161 11.086 11.161 C 11.970 11.161 12.771 10.493 13.153 9.795 L 13.153 7.306 C 12.764 6.583 11.942 6.058 11.086 6.058 ZM 2.337 8.176 L 5.055 8.176 L 3.691 4.643 L 2.337 8.176 Z"),
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
        return _letterCaseCapitalize!!
    }

private var _letterCaseCapitalize: ImageVector? = null
