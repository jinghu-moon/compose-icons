package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorRegularIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64h-48v-8C176 42.745 165.255 32 152 32h-48C90.745 32 80 42.745 80 56v8h-48C23.163 64 16 71.163 16 80v112c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM96 56c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8v8h-64ZM224 80v32h-32v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-96v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-32v-32ZM224 192h-192v-64h32v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h96v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h32v64Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
