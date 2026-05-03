package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DragHandleHorizontal: ImageVector
    get() {
        if (_dragHandleHorizontal != null) return _dragHandleHorizontal!!
        _dragHandleHorizontal = radixIcon(
            name = "DragHandleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.581 10.109 C 12.763 10.146 12.901 10.307 12.901 10.500 C 12.901 10.693 12.763 10.854 12.581 10.892 L 12.500 10.901 L 2.500 10.901 C 2.280 10.901 2.100 10.721 2.100 10.500 C 2.100 10.280 2.279 10.100 2.500 10.100 L 12.500 10.100 L 12.581 10.109 ZM 12.581 8.109 C 12.763 8.146 12.901 8.307 12.901 8.500 C 12.901 8.693 12.763 8.854 12.581 8.892 L 12.500 8.901 L 2.500 8.901 C 2.280 8.901 2.100 8.721 2.100 8.500 C 2.100 8.279 2.279 8.100 2.500 8.100 L 12.500 8.100 L 12.581 8.109 ZM 12.581 6.109 C 12.763 6.146 12.901 6.307 12.901 6.500 C 12.901 6.693 12.763 6.854 12.581 6.892 L 12.500 6.901 L 2.500 6.901 C 2.280 6.901 2.100 6.721 2.100 6.500 C 2.100 6.279 2.279 6.100 2.500 6.100 L 12.500 6.100 L 12.581 6.109 ZM 12.581 4.109 C 12.763 4.146 12.901 4.307 12.901 4.500 C 12.901 4.693 12.763 4.854 12.581 4.892 L 12.500 4.901 L 2.500 4.901 C 2.280 4.901 2.100 4.721 2.100 4.500 C 2.100 4.279 2.279 4.100 2.500 4.100 L 12.500 4.100 L 12.581 4.109 Z"),
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
        return _dragHandleHorizontal!!
    }

private var _dragHandleHorizontal: ImageVector? = null
