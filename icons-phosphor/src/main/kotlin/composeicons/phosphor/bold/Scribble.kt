package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorBoldIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.5 192.49c-1.991 1.988-3.109 4.686-3.109 7.5 0 2.814 1.119 5.512 3.109 7.5 4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0-6.505-6.494-10.16-15.308-10.16-24.5 0-9.192 3.655-18.006 10.16-24.5l9.37-9.37c3.687-4.212 3.476-10.56-.482-14.518-3.958-3.958-10.307-4.169-14.518-.482l-66.76 66.75c-13.531 13.531-35.469 13.531-49 0-13.531-13.531-13.531-35.469 0-49L168.87 70.12c3.687-4.212 3.476-10.56-.482-14.518-3.958-3.958-10.307-4.169-14.518-.482L87.11 121.86c-13.531 13.531-35.469 13.531-49 0-13.531-13.531-13.531-35.469 0-49L79.51 31.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L55.1 89.86c-3.687 4.212-3.476 10.56 .482 14.518 3.958 3.958 10.307 4.169 14.518 .482L136.86 38.11c13.531-13.531 35.469-13.531 49 0 13.531 13.531 13.531 35.469 0 49L87.11 185.86c-3.687 4.212-3.476 10.56 .482 14.518 3.958 3.958 10.307 4.169 14.518 .482l66.75-66.75c13.531-13.531 35.469-13.531 49 0 13.531 13.531 13.531 35.469 0 49Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
