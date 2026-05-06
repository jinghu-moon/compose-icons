package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TaskLine: ImageVector
    get() {
        if (_taskLine != null) return _taskLine!!
        _taskLine = remixIcon(
            name = "TaskLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4h-14v16h14v-16ZM3 2.992C3 2.444 3.447 2 3.999 2h16.001c.552 0 1 .448 1 1L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016ZM11.293 13.121 15.535 8.879l1.414 1.414-5.657 5.657L7.404 12.061 8.818 10.646l2.475 2.475Z"),
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
        return _taskLine!!
    }

private var _taskLine: ImageVector? = null
