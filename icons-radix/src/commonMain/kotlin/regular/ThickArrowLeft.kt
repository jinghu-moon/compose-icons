package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowLeft: ImageVector
    get() {
        if (_thickArrowLeft != null) return _thickArrowLeft!!
        _thickArrowLeft = radixIcon(
            name = "ThickArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.000 7.500 C 1.000 7.661 1.078 7.813 1.209 7.907 L 8.209 12.907 C 8.361 13.016 8.562 13.030 8.729 12.944 C 8.895 12.859 9.000 12.687 9.000 12.500 L 9.000 10.000 L 11.500 10.000 C 11.776 10.000 12.000 9.776 12.000 9.500 L 12.000 5.500 C 12.000 5.224 11.776 5.000 11.500 5.000 L 9.000 5.000 L 9.000 2.500 C 9.000 2.313 8.895 2.141 8.729 2.056 C 8.562 1.970 8.361 1.984 8.209 2.093 L 1.209 7.093 L 1.121 7.174 C 1.044 7.264 1.000 7.379 1.000 7.500 ZM 8.000 3.473 L 8.000 5.500 C 8.000 5.776 8.224 6.000 8.500 6.000 L 11.000 6.000 L 11.000 9.000 L 8.500 9.000 C 8.224 9.000 8.000 9.224 8.000 9.500 L 8.000 11.527 L 2.360 7.500 L 8.000 3.473 Z"),
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
        return _thickArrowLeft!!
    }

private var _thickArrowLeft: ImageVector? = null
