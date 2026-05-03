package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlarmAddFill: ImageVector
    get() {
        if (_alarmAddFill != null) return _alarmAddFill!!
        _alarmAddFill = remixIcon(
            name = "AlarmAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 13.000 C 3.000 17.971 7.030 22.000 12.000 22.000 C 16.971 22.000 21.000 17.971 21.000 13.000 C 21.000 8.030 16.971 4.000 12.000 4.000 C 7.030 4.000 3.000 8.030 3.000 13.000 ZM 5.283 2.747 L 1.747 6.283 L 3.161 7.697 L 6.697 4.161 L 5.283 2.747 ZM 22.253 6.283 L 18.718 2.747 L 17.303 4.161 L 20.839 7.697 L 22.253 6.283 ZM 11.000 9.000 L 13.000 9.000 L 13.000 12.000 L 16.000 12.000 L 16.000 14.000 L 13.000 14.000 L 13.000 17.000 L 11.000 17.000 L 11.000 14.000 L 8.000 14.000 L 8.000 12.000 L 11.000 12.000 L 11.000 9.000 Z"),
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
        return _alarmAddFill!!
    }

private var _alarmAddFill: ImageVector? = null
