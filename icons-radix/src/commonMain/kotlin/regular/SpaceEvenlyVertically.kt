package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpaceEvenlyVertically: ImageVector
    get() {
        if (_spaceEvenlyVertically != null) return _spaceEvenlyVertically!!
        _spaceEvenlyVertically = radixIcon(
            name = "SpaceEvenlyVertically",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.500 14.000 C 13.776 14.000 14.000 14.224 14.000 14.500 C 14.000 14.776 13.776 15.000 13.500 15.000 L 1.500 15.000 C 1.224 15.000 1.000 14.776 1.000 14.500 C 1.000 14.224 1.224 14.000 1.500 14.000 L 13.500 14.000 ZM 8.000 8.000 C 8.552 8.000 9.000 8.448 9.000 9.000 L 9.000 12.000 C 9.000 12.552 8.552 13.000 8.000 13.000 L 7.000 13.000 C 6.448 13.000 6.000 12.552 6.000 12.000 L 6.000 9.000 C 6.000 8.448 6.448 8.000 7.000 8.000 L 8.000 8.000 ZM 8.000 2.000 C 8.552 2.000 9.000 2.448 9.000 3.000 L 9.000 6.000 C 9.000 6.552 8.552 7.000 8.000 7.000 L 7.000 7.000 C 6.448 7.000 6.000 6.552 6.000 6.000 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 L 8.000 2.000 ZM 13.500 0.000 C 13.776 0.000 14.000 0.224 14.000 0.500 C 14.000 0.776 13.776 1.000 13.500 1.000 L 1.500 1.000 C 1.224 1.000 1.000 0.776 1.000 0.500 C 1.000 0.224 1.224 0.000 1.500 0.000 L 13.500 0.000 Z"),
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
        return _spaceEvenlyVertically!!
    }

private var _spaceEvenlyVertically: ImageVector? = null
