package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorThinIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 128c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM160 156h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM212 40v160c0 15.464-12.536 28-28 28h-112C56.536 228 44 215.464 44 200v-160c0-2.209 1.791-4 4-4h28v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h40v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h40v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h28c2.209 0 4 1.791 4 4ZM204 44h-24v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-40v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-40v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-24v156c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
