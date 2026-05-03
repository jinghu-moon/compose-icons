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
                pathData = parseSvgPathData("M 5.500 10.375 C 6.121 10.375 6.625 10.879 6.625 11.500 C 6.625 12.121 6.121 12.625 5.500 12.625 C 4.879 12.625 4.375 12.121 4.375 11.500 C 4.375 10.879 4.879 10.375 5.500 10.375 ZM 9.500 10.375 C 10.121 10.375 10.625 10.879 10.625 11.500 C 10.625 12.121 10.121 12.625 9.500 12.625 C 8.879 12.625 8.375 12.121 8.375 11.500 C 8.375 10.879 8.879 10.375 9.500 10.375 ZM 5.500 6.375 C 6.121 6.375 6.625 6.879 6.625 7.500 C 6.625 8.121 6.121 8.625 5.500 8.625 C 4.879 8.625 4.375 8.121 4.375 7.500 C 4.375 6.879 4.879 6.375 5.500 6.375 ZM 9.500 6.375 C 10.121 6.375 10.625 6.879 10.625 7.500 C 10.625 8.121 10.121 8.625 9.500 8.625 C 8.879 8.625 8.375 8.121 8.375 7.500 C 8.375 6.879 8.879 6.375 9.500 6.375 ZM 5.500 2.375 C 6.121 2.375 6.625 2.879 6.625 3.500 C 6.625 4.121 6.121 4.625 5.500 4.625 C 4.879 4.625 4.375 4.121 4.375 3.500 C 4.375 2.879 4.879 2.375 5.500 2.375 ZM 9.500 2.375 C 10.121 2.375 10.625 2.879 10.625 3.500 C 10.625 4.121 10.121 4.625 9.500 4.625 C 8.879 4.625 8.375 4.121 8.375 3.500 C 8.375 2.879 8.879 2.375 9.500 2.375 Z"),
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
