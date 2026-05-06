package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorThinIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 68h-38.34L226.83 34.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L188 62.34v-38.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v40C156.128 46.097 122.727 48.458 101.61 69.54h0 0C84.49 86.33 67.1 115.26 49.91 155.54c-11.93 28-19.61 52-20.59 55.09-1.828 3.714-1.621 8.106 .547 11.632 2.168 3.526 5.994 5.693 10.133 5.738 1.862-.005 3.697-.443 5.36-1.28 3.12-1 27.13-8.65 55.09-20.59 40.29-17.2 69.24-34.61 86-51.71C207.553 133.301 209.918 99.88 192 76h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM180.74 148.79c-9.76 10-23.42 19.39-38.37 27.91L114.83 149.17c-1.58-1.432-4.006-1.372-5.514 .136-1.508 1.508-1.568 3.934-.136 5.514l25.9 25.91C92.61 203.55 43.34 219 42.64 219.18c-.245 .079-.482 .18-.71 .3-1.553 .826-3.463 .541-4.707-.703-1.244-1.244-1.529-3.154-.703-4.707 .12-.228 .221-.465 .3-.71 .29-1 29.72-95 67.62-135.27l36.74 36.73c1.561 1.558 4.089 1.558 5.65 0 1.558-1.561 1.558-4.089 0-5.65L110.18 72.52c21.238-18.009 52.892-16.093 71.802 4.347 18.91 20.44 18.362 52.148-1.242 71.923Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
