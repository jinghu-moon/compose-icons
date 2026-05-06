package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BarChart: ImageVector
    get() {
        if (_barChart != null) return _barChart!!
        _barChart = radixIcon(
            name = "BarChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 5C1.776 5 2 5.224 2 5.5v8C2 13.776 1.776 14 1.5 14 1.224 14 1 13.776 1 13.5v-8C1 5.224 1.224 5 1.5 5ZM3.5 7C3.776 7 4 7.224 4 7.5v6C4 13.776 3.776 14 3.5 14 3.224 14 3 13.776 3 13.5v-6C3 7.224 3.224 7 3.5 7ZM5.5 4C5.776 4 6 4.224 6 4.5v9C6 13.776 5.776 14 5.5 14 5.224 14 5 13.776 5 13.5v-9C5 4.224 5.224 4 5.5 4ZM7.5 5C7.776 5 8 5.224 8 5.5v8C8 13.776 7.776 14 7.5 14 7.224 14 7 13.776 7 13.5v-8C7 5.224 7.224 5 7.5 5ZM9.5 3c.276 0 .5 .224 .5 .5v10c0 .276-.224 .5-.5 .5C9.224 14 9 13.776 9 13.5v-10C9 3.224 9.224 3 9.5 3ZM11.5 1c.276 0 .5 .224 .5 .5v12c0 .276-.224 .5-.5 .5C11.224 14 11 13.776 11 13.5v-12C11 1.224 11.224 1 11.5 1ZM13.5 3c.276 0 .5 .224 .5 .5v10c0 .276-.224 .5-.5 .5C13.224 14 13 13.776 13 13.5v-10C13 3.224 13.224 3 13.5 3Z"),
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
        return _barChart!!
    }

private var _barChart: ImageVector? = null
