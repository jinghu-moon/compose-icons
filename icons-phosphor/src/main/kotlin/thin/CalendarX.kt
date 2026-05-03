package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarX: ImageVector
    get() {
        if (_calendarX != null) return _calendarX!!
        _calendarX = phosphorThinIcon(
            name = "CalendarX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 180.000 36.000 L 180.000 24.000 C 180.000 21.791 178.209 20.000 176.000 20.000 C 173.791 20.000 172.000 21.791 172.000 24.000 L 172.000 36.000 L 84.000 36.000 L 84.000 24.000 C 84.000 21.791 82.209 20.000 80.000 20.000 C 77.791 20.000 76.000 21.791 76.000 24.000 L 76.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 48.000 44.000 L 76.000 44.000 L 76.000 56.000 C 76.000 58.209 77.791 60.000 80.000 60.000 C 82.209 60.000 84.000 58.209 84.000 56.000 L 84.000 44.000 L 172.000 44.000 L 172.000 56.000 C 172.000 58.209 173.791 60.000 176.000 60.000 C 178.209 60.000 180.000 58.209 180.000 56.000 L 180.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 84.000 L 44.000 84.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 92.000 L 212.000 92.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 154.830 130.830 L 133.660 152.000 L 154.830 173.170 C 156.393 174.733 156.393 177.267 154.830 178.830 C 153.267 180.393 150.733 180.393 149.170 178.830 L 128.000 157.660 L 106.830 178.830 C 105.267 180.393 102.733 180.393 101.170 178.830 C 99.607 177.267 99.607 174.733 101.170 173.170 L 122.340 152.000 L 101.170 130.830 C 99.607 129.267 99.607 126.733 101.170 125.170 C 102.733 123.607 105.267 123.607 106.830 125.170 L 128.000 146.340 L 149.170 125.170 C 150.733 123.607 153.267 123.607 154.830 125.170 C 156.393 126.733 156.393 129.267 154.830 130.830 Z"),
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
        return _calendarX!!
    }

private var _calendarX: ImageVector? = null
