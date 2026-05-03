package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TerminalWindowFill: ImageVector
    get() {
        if (_terminalWindowFill != null) return _terminalWindowFill!!
        _terminalWindowFill = remixIcon(
            name = "TerminalWindowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 10.000 L 4.000 10.000 L 4.000 19.000 L 20.000 19.000 L 20.000 10.000 ZM 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 5.000 6.000 L 5.000 8.000 L 7.000 8.000 L 7.000 6.000 L 5.000 6.000 ZM 9.000 6.000 L 9.000 8.000 L 11.000 8.000 L 11.000 6.000 L 9.000 6.000 ZM 5.000 11.000 L 8.000 11.000 L 8.000 16.000 L 5.000 16.000 L 5.000 11.000 Z"),
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
        return _terminalWindowFill!!
    }

private var _terminalWindowFill: ImageVector? = null
