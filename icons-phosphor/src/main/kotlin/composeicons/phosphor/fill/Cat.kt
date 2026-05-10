package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorFillIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.83 33.54c-6.106-2.883-13.364-1.622-18.14 3.15-.14 .14-.26 .27-.38 .41L187.05 57C150.943 34.408 105.107 34.408 69 57L51.69 37.1c-.12-.14-.24-.27-.38-.41C46.534 31.918 39.276 30.657 33.17 33.54 27.492 36.328 23.923 42.134 24 48.46v87.54c0 49 40.06 89.63 91.56 95.32 1.135 .126 2.269-.24 3.117-1.004 .848-.764 1.33-1.854 1.323-2.996v-32L106.58 181.89c-3.161-3.068-3.342-8.082-.41-11.37 1.482-1.579 3.541-2.489 5.707-2.523 2.165-.034 4.252 .812 5.783 2.343L128 180.68l10.34-10.35c1.531-1.532 3.618-2.377 5.783-2.343 2.165 .034 4.225 .944 5.707 2.523 2.932 3.288 2.751 8.302-.41 11.37L136 195.31v32c-.007 1.142 .474 2.232 1.323 2.996 .848 .764 1.983 1.129 3.117 1.004C191.94 225.62 232 185 232 136v-87.54c.077-6.326-3.492-12.132-9.17-14.92ZM84 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM104 88c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-19c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 88c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM152 88v-19c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v19c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM172 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
