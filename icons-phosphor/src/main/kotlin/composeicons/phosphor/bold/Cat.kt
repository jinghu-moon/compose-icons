package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorBoldIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.65 29.53c-7.473-3.092-16.072-1.379-21.79 4.34-.2 .2-.39 .4-.57 .61l-15 17.3C150.31 30.727 105.77 30.727 69.79 51.78l-15-17.3c-.18-.21-.37-.41-.57-.61C48.509 28.096 39.873 26.348 32.367 29.448 24.86 32.547 19.973 39.879 20 48v88c0 55.14 48.45 100 108 100 59.55 0 108-44.86 108-100v-88c-.004-8.087-4.878-15.377-12.35-18.47ZM212 136c0 38.22-31.35 69.93-72 75.21v-14.21l12.49-12.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L128 175l-7.51-7.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L116 197v14.24c-40.65-5.28-72-37-72-75.21v-77.29L58.54 75.47c4.114 4.731 11.177 5.498 16.21 1.76C81.257 72.419 88.411 68.551 96 65.74v22.26c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-27.65Q124 60 128 60q4 0 8 .35v27.65c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-22.26c7.588 2.814 14.741 6.682 21.25 11.49 5.033 3.738 12.096 2.971 16.21-1.76L212 58.74ZM100 140c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM188 140c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
