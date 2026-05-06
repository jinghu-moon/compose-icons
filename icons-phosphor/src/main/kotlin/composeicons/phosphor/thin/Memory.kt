package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Memory: ImageVector
    get() {
        if (_memory != null) return _memory!!
        _memory = phosphorThinIcon(
            name = "Memory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 60h-208C17.373 60 12 65.373 12 72v128c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-128c0-6.627-5.373-12-12-12ZM20 72c0-2.209 1.791-4 4-4h208c2.209 0 4 1.791 4 4v100h-216ZM112 148c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4ZM52 100h56v40h-56ZM144 148h64c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4ZM148 100h56v40h-56Z"),
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
        return _memory!!
    }

private var _memory: ImageVector? = null
