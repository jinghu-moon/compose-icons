package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MaskOn: ImageVector
    get() {
        if (_maskOn != null) return _maskOn!!
        _maskOn = radixIcon(
            name = "MaskOn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 1.000 C 14.552 1.000 15.000 1.448 15.000 2.000 L 15.000 13.000 C 15.000 13.552 14.552 14.000 14.000 14.000 L 1.000 14.000 C 0.448 14.000 0.000 13.552 0.000 13.000 L 0.000 2.000 C 0.000 1.448 0.448 1.000 1.000 1.000 L 14.000 1.000 ZM 7.500 4.375 C 5.774 4.375 4.375 5.774 4.375 7.500 C 4.375 9.226 5.774 10.625 7.500 10.625 C 9.226 10.625 10.625 9.226 10.625 7.500 C 10.625 5.774 9.226 4.375 7.500 4.375 Z"),
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
        return _maskOn!!
    }

private var _maskOn: ImageVector? = null
