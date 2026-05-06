package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorThinIcon(
            name = "FileVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M83.77 153.35l-20 56c-.566 1.596-2.076 2.663-3.77 2.663-1.694 0-3.204-1.067-3.77-2.663l-20-56c-.746-2.082 .338-4.374 2.42-5.12 2.082-.746 4.374 .338 5.12 2.42L60 196.11 76.23 150.65c.746-2.082 3.038-3.166 5.12-2.42 2.082 .746 3.166 3.038 2.42 5.12ZM208 156c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-28v-20h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-20ZM144 148c-2.209 0-4 1.791-4 4v38c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14v-38c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v38c0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22v-38c0-2.209-1.791-4-4-4ZM212 88v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83ZM198.34 84 156 41.65v42.35Z"),
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
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
