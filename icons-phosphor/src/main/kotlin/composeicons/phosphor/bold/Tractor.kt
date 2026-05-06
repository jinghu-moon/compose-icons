package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorBoldIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 164v-30c.041-8.843-5.768-16.649-14.25-19.15l-.31-.09L196 105.65v-29.65c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v23.15L156 94.82v-34.82h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-120C33.373 36 28 41.373 28 48c0 6.627 5.373 12 12 12h4v24h-4C33.373 84 28 89.373 28 96c0 6.627 5.373 12 12 12h28c35.33 .039 63.961 28.67 64 64v12c0 6.627 5.373 12 12 12h28.8c3.289 16.082 16.069 28.522 32.234 31.376 16.165 2.854 32.432-4.457 41.029-18.44C254.661 194.952 253.843 177.136 244 164ZM132 111.67C115.404 94.003 92.239 83.988 68 84v-24h64ZM175.35 172h-19.35v-52.32L220 137v11.8c-2.634-.531-5.313-.799-8-.8-15.896 .02-30.277 9.437-36.65 24ZM212 204c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM64 124c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52 28.719 0 52-23.281 52-52C115.967 147.295 92.705 124.033 64 124ZM64 204C48.536 204 36 191.464 36 176c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM80 176c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _tractor!!
    }

private var _tractor: ImageVector? = null
