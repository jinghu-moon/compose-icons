package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) return _cellSignalHigh!!
        _cellSignalHigh = phosphorRegularIcon(
            name = "CellSignalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 72v128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM120 104c-4.418 0-8 3.582-8 8v88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88c0-4.418-3.582-8-8-8ZM80 144c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM40 184c-4.418 0-8 3.582-8 8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8c0-4.418-3.582-8-8-8Z"),
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
        return _cellSignalHigh!!
    }

private var _cellSignalHigh: ImageVector? = null
