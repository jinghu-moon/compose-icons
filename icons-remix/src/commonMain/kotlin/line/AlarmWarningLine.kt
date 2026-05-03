package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlarmWarningLine: ImageVector
    get() {
        if (_alarmWarningLine != null) return _alarmWarningLine!!
        _alarmWarningLine = remixIcon(
            name = "AlarmWarningLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 20.000 L 4.000 14.000 C 4.000 9.582 7.582 6.000 12.000 6.000 C 16.418 6.000 20.000 9.582 20.000 14.000 L 20.000 20.000 L 21.000 20.000 L 21.000 22.000 L 3.000 22.000 L 3.000 20.000 L 4.000 20.000 ZM 6.000 20.000 L 18.000 20.000 L 18.000 14.000 C 18.000 10.686 15.314 8.000 12.000 8.000 C 8.686 8.000 6.000 10.686 6.000 14.000 L 6.000 20.000 ZM 11.000 2.000 L 13.000 2.000 L 13.000 5.000 L 11.000 5.000 L 11.000 2.000 ZM 19.778 4.808 L 21.192 6.222 L 19.071 8.343 L 17.657 6.929 L 19.778 4.808 ZM 2.808 6.222 L 4.222 4.808 L 6.343 6.929 L 4.929 8.343 L 2.808 6.222 ZM 7.000 14.000 C 7.000 11.239 9.239 9.000 12.000 9.000 L 12.000 11.000 C 10.343 11.000 9.000 12.343 9.000 14.000 L 7.000 14.000 Z"),
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
        return _alarmWarningLine!!
    }

private var _alarmWarningLine: ImageVector? = null
