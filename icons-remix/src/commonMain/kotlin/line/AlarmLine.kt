package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlarmLine: ImageVector
    get() {
        if (_alarmLine != null) return _alarmLine!!
        _alarmLine = remixIcon(
            name = "AlarmLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 C 7.030 22.000 3.000 17.971 3.000 13.000 C 3.000 8.030 7.030 4.000 12.000 4.000 C 16.971 4.000 21.000 8.030 21.000 13.000 C 21.000 17.971 16.971 22.000 12.000 22.000 ZM 12.000 20.000 C 15.866 20.000 19.000 16.866 19.000 13.000 C 19.000 9.134 15.866 6.000 12.000 6.000 C 8.134 6.000 5.000 9.134 5.000 13.000 C 5.000 16.866 8.134 20.000 12.000 20.000 ZM 13.000 13.000 L 16.000 13.000 L 16.000 15.000 L 11.000 15.000 L 11.000 8.000 L 13.000 8.000 L 13.000 13.000 ZM 1.747 6.283 L 5.283 2.747 L 6.697 4.161 L 3.161 7.697 L 1.747 6.283 ZM 18.718 2.747 L 22.253 6.283 L 20.839 7.697 L 17.303 4.161 L 18.718 2.747 Z"),
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
        return _alarmLine!!
    }

private var _alarmLine: ImageVector? = null
