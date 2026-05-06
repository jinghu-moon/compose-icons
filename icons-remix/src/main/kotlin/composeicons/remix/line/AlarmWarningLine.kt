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
                pathData = parseSvgPathData("M4 20v-6C4 9.582 7.582 6 12 6c4.418 0 8 3.582 8 8v6h1v2h-18v-2h1ZM6 20h12v-6C18 10.686 15.314 8 12 8 8.686 8 6 10.686 6 14v6ZM11 2h2v3h-2v-3ZM19.778 4.808l1.414 1.414L19.071 8.343 17.657 6.929 19.778 4.808ZM2.808 6.222 4.222 4.808 6.343 6.929 4.929 8.343 2.808 6.222ZM7 14C7 11.239 9.239 9 12 9v2c-1.657 0-3 1.343-3 3h-2Z"),
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
