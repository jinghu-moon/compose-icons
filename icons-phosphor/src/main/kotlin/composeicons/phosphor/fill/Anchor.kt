package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorFillIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 144c0 38.11-27.67 45.66-49.9 51.72C149.77 202.36 136 207.31 136 232c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-24.69-13.77-29.64-38.1-36.28C59.67 189.66 32 182.11 32 144c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 24.69 13.77 29.64 38.1 36.28 11.36 3.1 24.12 6.6 33.9 14.34v-66.62h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-29.17C106.677 78.858 98.286 65.712 100.293 51.955 102.3 38.198 114.097 27.997 128 27.997c13.903 0 25.7 10.201 27.707 23.958C157.714 65.712 149.323 78.858 136 82.83v29.17h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32v66.62c9.78-7.74 22.54-11.24 33.9-14.34C194.23 173.64 208 168.69 208 144c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
