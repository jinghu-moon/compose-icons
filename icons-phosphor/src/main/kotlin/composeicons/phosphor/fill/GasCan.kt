package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorFillIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-76.69c-4.246-.014-8.32 1.676-11.31 4.69L101.66 39 91.31 28.69c-6.248-6.243-16.372-6.243-22.62 0L44.69 52.69c-6.243 6.248-6.243 16.372 0 22.62L55 85.66 44.69 96c-3.014 2.99-4.704 7.064-4.69 11.31v108.69c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM56 64 80 40 90.34 50.34l-24 24ZM180.8 185.6c3.535 2.651 4.251 7.665 1.6 11.2-2.651 3.535-7.665 4.251-11.2 1.6L128 166 84.8 198.4c-3.535 2.651-8.549 1.935-11.2-1.6-2.651-3.535-1.935-8.549 1.6-11.2L114.67 156 75.2 126.4c-3.535-2.651-4.251-7.665-1.6-11.2 2.651-3.535 7.665-4.251 11.2-1.6L128 146l43.2-32.4c3.535-2.651 8.549-1.935 11.2 1.6 2.651 3.535 1.935 8.549-1.6 11.2L141.33 156ZM176 72h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
