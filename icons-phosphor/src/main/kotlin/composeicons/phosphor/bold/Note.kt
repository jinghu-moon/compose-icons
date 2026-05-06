package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorBoldIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 108c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12ZM116 136h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM228 48v108.69c.014 5.307-2.096 10.399-5.86 14.14l-51.31 51.31c-3.741 3.764-8.833 5.874-14.14 5.86h-108.69C36.954 228 28 219.046 28 208v-160C28 36.954 36.954 28 48 28h160c11.046 0 20 8.954 20 20ZM52 204h92v-48c0-6.627 5.373-12 12-12h48v-92h-152ZM191 168h-23v23Z"),
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
        return _note!!
    }

private var _note: ImageVector? = null
