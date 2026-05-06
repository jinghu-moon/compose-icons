package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatDeleteLine: ImageVector
    get() {
        if (_chatDeleteLine != null) return _chatDeleteLine!!
        _chatDeleteLine = remixIcon(
            name = "ChatDeleteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.455 19 2 22.5v-18.5C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14.545ZM4 18.385 5.763 17h14.237v-12h-16v13.385ZM13.414 11l2.475 2.475-1.414 1.414L12 12.414 9.525 14.889 8.111 13.475 10.586 11 8.111 8.525 9.525 7.111 12 9.586 14.475 7.111l1.414 1.414L13.414 11Z"),
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
        return _chatDeleteLine!!
    }

private var _chatDeleteLine: ImageVector? = null
