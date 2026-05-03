package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) return _calendarCheck!!
        _calendarCheck = phosphorDuotoneIcon(
            name = "CalendarCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 88.000 L 40.000 88.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 184.000 32.000 L 184.000 24.000 C 184.000 19.582 180.418 16.000 176.000 16.000 C 171.582 16.000 168.000 19.582 168.000 24.000 L 168.000 32.000 L 88.000 32.000 L 88.000 24.000 C 88.000 19.582 84.418 16.000 80.000 16.000 C 75.582 16.000 72.000 19.582 72.000 24.000 L 72.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 72.000 48.000 L 72.000 56.000 C 72.000 60.418 75.582 64.000 80.000 64.000 C 84.418 64.000 88.000 60.418 88.000 56.000 L 88.000 48.000 L 168.000 48.000 L 168.000 56.000 C 168.000 60.418 171.582 64.000 176.000 64.000 C 180.418 64.000 184.000 60.418 184.000 56.000 L 184.000 48.000 L 208.000 48.000 L 208.000 80.000 L 48.000 80.000 L 48.000 48.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 96.000 L 208.000 96.000 L 208.000 208.000 ZM 169.660 122.340 C 171.162 123.841 172.006 125.877 172.006 128.000 C 172.006 130.123 171.162 132.159 169.660 133.660 L 121.660 181.660 C 120.159 183.162 118.123 184.006 116.000 184.006 C 113.877 184.006 111.841 183.162 110.340 181.660 L 86.340 157.660 C 83.214 154.534 83.214 149.466 86.340 146.340 C 89.466 143.214 94.534 143.214 97.660 146.340 L 116.000 164.690 L 158.340 122.340 C 159.841 120.838 161.877 119.994 164.000 119.994 C 166.123 119.994 168.159 120.838 169.660 122.340 Z"),
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
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
