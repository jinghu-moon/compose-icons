package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NoteBlank: ImageVector
    get() {
        if (_noteBlank != null) return _noteBlank!!
        _noteBlank = phosphorBoldIcon(
            name = "NoteBlank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h108.69c5.307 .014 10.399-2.096 14.14-5.86l51.31-51.31c3.764-3.741 5.874-8.833 5.86-14.14v-108.69C228 36.954 219.046 28 208 28ZM52 52h152v92h-48c-6.627 0-12 5.373-12 12v48h-92ZM168 191v-23h23Z"),
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
