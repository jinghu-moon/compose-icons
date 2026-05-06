package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NoteBlank: ImageVector
    get() {
        if (_noteBlank != null) return _noteBlank!!
        _noteBlank = phosphorThinIcon(
            name = "NoteBlank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h108.69c3.182 .008 6.234-1.256 8.48-3.51l51.32-51.32c2.254-2.246 3.518-5.298 3.51-8.48v-108.69c0-6.627-5.373-12-12-12ZM44 208v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4v108h-52c-2.209 0-4 1.791-4 4v52h-108c-2.209 0-4-1.791-4-4ZM164 206.34v-42.34h42.35Z"),
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
        return _noteBlank!!
    }

private var _noteBlank: ImageVector? = null
