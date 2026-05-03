package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KeyboardBoxLine: ImageVector
    get() {
        if (_keyboardBoxLine != null) return _keyboardBoxLine!!
        _keyboardBoxLine = remixIcon(
            name = "KeyboardBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 ZM 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 6.000 7.000 L 8.000 7.000 L 8.000 9.000 L 6.000 9.000 L 6.000 7.000 ZM 6.000 11.000 L 8.000 11.000 L 8.000 13.000 L 6.000 13.000 L 6.000 11.000 ZM 6.000 15.000 L 18.000 15.000 L 18.000 17.000 L 6.000 17.000 L 6.000 15.000 ZM 11.000 11.000 L 13.000 11.000 L 13.000 13.000 L 11.000 13.000 L 11.000 11.000 ZM 11.000 7.000 L 13.000 7.000 L 13.000 9.000 L 11.000 9.000 L 11.000 7.000 ZM 16.000 7.000 L 18.000 7.000 L 18.000 9.000 L 16.000 9.000 L 16.000 7.000 ZM 16.000 11.000 L 18.000 11.000 L 18.000 13.000 L 16.000 13.000 L 16.000 11.000 Z"),
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
        return _keyboardBoxLine!!
    }

private var _keyboardBoxLine: ImageVector? = null
