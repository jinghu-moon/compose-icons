package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorDuotoneIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 24h0C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.934 70.59 185.41 24.066 128 24ZM215.62 120h-39.83C174 83.49 159.94 57.67 148.41 42.4c36.705 8.814 63.731 40.013 67.22 77.6ZM96.23 136h63.54c-2.31 41.61-22.23 67.11-31.77 77C118.45 203.1 98.54 177.6 96.23 136ZM96.23 120C98.54 78.39 118.46 52.89 128 43c9.55 9.93 29.46 35.43 31.77 77ZM107.59 42.4C96.06 57.67 82 83.49 80.21 120h-39.84C43.859 82.413 70.885 51.214 107.59 42.4ZM40.37 136h39.84c1.82 36.51 15.85 62.33 27.38 77.6C70.885 204.786 43.859 173.587 40.37 136ZM148.37 213.6C159.9 198.33 173.93 172.51 175.75 136h39.84c-3.484 37.576-30.49 68.771-67.18 77.6Z"),
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
