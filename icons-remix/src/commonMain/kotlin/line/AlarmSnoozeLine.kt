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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 13.000 C 3.000 17.971 7.030 22.000 12.000 22.000 C 16.971 22.000 21.000 17.971 21.000 13.000 C 21.000 8.030 16.971 4.000 12.000 4.000 C 7.030 4.000 3.000 8.030 3.000 13.000 ZM 19.000 13.000 C 19.000 16.866 15.866 20.000 12.000 20.000 C 8.134 20.000 5.000 16.866 5.000 13.000 C 5.000 9.134 8.134 6.000 12.000 6.000 C 15.866 6.000 19.000 9.134 19.000 13.000 ZM 5.283 2.747 L 1.747 6.283 L 3.161 7.697 L 6.697 4.161 L 5.283 2.747 ZM 22.253 6.283 L 18.718 2.747 L 17.303 4.161 L 20.839 7.697 L 22.253 6.283 ZM 9.000 11.000 L 12.586 11.000 L 9.000 14.586 L 9.000 17.000 L 15.000 17.000 L 15.000 15.000 L 11.414 15.000 L 15.000 11.414 L 15.000 9.000 L 9.000 9.000 L 9.000 11.000 Z"),
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
        return _alarmSnoozeLine!!
    }

private var _alarmSnoozeLine: ImageVector? = null
