package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorThinIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.06 148.57 188 125.74v-21.74c.002-1.431-.761-2.754-2-3.47L132 69.68v-25.68h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v25.68L70 100.53c-1.239 .716-2.002 2.039-2 3.47v21.74L29.94 148.57c-1.204 .723-1.94 2.025-1.94 3.43v64c0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v48c0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4v-64c0-1.405-.736-2.707-1.94-3.43ZM36 154.26 68 135.06v76.94h-32ZM128 148c-11.046 0-20 8.954-20 20v44h-32v-105.68L128 76.61l52 29.71v105.68h-32v-44c0-11.046-8.954-20-20-20ZM220 212h-32v-76.94l32 19.2Z"),
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
        return _church!!
    }

private var _church: ImageVector? = null
