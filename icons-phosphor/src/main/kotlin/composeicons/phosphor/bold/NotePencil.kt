package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorBoldIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 55.51l-32-32c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L87.49 119.51C85.247 121.766 83.992 124.819 84 128v32c0 6.627 5.373 12 12 12h32c3.184 .003 6.238-1.26 8.49-3.51l96-96c2.253-2.251 3.519-5.305 3.519-8.49 0-3.185-1.266-6.239-3.519-8.49ZM192 49l15 15L196 75 181 60ZM123 148h-15v-15L164 77l15 15ZM228 140.57v67.43c0 11.046-8.954 20-20 20h-160C36.954 228 28 219.046 28 208v-160C28 36.954 36.954 28 48 28h67.43c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-63.43v152h152v-63.43c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
