package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowUp: ImageVector
    get() {
        if (_thickArrowUp != null) return _thickArrowUp!!
        _thickArrowUp = radixIcon(
            name = "ThickArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 1.000 C 7.661 1.000 7.813 1.078 7.907 1.209 L 12.907 8.209 C 13.016 8.361 13.030 8.562 12.944 8.729 C 12.859 8.895 12.687 9.000 12.500 9.000 L 10.000 9.000 L 10.000 11.500 C 10.000 11.776 9.776 12.000 9.500 12.000 L 5.500 12.000 C 5.224 12.000 5.000 11.776 5.000 11.500 L 5.000 9.000 L 2.500 9.000 C 2.313 9.000 2.141 8.895 2.056 8.729 C 1.970 8.562 1.984 8.361 2.093 8.209 L 7.093 1.209 L 7.174 1.121 C 7.264 1.044 7.379 1.000 7.500 1.000 ZM 3.473 8.000 L 5.500 8.000 C 5.776 8.000 6.000 8.224 6.000 8.500 L 6.000 11.000 L 9.000 11.000 L 9.000 8.500 C 9.000 8.224 9.224 8.000 9.500 8.000 L 11.527 8.000 L 7.500 2.360 L 3.473 8.000 Z"),
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
        return _thickArrowUp!!
    }

private var _thickArrowUp: ImageVector? = null
