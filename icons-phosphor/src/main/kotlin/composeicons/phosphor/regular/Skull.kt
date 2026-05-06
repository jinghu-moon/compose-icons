package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorRegularIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 104c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM92 144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM164 104c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM164 144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM128 16C70.65 16 24 60.86 24 116c0 34.1 18.27 66 48 84.28v15.72c0 8.837 7.163 16 16 16h80c8.837 0 16-7.163 16-16v-15.72C213.73 182 232 150.1 232 116 232 60.86 185.35 16 128 16ZM172.12 188.69c-2.544 1.411-4.121 4.091-4.12 7v20.31h-16v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24h-16v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24h-16v-20.31c.001-2.909-1.576-5.589-4.12-7C56.81 173.69 40 145.84 40 116 40 69.68 79.48 32 128 32c48.52 0 88 37.68 88 84 0 29.83-16.81 57.69-43.88 72.69Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
