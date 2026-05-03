package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BorderDotted: ImageVector
    get() {
        if (_borderDotted != null) return _borderDotted!!
        _borderDotted = radixIcon(
            name = "BorderDotted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.500 6.625 C 1.983 6.625 2.375 7.017 2.375 7.500 C 2.375 7.983 1.983 8.375 1.500 8.375 C 1.017 8.375 0.625 7.983 0.625 7.500 C 0.625 7.017 1.017 6.625 1.500 6.625 ZM 5.500 6.625 C 5.983 6.625 6.375 7.017 6.375 7.500 C 6.375 7.983 5.983 8.375 5.500 8.375 C 5.017 8.375 4.625 7.983 4.625 7.500 C 4.625 7.017 5.017 6.625 5.500 6.625 ZM 9.500 6.625 C 9.983 6.625 10.375 7.017 10.375 7.500 C 10.375 7.983 9.983 8.375 9.500 8.375 C 9.017 8.375 8.625 7.983 8.625 7.500 C 8.625 7.017 9.017 6.625 9.500 6.625 ZM 13.500 6.625 C 13.983 6.625 14.375 7.017 14.375 7.500 C 14.375 7.983 13.983 8.375 13.500 8.375 C 13.017 8.375 12.625 7.983 12.625 7.500 C 12.625 7.017 13.017 6.625 13.500 6.625 Z"),
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
        return _borderDotted!!
    }

private var _borderDotted: ImageVector? = null
