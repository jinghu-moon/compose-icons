package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ThickArrowDown: ImageVector
    get() {
        if (_thickArrowDown != null) return _thickArrowDown!!
        _thickArrowDown = radixIcon(
            name = "ThickArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.601 3.010 C 9.829 3.056 10.000 3.258 10.000 3.500 L 10.000 6.000 L 12.500 6.000 C 12.687 6.000 12.859 6.105 12.944 6.271 C 13.030 6.438 13.016 6.639 12.907 6.791 L 7.907 13.791 C 7.813 13.922 7.661 14.000 7.500 14.000 C 7.339 14.000 7.187 13.922 7.093 13.791 L 2.093 6.791 C 1.984 6.639 1.970 6.438 2.056 6.271 C 2.141 6.105 2.313 6.000 2.500 6.000 L 5.000 6.000 L 5.000 3.500 L 5.010 3.399 C 5.056 3.171 5.258 3.000 5.500 3.000 L 9.500 3.000 L 9.601 3.010 ZM 6.000 6.500 C 6.000 6.776 5.776 7.000 5.500 7.000 L 3.473 7.000 L 7.500 12.639 L 11.527 7.000 L 9.500 7.000 C 9.224 7.000 9.000 6.776 9.000 6.500 L 9.000 4.000 L 6.000 4.000 L 6.000 6.500 Z"),
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
        return _thickArrowDown!!
    }

private var _thickArrowDown: ImageVector? = null
