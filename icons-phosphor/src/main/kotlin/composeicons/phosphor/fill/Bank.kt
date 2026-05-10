package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorFillIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 208c0 4.418-3.582 8-8 8h-224c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h224c4.418 0 8 3.582 8 8ZM16.3 98.18c-.978-3.448 .456-7.125 3.51-9l104-64c2.57-1.58 5.81-1.58 8.38 0l104 64c3.055 1.873 4.491 5.549 3.516 8.996-.975 3.448-4.123 5.827-7.706 5.824h-24v64h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-64h-24c-3.58 .001-6.725-2.376-7.7-5.82ZM144 160c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8ZM96 160c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
