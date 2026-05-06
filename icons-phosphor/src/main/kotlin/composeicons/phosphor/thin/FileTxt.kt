package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorThinIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 112c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c.001-1.061-.42-2.079-1.17-2.83l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52ZM156 41.65 198.34 84h-42.34ZM151.25 154.32 132.92 180l18.33 25.67c.909 1.158 1.109 2.721 .52 4.07-.588 1.349-1.87 2.266-3.337 2.387-1.467 .121-2.882-.573-3.683-1.807L128 186.88l-16.75 23.44c-.802 1.234-2.217 1.928-3.683 1.807-1.467-.121-2.748-1.038-3.337-2.387-.588-1.349-.389-2.912 .52-4.07L123.08 180 104.75 154.32c-.909-1.158-1.109-2.721-.52-4.07 .588-1.349 1.87-2.266 3.337-2.387 1.467-.121 2.881 .573 3.683 1.807L128 173.12l16.75-23.45c.802-1.234 2.217-1.928 3.683-1.807 1.467 .121 2.748 1.038 3.337 2.387 .588 1.349 .389 2.912-.52 4.07ZM88 152c0 2.209-1.791 4-4 4h-16v52c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-52h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM216 152c0 2.209-1.791 4-4 4h-16v52c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-52h-16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4Z"),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
