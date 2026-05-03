package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = radixIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.653 1.008 C 13.410 1.085 14.000 1.723 14.000 2.500 L 14.000 12.500 L 13.992 12.653 C 13.920 13.359 13.359 13.920 12.653 13.992 L 12.500 14.000 L 2.500 14.000 L 2.347 13.992 C 1.641 13.920 1.079 13.359 1.008 12.653 L 1.000 12.500 L 1.000 2.500 C 1.000 1.723 1.590 1.085 2.347 1.008 L 2.500 1.000 L 12.500 1.000 L 12.653 1.008 ZM 2.000 12.500 C 2.000 12.776 2.224 13.000 2.500 13.000 L 7.000 13.000 L 7.000 10.000 L 2.000 10.000 L 2.000 12.500 ZM 8.000 13.000 L 12.500 13.000 C 12.776 13.000 13.000 12.776 13.000 12.500 L 13.000 10.000 L 8.000 10.000 L 8.000 13.000 ZM 2.000 6.000 L 2.000 9.000 L 7.000 9.000 L 7.000 6.000 L 2.000 6.000 ZM 8.000 6.000 L 8.000 9.000 L 13.000 9.000 L 13.000 6.000 L 8.000 6.000 ZM 2.500 2.000 C 2.224 2.000 2.000 2.224 2.000 2.500 L 2.000 5.000 L 7.000 5.000 L 7.000 2.000 L 2.500 2.000 ZM 8.000 5.000 L 13.000 5.000 L 13.000 2.500 C 13.000 2.224 12.776 2.000 12.500 2.000 L 8.000 2.000 L 8.000 5.000 Z"),
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
        return _table!!
    }

private var _table: ImageVector? = null
