package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorRegularIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 112h-88c-4.418 0-8 3.582-8 8v88c0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8v-88c0-4.418-3.582-8-8-8ZM128 200h-72v-72h72ZM216 184v16c0 8.837-7.163 16-16 16h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM216 112v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM216 56v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c8.837 0 16 7.163 16 16ZM152 48c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM40 80v-24C40 47.163 47.163 40 56 40h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
