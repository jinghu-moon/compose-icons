package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorDuotoneIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 116h0c0 33.137-26.863 60-60 60h-12v40h-64v-80h-12C50.863 136 24 109.137 24 76h0C24 64.954 32.954 56 44 56h0c11.046 0 20 8.954 20 20 0 11.046 8.954 20 20 20h12v-40C96 38.327 110.327 24 128 24h0c17.673 0 32 14.327 32 32v80h12c11.046 0 20-8.954 20-20 0-11.046 8.954-20 20-20h0c11.046 0 20 8.954 20 20Z"),
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
                pathData = parseSvgPathData("M216 208h-48v-24h4c37.539-.039 67.961-30.461 68-68C240 100.536 227.464 88 212 88c-15.464 0-28 12.536-28 28 0 6.627-5.373 12-12 12h-4v-72C168 33.909 150.091 16 128 16 105.909 16 88 33.909 88 56v32h-4C77.373 88 72 82.627 72 76 72 60.536 59.464 48 44 48 28.536 48 16 60.536 16 76c.039 37.539 30.461 67.961 68 68h4v64h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96 128h-12C55.295 127.967 32.033 104.705 32 76 32 69.373 37.373 64 44 64c6.627 0 12 5.373 12 12 0 15.464 12.536 28 28 28h12c4.418 0 8-3.582 8-8v-40c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24v80c0 4.418 3.582 8 8 8h12c15.464 0 28-12.536 28-28 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12-.033 28.705-23.295 51.967-52 52h-12c-4.418 0-8 3.582-8 8v32h-48v-72c0-4.418-3.582-8-8-8Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
