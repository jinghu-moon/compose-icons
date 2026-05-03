package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BoxModel: ImageVector
    get() {
        if (_boxModel != null) return _boxModel!!
        _boxModel = radixIcon(
            name = "BoxModel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 1.000 C 13.552 1.000 14.000 1.448 14.000 2.000 L 14.000 13.000 C 14.000 13.552 13.552 14.000 13.000 14.000 L 2.000 14.000 C 1.448 14.000 1.000 13.552 1.000 13.000 L 1.000 2.000 C 1.000 1.448 1.448 1.000 2.000 1.000 L 13.000 1.000 ZM 2.000 13.000 L 13.000 13.000 L 13.000 2.000 L 2.000 2.000 L 2.000 13.000 ZM 10.601 4.010 C 10.828 4.056 11.000 4.258 11.000 4.500 L 11.000 10.500 C 11.000 10.776 10.776 11.000 10.500 11.000 L 4.500 11.000 C 4.224 11.000 4.000 10.776 4.000 10.500 L 4.000 4.500 L 4.010 4.399 C 4.056 4.171 4.258 4.000 4.500 4.000 L 10.500 4.000 L 10.601 4.010 ZM 5.000 10.000 L 10.000 10.000 L 10.000 5.000 L 5.000 5.000 L 5.000 10.000 Z"),
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
        return _boxModel!!
    }

private var _boxModel: ImageVector? = null
