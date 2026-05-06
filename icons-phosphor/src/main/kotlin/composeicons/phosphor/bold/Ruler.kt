package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorBoldIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.15 70.54 185.46 17.86c-3.751-3.752-8.839-5.861-14.145-5.861-5.306 0-10.394 2.108-14.145 5.861L17.85 157.17c-3.752 3.751-5.861 8.839-5.861 14.145 0 5.306 2.108 10.394 5.861 14.145l52.69 52.68c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861L238.15 98.83c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145ZM84.68 218.34l-47-47L64 145l23.52 23.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L81 128 96 113l23.51 23.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L113 96 128 81l23.52 23.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L145 64 171.35 37.66l47 47Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
