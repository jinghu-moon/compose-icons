package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorBoldIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 108c-14.678 .017-27.879 8.932-33.38 22.54l-39-5.57c-.96-.136-1.837-.616-2.47-1.35L100.55 85.53c13.644-9.504 19.005-27.116 12.968-42.61C107.481 27.426 91.618 18.083 75.141 20.316 58.663 22.548 45.858 35.775 44.162 52.317 42.465 68.858 52.319 84.409 68 89.94v76.12c-16.531 5.844-26.446 22.748-23.482 40.029 2.965 17.281 17.948 29.912 35.482 29.912 17.533 0 32.517-12.632 35.482-29.912C118.446 188.808 108.531 171.904 92 166.06v-53.62l23 26.8c4.424 5.158 10.573 8.531 17.3 9.49l41.34 5.91c5.466 17.668 23.431 28.32 41.555 24.64 18.125-3.68 30.512-20.495 28.655-38.896C241.992 121.984 226.494 107.984 208 108ZM80 44c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C73.373 68 68 62.627 68 56 68 49.373 73.373 44 80 44ZM80 212c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM208 156c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
