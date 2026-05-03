package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Exit: ImageVector
    get() {
        if (_exit != null) return _exit!!
        _exit = radixIcon(
            name = "Exit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 1.000 C 10.776 1.000 11.000 1.224 11.000 1.500 C 11.000 1.776 10.776 2.000 10.500 2.000 L 3.000 2.000 L 3.000 13.000 L 10.500 13.000 C 10.776 13.000 11.000 13.224 11.000 13.500 C 11.000 13.776 10.776 14.000 10.500 14.000 L 3.000 14.000 C 2.448 14.000 2.000 13.552 2.000 13.000 L 2.000 2.000 C 2.000 1.448 2.448 1.000 3.000 1.000 L 10.500 1.000 ZM 11.896 4.896 C 12.067 4.726 12.331 4.704 12.525 4.832 L 12.603 4.896 L 14.853 7.146 L 14.918 7.224 C 15.046 7.419 15.024 7.683 14.853 7.853 L 12.603 10.103 C 12.408 10.299 12.092 10.299 11.896 10.103 C 11.701 9.908 11.701 9.592 11.896 9.396 L 13.293 8.000 L 6.500 8.000 C 6.224 8.000 6.000 7.776 6.000 7.500 C 6.000 7.224 6.224 7.000 6.500 7.000 L 13.293 7.000 L 11.896 5.603 L 11.832 5.525 C 11.704 5.331 11.725 5.067 11.896 4.896 Z"),
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
        return _exit!!
    }

private var _exit: ImageVector? = null
