package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorFillIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.8 169.6C219.415 168.561 217.731 168 216 168h-8v-104C208 46.327 193.673 32 176 32h-136C22.327 32 8 46.327 8 64 8 77.61 18.05 85.54 19.2 86.4h0C20.581 87.446 22.268 88.008 24 88c3.418-.009 6.453-2.189 7.553-5.426 1.1-3.236 .022-6.814-2.683-8.904h0C28.83 73.62 24 69.74 24 64 24 55.163 31.163 48 40 48c8.837 0 16 7.163 16 16v128c0 17.673 14.327 32 32 32h112c17.673 0 32-14.327 32-32 0-13.61-10-21.54-11.2-22.4ZM104 96h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM96 136c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8ZM200 208h-92.29c2.818-4.861 4.298-10.381 4.29-16 .002-2.712-.406-5.41-1.21-8h102c1.986 2.203 3.13 5.036 3.23 8 0 4.247-1.688 8.32-4.693 11.321-3.005 3.001-7.08 4.685-11.327 4.679Z"),
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
