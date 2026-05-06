package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorThinIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 100h-48c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM148 148h-40v-40h40ZM232 148h-20v-40h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-44c0-6.627-5.373-12-12-12h-44v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-40v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-44C49.373 44 44 49.373 44 56v44h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v40h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v44c0 6.627 5.373 12 12 12h44v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h40v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h44c6.627 0 12-5.373 12-12v-44h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM204 200c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-144c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4Z"),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
