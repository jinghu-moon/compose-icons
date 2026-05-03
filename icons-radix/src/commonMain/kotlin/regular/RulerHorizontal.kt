package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RulerHorizontal: ImageVector
    get() {
        if (_rulerHorizontal != null) return _rulerHorizontal!!
        _rulerHorizontal = radixIcon(
            name = "RulerHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.601 4.010 C 14.829 4.056 15.000 4.258 15.000 4.500 L 15.000 10.500 C 15.000 10.776 14.776 11.000 14.500 11.000 L 0.500 11.000 C 0.224 11.000 0.000 10.776 0.000 10.500 L 0.000 4.500 L 0.010 4.399 C 0.056 4.171 0.258 4.000 0.500 4.000 L 14.500 4.000 L 14.601 4.010 ZM 1.000 10.000 L 14.000 10.000 L 14.000 5.000 L 12.925 5.000 L 12.925 6.500 C 12.925 6.735 12.735 6.925 12.500 6.925 C 12.265 6.925 12.075 6.735 12.075 6.500 L 12.075 5.000 L 10.925 5.000 L 10.925 6.500 C 10.925 6.735 10.735 6.925 10.500 6.925 C 10.265 6.925 10.075 6.735 10.075 6.500 L 10.075 5.000 L 8.925 5.000 L 8.925 7.500 C 8.925 7.735 8.735 7.925 8.500 7.925 C 8.265 7.925 8.075 7.735 8.075 7.500 L 8.075 5.000 L 6.925 5.000 L 6.925 6.500 C 6.925 6.735 6.735 6.925 6.500 6.925 C 6.265 6.925 6.075 6.735 6.075 6.500 L 6.075 5.000 L 4.925 5.000 L 4.925 6.500 C 4.925 6.735 4.735 6.925 4.500 6.925 C 4.265 6.925 4.075 6.735 4.075 6.500 L 4.075 5.000 L 2.925 5.000 L 2.925 7.500 C 2.925 7.735 2.735 7.925 2.500 7.925 C 2.265 7.925 2.075 7.735 2.075 7.500 L 2.075 5.000 L 1.000 5.000 L 1.000 10.000 Z"),
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
        return _rulerHorizontal!!
    }

private var _rulerHorizontal: ImageVector? = null
