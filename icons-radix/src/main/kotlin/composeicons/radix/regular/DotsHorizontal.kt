package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DotsHorizontal: ImageVector
    get() {
        if (_dotsHorizontal != null) return _dotsHorizontal!!
        _dotsHorizontal = radixIcon(
            name = "DotsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 6.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125C1.879 8.625 1.375 8.121 1.375 7.5c0-.621 .504-1.125 1.125-1.125ZM7.5 6.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125C6.879 8.625 6.375 8.121 6.375 7.5c0-.621 .504-1.125 1.125-1.125ZM12.5 6.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125-.621 0-1.125-.504-1.125-1.125 0-.621 .504-1.125 1.125-1.125Z"),
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
        return _dotsHorizontal!!
    }

private var _dotsHorizontal: ImageVector? = null
