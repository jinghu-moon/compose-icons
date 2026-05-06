package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorThinIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.84 85.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-24 24c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l24-24c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM213.59 112.08 112.08 213.57c-19.293 18.882-50.19 18.717-69.282-.369C23.707 194.115 23.534 163.219 42.41 143.92L143.92 42.43c19.293-18.882 50.19-18.717 69.282 .369 19.091 19.086 19.265 49.982 .388 69.281ZM154.35 160 96 101.66 48.06 149.57c-16.113 16.116-16.111 42.242 .005 58.355 16.116 16.113 42.242 16.111 58.355-.005ZM207.94 48.08c-16.119-16.108-42.241-16.108-58.36 0L101.65 96 160 154.34l47.93-47.91c16.082-16.124 16.087-42.221 .01-58.35Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
