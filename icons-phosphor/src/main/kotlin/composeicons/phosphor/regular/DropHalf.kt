package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorRegularIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 47.75C161.648 33.484 147.745 20.639 132.55 9.45c-2.756-1.93-6.424-1.93-9.18 0C108.203 20.643 94.327 33.489 82 47.75 54.51 79.32 40 112.6 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 112.6 201.49 79.32 174 47.75ZM200 144c-.002 2.673-.155 5.344-.46 8h-63.54v-16h63.64q.36 4 .36 8ZM183.39 88h-47.39v-16h36.89c3.788 5.139 7.293 10.48 10.5 16ZM136 200h37.19c-10.655 8.631-23.562 14.024-37.19 15.54ZM136 184v-16h59.87c-1.991 5.645-4.679 11.02-8 16ZM136 120v-16h55.39c2.201 5.195 4.022 10.542 5.45 16ZM159.89 56h-23.89v-23.4c8.462 7.274 16.443 15.09 23.89 23.4ZM56 144C56 94 98.26 51.29 120 32.6v182.94C83.582 211.432 56.044 180.649 56 144Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
