package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RulerSquare: ImageVector
    get() {
        if (_rulerSquare != null) return _rulerSquare!!
        _rulerSquare = radixIcon(
            name = "RulerSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.601 0.010 C 14.829 0.056 15.000 0.258 15.000 0.500 L 15.000 4.500 C 15.000 4.776 14.776 5.000 14.500 5.000 L 5.000 5.000 L 5.000 14.500 C 5.000 14.776 4.776 15.000 4.500 15.000 L 0.500 15.000 C 0.224 15.000 0.000 14.776 0.000 14.500 L 0.000 0.500 L 0.010 0.399 C 0.056 0.171 0.258 0.000 0.500 0.000 L 14.500 0.000 L 14.601 0.010 ZM 1.000 4.925 L 1.000 14.000 L 4.000 14.000 L 4.000 12.925 L 2.750 12.925 C 2.515 12.925 2.325 12.735 2.325 12.500 C 2.325 12.265 2.515 12.075 2.750 12.075 L 4.000 12.075 L 4.000 10.925 L 2.250 10.925 C 2.015 10.925 1.825 10.735 1.825 10.500 C 1.825 10.265 2.015 10.075 2.250 10.075 L 4.000 10.075 L 4.000 8.925 L 2.750 8.925 C 2.515 8.925 2.325 8.735 2.325 8.500 C 2.325 8.265 2.515 8.075 2.750 8.075 L 4.000 8.075 L 4.000 6.925 L 2.750 6.925 C 2.515 6.925 2.325 6.735 2.325 6.500 C 2.325 6.265 2.515 6.075 2.750 6.075 L 4.000 6.075 L 4.000 4.925 L 1.000 4.925 ZM 1.000 4.075 L 4.075 4.075 L 4.075 1.000 L 1.000 1.000 L 1.000 4.075 ZM 4.925 4.000 L 6.075 4.000 L 6.075 2.750 C 6.075 2.515 6.265 2.325 6.500 2.325 C 6.735 2.325 6.925 2.515 6.925 2.750 L 6.925 4.000 L 8.075 4.000 L 8.075 2.750 C 8.075 2.515 8.265 2.325 8.500 2.325 C 8.735 2.325 8.925 2.515 8.925 2.750 L 8.925 4.000 L 10.075 4.000 L 10.075 2.250 C 10.075 2.015 10.265 1.825 10.500 1.825 C 10.735 1.825 10.925 2.015 10.925 2.250 L 10.925 4.000 L 12.075 4.000 L 12.075 2.750 C 12.075 2.515 12.265 2.325 12.500 2.325 C 12.735 2.325 12.925 2.515 12.925 2.750 L 12.925 4.000 L 14.000 4.000 L 14.000 1.000 L 4.925 1.000 L 4.925 4.000 Z"),
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
        return _rulerSquare!!
    }

private var _rulerSquare: ImageVector? = null
