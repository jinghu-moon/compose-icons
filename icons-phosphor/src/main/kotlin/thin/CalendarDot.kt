package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarDot: ImageVector
    get() {
        if (_calendarDot != null) return _calendarDot!!
        _calendarDot = phosphorThinIcon(
            name = "CalendarDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 180.000 36.000 L 180.000 24.000 C 180.000 21.791 178.209 20.000 176.000 20.000 C 173.791 20.000 172.000 21.791 172.000 24.000 L 172.000 36.000 L 84.000 36.000 L 84.000 24.000 C 84.000 21.791 82.209 20.000 80.000 20.000 C 77.791 20.000 76.000 21.791 76.000 24.000 L 76.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 48.000 44.000 L 76.000 44.000 L 76.000 56.000 C 76.000 58.209 77.791 60.000 80.000 60.000 C 82.209 60.000 84.000 58.209 84.000 56.000 L 84.000 44.000 L 172.000 44.000 L 172.000 56.000 C 172.000 58.209 173.791 60.000 176.000 60.000 C 178.209 60.000 180.000 58.209 180.000 56.000 L 180.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 84.000 L 44.000 84.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 92.000 L 212.000 92.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 140.000 152.000 C 140.000 158.627 134.627 164.000 128.000 164.000 C 121.373 164.000 116.000 158.627 116.000 152.000 C 116.000 145.373 121.373 140.000 128.000 140.000 C 134.627 140.000 140.000 145.373 140.000 152.000 Z"),
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
        return _calendarDot!!
    }

private var _calendarDot: ImageVector? = null
