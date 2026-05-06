package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorBoldIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48h-156v-8C76 33.373 70.627 28 64 28h-16C28.118 28 12 44.118 12 64v112c0 19.882 16.118 36 36 36h184c6.627 0 12-5.373 12-12v-140c0-6.627-5.373-12-12-12ZM36 64C36 57.373 41.373 52 48 52h4v88h-4c-4.089-.008-8.148 .689-12 2.06ZM220 188h-172c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h16c6.627 0 12-5.373 12-12v-80h144ZM104 136c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h16v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-12h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-16v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v12ZM140 124h16v12h-16Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
