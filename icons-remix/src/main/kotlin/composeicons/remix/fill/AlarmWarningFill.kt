package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlarmWarningFill: ImageVector
    get() {
        if (_alarmWarningFill != null) return _alarmWarningFill!!
        _alarmWarningFill = remixIcon(
            name = "AlarmWarningFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 20v-6C4 9.582 7.582 6 12 6c4.418 0 8 3.582 8 8v6h1v2h-18v-2h1ZM6 14h2c0-2.209 1.791-4 4-4v-2C8.686 8 6 10.686 6 14ZM11 2h2v3h-2v-3ZM19.778 4.808l1.414 1.414L19.071 8.343 17.657 6.929 19.778 4.808ZM2.808 6.222 4.222 4.808 6.343 6.929 4.929 8.343 2.808 6.222Z"),
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
        return _alarmWarningFill!!
    }

private var _alarmWarningFill: ImageVector? = null
