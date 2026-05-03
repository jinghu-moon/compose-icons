package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DragHandleVertical: ImageVector
    get() {
        if (_dragHandleVertical != null) return _dragHandleVertical!!
        _dragHandleVertical = radixIcon(
            name = "DragHandleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.109 2.419 C 10.146 2.237 10.307 2.099 10.500 2.099 C 10.693 2.099 10.854 2.237 10.892 2.419 L 10.901 2.500 L 10.901 12.500 C 10.901 12.720 10.721 12.900 10.500 12.900 C 10.280 12.900 10.100 12.720 10.100 12.500 L 10.100 2.500 L 10.109 2.419 ZM 8.109 2.419 C 8.146 2.237 8.307 2.099 8.500 2.099 C 8.693 2.099 8.854 2.237 8.892 2.419 L 8.901 2.500 L 8.901 12.500 C 8.901 12.720 8.721 12.900 8.500 12.900 C 8.279 12.900 8.100 12.720 8.100 12.500 L 8.100 2.500 L 8.109 2.419 ZM 6.109 2.419 C 6.146 2.237 6.307 2.099 6.500 2.099 C 6.693 2.099 6.854 2.237 6.892 2.419 L 6.901 2.500 L 6.901 12.500 C 6.901 12.720 6.721 12.900 6.500 12.900 C 6.279 12.900 6.100 12.720 6.100 12.500 L 6.100 2.500 L 6.109 2.419 ZM 4.109 2.419 C 4.146 2.237 4.307 2.099 4.500 2.099 C 4.693 2.099 4.854 2.237 4.892 2.419 L 4.901 2.500 L 4.901 12.500 C 4.901 12.720 4.721 12.900 4.500 12.900 C 4.279 12.900 4.100 12.720 4.100 12.500 L 4.100 2.500 L 4.109 2.419 Z"),
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
        return _dragHandleVertical!!
    }

private var _dragHandleVertical: ImageVector? = null
