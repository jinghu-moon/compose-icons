package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorThinIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 120v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM200 196c-2.209 0-4 1.791-4 4v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16c0-2.209-1.791-4-4-4ZM224 164h-20v-124c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v124h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM56 164c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM80 132h-20v-92c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v92h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM152 84h-20v-44c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v44h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
