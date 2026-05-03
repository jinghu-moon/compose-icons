package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarX: ImageVector
    get() {
        if (_calendarX != null) return _calendarX!!
        _calendarX = phosphorDuotoneIcon(
            name = "CalendarX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 216.000 88.000 L 40.000 88.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 184.000 32.000 L 184.000 24.000 C 184.000 19.582 180.418 16.000 176.000 16.000 C 171.582 16.000 168.000 19.582 168.000 24.000 L 168.000 32.000 L 88.000 32.000 L 88.000 24.000 C 88.000 19.582 84.418 16.000 80.000 16.000 C 75.582 16.000 72.000 19.582 72.000 24.000 L 72.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 48.000 L 72.000 56.000 C 72.000 60.418 75.582 64.000 80.000 64.000 C 84.418 64.000 88.000 60.418 88.000 56.000 L 88.000 48.000 L 168.000 48.000 L 168.000 56.000 C 168.000 60.418 171.582 64.000 176.000 64.000 C 180.418 64.000 184.000 60.418 184.000 56.000 L 184.000 48.000 L 208.000 48.000 L 208.000 80.000 L 48.000 80.000 L 48.000 48.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 96.000 L 208.000 96.000 L 208.000 208.000 ZM 157.660 133.660 L 139.310 152.000 L 157.660 170.340 C 160.786 173.466 160.786 178.534 157.660 181.660 C 154.534 184.786 149.466 184.786 146.340 181.660 L 128.000 163.310 L 109.660 181.660 C 106.534 184.786 101.466 184.786 98.340 181.660 C 95.214 178.534 95.214 173.466 98.340 170.340 L 116.690 152.000 L 98.340 133.660 C 95.214 130.534 95.214 125.466 98.340 122.340 C 101.466 119.214 106.534 119.214 109.660 122.340 L 128.000 140.690 L 146.340 122.340 C 149.466 119.214 154.534 119.214 157.660 122.340 C 160.786 125.466 160.786 130.534 157.660 133.660 Z"),
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
