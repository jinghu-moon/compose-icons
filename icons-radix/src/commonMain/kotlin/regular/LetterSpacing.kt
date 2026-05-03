package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LetterSpacing: ImageVector
    get() {
        if (_letterSpacing != null) return _letterSpacing!!
        _letterSpacing = radixIcon(
            name = "LetterSpacing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.271 10.217 C 12.427 10.061 12.681 10.061 12.837 10.217 L 14.837 12.217 L 14.887 12.278 C 14.930 12.343 14.955 12.421 14.955 12.500 C 14.955 12.606 14.912 12.708 14.837 12.783 L 12.837 14.783 L 12.774 14.834 C 12.619 14.936 12.408 14.920 12.271 14.783 C 12.134 14.646 12.118 14.436 12.220 14.280 L 12.271 14.217 L 13.587 12.900 L 1.521 12.900 L 2.837 14.217 C 2.993 14.373 2.993 14.627 2.837 14.783 C 2.681 14.939 2.427 14.939 2.271 14.783 L 0.271 12.783 C 0.196 12.708 0.154 12.606 0.154 12.500 C 0.154 12.394 0.196 12.292 0.271 12.217 L 2.271 10.217 L 2.334 10.166 C 2.490 10.064 2.701 10.080 2.837 10.217 C 2.974 10.353 2.990 10.564 2.888 10.720 L 2.837 10.783 L 1.521 12.100 L 13.587 12.100 L 12.271 10.783 C 12.115 10.627 12.115 10.373 12.271 10.217 ZM 13.389 1.227 C 13.516 1.032 13.766 0.946 13.991 1.034 C 14.215 1.122 14.340 1.356 14.300 1.585 L 14.273 1.683 L 11.521 8.685 C 11.446 8.876 11.262 9.002 11.056 9.002 C 10.876 9.002 10.712 8.905 10.623 8.753 L 10.590 8.685 L 7.838 1.683 C 7.738 1.426 7.865 1.135 8.121 1.034 C 8.378 0.933 8.669 1.061 8.770 1.317 L 11.055 7.136 L 13.342 1.317 L 13.389 1.227 ZM 4.553 1.000 C 4.753 1.000 4.933 1.119 5.012 1.303 L 8.011 8.300 L 8.041 8.396 C 8.088 8.624 7.970 8.861 7.748 8.956 C 7.526 9.051 7.274 8.973 7.141 8.782 L 7.091 8.693 L 6.116 6.417 L 2.990 6.417 L 2.014 8.693 L 1.964 8.782 C 1.832 8.973 1.579 9.051 1.357 8.956 C 1.104 8.847 0.986 8.553 1.094 8.300 L 4.093 1.303 L 4.127 1.237 C 4.217 1.091 4.378 1.000 4.553 1.000 ZM 3.353 5.567 L 5.751 5.567 L 4.552 2.769 L 3.353 5.567 Z"),
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
        return _letterSpacing!!
    }

private var _letterSpacing: ImageVector? = null
