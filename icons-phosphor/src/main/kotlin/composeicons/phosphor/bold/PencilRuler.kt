package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorBoldIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-48c-11.046 0-20 8.954-20 20v160c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-40v-24h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16v-16h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16v-16h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16v-24h40ZM80.49 23.51C78.238 21.251 75.18 19.981 71.99 19.981c-3.19 0-6.248 1.27-8.5 3.529L31.49 55.51C29.247 57.766 27.992 60.819 28 64v144c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-144c.003-3.184-1.26-6.238-3.51-8.49ZM52 92h40v72h-40ZM72 49 91 68h-38ZM52 204v-16h40v16Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
