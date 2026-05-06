package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SunDim: ImageVector
    get() {
        if (_sunDim != null) return _sunDim!!
        _sunDim = phosphorFillIcon(
            name = "SunDim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 40v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 64C92.654 64 64 92.654 64 128c0 35.346 28.654 64 64 64 35.346 0 64-28.654 64-64C191.961 92.67 163.33 64.039 128 64ZM58.34 69.66c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32l-8-8c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32ZM58.34 186.34l-8 8c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l8-8c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0ZM192 72c2.122 .002 4.158-.84 5.66-2.34l8-8c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0l-8 8c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938ZM197.66 186.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l8 8c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM40 120h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 208c-4.418 0-8 3.582-8 8v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8c0-4.418-3.582-8-8-8ZM224 120h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _sunDim!!
    }

private var _sunDim: ImageVector? = null
