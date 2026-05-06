package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorBoldIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.78 156.53l-12-96C230.03 46.518 218.121 36.002 204 36h-172C20.954 36 12 44.954 12 56v88c0 11.046 8.954 20 20 20h40.58l36.69 73.37c2.033 4.063 6.187 6.629 10.73 6.63 24.289-.028 43.972-19.711 44-44v-12h52c8.03-.001 15.673-3.45 20.987-9.47 5.314-6.02 7.788-14.032 6.793-22ZM68 140h-32v-80h32ZM219 162.65c-.76 .859-1.853 1.351-3 1.35h-64c-6.627 0-12 5.373-12 12v24c-.001 8.415-5.269 15.93-13.18 18.8L92 149.17v-89.17h112c2.028-.016 3.747 1.488 4 3.5l12 96c.136 1.145-.228 2.293-1 3.15Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
