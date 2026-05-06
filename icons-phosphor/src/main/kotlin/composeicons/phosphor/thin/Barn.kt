package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorThinIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 196h-12v-77.92l8.74 12.25c.753 1.051 1.967 1.673 3.26 1.67 1.496-.003 2.865-.841 3.549-2.171 .684-1.33 .569-2.931-.299-4.149l-40-56c-.267-.393-.607-.733-1-1L134.66 22c-4.044-2.713-9.326-2.713-13.37 0L53.73 68.71c-.393 .267-.733 .607-1 1l-40 56c-1.284 1.798-.868 4.296 .93 5.58 1.798 1.284 4.296 .868 5.58-.93L28 118.08v77.92h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM36 106.88l22.85-32L125.78 28.65c1.33-.87 3.05-.87 4.38 0l67 46.26 22.85 32v89.09h-32.01v-76c0-2.209-1.791-4-4-4h-112c-2.209 0-4 1.791-4 4v76h-32ZM128 155.08 84.48 124h87ZM180 127.77v64.46L134.88 160ZM121.12 160 76 192.23v-64.46ZM128 164.92 171.52 196h-87ZM108 88c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
