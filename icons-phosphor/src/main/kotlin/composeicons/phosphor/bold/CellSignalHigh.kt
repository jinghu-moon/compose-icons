package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) return _cellSignalHigh!!
        _cellSignalHigh = phosphorBoldIcon(
            name = "CellSignalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 72v128c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM120 100c-6.627 0-12 5.373-12 12v88c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-88c0-6.627-5.373-12-12-12ZM80 140c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM40 180c-6.627 0-12 5.373-12 12v8c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-8c0-6.627-5.373-12-12-12Z"),
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
