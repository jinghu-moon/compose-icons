package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlarmSnoozeLine: ImageVector
    get() {
        if (_alarmSnoozeLine != null) return _alarmSnoozeLine!!
        _alarmSnoozeLine = remixIcon(
            name = "AlarmSnoozeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 13c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9 0-4.971-4.029-9-9-9-4.971 0-9 4.029-9 9ZM19 13c0 3.866-3.134 7-7 7-3.866 0-7-3.134-7-7 0-3.866 3.134-7 7-7 3.866 0 7 3.134 7 7ZM5.283 2.747 1.747 6.283 3.161 7.697 6.697 4.161 5.283 2.747ZM22.253 6.283 18.718 2.747 17.303 4.161l3.536 3.536L22.253 6.283ZM9 11h3.586L9 14.586v2.414h6v-2h-3.586L15 11.414v-2.414h-6v2Z"),
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
        return _alarmSnoozeLine!!
    }

private var _alarmSnoozeLine: ImageVector? = null
