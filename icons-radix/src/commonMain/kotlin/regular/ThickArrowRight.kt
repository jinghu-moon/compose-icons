package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowRight: ImageVector
    get() {
        if (_thickArrowRight != null) return _thickArrowRight!!
        _thickArrowRight = radixIcon(
            name = "ThickArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 7.500 C 14.000 7.661 13.922 7.813 13.791 7.907 L 6.791 12.907 C 6.639 13.016 6.438 13.030 6.271 12.944 C 6.105 12.859 6.000 12.687 6.000 12.500 L 6.000 10.000 L 3.500 10.000 C 3.224 10.000 3.000 9.776 3.000 9.500 L 3.000 5.500 C 3.000 5.224 3.224 5.000 3.500 5.000 L 6.000 5.000 L 6.000 2.500 C 6.000 2.313 6.105 2.141 6.271 2.056 C 6.438 1.970 6.639 1.984 6.791 2.093 L 13.791 7.093 L 13.879 7.174 C 13.956 7.264 14.000 7.379 14.000 7.500 ZM 7.000 3.473 L 7.000 5.500 C 7.000 5.776 6.776 6.000 6.500 6.000 L 4.000 6.000 L 4.000 9.000 L 6.500 9.000 C 6.776 9.000 7.000 9.224 7.000 9.500 L 7.000 11.527 L 12.640 7.500 L 7.000 3.473 Z"),
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
        return _thickArrowRight!!
    }

private var _thickArrowRight: ImageVector? = null
