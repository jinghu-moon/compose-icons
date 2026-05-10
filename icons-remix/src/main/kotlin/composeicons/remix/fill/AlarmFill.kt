package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlarmFill: ImageVector
    get() {
        if (_alarmFill != null) return _alarmFill!!
        _alarmFill = remixIcon(
            name = "AlarmFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22c-4.971 0-9-4.029-9-9 0-4.971 4.029-9 9-9 4.971 0 9 4.029 9 9 0 4.971-4.029 9-9 9ZM13 13v-5h-2v7h5v-2h-3ZM1.747 6.283 5.283 2.747 6.697 4.161 3.161 7.697 1.747 6.283ZM18.718 2.747l3.536 3.536L20.839 7.697 17.303 4.161 18.718 2.747Z"),
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
        return _alarmFill!!
    }

private var _alarmFill: ImageVector? = null
