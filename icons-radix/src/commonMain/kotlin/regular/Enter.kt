package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Enter: ImageVector
    get() {
        if (_enter != null) return _enter!!
        _enter = radixIcon(
            name = "Enter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 C 12.552 1.000 13.000 1.448 13.000 2.000 L 13.000 13.000 C 13.000 13.552 12.552 14.000 12.000 14.000 L 4.500 14.000 C 4.224 14.000 4.000 13.776 4.000 13.500 C 4.000 13.224 4.224 13.000 4.500 13.000 L 12.000 13.000 L 12.000 2.000 L 4.500 2.000 C 4.224 2.000 4.000 1.776 4.000 1.500 C 4.000 1.224 4.224 1.000 4.500 1.000 L 12.000 1.000 ZM 5.896 4.896 C 6.067 4.726 6.331 4.704 6.525 4.832 L 6.604 4.896 L 8.854 7.146 L 8.918 7.225 C 9.046 7.419 9.024 7.683 8.854 7.854 L 6.604 10.104 C 6.408 10.299 6.092 10.299 5.896 10.104 C 5.701 9.908 5.701 9.592 5.896 9.396 L 7.293 8.000 L 0.500 8.000 C 0.224 8.000 0.000 7.776 0.000 7.500 C 0.000 7.224 0.224 7.000 0.500 7.000 L 7.293 7.000 L 5.896 5.604 L 5.832 5.525 C 5.704 5.331 5.726 5.067 5.896 4.896 Z"),
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
        return _enter!!
    }

private var _enter: ImageVector? = null
