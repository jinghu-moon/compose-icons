package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlarmSnoozeFill: ImageVector
    get() {
        if (_alarmSnoozeFill != null) return _alarmSnoozeFill!!
        _alarmSnoozeFill = remixIcon(
            name = "AlarmSnoozeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 13c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9 0-4.971-4.029-9-9-9-4.971 0-9 4.029-9 9ZM5.283 2.747 1.747 6.283 3.161 7.697 6.697 4.161 5.283 2.747ZM22.253 6.283 18.718 2.747 17.303 4.161l3.536 3.536L22.253 6.283ZM9 11v-2h6v2.414L11.414 15h3.586v2h-6v-2.414L12.586 11h-3.586Z"),
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
        return _alarmSnoozeFill!!
    }

private var _alarmSnoozeFill: ImageVector? = null
