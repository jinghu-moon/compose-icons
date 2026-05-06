package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorThinIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 196h-36v-32h28c1.238 .002 2.408-.569 3.167-1.548 .759-.978 1.022-2.253 .713-3.452l-32-128c-.446-1.78-2.045-3.028-3.88-3.028-1.835 0-3.434 1.248-3.88 3.028l-32 128c-.31 1.199-.046 2.474 .713 3.452 .759 .978 1.929 1.55 3.167 1.548h28v32h-72v-24h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-24h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-88c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v24h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v24h-28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h208c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM192 48.49 218.88 156h-53.76ZM60 140h48v24h-48ZM60 172h48v24h-48ZM116 92c13.255 0 24-10.745 24-24C140 54.745 129.255 44 116 44 102.745 44 92 54.745 92 68c0 13.255 10.745 24 24 24ZM116 52c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null
