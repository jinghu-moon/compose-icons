package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TerminalFill: ImageVector
    get() {
        if (_terminalFill != null) return _terminalFill!!
        _terminalFill = remixIcon(
            name = "TerminalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 12.000 L 3.929 19.071 L 2.515 17.657 L 8.172 12.000 L 2.515 6.343 L 3.929 4.929 L 11.000 12.000 ZM 11.000 19.000 L 21.000 19.000 L 21.000 21.000 L 11.000 21.000 L 11.000 19.000 Z"),
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
        return _terminalFill!!
    }

private var _terminalFill: ImageVector? = null
