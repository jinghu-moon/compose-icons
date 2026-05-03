package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FileMinus: ImageVector
    get() {
        if (_fileMinus != null) return _fileMinus!!
        _fileMinus = radixIcon(
            name = "FileMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.598 1.010 C 9.694 1.029 9.783 1.076 9.854 1.146 L 12.780 4.073 C 12.921 4.214 13.000 4.405 13.000 4.604 L 13.000 12.500 C 13.000 13.328 12.328 14.000 11.500 14.000 L 3.500 14.000 C 2.672 14.000 2.000 13.328 2.000 12.500 L 2.000 2.500 C 2.000 1.672 2.672 1.000 3.500 1.000 L 9.500 1.000 L 9.598 1.010 ZM 3.500 2.000 C 3.224 2.000 3.000 2.224 3.000 2.500 L 3.000 12.500 C 3.000 12.776 3.224 13.000 3.500 13.000 L 11.500 13.000 C 11.776 13.000 12.000 12.776 12.000 12.500 L 12.000 4.707 L 9.293 2.000 L 3.500 2.000 ZM 9.750 7.000 C 10.026 7.000 10.250 7.224 10.250 7.500 C 10.250 7.776 10.026 8.000 9.750 8.000 L 5.250 8.000 C 4.974 8.000 4.750 7.776 4.750 7.500 C 4.750 7.224 4.974 7.000 5.250 7.000 L 9.750 7.000 Z"),
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
        return _fileMinus!!
    }

private var _fileMinus: ImageVector? = null
