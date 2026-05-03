package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontFamily: ImageVector
    get() {
        if (_fontFamily != null) return _fontFamily!!
        _fontFamily = radixIcon(
            name = "FontFamily",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.499 2.000 C 12.775 2.000 13.000 2.224 13.000 2.500 C 13.000 2.776 12.776 3.000 12.500 3.000 L 8.692 3.000 L 8.405 3.854 C 8.189 4.497 7.894 5.372 7.581 6.298 C 7.503 6.529 7.423 6.765 7.344 7.000 L 8.500 7.000 C 8.776 7.000 9.000 7.224 9.000 7.500 C 9.000 7.776 8.776 8.000 8.500 8.000 L 7.004 8.000 C 6.567 9.285 6.164 10.462 5.958 11.039 C 5.636 11.939 5.207 12.486 4.667 12.778 C 4.163 13.051 3.642 13.050 3.284 13.050 L 3.250 13.050 C 2.946 13.050 2.700 12.804 2.700 12.500 C 2.700 12.196 2.946 11.950 3.250 11.950 C 3.642 11.950 3.903 11.941 4.144 11.811 C 4.364 11.691 4.655 11.415 4.922 10.668 C 5.107 10.151 5.453 9.141 5.842 8.000 L 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 L 6.182 7.000 C 6.301 6.648 6.422 6.293 6.539 5.945 C 6.852 5.020 7.146 4.146 7.362 3.504 L 7.532 3.000 L 5.000 3.000 C 4.151 3.000 3.500 3.651 3.500 4.500 C 3.500 4.776 3.276 5.000 3.000 5.000 C 2.724 5.000 2.500 4.776 2.500 4.500 C 2.500 3.099 3.599 2.000 5.000 2.000 L 12.499 2.000 Z"),
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
        return _fontFamily!!
    }

private var _fontFamily: ImageVector? = null
