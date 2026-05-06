package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Racquet: ImageVector
    get() {
        if (_racquet != null) return _racquet!!
        _racquet = phosphorRegularIcon(
            name = "Racquet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 26.05C202-1.88 151.53 3.16 117.4 37.3 85.61 69.09 79.07 115.07 100.89 143.79L71.33 173.35l-.68-.68c-3.001-3.004-7.073-4.693-11.32-4.693-4.247 0-8.319 1.688-11.32 4.693L20.69 200c-3.004 3.001-4.693 7.073-4.693 11.32 0 4.247 1.688 8.319 4.693 11.32l12.69 12.69c3.001 3.001 7.071 4.688 11.315 4.688 4.244 0 8.314-1.686 11.315-4.688h0L83.34 208c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315l-.69-.69 29.56-29.56c11.29 8.58 25.24 12.79 40 12.79 22.72 0 47.25-10 66.54-29.3C252.83 104.47 257.88 54 230 26.05ZM44.7 224 32 211.31 59.33 184l6.33 6.34h0L72 196.67ZM224.23 104h-24.17v-32h32c-.118 11.126-2.797 22.076-7.83 32ZM136 149.61C121.779 145.346 110.654 134.221 106.39 120h29.61ZM104 104c.12-11.13 2.81-22.081 7.86-32h24.14v32ZM152 72h32v32h-32ZM229.67 56h-29.61v-29.72c14.244 4.272 25.388 15.416 29.66 29.66ZM183.85 24h.16v32h-32v-24.24c9.888-5.026 20.799-7.715 31.89-7.86ZM136 42.06v13.88h-13.84c2.051-2.558 4.241-5.002 6.56-7.32 2.31-2.313 4.74-4.503 7.28-6.56ZM152 151.98v-31.98h32v24.16c-9.905 5.036-20.839 7.719-31.95 7.84ZM200 133.84v-13.84h14c-2.054 2.556-4.244 4.999-6.56 7.32-2.339 2.307-4.802 4.484-7.38 6.52Z"),
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
        return _racquet!!
    }

private var _racquet: ImageVector? = null
