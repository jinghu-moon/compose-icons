package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarPlus: ImageVector
    get() {
        if (_calendarPlus != null) return _calendarPlus!!
        _calendarPlus = phosphorThinIcon(
            name = "CalendarPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 180.000 36.000 L 180.000 24.000 C 180.000 21.791 178.209 20.000 176.000 20.000 C 173.791 20.000 172.000 21.791 172.000 24.000 L 172.000 36.000 L 84.000 36.000 L 84.000 24.000 C 84.000 21.791 82.209 20.000 80.000 20.000 C 77.791 20.000 76.000 21.791 76.000 24.000 L 76.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 48.000 44.000 L 76.000 44.000 L 76.000 56.000 C 76.000 58.209 77.791 60.000 80.000 60.000 C 82.209 60.000 84.000 58.209 84.000 56.000 L 84.000 44.000 L 172.000 44.000 L 172.000 56.000 C 172.000 58.209 173.791 60.000 176.000 60.000 C 178.209 60.000 180.000 58.209 180.000 56.000 L 180.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 84.000 L 44.000 84.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 92.000 L 212.000 92.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 156.000 152.000 C 156.000 154.209 154.209 156.000 152.000 156.000 L 132.000 156.000 L 132.000 176.000 C 132.000 178.209 130.209 180.000 128.000 180.000 C 125.791 180.000 124.000 178.209 124.000 176.000 L 124.000 156.000 L 104.000 156.000 C 101.791 156.000 100.000 154.209 100.000 152.000 C 100.000 149.791 101.791 148.000 104.000 148.000 L 124.000 148.000 L 124.000 128.000 C 124.000 125.791 125.791 124.000 128.000 124.000 C 130.209 124.000 132.000 125.791 132.000 128.000 L 132.000 148.000 L 152.000 148.000 C 154.209 148.000 156.000 149.791 156.000 152.000 Z"),
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
        return _calendarPlus!!
    }

private var _calendarPlus: ImageVector? = null
