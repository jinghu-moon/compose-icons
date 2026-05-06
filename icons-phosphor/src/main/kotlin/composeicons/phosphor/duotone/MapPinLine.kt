package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorDuotoneIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C83.817 24 48 59.817 48 104c0 72 80 128 80 128 0 0 80-56 80-128C208 59.817 172.183 24 128 24ZM128 136C110.327 136 96 121.673 96 104 96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M200 224h-49.46c8.309-7.419 16.144-15.351 23.46-23.75C201.45 168.68 216 135.4 216 104 216 55.399 176.601 16 128 16 79.399 16 40 55.399 40 104c0 31.4 14.51 64.68 42 96.25 7.316 8.399 15.151 16.331 23.46 23.75h-49.46c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM56 104C56 64.235 88.235 32 128 32c39.764 0 72 32.235 72 72 0 57.23-55.47 105-72 118C111.47 209 56 161.23 56 104ZM168 104C168 81.909 150.091 64 128 64 105.909 64 88 81.909 88 104c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40ZM104 104c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24Z"),
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
