package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = radixIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.151 14.000 L 0.850 14.000 L 0.850 1.000 L 2.151 1.000 L 2.151 14.000 ZM 6.151 14.000 L 4.850 14.000 L 4.850 1.000 L 6.151 1.000 L 6.151 14.000 ZM 10.151 14.000 L 8.850 14.000 L 8.850 1.000 L 10.151 1.000 L 10.151 14.000 ZM 14.151 14.000 L 12.850 14.000 L 12.850 1.000 L 14.151 1.000 L 14.151 14.000 Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
