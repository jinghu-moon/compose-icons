package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorFillIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24h0C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.934 70.59 185.41 24.066 128 24ZM215.62 120h-39.83C174 83.49 159.94 57.67 148.41 42.4c36.705 8.814 63.731 40.013 67.22 77.6ZM96.23 136h63.54c-2.31 41.61-22.23 67.11-31.77 77C118.45 203.1 98.54 177.6 96.23 136ZM96.23 120C98.54 78.39 118.46 52.89 128 43c9.55 9.93 29.46 35.43 31.77 77ZM148.41 213.6C159.94 198.33 173.97 172.51 175.79 136h39.84c-3.489 37.587-30.515 68.786-67.22 77.6Z"),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
