package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PieChart: ImageVector
    get() {
        if (_pieChart != null) return _pieChart!!
        _pieChart = radixIcon(
            name = "PieChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 .85c3.673 0 6.649 2.978 6.649 6.65 0 3.673-2.977 6.65-6.649 6.65C3.828 14.151 .85 11.173 .85 7.5 .85 3.828 3.828 .85 7.5 .85ZM7.5 1.85C4.38 1.85 1.85 4.38 1.85 7.5c0 3.121 2.53 5.65 5.65 5.65 3.12-0 5.649-2.53 5.649-5.65C13.15 4.38 10.621 1.85 7.5 1.85ZM7.5 3.1c2.43 0 4.4 1.97 4.4 4.4 0 .169-.011 .336-.029 .5h-4.871v-4.872c.164-.019 .331-.028 .5-.028Z"),
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
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
