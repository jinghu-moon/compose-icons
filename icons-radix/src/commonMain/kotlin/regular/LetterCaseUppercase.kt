package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterCaseUppercase: ImageVector
    get() {
        if (_letterCaseUppercase != null) return _letterCaseUppercase!!
        _letterCaseUppercase = radixIcon(
            name = "LetterCaseUppercase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.019 11.743 C 0.923 12.002 0.635 12.134 0.376 12.038 C 0.118 11.942 -0.014 11.655 0.081 11.396 L 1.019 11.743 ZM 7.170 11.396 C 7.265 11.655 7.133 11.942 6.874 12.038 C 6.615 12.134 6.327 12.002 6.231 11.743 L 7.170 11.396 ZM 8.765 11.743 C 8.669 12.002 8.381 12.134 8.122 12.038 C 7.864 11.942 7.732 11.655 7.827 11.396 L 8.765 11.743 ZM 14.916 11.396 C 15.012 11.655 14.879 11.942 14.620 12.038 C 14.361 12.134 14.073 12.002 13.978 11.743 L 14.916 11.396 ZM 3.625 2.750 C 3.834 2.750 4.021 2.880 4.094 3.076 L 7.170 11.396 L 6.700 11.569 L 6.231 11.743 L 5.224 9.016 L 2.026 9.016 L 1.019 11.743 L 0.550 11.569 L 0.081 11.396 L 3.156 3.076 L 3.188 3.006 C 3.276 2.850 3.442 2.750 3.625 2.750 ZM 11.371 2.750 C 11.580 2.750 11.767 2.880 11.840 3.076 L 14.916 11.396 L 14.446 11.569 L 13.978 11.743 L 12.970 9.016 L 9.772 9.016 L 8.765 11.743 L 8.296 11.569 L 7.827 11.396 L 10.902 3.076 L 10.935 3.006 C 11.022 2.850 11.188 2.750 11.371 2.750 ZM 2.341 8.166 L 4.909 8.166 L 3.625 4.691 L 2.341 8.166 ZM 10.087 8.166 L 12.655 8.166 L 11.371 4.691 L 10.087 8.166 Z"),
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
        return _letterCaseUppercase!!
    }

private var _letterCaseUppercase: ImageVector? = null
