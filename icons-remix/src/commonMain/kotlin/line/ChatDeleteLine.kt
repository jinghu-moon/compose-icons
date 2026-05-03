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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 ZM 4.000 18.385 L 5.763 17.000 L 20.000 17.000 L 20.000 5.000 L 4.000 5.000 L 4.000 18.385 ZM 13.414 11.000 L 15.889 13.475 L 14.475 14.889 L 12.000 12.414 L 9.525 14.889 L 8.111 13.475 L 10.586 11.000 L 8.111 8.525 L 9.525 7.111 L 12.000 9.586 L 14.475 7.111 L 15.889 8.525 L 13.414 11.000 Z"),
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
        return _chatDeleteLine!!
    }

private var _chatDeleteLine: ImageVector? = null
