package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorThinIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.83 61.17l-48-48c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L210.34 40l-76.68 76.69L96.49 79.51C94.238 77.251 91.18 75.981 87.99 75.981c-3.19 0-6.248 1.27-8.5 3.529L23.49 135.51C21.241 137.761 19.984 140.818 20 144v80c0 6.627 5.373 12 12 12h80c3.184 .003 6.238-1.26 8.49-3.51l56-56c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L139.31 122.32 216 45.66l21.17 21.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66ZM170.83 165.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-56 56c-.751 .75-1.769 1.171-2.83 1.17h-80c-2.209 0-4-1.791-4-4v-80c-.001-1.061 .42-2.079 1.17-2.83l56-56c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L128 122.34 85.17 165.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L133.66 128Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
