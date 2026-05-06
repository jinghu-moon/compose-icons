package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorRegularIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-40v-8C176 26.745 165.255 16 152 16h-48C90.745 16 80 26.745 80 40v8h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v144c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-144h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 40c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8v8h-64ZM192 208h-128v-144h128ZM112 104v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM160 104v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
