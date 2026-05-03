package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = radixIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 12.849 L 14.000 14.150 L 1.000 14.150 L 1.000 12.849 L 14.000 12.849 ZM 14.000 8.849 L 14.000 10.150 L 1.000 10.150 L 1.000 8.849 L 14.000 8.849 ZM 14.000 4.849 L 14.000 6.150 L 1.000 6.150 L 1.000 4.849 L 14.000 4.849 ZM 14.000 0.849 L 14.000 2.150 L 1.000 2.150 L 1.000 0.849 L 14.000 0.849 Z"),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
