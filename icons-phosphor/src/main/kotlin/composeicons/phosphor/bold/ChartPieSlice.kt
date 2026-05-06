package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorBoldIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M93.82 116.64c3.813-2.114 6.178-6.13 6.18-10.49v-65.41c0-4.087-2.079-7.893-5.519-10.1C91.042 28.432 86.715 28.127 83 29.83 44.659 47.475 20.068 85.794 20 128c0 3.37 .16 6.76 .47 10.1 .377 4.032 2.763 7.601 6.344 9.492 3.581 1.891 7.874 1.849 11.416-.113ZM76 62.06v37L44.81 116.36C47.858 94.93 59.024 75.49 76 62.06ZM128 20c-6.627 0-12 5.373-12 12v89.53L39.18 166.27c-2.759 1.607-4.764 4.247-5.571 7.336-.807 3.089-.35 6.373 1.271 9.124 26.505 45.09 81.512 64.707 130.568 46.564 49.056-18.143 78.061-68.83 68.849-120.316C225.085 57.492 180.304 20.007 128 20ZM128 212C102.51 211.931 78.414 200.355 62.43 180.5L134 138.79c3.706-2.14 5.992-6.091 6-10.37v-83.57c43.643 6.256 75.022 45.189 71.865 89.165C208.708 177.991 172.089 212.042 128 212Z"),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
