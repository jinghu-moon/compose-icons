package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) return _calendarStar!!
        _calendarStar = phosphorBoldIcon(
            name = "CalendarStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-20v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-72v-4C92 17.373 86.627 12 80 12 73.373 12 68 17.373 68 24v4h-20C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12h16ZM176.92 109.65l-27.42-2.12L139 83.25c-1.908-4.375-6.227-7.204-11-7.204-4.773 0-9.092 2.829-11 7.204l-10.5 24.28-27.42 2.12c-4.88 .375-9.044 3.676-10.522 8.342-1.478 4.666 .027 9.762 3.802 12.878l20.58 17-6.25 25.26c-1.156 4.686 .608 9.609 4.478 12.494 3.869 2.885 9.091 3.171 13.252 .726L128 172.46l23.58 13.88c4.161 2.445 9.383 2.159 13.252-.726 3.869-2.885 5.634-7.808 4.478-12.494l-6.25-25.26 20.58-17c3.775-3.116 5.28-8.212 3.802-12.878-1.478-4.666-5.642-7.967-10.522-8.342ZM141.92 134.16c-3.553 2.939-5.108 7.654-4 12.13l1.21 4.89-5.07-3c-3.762-2.201-8.418-2.201-12.18 0l-5.07 3 1.21-4.89c1.108-4.476-.447-9.191-4-12.13l-3.47-2.87 5-.39c4.441-.344 8.325-3.12 10.09-7.21l2.33-5.4 2.33 5.4c1.765 4.09 5.649 6.865 10.09 7.21l5 .39Z"),
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
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
