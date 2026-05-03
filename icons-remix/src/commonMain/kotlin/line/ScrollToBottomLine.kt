package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ScrollToBottomLine: ImageVector
    get() {
        if (_scrollToBottomLine != null) return _scrollToBottomLine!!
        _scrollToBottomLine = remixIcon(
            name = "ScrollToBottomLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.013 4.565 C 8.754 4.169 9.559 4.000 11.141 4.000 L 12.859 4.000 C 14.441 4.000 15.246 4.169 15.987 4.565 C 16.617 4.902 17.098 5.383 17.435 6.013 C 17.831 6.754 18.000 7.559 18.000 9.141 L 18.000 14.859 C 18.000 16.441 17.831 17.246 17.435 17.987 C 17.098 18.617 16.617 19.098 15.987 19.435 C 15.246 19.831 14.441 20.000 12.859 20.000 L 11.141 20.000 C 9.559 20.000 8.754 19.831 8.013 19.435 C 7.383 19.098 6.902 18.617 6.565 17.987 C 6.169 17.246 6.000 16.441 6.000 14.859 L 6.000 9.141 C 6.000 7.559 6.169 6.754 6.565 6.013 C 6.902 5.383 7.383 4.902 8.013 4.565 ZM 12.859 2.000 L 11.141 2.000 C 9.127 2.000 8.047 2.278 7.069 2.801 C 6.092 3.324 5.324 4.092 4.801 5.069 C 4.278 6.047 4.000 7.127 4.000 9.141 L 4.000 14.859 C 4.000 16.873 4.278 17.953 4.801 18.931 C 5.324 19.908 6.092 20.676 7.069 21.199 C 8.047 21.722 9.127 22.000 11.141 22.000 L 12.859 22.000 C 14.873 22.000 15.953 21.722 16.931 21.199 C 17.908 20.676 18.676 19.908 19.199 18.931 C 19.722 17.953 20.000 16.873 20.000 14.859 L 20.000 9.141 C 20.000 7.127 19.722 6.047 19.199 5.069 C 18.676 4.092 17.908 3.324 16.931 2.801 C 15.953 2.278 14.873 2.000 12.859 2.000 ZM 13.000 6.000 L 11.000 6.000 L 11.000 11.000 L 13.000 11.000 L 13.000 6.000 ZM 7.758 13.758 L 12.000 18.001 L 16.243 13.758 L 14.829 12.344 L 12.000 15.172 L 9.172 12.344 L 7.758 13.758 Z"),
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
        return _scrollToBottomLine!!
    }

private var _scrollToBottomLine: ImageVector? = null
