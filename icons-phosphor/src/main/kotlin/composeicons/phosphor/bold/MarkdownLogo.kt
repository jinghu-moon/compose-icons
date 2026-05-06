package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MarkdownLogo: ImageVector
    get() {
        if (_markdownLogo != null) return _markdownLogo!!
        _markdownLogo = phosphorBoldIcon(
            name = "MarkdownLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 44h-208C12.954 44 4 52.954 4 64v128c0 11.046 8.954 20 20 20h208c11.046 0 20-8.954 20-20v-128C252 52.954 243.046 44 232 44ZM228 188h-200v-120h200ZM48 148v-40c-.004-4.856 2.92-9.236 7.407-11.095 4.487-1.859 9.651-.83 13.083 2.605L88 119 107.51 99.48c3.436-3.44 8.608-4.467 13.097-2.6 4.489 1.867 7.409 6.258 7.393 11.12v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-11l-7.51 7.52c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L72 137v11c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM146.63 124.5c1.989-2.486 4.884-4.079 8.048-4.43 3.164-.351 6.337 .57 8.822 2.56l.5 .4v-15.03c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v15l.5-.4c5.175-4.142 12.728-3.305 16.87 1.87 4.142 5.175 3.305 12.728-1.87 16.87l-20 16c-4.384 3.51-10.616 3.51-15 0l-20-16c-5.157-4.139-5.993-11.67-1.87-16.84Z"),
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
        return _markdownLogo!!
    }

private var _markdownLogo: ImageVector? = null
