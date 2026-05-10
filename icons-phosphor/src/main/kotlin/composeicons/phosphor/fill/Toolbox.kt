package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorFillIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64h-48v-8C176 42.745 165.255 32 152 32h-48C90.745 32 80 42.745 80 56v8h-48C23.163 64 16 71.163 16 80v28c0 2.209 1.791 4 4 4h44v-15.73C63.932 91.979 67.195 88.367 71.47 88c2.212-.147 4.386 .631 6.003 2.147C79.09 91.664 80.005 93.783 80 96v16h96v-15.73c-.068-4.291 3.195-7.903 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v16h44c2.209 0 4-1.791 4-4v-28c0-8.837-7.163-16-16-16ZM160 64h-64v-8c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM240 132v60c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-60c0-2.209 1.791-4 4-4h44v16c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.516 3.791 2.294 6.003 2.147 4.275-.367 7.538-3.979 7.47-8.27v-15.73h96v16c-.005 2.217 .91 4.336 2.527 5.853 1.617 1.516 3.791 2.294 6.003 2.147 4.268-.367 7.528-3.967 7.47-8.25v-15.75h44c2.209 0 4 1.791 4 4Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
