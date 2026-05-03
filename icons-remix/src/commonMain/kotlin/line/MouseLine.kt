package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MouseLine: ImageVector
    get() {
        if (_mouseLine != null) return _mouseLine!!
        _mouseLine = remixIcon(
            name = "MouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.141 4.000 C 9.559 4.000 8.754 4.169 8.013 4.565 C 7.383 4.902 6.902 5.383 6.565 6.013 C 6.169 6.754 6.000 7.559 6.000 9.141 L 6.000 14.859 C 6.000 16.441 6.169 17.246 6.565 17.987 C 6.902 18.617 7.383 19.098 8.013 19.435 C 8.754 19.831 9.559 20.000 11.141 20.000 L 12.859 20.000 C 14.441 20.000 15.246 19.831 15.987 19.435 C 16.617 19.098 17.098 18.617 17.435 17.987 C 17.831 17.246 18.000 16.441 18.000 14.859 L 18.000 9.141 C 18.000 7.559 17.831 6.754 17.435 6.013 C 17.098 5.383 16.617 4.902 15.987 4.565 C 15.246 4.169 14.441 4.000 12.859 4.000 L 11.141 4.000 ZM 11.141 2.000 L 12.859 2.000 C 14.873 2.000 15.953 2.278 16.931 2.801 C 17.908 3.324 18.676 4.092 19.199 5.069 C 19.722 6.047 20.000 7.127 20.000 9.141 L 20.000 14.859 C 20.000 16.873 19.722 17.953 19.199 18.931 C 18.676 19.908 17.908 20.676 16.931 21.199 C 15.953 21.722 14.873 22.000 12.859 22.000 L 11.141 22.000 C 9.127 22.000 8.047 21.722 7.069 21.199 C 6.092 20.676 5.324 19.908 4.801 18.931 C 4.278 17.953 4.000 16.873 4.000 14.859 L 4.000 9.141 C 4.000 7.127 4.278 6.047 4.801 5.069 C 5.324 4.092 6.092 3.324 7.069 2.801 C 8.047 2.278 9.127 2.000 11.141 2.000 ZM 11.000 6.000 L 13.000 6.000 L 13.000 11.000 L 11.000 11.000 L 11.000 6.000 Z"),
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
        return _mouseLine!!
    }

private var _mouseLine: ImageVector? = null
