package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorThinIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 104c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4ZM104 140h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM228 192c0 15.464-12.536 28-28 28h-112C72.536 220 60 207.464 60 192v-128C60 52.954 51.046 44 40 44 28.954 44 20 52.954 20 64c0 7.78 6.34 12.75 6.4 12.8 1.767 1.325 2.125 3.833 .8 5.6-1.325 1.767-3.833 2.125-5.6 .8C21.21 82.91 12 75.86 12 64 12 48.536 24.536 36 40 36h136c15.464 0 28 12.536 28 28v108h12c.865 0 1.708 .281 2.4 .8 .39 .29 9.6 7.34 9.6 19.2ZM108 192c0-7.78-6.34-12.75-6.4-12.8-1.377-1.033-1.939-2.832-1.395-4.465 .544-1.633 2.073-2.735 3.795-2.735h92v-108C196 52.954 187.046 44 176 44h-116.43c5.394 5.256 8.435 12.469 8.43 20v128c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20ZM220 192c0-6-3.74-10.3-5.5-12h-101.89c2.199 3.618 3.371 7.766 3.39 12 .003 7.529-3.033 14.74-8.42 20h92.42c11.046 0 20-8.954 20-20Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
