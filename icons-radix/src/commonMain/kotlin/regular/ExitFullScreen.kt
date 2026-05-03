package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ExitFullScreen: ImageVector
    get() {
        if (_exitFullScreen != null) return _exitFullScreen!!
        _exitFullScreen = radixIcon(
            name = "ExitFullScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.500 9.000 C 5.776 9.000 6.000 9.224 6.000 9.500 L 6.000 12.500 C 6.000 12.776 5.776 13.000 5.500 13.000 C 5.224 13.000 5.000 12.776 5.000 12.500 L 5.000 10.000 L 2.500 10.000 C 2.224 10.000 2.000 9.776 2.000 9.500 C 2.000 9.224 2.224 9.000 2.500 9.000 L 5.500 9.000 ZM 12.500 9.000 C 12.776 9.000 13.000 9.224 13.000 9.500 C 13.000 9.776 12.776 10.000 12.500 10.000 L 10.000 10.000 L 10.000 12.500 C 10.000 12.776 9.776 13.000 9.500 13.000 C 9.224 13.000 9.000 12.776 9.000 12.500 L 9.000 9.500 C 9.000 9.224 9.224 9.000 9.500 9.000 L 12.500 9.000 ZM 5.500 2.000 C 5.776 2.000 6.000 2.224 6.000 2.500 L 6.000 5.500 C 6.000 5.776 5.776 6.000 5.500 6.000 L 2.500 6.000 C 2.224 6.000 2.000 5.776 2.000 5.500 C 2.000 5.224 2.224 5.000 2.500 5.000 L 5.000 5.000 L 5.000 2.500 C 5.000 2.224 5.224 2.000 5.500 2.000 ZM 9.500 2.000 C 9.776 2.000 10.000 2.224 10.000 2.500 L 10.000 5.000 L 12.500 5.000 C 12.776 5.000 13.000 5.224 13.000 5.500 C 13.000 5.776 12.776 6.000 12.500 6.000 L 9.500 6.000 C 9.224 6.000 9.000 5.776 9.000 5.500 L 9.000 2.500 C 9.000 2.224 9.224 2.000 9.500 2.000 Z"),
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
        return _exitFullScreen!!
    }

private var _exitFullScreen: ImageVector? = null
