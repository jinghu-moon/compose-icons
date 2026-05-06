package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorFillIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 16h-48C89.072 16 64 41.072 64 72v31.73c.068 4.291-3.195 7.903-7.47 8.27-2.212 .147-4.386-.631-6.003-2.147C48.91 108.336 47.995 106.217 48 104v-25.3c-.001-1.355-.687-2.617-1.824-3.354-1.137-.737-2.569-.848-3.806-.296C31.157 80.329 24.001 91.607 24 104v29.19c.008 3.632 1.241 7.155 3.5 10q.3 .36 .63 .69L64 179.34v36.66c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-38.88l15.38-53.84c.41-1.431 .619-2.912 .62-4.4v-46.88C224 41.072 198.928 16 168 16ZM171.58 184.84c3.954 1.977 5.557 6.786 3.58 10.74-1.977 3.954-6.786 5.557-10.74 3.58L136 184.94l-28.42 14.22c-3.954 1.977-8.763 .374-10.74-3.58-1.977-3.954-.374-8.763 3.58-10.74L118.11 176l-17.69-8.84c-3.954-1.977-5.557-6.786-3.58-10.74 1.977-3.954 6.786-5.557 10.74-3.58L136 167.06l28.42-14.22c3.954-1.977 8.763-.374 10.74 3.58 1.977 3.954 .374 8.763-3.58 10.74L153.89 176Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
