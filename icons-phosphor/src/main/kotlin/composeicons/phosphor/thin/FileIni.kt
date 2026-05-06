package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorThinIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 152v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM120 148c-2.209 0-4 1.791-4 4v43.52L83.25 149.68c-1.011-1.41-2.817-2.007-4.469-1.478-1.653 .529-2.776 2.063-2.781 3.798v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-43.52l32.75 45.84c1.011 1.41 2.817 2.007 4.469 1.478 1.653-.529 2.776-2.063 2.781-3.798v-56c0-2.209-1.791-4-4-4ZM160 148c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-56c0-2.209-1.791-4-4-4ZM212 88v136c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-132h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83ZM156 84h42.34L156 41.65Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
