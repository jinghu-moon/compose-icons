package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorBoldIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.52l-56-56C158.239 21.266 155.185 20 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v108h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28c11.046 0 20-8.954 20-20v-128c-0-3.18-1.263-6.23-3.51-8.48ZM160 57l23 23h-23ZM64 140h-16c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c17.673 0 32-14.327 32-32C96 154.327 81.673 140 64 140ZM64 180h-4v-16h4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM144 187.44v20.56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20.56L101.82 158.36c-3.513-5.622-1.802-13.027 3.82-16.54 5.622-3.513 13.027-1.802 16.54 3.82L132 161.36l9.82-15.72c3.513-5.622 10.918-7.333 16.54-3.82 5.622 3.513 7.333 10.918 3.82 16.54Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
