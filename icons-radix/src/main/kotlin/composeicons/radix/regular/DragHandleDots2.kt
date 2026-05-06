package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DragHandleDots2: ImageVector
    get() {
        if (_dragHandleDots2 != null) return _dragHandleDots2!!
        _dragHandleDots2 = radixIcon(
            name = "DragHandleDots2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 10.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125-.621 0-1.125-.504-1.125-1.125 0-.621 .504-1.125 1.125-1.125ZM9.5 10.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125-.621 0-1.125-.504-1.125-1.125 0-.621 .504-1.125 1.125-1.125ZM5.5 6.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125C4.879 8.625 4.375 8.121 4.375 7.5c0-.621 .504-1.125 1.125-1.125ZM9.5 6.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125C8.879 8.625 8.375 8.121 8.375 7.5c0-.621 .504-1.125 1.125-1.125ZM5.5 2.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125C4.879 4.625 4.375 4.121 4.375 3.5c0-.621 .504-1.125 1.125-1.125ZM9.5 2.375c.621 0 1.125 .504 1.125 1.125 0 .621-.504 1.125-1.125 1.125C8.879 4.625 8.375 4.121 8.375 3.5c0-.621 .504-1.125 1.125-1.125Z"),
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
        return _dragHandleDots2!!
    }

private var _dragHandleDots2: ImageVector? = null
