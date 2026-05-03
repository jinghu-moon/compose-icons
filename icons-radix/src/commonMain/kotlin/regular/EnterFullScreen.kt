package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EnterFullScreen: ImageVector
    get() {
        if (_enterFullScreen != null) return _enterFullScreen!!
        _enterFullScreen = radixIcon(
            name = "EnterFullScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.500 9.000 C 2.776 9.000 3.000 9.224 3.000 9.500 L 3.000 12.000 L 5.500 12.000 C 5.776 12.000 6.000 12.224 6.000 12.500 C 6.000 12.776 5.776 13.000 5.500 13.000 L 2.500 13.000 C 2.224 13.000 2.000 12.776 2.000 12.500 L 2.000 9.500 C 2.000 9.224 2.224 9.000 2.500 9.000 ZM 12.500 9.000 C 12.776 9.000 13.000 9.224 13.000 9.500 L 13.000 12.500 C 13.000 12.776 12.776 13.000 12.500 13.000 L 9.500 13.000 C 9.224 13.000 9.000 12.776 9.000 12.500 C 9.000 12.224 9.224 12.000 9.500 12.000 L 12.000 12.000 L 12.000 9.500 C 12.000 9.224 12.224 9.000 12.500 9.000 ZM 5.500 2.000 C 5.776 2.000 6.000 2.224 6.000 2.500 C 6.000 2.776 5.776 3.000 5.500 3.000 L 3.000 3.000 L 3.000 5.500 C 3.000 5.776 2.776 6.000 2.500 6.000 C 2.224 6.000 2.000 5.776 2.000 5.500 L 2.000 2.500 L 2.010 2.399 C 2.056 2.171 2.258 2.000 2.500 2.000 L 5.500 2.000 ZM 12.601 2.010 C 12.829 2.056 13.000 2.258 13.000 2.500 L 13.000 5.500 C 13.000 5.776 12.776 6.000 12.500 6.000 C 12.224 6.000 12.000 5.776 12.000 5.500 L 12.000 3.000 L 9.500 3.000 C 9.224 3.000 9.000 2.776 9.000 2.500 C 9.000 2.224 9.224 2.000 9.500 2.000 L 12.500 2.000 L 12.601 2.010 Z"),
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
        return _enterFullScreen!!
    }

private var _enterFullScreen: ImageVector? = null
