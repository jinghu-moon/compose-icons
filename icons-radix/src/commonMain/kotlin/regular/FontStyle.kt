package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontStyle: ImageVector
    get() {
        if (_fontStyle != null) return _fontStyle!!
        _fontStyle = radixIcon(
            name = "FontStyle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.243 2.688 C 6.917 2.688 7.974 3.335 8.438 4.311 C 8.571 4.589 8.576 4.913 8.228 5.191 C 7.880 5.470 7.523 5.348 7.233 5.038 C 6.472 4.226 5.995 4.050 5.256 4.050 C 4.140 4.050 3.547 4.636 3.547 5.279 C 3.547 5.866 3.963 6.231 4.947 6.534 L 5.678 6.762 C 7.230 7.235 7.974 7.960 7.974 9.171 C 7.974 10.773 6.694 12.091 4.462 12.091 C 2.866 12.091 1.400 11.113 1.038 9.980 C 0.935 9.658 1.116 9.377 1.400 9.249 C 1.684 9.121 2.094 9.134 2.270 9.454 C 2.853 10.514 3.646 10.729 4.486 10.729 C 5.527 10.729 6.297 10.261 6.297 9.454 C 6.297 8.805 5.911 8.464 4.871 8.143 L 4.159 7.922 C 2.645 7.449 1.888 6.692 1.888 5.456 C 1.888 3.798 3.276 2.688 5.243 2.688 ZM 12.613 5.047 C 13.855 5.047 14.662 5.634 14.977 6.635 C 15.044 6.846 14.959 6.980 14.748 7.049 C 14.540 7.117 14.318 7.100 14.238 6.897 C 13.936 6.123 13.352 5.763 12.599 5.763 C 11.647 5.763 11.014 6.252 11.013 6.916 C 11.013 7.450 11.346 7.751 12.247 8.044 L 12.835 8.232 C 14.062 8.630 14.551 9.138 14.552 10.018 C 14.552 11.197 13.481 12.044 11.993 12.044 C 10.644 12.044 9.656 11.281 9.420 10.336 C 9.365 10.119 9.412 10.029 9.700 9.962 C 9.988 9.895 10.071 9.899 10.172 10.137 C 10.456 10.811 11.153 11.327 12.032 11.327 C 12.991 11.327 13.683 10.780 13.683 10.064 C 13.683 9.536 13.396 9.288 12.436 8.976 L 11.849 8.780 C 10.661 8.396 10.165 7.861 10.165 6.988 C 10.165 5.868 11.164 5.047 12.613 5.047 Z"),
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
        return _fontStyle!!
    }

private var _fontStyle: ImageVector? = null
