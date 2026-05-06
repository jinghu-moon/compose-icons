package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorBoldIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 92c17.673 0 32-14.327 32-32C208 42.327 193.673 28 176 28c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM176 52c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM28.48 80.64c1.856-6.362 8.518-10.016 14.88-8.16l67.5 19.68 8.66-8.65c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529L165 112h35c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-40c-3.18-0-6.23-1.263-8.48-3.51l-4.89-4.89L36.63 95.53c-3.056-.893-5.631-2.964-7.16-5.757-1.529-2.793-1.885-6.078-.99-9.133ZM238.65 211.57C220.505 223.673 197.934 227.125 177 221L20.65 175.51c-4.343-.995-7.776-4.314-8.919-8.62-1.142-4.306 .195-8.891 3.474-11.907 3.279-3.017 7.958-3.968 12.155-2.472l79.92 23.27 13.81-13.81L84.7 151.53c-4.197-1.113-7.466-4.408-8.546-8.614-1.08-4.206 .196-8.667 3.337-11.666 3.141-2.998 7.657-4.066 11.808-2.791l56 16c4.079 1.172 7.235 4.411 8.301 8.519 1.066 4.108-.117 8.473-3.111 11.481l-18.93 18.94L183.66 198c14.154 4.146 29.418 1.806 41.68-6.39 5.523-3.675 12.98-2.178 16.655 3.345 3.675 5.523 2.178 12.98-3.345 16.655Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
