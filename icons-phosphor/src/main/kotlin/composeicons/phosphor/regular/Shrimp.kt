package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorRegularIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 116c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM223.8 85.38C220.927 127.352 186.07 159.946 144 160h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48v16h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-56C51.817 232 16 196.183 16 152 16 107.817 51.817 72 96 72h116c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-84C114.745 48 104 37.255 104 24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418 3.582 8 8 8h84c13.125 .012 24.481 9.14 27.314 21.956 2.833 12.816-3.617 25.88-15.514 31.424ZM50.8 197.29 84.02 173.56c0-.51 0-1 0-1.56-.006-2.527 .331-5.043 1-7.48L33 140.87c-3.672 20.595 2.995 41.68 17.84 56.42ZM89.8 189.09 64.12 207.46c9.69 5.602 20.687 8.548 31.88 8.54h8v-17.17c-5.621-1.69-10.572-5.096-14.16-9.74ZM104 145.17v-57.17h-8c-25.068 .028-47.817 14.673-58.22 37.48l55.87 25.39c3.005-2.615 6.534-4.558 10.35-5.7ZM207.5 88h-87.5v56h24c32.239-.039 59.431-24.019 63.5-56Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
