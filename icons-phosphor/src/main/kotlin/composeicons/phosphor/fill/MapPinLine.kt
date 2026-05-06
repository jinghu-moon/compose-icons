package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorFillIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 224h-49.46c8.309-7.419 16.144-15.351 23.46-23.75C201.45 168.68 216 135.4 216 104 216 55.399 176.601 16 128 16 79.399 16 40 55.399 40 104c0 31.4 14.51 64.68 42 96.25 7.316 8.399 15.151 16.331 23.46 23.75h-49.46c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 72c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 136 96 121.673 96 104 96 86.327 110.327 72 128 72Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
