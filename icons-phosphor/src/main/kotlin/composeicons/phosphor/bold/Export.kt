package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorBoldIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 112v96c0 11.046-8.954 20-20 20h-144C44.954 228 36 219.046 36 208v-96C36 100.954 44.954 92 56 92h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-16v88h136v-88h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h20c11.046 0 20 8.954 20 20ZM96.49 72.49 116 53v83c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-83l19.51 19.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-40-40c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-40 40c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0Z"),
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
        return _export!!
    }

private var _export: ImageVector? = null
